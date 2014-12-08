package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTTPOperationCreateBendpointCommand;
import it.unibz.udig.omtg.gef.commands.OMTTPOperationDeleteBendpointCommand;
import it.unibz.udig.omtg.gef.commands.OMTTPOperationMoveBendpointCommand;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

public class OMTTPOperationBendpointEditPolicy extends BendpointEditPolicy
{

	@Override
	protected Command getCreateBendpointCommand( BendpointRequest request )
	{
		OMTTPOperationCreateBendpointCommand com = new OMTTPOperationCreateBendpointCommand();

		Point p = request.getLocation();
		Connection conn = getConnection();
		conn.translateToRelative( p );
		Point ref1 = conn.getSourceAnchor().getReferencePoint();
		Point ref2 = conn.getTargetAnchor().getReferencePoint();
		conn.translateToRelative( ref1 );
		conn.translateToRelative( ref2 );
		com.setLocation( p );
		com.setOMTLink( (OMTTPOperation)request.getSource().getModel() );
		com.setIndex( request.getIndex() );
		return com;
	}

	@Override
	protected Command getDeleteBendpointCommand( BendpointRequest request )
	{
		OMTTPOperationDeleteBendpointCommand command = new OMTTPOperationDeleteBendpointCommand();
		command.setRelation( (OMTTPOperation)request.getSource().getModel() );
		command.setIndex( request.getIndex() );
		return command;

	}

	@Override
	protected Command getMoveBendpointCommand( BendpointRequest request )
	{
		Point p = request.getLocation();
		OMTTPOperationMoveBendpointCommand command = new OMTTPOperationMoveBendpointCommand();
		command.setRelation( (OMTTPOperation)request.getSource().getModel() );
		command.setLocation( p );
		command.setIndex( request.getIndex() );

		return command;
	}
}
