package it.unibz.udig.xplr.tool.select;

import it.unibz.udig.xplr.grammar.parser.Attribute;
import it.unibz.udig.xplr.grammar.parser.Dictionary;
import it.unibz.udig.xplr.grammar.parser.DictionaryEntry;
import it.unibz.udig.xplr.grammar.parser.XpLRParser;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.ui.ApplicationGIS;
import net.refractions.udig.project.ui.commands.SelectionBoxCommand;
import net.refractions.udig.project.ui.render.displayAdapter.MapMouseEvent;
import net.refractions.udig.project.ui.tool.ModalTool;
import net.refractions.udig.project.ui.tool.SimpleTool;

import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.geotools.feature.FeatureCollection;
import org.geotools.feature.FeatureIterator;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.opengis.feature.Property;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import com.vividsolutions.jts.geom.Coordinate;

import com.vividsolutions.jts.geom.Envelope;

public class XplrBBoxSelection extends SimpleTool implements ModalTool
{

	public static final String ID = "it.unibz.udig.xplr.tool.select.selectfeatures"; //$NON-NLS-1$

	private Point start;

	private boolean selecting;

	net.refractions.udig.project.ui.commands.SelectionBoxCommand shapeCommand;

	Set<String> selectedFids = new HashSet<String>();
	String outputText = "";

	public XplrBBoxSelection()
	{
		super(MOUSE | MOTION);
	}

	/**
	 * @see net.refractions.udig.project.ui.tool.SimpleTool#onMouseDragged(net.refractions.udig.project.render.displayAdapter.MapMouseEvent)
	 */
	protected void onMouseDragged(MapMouseEvent e)
	{
		Point end = e.getPoint();
		if (start == null) return;
		shapeCommand
				.setShape(new Rectangle(Math.min(start.x, end.x), Math.min(start.y, end.y), Math.abs(start.x - end.x), Math.abs(start.y - end.y)));
		context.getViewportPane().repaint();
	}

	/**
	 * @see net.refractions.udig.project.ui.tool.AbstractTool#mousePressed(net.refractions.udig.project.render.displayAdapter.MapMouseEvent)
	 */
	public void onMousePressed(MapMouseEvent e)
	{
		shapeCommand = new SelectionBoxCommand();

		if (((e.button & MapMouseEvent.BUTTON1) != 0))
		{
			selecting = true;

			start = e.getPoint();
			shapeCommand.setValid(true);
			shapeCommand.setShape(new Rectangle(start.x, start.y, 0, 0));
			context.sendASyncCommand(shapeCommand);
		}
	}

	/**
	 * @see net.refractions.udig.project.ui.tool.AbstractTool#mouseReleased(net.refractions.udig.project.render.displayAdapter.MapMouseEvent)
	 */
	public void onMouseReleased(MapMouseEvent e)
	{
		if (selecting)
		{
			Point end = e.getPoint();
			if (start == null || start.equals(end))
			{

				ReferencedEnvelope bounds = getContext().getBoundingBox(e.getPoint(), 3);
				sendSelectionCommand(e, bounds);
			}
			else
			{
				Coordinate c1 = context.getMap().getViewportModel().pixelToWorld(start.x, start.y);
				Coordinate c2 = context.getMap().getViewportModel().pixelToWorld(end.x, end.y);

				Envelope env = new Envelope(c1, c2);
				ReferencedEnvelope bounds = new ReferencedEnvelope();
				bounds.init(env);

				sendSelectionCommand(e, bounds);
			}
		}
	}

	/**
	 * @param e
	 * @param bounds
	 */
	protected void sendSelectionCommand(MapMouseEvent e, final ReferencedEnvelope bounds)
	{
		StringBuilder b = new StringBuilder();
		XplrBBoxSelectionCommand command = null;
		try
		{

			String inputfile = "/Users/sara/git/udigXpLR/regole/lamp.xpg";
			
			XpLRParser par = new XpLRParser(inputfile);

			ArrayList<String> layerList = new ArrayList<String>();

			for (String s : par.getLoader().getLayers())
			{
				layerList.add(s);
			}

			List<ILayer> layers = new ArrayList<ILayer>();
			if (layerList.isEmpty())
			{
				layers.addAll(getContext().getMapLayers());
			}
			else
			{
				for (ILayer l : getContext().getMapLayers())
				{
					if (layerList.contains(l.getName()))
					{
						layers.add(l);
					}
				}
			}

			if (e.isModifierDown(MapMouseEvent.MOD2_DOWN_MASK))
			{
				command = new XplrBBoxSelectionCommand(layers, bounds, XplrBBoxSelectionCommand.ADD);
			}
			else if (e.isModifierDown(MapMouseEvent.MOD1_DOWN_MASK))
			{
				command = new XplrBBoxSelectionCommand(layers, bounds, XplrBBoxSelectionCommand.SUBTRACT);
			}
			else
			{
				command = new XplrBBoxSelectionCommand(layers, bounds, XplrBBoxSelectionCommand.NONE);
			}

			for (ILayer layer : layers)
			{
				FeatureCollection<SimpleFeatureType, SimpleFeature> features = getContext().getFeaturesInBbox(layer, bounds);

				FeatureIterator<SimpleFeature> fIt = features.features();
				while (fIt.hasNext())
				{
					SimpleFeature feature = fIt.next();

					ArrayList<Attribute> attributes = new ArrayList<Attribute>();

					Collection<Property> props = feature.getProperties();
					Iterator<Property> it = props.iterator();
					while (it.hasNext())
					{
						Property p = it.next();

						attributes.add(new Attribute(p.getName().toString(), p.getType().getBinding().getName(), p.getValue()));

					}

					DictionaryEntry de = new DictionaryEntry(feature.getID(), attributes);
					par.getDictionary().getEntries().add(de);
				}

				fIt.close();

			}

//			Dictionary d = par.getDictionary();
//			for (Object o : d.getEntries())
//			{
//				if (o instanceof DictionaryEntry)
//				{
//					DictionaryEntry feature = (DictionaryEntry) o;
//					System.out.println(feature.getName());
//					if (feature.getAttributes() != null)
//					{
//						for (Attribute a : feature.getAttributes())
//						{
//							System.out.println(a.toString());
//						}
//					}
//
//				}
//			}

			for (XpLRParser.ResultObject o : par.getResult())
			{
				b.append(o.getMessage());
				if (o.getLevel() > 0) System.err.println(o.getMessage());
			}

		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{

			if (command != null)
			{
				getContext().sendASyncCommand(command);
			}

			selecting = false;
			shapeCommand.setValid(false);
			getContext().getViewportPane().repaint();

			Display.getDefault().asyncExec(new Runnable()
			{

				public void run()
				{
					XpLRViewPart vp = (XpLRViewPart) ApplicationGIS.getView(true, XpLRViewPart.VIEW_ID);
					if (vp != null)
						if (vp.getSite().getSelectionProvider() != null) vp.getSite().getSelectionProvider().setSelection(new StructuredSelection());

					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					if (!page.isPartVisible(vp)) page.bringToTop(vp);

					vp = (XpLRViewPart) ApplicationGIS.getView(true, XpLRViewPart.VIEW_ID);
					vp.output.setText(outputText);
				}
			});

		}
	}
}
