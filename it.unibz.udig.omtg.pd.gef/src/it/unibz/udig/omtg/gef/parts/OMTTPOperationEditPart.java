package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.policies.OMTTPOperationBendpointEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTTPOperationConnectionEditPolicy;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.swt.SWT;

public class OMTTPOperationEditPart extends AbstractConnectionEditPart
{

	OMTTPOperationAdapter	adapter;

	public OMTTPOperationEditPart()
	{
		super();
		adapter = new OMTTPOperationAdapter();
	}

	@Override
	protected void createEditPolicies( )
	{
		installEditPolicy( EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_ROLE, new OMTTPOperationConnectionEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_BENDPOINTS_ROLE, new OMTTPOperationBendpointEditPolicy() );
	}

	@Override
	protected PolylineConnection createFigure( )
	{
		try
		{
			OMTTPOperation model = (OMTTPOperation)getModel();
			PolylineConnection c = new PolylineConnection();
			ConnectionEndpointLocator targetLabelLocator = new ConnectionEndpointLocator( c, true );
			targetLabelLocator.setVDistance( 10 );
			if ( model.getExpression() != null )
			{
				int labelLength = model.getExpression().length();

				targetLabelLocator.setUDistance( (labelLength / 2) + 10 );

				Label relationshipLabel = new Label( model.getExpression() );
				c.add( relationshipLabel, targetLabelLocator );
			}
			c.setLineStyle( SWT.LINE_CUSTOM );
			c.setLineDash( new float[ ]
			{ 10.0f, 10.0f } );

			c.setConnectionRouter( new BendpointConnectionRouter() );
			c.setTargetDecoration( new PolylineDecoration() );
			return c;
		}
		catch ( Exception ex )
		{
			ex.printStackTrace();
			return null;
		}

	}

	@Override
	protected void refreshVisuals( )
	{
		Connection connection = getConnectionFigure();
		List< Point > modelConstraint = ((OMTTPOperation)getModel()).getBendpoints();
		List< AbsoluteBendpoint > figureConstraint = new ArrayList< AbsoluteBendpoint >();
		for ( Point p : modelConstraint )
		{
			figureConstraint.add( new AbsoluteBendpoint( p ) );
		}
		connection.setRoutingConstraint( figureConstraint );
	}

	@Override
	public void activate( )
	{
		if ( !isActive() )
		{
			((OMTTPOperation)getModel()).eAdapters().add( adapter );
		}
		super.activate();
	}

	@Override
	public void deactivate( )
	{
		if ( isActive() )
		{
			((OMTTPOperation)getModel()).eAdapters().remove( adapter );
		}
		super.deactivate();
	}

	public class OMTTPOperationAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshVisuals();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTTPOperation)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTTPOperation.class );
		}
	}
}
