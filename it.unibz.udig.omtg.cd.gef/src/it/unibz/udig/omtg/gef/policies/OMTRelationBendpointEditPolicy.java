package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.gef.commands.OMTRelationCreateBendpointCommand;
import it.unibz.udig.omtg.gef.commands.OMTRelationDeleteBendpointCommand;
import it.unibz.udig.omtg.gef.commands.OMTRelationMoveBendpointCommand;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

public class OMTRelationBendpointEditPolicy extends BendpointEditPolicy
{

	@Override
	protected Command getCreateBendpointCommand( BendpointRequest request )
	{
		OMTRelationCreateBendpointCommand com = new OMTRelationCreateBendpointCommand();
		Point p = request.getLocation();
		Connection conn = getConnection();
		conn.translateToRelative( p );
		Point ref1 = conn.getSourceAnchor().getReferencePoint();
		Point ref2 = conn.getTargetAnchor().getReferencePoint();
		conn.translateToRelative( ref1 );
		conn.translateToRelative( ref2 );
		com.setLocation( p );
		com.setOMTLink( (OMTRelationship)request.getSource().getModel() );
		com.setIndex( request.getIndex() );
		return com;
	}

	@Override
	protected Command getDeleteBendpointCommand( BendpointRequest request )
	{
		OMTRelationDeleteBendpointCommand command = new OMTRelationDeleteBendpointCommand();
		command.setRelation( (OMTRelationship)request.getSource().getModel() );
		command.setIndex( request.getIndex() );
		return command;

	}

	@Override
	protected Command getMoveBendpointCommand( BendpointRequest request )
	{
		Point p = request.getLocation();
		OMTRelationMoveBendpointCommand command = new OMTRelationMoveBendpointCommand();
		command.setRelation( (OMTRelationship)request.getSource().getModel() );
		command.setLocation( p );
		command.setIndex( request.getIndex() );

		return command;
	}

}
