package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.policies.OMTOperationBendpointEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTOperationConnectionEditPolicy;
import it.unibz.udig.omtg.td.model.OMTTROperation;

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

public class OMTTROperationEditPart extends AbstractConnectionEditPart
{

	OMTOperationAdapter	adapter;

	public OMTTROperationEditPart()
	{
		super();
		adapter = new OMTOperationAdapter();
	}

	@Override
	protected void createEditPolicies( )
	{
		installEditPolicy( EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_ROLE, new OMTOperationConnectionEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_BENDPOINTS_ROLE, new OMTOperationBendpointEditPolicy() );
	}

	@Override
	protected PolylineConnection createFigure( )
	{
		try
		{
			OMTTROperation model = (OMTTROperation)getModel();
			PolylineConnection c = new PolylineConnection();
			ConnectionEndpointLocator targetLabelLocator = new ConnectionEndpointLocator( c, true );
			targetLabelLocator.setVDistance( 10 );

			int labelLength = model.getOperation().getLiteral().length();

			targetLabelLocator.setUDistance( (labelLength / 2) + 10 );

			Label relationshipLabel = new Label( model.getOperation().getLiteral() );
			c.add( relationshipLabel, targetLabelLocator );

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
		List< Point > modelConstraint = ((OMTTROperation)getModel()).getBendpoints();
		List< AbsoluteBendpoint > figureConstraint = new ArrayList< AbsoluteBendpoint >();
		for ( Point p : modelConstraint )
		{
			figureConstraint.add( new AbsoluteBendpoint( p ) );
		}
		connection.setRoutingConstraint( figureConstraint );
	}

	class OMTOperationAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshVisuals();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTTROperation)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTTROperation.class );
		}
	}

}
