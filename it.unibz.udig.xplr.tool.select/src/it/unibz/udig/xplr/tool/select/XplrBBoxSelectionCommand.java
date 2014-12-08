package it.unibz.udig.xplr.tool.select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.command.AbstractCommand;
import net.refractions.udig.project.command.UndoableMapCommand;
import net.refractions.udig.project.internal.Layer;
import net.refractions.udig.project.internal.Messages;

import org.eclipse.core.runtime.IProgressMonitor;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.factory.GeoTools;
import org.opengis.filter.And;
import org.opengis.filter.Filter;
import org.opengis.filter.Not;

import com.vividsolutions.jts.geom.Envelope;

public class XplrBBoxSelectionCommand extends AbstractCommand implements UndoableMapCommand
{

	/** Add bbox to layers' current filters */
	public final static int ADD = 1;

	/** Replaces layers' filters */
	public final static int NONE = 0;

	/** "and" bbox to layer's current filters */
	public final static int SUBTRACT = -1;

	Envelope bbox = null;

	private int modifiers;
	private List<ILayer> mapLayers;

	private Map<Layer, Filter> undoState = new HashMap<Layer, Filter>();

	public XplrBBoxSelectionCommand(List<ILayer> mapLayers, Envelope bbox, int modifiers)
	{
		this.bbox = bbox;
		this.modifiers = modifiers;
		this.mapLayers = mapLayers;
	}

	/**
	 * @see net.refractions.udig.project.command.UndoableCommand#rollback()
	 */
	public void rollback(IProgressMonitor monitor) throws Exception
	{
		Set<Entry<Layer, Filter>> state = undoState.entrySet();
		for (Entry<Layer, Filter> entry : state)
		{
			entry.getKey().setFilter(entry.getValue());
		}
	}

	/**
	 * @see net.refractions.udig.project.command.MapCommand#run()
	 */
	public void run(IProgressMonitor monitor) throws Exception
	{
		List<Layer> layers = getMap().getLayersInternal();
		for (Layer layer : layers)
		{
			undoState.put(layer, layer.getFilter());
		}

		if (modifiers == NONE)
		{
			LAYERS: for (ILayer il : mapLayers)
			{
				Layer layer = (Layer) il;

				Filter newFilter = layer.createBBoxFilter(bbox, null);
				if (newFilter == null) continue LAYERS;
				layer.setFilter(newFilter);

			}
		}
		else
		{
			LAYERS: for (ILayer il : mapLayers)
			{
				Layer layer = (Layer) il;

				Filter oldFilter = layer.getFilter();
				Filter newFilter = null;
				newFilter = layer.createBBoxFilter(bbox, null);

				if (newFilter == null) continue LAYERS;
				if (oldFilter == null || oldFilter == Filter.EXCLUDE || oldFilter.equals(Filter.EXCLUDE))
				{
					layer.setFilter(newFilter);
				}
				else
				{
					org.opengis.filter.FilterFactory fac = CommonFactoryFinder.getFilterFactory(GeoTools.getDefaultHints());
					if (modifiers == ADD)
					{
						Filter orFilter = fac.or(newFilter, oldFilter);
						layer.setFilter(orFilter);
					}
					else
					{
						Not notFilter = fac.not(newFilter);
						And logicFilter = fac.and(notFilter, oldFilter);

						layer.setFilter(logicFilter);
					}

				}
			}
		}

	}

	/**
	 * @see net.refractions.udig.project.command.MapCommand#getName()
	 */
	public String getName()
	{
		return Messages.BBoxSelectionCommand_boxSelection;
	}

}
