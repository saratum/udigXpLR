package it.unibz.udig.omtg.gef.figures;

import it.unibz.udig.omtg.gef.figures.helpers.CompartmentFigure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class OMTConventionalClassFigure extends Figure implements OMTClassFigure
{

	private Label				label;
	private CompartmentFigure	attributes;
	private CompartmentFigure	operations;
	private RectangleFigure		rectangle;
	private ConnectionAnchor	connectionAnchor;

	public OMTConventionalClassFigure()
	{
		setLayoutManager( new XYLayout() );
		rectangle = new RectangleFigure();
		add( rectangle );
		label = new Label();
		add( label );
		attributes = new CompartmentFigure();
		add( attributes );
		operations = new CompartmentFigure();
		add( operations );
	}

	@Override
	protected void paintFigure( Graphics graphics )
	{
		Rectangle r = getBounds().getCopy();
		int compartmentsize = ((r.height - 30) / 2);

		setConstraint( rectangle, new Rectangle( 0, 0, r.width, r.height ) );
		setConstraint( label, new Rectangle( 0, 0, r.width, 30 ) );
		setConstraint( attributes, new Rectangle( 0, 30, r.width, compartmentsize ) );
		setConstraint( operations, new Rectangle( 0, 30 + compartmentsize, r.width, compartmentsize ) );

		label.invalidate();
		attributes.invalidate();
		operations.invalidate();
		rectangle.invalidate();
	}

	@Override
	public Label getNameLabel( )
	{
		return label;
	}

	public ConnectionAnchor getConnectionAnchor( )
	{
		if ( connectionAnchor == null ) connectionAnchor = new ChopboxAnchor( this );

		return connectionAnchor;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor( )
	{
		return getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor( )
	{
		return getConnectionAnchor();
	}

	@Override
	public CompartmentFigure getAttributes( )
	{
		return attributes;
	}

	@Override
	public CompartmentFigure getOperations( )
	{
		return operations;
	}

}
