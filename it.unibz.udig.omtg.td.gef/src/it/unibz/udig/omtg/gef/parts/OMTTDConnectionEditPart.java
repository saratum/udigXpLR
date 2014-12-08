package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.policies.OMTOperationBendpointEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTOperationConnectionEditPolicy;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTDConnection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

public class OMTTDConnectionEditPart extends AbstractConnectionEditPart
{

	OMTTDConnectionAdapter	adapter;

	public OMTTDConnectionEditPart()
	{
		super();
		adapter = new OMTTDConnectionAdapter();
	}

	@Override
	protected void createEditPolicies( )
	{
		installEditPolicy( EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_ROLE, new OMTOperationConnectionEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_BENDPOINTS_ROLE, new OMTOperationBendpointEditPolicy() );
	}

	@Override
	protected void refreshVisuals( )
	{
		Connection connection = getConnectionFigure();
		List< Point > modelConstraint = ((OMTTDConnection)getModel()).getBendpoints();
		List< AbsoluteBendpoint > figureConstraint = new ArrayList< AbsoluteBendpoint >();
		for ( Point p : modelConstraint )
		{
			figureConstraint.add( new AbsoluteBendpoint( p ) );
		}
		connection.setRoutingConstraint( figureConstraint );
	}

	ConnectionEndpointLocator	targetLabelLocator;

	@Override
	protected PolylineConnection createFigure( )
	{
		PolylineConnection c = new PolylineConnection();
		targetLabelLocator = new ConnectionEndpointLocator( c, true );
		targetLabelLocator.setVDistance( 10 );

		c.setConnectionRouter( new BendpointConnectionRouter() );
		c.setTargetDecoration( new PolylineDecoration() );
		return c;
	}

	public ConnectionEndpointLocator getTargetLabelLocator( )
	{
		return targetLabelLocator;
	}

	class OMTTDConnectionAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshVisuals();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTOperation)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTOperation.class );
		}
	}

}
