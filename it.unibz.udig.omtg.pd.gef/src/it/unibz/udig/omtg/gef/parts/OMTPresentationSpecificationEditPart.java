package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.figures.OMTPDNodeFigure;
import it.unibz.udig.omtg.gef.figures.OMTPresentationSpecificationFigure;
import it.unibz.udig.omtg.gef.policies.OMTClassLabelDirectEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTPDNodeGraphicalNodeEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTPresentationSpecificationComponentEditPolicy;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;
import it.unibz.udig.omtg.pd.model.Pictogram;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.graphics.Image;

public class OMTPresentationSpecificationEditPart extends AbstractGraphicalEditPart implements NodeEditPart
{

	OMTClassAdapter	adapter;

	public OMTPresentationSpecificationEditPart()
	{
		super();
		adapter = new OMTClassAdapter();
	}

	@Override
	protected void createEditPolicies( )
	{
		installEditPolicy( EditPolicy.COMPONENT_ROLE, new OMTPresentationSpecificationComponentEditPolicy() );
		installEditPolicy( EditPolicy.GRAPHICAL_NODE_ROLE, new OMTPDNodeGraphicalNodeEditPolicy() );
		installEditPolicy( EditPolicy.DIRECT_EDIT_ROLE, new OMTClassLabelDirectEditPolicy() );

	}

	@Override
	protected IFigure createFigure( )
	{
		return new OMTPresentationSpecificationFigure();
	}

	@Override
	protected void refreshVisuals( )
	{
		OMTPresentationSpecificationFigure figure = (OMTPresentationSpecificationFigure)getFigure();
		OMTPresentationSpecification model = (OMTPresentationSpecification)getModel();
		OMTPresentationDiagramEditPart parent = (OMTPresentationDiagramEditPart)getParent();

		figure.getClassLabel().setText( "C: " + model.getClassName() );
		figure.getApplicationLabel().setText( "A:" + model.getApplicationName() );
		figure.getPresentationLabel().setText( "P: " + model.getPresentationName() );

		if ( figure.getSpecificationList() != null ) figure.getSpecificationList().removeAll();
		for ( OMTSpecification s : model.getSpecification() )
			figure.getSpecificationList().add( new Label( s.getName() + " = " + s.getType() ) );

		if ( figure.getPictogramList() != null ) figure.getPictogramList().removeAll();
		for ( Pictogram s : model.getPictogramList() )
		{
			Label l = new Label( s.getMeaning() );
			// TODO sistemare caricamento iconcina
			try
			{
				if ( s.getImageFileLocation() != null )
				{
					InputStream is = OMTPresentationSpecificationEditPart.class.getResourceAsStream( s
							.getImageFileLocation() );
					if ( is != null )
					{
						Image i = new Image( null, is );
						l.setIcon( i );
					}
				}

			}
			catch ( Exception e )
			{
				System.err.println( e.getClass().toString() + " - " + e.getMessage() );
				e.printStackTrace();
			}
			figure.getPictogramList().add( l );
		}

		parent.setLayoutConstraint( this, (IFigure)figure, model.getConstraint() );
	}

	@Override
	public void activate( )
	{
		if ( !isActive() )
		{
			((OMTPresentationSpecification)getModel()).eAdapters().add( adapter );
		}
		super.activate();
	}

	@Override
	public void deactivate( )
	{
		if ( isActive() )
		{
			((OMTPresentationSpecification)getModel()).eAdapters().remove( adapter );
		}
		super.deactivate();
	}

	@Override
	protected List< OMTTPOperation > getModelSourceConnections( )
	{
		return null;
	}

	@Override
	protected List< OMTTPOperation > getModelTargetConnections( )
	{
		ArrayList< OMTTPOperation > rv = new ArrayList< OMTTPOperation >();

		OMTPresentationSpecification model = (OMTPresentationSpecification)getModel();
		if ( model.getIncomingOperation() != null ) rv.add( model.getIncomingOperation() );
		return rv;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor( ConnectionEditPart connection )
	{
		return ((OMTPDNodeFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor( ConnectionEditPart connection )
	{
		return ((OMTPDNodeFigure)getFigure()).getTargetConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor( Request request )
	{
		return ((OMTPDNodeFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor( Request request )
	{
		return ((OMTPDNodeFigure)getFigure()).getTargetConnectionAnchor();
	}

	public class OMTClassAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshVisuals();
			refreshSourceConnections();
			refreshTargetConnections();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTPresentationSpecification)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTPresentationSpecification.class );
		}
	}

}
