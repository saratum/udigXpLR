package it.unibz.udig.omtg.gef.figures;

import it.unibz.udig.omtg.gef.figures.helpers.CompartmentFigure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public abstract class OMTClassFigure extends Figure implements OMTPDNodeFigure
{

	private Label				classLabel;
	private CompartmentFigure	attributes;
	private CompartmentFigure	operations;

	abstract public IFigure getContentPane( );

	public OMTClassFigure()
	{
		setLayoutManager( new XYLayout() );
		classLabel = new Label();
		add( classLabel );
		attributes = new CompartmentFigure();
		add( attributes );
		operations = new CompartmentFigure();
		add( operations );
	}

	@Override
	public Dimension getPreferredSize( int wHint, int hHint )
	{
		Dimension d = new Dimension();
		Rectangle textRectangle = getClassLabel().getTextBounds().getCopy();
		d.width = textRectangle.width + 30 + 30;
		d.height = textRectangle.height + 30 + 30;
		return d;
	}

	public Label getClassLabel( )
	{
		return classLabel;
	}

	public CompartmentFigure getAttributes( )
	{
		return attributes;
	}

	public CompartmentFigure getOperations( )
	{
		return operations;
	}

}
