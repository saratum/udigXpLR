package it.unibz.udig.omtg.gef.figures;

import it.unibz.udig.omtg.gef.figures.helpers.CompartmentFigure;
import it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

public class OMTGeoObjectTopologyClassFigure extends Figure implements OMTClassFigure
{

	private OMTGeoObjectTopologyClassKind	kind;
	private Label							label;
	private RectangleFigure					rectangle;
	private ConnectionAnchor				connectionAnchor;
	private CompartmentFigure				attributes;
	private CompartmentFigure				operations;
	public boolean							temporary;

	public OMTGeoObjectTopologyClassFigure(final OMTGeoObjectTopologyClassKind kind)
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
		this.kind = kind;

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

		setBorder( null );
		rectangle.setBorder( null );

		if ( temporary )
		{

			LineBorder lb = new LineBorder();
			lb.setStyle( SWT.LINE_DASH );
			lb.setWidth( 2 );
			setBorder( lb );
		}
		else
		{
			setBorder( new LineBorder() );
		}
		if ( kind != null )
		{
			switch ( kind )
			{
				case BIDIRECTIONAL_LINE:
					getNameLabel().setIcon(
							new Image( null, OMTGeoObjectTopologyClassFigure.class
									.getResourceAsStream( "imgs/bidirline.png" ) ) );
					break;
				case NODE:
					getNameLabel().setIcon(
							new Image( null, OMTGeoObjectTopologyClassFigure.class
									.getResourceAsStream( "imgs/node.png" ) ) );
					break;
				case UNIDIRECTIONAL_LINE:
					getNameLabel().setIcon(
							new Image( null, OMTGeoObjectTopologyClassFigure.class
									.getResourceAsStream( "imgs/unidirline.png" ) ) );
					break;
				default:
					throw new IllegalArgumentException( "Invalid  kind: " + kind );
			}
		}

		label.invalidate();
		attributes.invalidate();
		operations.invalidate();
		rectangle.invalidate();
	}

	@Override
	public void setTemporary( boolean t )
	{
		temporary = t;
	}

	@Override
	public Label getNameLabel( )
	{
		return label;
	}

	@Override
	public CompartmentFigure getAttributes( )
	{
		return attributes;
	}

	public ConnectionAnchor getConnectionAnchor( )
	{
		if ( connectionAnchor == null )
		{
			connectionAnchor = new ChopboxAnchor( this );
		}
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
	public CompartmentFigure getOperations( )
	{
		return operations;
	}

}
