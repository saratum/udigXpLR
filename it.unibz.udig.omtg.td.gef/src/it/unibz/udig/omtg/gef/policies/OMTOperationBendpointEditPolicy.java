package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTOperationCreateBendpointCommand;
import it.unibz.udig.omtg.gef.commands.OMTOperationDeleteBendpointCommand;
import it.unibz.udig.omtg.gef.commands.OMTOperationMoveBendpointCommand;
import it.unibz.udig.omtg.td.model.OMTOperation;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

public class OMTOperationBendpointEditPolicy extends BendpointEditPolicy
{

	@Override
	protected Command getCreateBendpointCommand( BendpointRequest request )
	{
		OMTOperationCreateBendpointCommand com = new OMTOperationCreateBendpointCommand();

		Point p = request.getLocation();
		Connection conn = getConnection();
		conn.translateToRelative( p );
		Point ref1 = conn.getSourceAnchor().getReferencePoint();
		Point ref2 = conn.getTargetAnchor().getReferencePoint();
		conn.translateToRelative( ref1 );
		conn.translateToRelative( ref2 );
		com.setLocation( p );
		com.setOMTLink( (OMTOperation)request.getSource().getModel() );
		com.setIndex( request.getIndex() );
		return com;
	}

	@Override
	protected Command getDeleteBendpointCommand( BendpointRequest request )
	{
		OMTOperationDeleteBendpointCommand command = new OMTOperationDeleteBendpointCommand();
		command.setRelation( (OMTOperation)request.getSource().getModel() );
		command.setIndex( request.getIndex() );
		return command;

	}

	@Override
	protected Command getMoveBendpointCommand( BendpointRequest request )
	{
		Point p = request.getLocation();
		OMTOperationMoveBendpointCommand command = new OMTOperationMoveBendpointCommand();
		command.setRelation( (OMTOperation)request.getSource().getModel() );
		command.setLocation( p );
		command.setIndex( request.getIndex() );

		return command;
	}

}
