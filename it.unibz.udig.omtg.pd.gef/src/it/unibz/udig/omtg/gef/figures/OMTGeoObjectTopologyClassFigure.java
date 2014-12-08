package it.unibz.udig.omtg.gef.figures;

import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

public class OMTGeoObjectTopologyClassFigure extends OMTClassFigure
{

	private OMTGeoObjectTopologyClassKind	kind;
	private RectangleFigure					rectangle;
	private ConnectionAnchor				connectionAnchor;

	public OMTGeoObjectTopologyClassFigure(final OMTGeoObjectTopologyClassKind kind)
	{
		setLayoutManager( new XYLayout() );
		rectangle = new RectangleFigure();
		add( rectangle );
		this.kind = kind;

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
				case BIDIRECTIONAL_LINE:
					getClassLabel().setIcon(
							new Image( null, OMTGeoObjectTopologyClassFigure.class
									.getResourceAsStream( "imgs/bidirline.png" ) ) );
					break;
				case NODE:
					getClassLabel().setIcon(
							new Image( null, OMTGeoObjectTopologyClassFigure.class
									.getResourceAsStream( "imgs/node.png" ) ) );
					break;
				case UNIDIRECTIONAL_LINE:
					getClassLabel().setIcon(
							new Image( null, OMTGeoObjectTopologyClassFigure.class
									.getResourceAsStream( "imgs/unidirline.png" ) ) );
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

	@Override
	public IFigure getContentPane( )
	{
		return rectangle;
	}

}
