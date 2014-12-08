package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.cd.model.OMTAggregation;
import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.cd.model.OMTRelationshipType;
import it.unibz.udig.omtg.cd.model.SpatialIntegrityRule;
import it.unibz.udig.omtg.gef.policies.OMTRelationBendpointEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTRelationConnectionEditPolicy;

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

public class OMTRelationshipEditPart extends AbstractConnectionEditPart
{

	OMTRelationshipAdapter	adapter;

	public OMTRelationshipEditPart()
	{
		super();
		adapter = new OMTRelationshipAdapter();
	}

	@Override
	protected void createEditPolicies( )
	{
		installEditPolicy( EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_ROLE, new OMTRelationConnectionEditPolicy() );
		installEditPolicy( EditPolicy.CONNECTION_BENDPOINTS_ROLE, new OMTRelationBendpointEditPolicy() );
	}

	@Override
	protected PolylineConnection createFigure( )
	{
		try
		{
			OMTRelationship model = (OMTRelationship)getModel();
			PolylineConnection c = new PolylineConnection();
			ConnectionEndpointLocator targetLabelLocator = new ConnectionEndpointLocator( c, true );
			targetLabelLocator.setVDistance( 10 );
			if ( model.getLabel() != null )
			{
				int labelLength = model.getLabel().length();

				targetLabelLocator.setUDistance( (labelLength / 2) + 10 );

				Label relationshipLabel = new Label( model.getLabel() );
				c.add( relationshipLabel, targetLabelLocator );
			}
			c.setLineStyle( SWT.LINE_CUSTOM );
			c.setLineDash( new float[ ]
			{ 10.0f, 10.0f } );

			if ( !(getModel() instanceof OMTAggregation) )
			{
				if ( model.getType() != OMTRelationshipType.ARC_ARC_NETWORK )
				{
					if ( model.getSource() != null )
					{
						Label sourceCardinality = new Label( model.getSource().getMultiplicity().toString() );
						ConnectionEndpointLocator sourceEndpointLocator = new ConnectionEndpointLocator( c,
								true );
						sourceEndpointLocator.setVDistance( 2 );
						sourceEndpointLocator.setUDistance( 5 );
						c.add( sourceCardinality, sourceEndpointLocator );
					}

					if ( model.getTarget() != null )
					{
						Label targetCardinality = new Label( model.getTarget().getMultiplicity().toString() );
						ConnectionEndpointLocator targetEndpointLocator = new ConnectionEndpointLocator( c,
								false );
						targetEndpointLocator.setVDistance( 2 );
						targetEndpointLocator.setUDistance( 5 );
						c.add( targetCardinality, targetEndpointLocator );
					}
				}
			}
			c.setConnectionRouter( new BendpointConnectionRouter() );
			c.setTargetDecoration( new PolylineDecoration() );

			decorateConnection( c, model.getRule() );
			decorateLine( c, model.getType() );

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
		List< Point > modelConstraint = ((OMTRelationship)getModel()).getBendpoints();
		List< AbsoluteBendpoint > figureConstraint = new ArrayList< AbsoluteBendpoint >();
		for ( Point p : modelConstraint )
		{
			figureConstraint.add( new AbsoluteBendpoint( p ) );
		}
		connection.setRoutingConstraint( figureConstraint );
	}

	private void decorateLine( PolylineConnection c, OMTRelationshipType type )
	{

		switch ( type )
		{
			case ARC_ARC_NETWORK:
				c.setLineStyle( SWT.LINE_CUSTOM );
				c.setLineDash( new float[ ]
				{ 10.0f, 10.0f } );
				// final Point start = c.getStart();
				// final Point end = c.getEnd();

				// c.setConnectionRouter(new AbstractRouter()
				// {
				//
				// @Override
				// public void route(Connection connection)
				// {
				// PointList points = connection.getPoints();
				// points.removeAllPoints();
				//
				// points.addPoint(new Point(start.x, 200));
				// points.addPoint(new Point(200,end.y));
				//
				//
				// connection.setPoints(points);
				//
				// }
				// });
				break;
			case ARC_NODE_NETWORK:
				c.setLineStyle( SWT.LINE_CUSTOM );
				c.setLineDash( new float[ ]
				{ 15.0f, 15.0f } );

				break;
			case SPATIAL:
				c.setLineStyle( SWT.LINE_CUSTOM );
				c.setLineDash( new float[ ]
				{ 5.0f, 5.0f } );

				break;
			case SIMPLE_ASSOCIATION:
				c.setLineStyle( SWT.LINE_SOLID );
				c.setConnectionRouter( new BendpointConnectionRouter() );
				break;
			default:
				throw new IllegalArgumentException( "No case for type " + type );
		}

	}

	private void decorateConnection( PolylineConnection connection, SpatialIntegrityRule kind )
	{
		switch ( kind )
		{
			case ADJACENT_TO:
				//				CircleDecoration agentDecoration = new CircleDecoration();
				//				agentDecoration.setBackgroundColor(ColorConstants.black);
				//				agentDecoration.setFill(true);
				//				connection.setTargetDecoration(agentDecoration);
				//				break;
			case COINCIDE:
			case CONTAIN:
			case CROSS:
			case DISJOINT:
			case IN:
			case NEAR:
			case OVERLAP:
			case TOUCH:
			case NONE:
				connection.setTargetDecoration( new PolylineDecoration() );
				break;
			default:
				throw new IllegalArgumentException( "No case for kind " + kind );
		}

	}

	@Override
	public void activate( )
	{
		if ( !isActive() )
		{
			((OMTRelationship)getModel()).eAdapters().add( adapter );
		}
		super.activate();
	}

	@Override
	public void deactivate( )
	{
		if ( isActive() )
		{
			((OMTRelationship)getModel()).eAdapters().remove( adapter );
		}
		super.deactivate();
	}

	public class OMTRelationshipAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshVisuals();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTRelationship)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTRelationship.class );
		}
	}
}
