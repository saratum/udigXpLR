package it.unibz.udig.omtg.gef.figures;

import it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

public class OMTGeoFieldClassFigure extends OMTClassFigure
{

	private OMTGeoFieldClassKind	kind;
	private RectangleFigure			rectangle;
	private ConnectionAnchor		connectionAnchor;

	public OMTGeoFieldClassFigure(final OMTGeoFieldClassKind kind)
	{
		super();
		rectangle = new RectangleFigure();
		rectangle.setFill( false );
		rectangle.setLayoutManager( new XYLayout() );
		add( rectangle );
		this.kind = kind;

	}

	@Override
	public IFigure getContentPane( )
	{
		return rectangle;
	}

	@Override
	protected void paintFigure( Graphics graphics )
	{
		Rectangle r = getBounds().getCopy();
		int compartmentsize = ((r.height - 30) / 2);

		setConstraint( rectangle, new Rectangle( 0, 0, r.width, r.height ) );
		setConstraint( getClassLabel(), new Rectangle( 0, 0, r.width, 30 ) );
		setConstraint( getAttributes(), new Rectangle( 0, 30, r.width, compartmentsize ) );
		setConstraint( getOperations(), new Rectangle( 0, 30 + compartmentsize, r.width, compartmentsize ) );

		if ( kind != null )
		{
			switch ( kind )
			{
				case ISOLINE:
					getClassLabel().setIcon(
							new Image( null, OMTGeoFieldClassFigure.class
									.getResourceAsStream( "imgs/isoline.png" ) ) );
					break;
				case PLANAR_SUBDIVISION:
					getClassLabel().setIcon(
							new Image( null, OMTGeoFieldClassFigure.class
									.getResourceAsStream( "imgs/planar.png" ) ) );
					break;
				case SAMPLING:
					getClassLabel().setIcon(
							new Image( null, OMTGeoFieldClassFigure.class
									.getResourceAsStream( "imgs/sampling.png" ) ) );
					break;
				case TESSELATION:
					getClassLabel().setIcon(
							new Image( null, OMTGeoFieldClassFigure.class
									.getResourceAsStream( "imgs/tessel.png" ) ) );
					break;
				case TRIANGULAR_IRREGULAR_NETWORK:
					getClassLabel().setIcon(
							new Image( null, OMTGeoFieldClassFigure.class
									.getResourceAsStream( "imgs/tin.png" ) ) );
					break;
				default:
					throw new IllegalArgumentException( "Invalid  kind: " + kind );
			}
		}

		getClassLabel().invalidate();
		getAttributes().invalidate();
		getOperations().invalidate();
		rectangle.invalidate();
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

}
