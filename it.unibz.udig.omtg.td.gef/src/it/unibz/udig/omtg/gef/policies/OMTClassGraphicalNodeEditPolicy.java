package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTOperationCreateCommand;
import it.unibz.udig.omtg.gef.commands.OMTTROperationCreateCommand;
import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTROperation;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

public class OMTClassGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy
{

	@Override
	protected Command getConnectionCompleteCommand( CreateConnectionRequest request )
	{
		Command command = null;

		// Simple link creation command.
		if ( request.getStartCommand() instanceof OMTOperationCreateCommand )
		{
			OMTOperationCreateCommand linkCreateCommand = (OMTOperationCreateCommand)request
					.getStartCommand();
			linkCreateCommand.setTarget( (OMTClass)getHost().getModel() );
			command = linkCreateCommand;
		}
		else if ( request.getStartCommand() instanceof OMTTROperationCreateCommand )
		{
			OMTTROperationCreateCommand linkCreateCommand = (OMTTROperationCreateCommand)request
					.getStartCommand();
			linkCreateCommand.setTarget( (OMTClass)getHost().getModel() );
			command = linkCreateCommand;
		}

		return command;
	}

	@Override
	protected Command getConnectionCreateCommand( CreateConnectionRequest request )
	{

		if ( request.getNewObjectType().equals( OMTOperation.class ) )
		{
			OMTOperationCreateCommand command = new OMTOperationCreateCommand();
			command.setSource( (OMTClass)getHost().getModel() );
			command.setRelation( (OMTOperation)request.getNewObject() );
			command.setDiagram( ((OMTClass)getHost().getModel()).getDiagram() );
			request.setStartCommand( command );
			return command;
		}
		else if ( request.getNewObjectType().equals( OMTTROperation.class ) )
		{
			OMTTROperationCreateCommand command = new OMTTROperationCreateCommand();
			command.setSource( (OMTClass)getHost().getModel() );
			command.setRelation( (OMTTROperation)request.getNewObject() );
			command.setDiagram( ((OMTClass)getHost().getModel()).getDiagram() );
			request.setStartCommand( command );
			return command;
		}
		else
			return null;

	}

	@Override
	protected Command getReconnectTargetCommand( ReconnectRequest request )
	{
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand( ReconnectRequest request )
	{
		return null;
	}

}
