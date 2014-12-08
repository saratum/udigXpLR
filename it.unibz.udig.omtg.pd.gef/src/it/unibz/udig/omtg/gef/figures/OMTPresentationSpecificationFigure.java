package it.unibz.udig.omtg.gef.figures;

import it.unibz.udig.omtg.gef.figures.helpers.CompartmentFigure;

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

public class OMTPresentationSpecificationFigure extends Figure implements OMTPDNodeFigure
{

	private RectangleFigure		rectangle;
	private Label				classLabel;
	private Label				applicationLabel;
	private Label				presentationLabel;
	private CompartmentFigure	pictogramList;
	private CompartmentFigure	specificationList;
	private ConnectionAnchor	connectionAnchor;

	public OMTPresentationSpecificationFigure()
	{
		setLayoutManager( new XYLayout() );
		rectangle = new RectangleFigure();
		add( rectangle );

		classLabel = new Label();
		add( classLabel );

		presentationLabel = new Label();
		add( presentationLabel );

		applicationLabel = new Label();
		add( applicationLabel );

		pictogramList = new CompartmentFigure();
		add( pictogramList );
		specificationList = new CompartmentFigure();
		add( specificationList );
	}

	@Override
	protected void paintFigure( Graphics graphics )
	{

		// TODO bordo DASHED
		Rectangle r = getBounds().getCopy();
		setConstraint( rectangle, new Rectangle( 0, 0, r.width, r.height ) );
		setBorder( null );
		rectangle.setBorder( null );

		LineBorder lb = new LineBorder();
		lb.setStyle( SWT.LINE_DASH );
		lb.setWidth( 2 );
		setBorder( lb );

		getClassLabel().setBorder( null );
		setConstraint( getClassLabel(), new Rectangle( 0, 0, r.width, 20 ) );
		getClassLabel().invalidate();

		getPresentationLabel().setBorder( null );
		setConstraint( getPresentationLabel(), new Rectangle( 0, 0, r.width, 40 ) );
		getPresentationLabel().invalidate();

		getApplicationLabel().setBorder( null );
		setConstraint( getApplicationLabel(), new Rectangle( 0, 0, r.width, 60 ) );
		getApplicationLabel().invalidate();

		getPictogramList().setBorder( new LineBorder() );
		setConstraint( getPictogramList(), new Rectangle( 0, 60, (r.width / 2) - 30, r.height - 60 ) );

		setConstraint( getSpecificationList(), new Rectangle( (r.width / 2) - 30, 60, (r.width / 2) + 30,
				(r.height - 60) ) );

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

	public Label getClassLabel( )
	{
		return classLabel;
	}

	public Label getApplicationLabel( )
	{
		return applicationLabel;
	}

	public Label getPresentationLabel( )
	{
		return presentationLabel;
	}

	public CompartmentFigure getSpecificationList( )
	{
		return specificationList;
	}

	public CompartmentFigure getPictogramList( )
	{
		return pictogramList;
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
