package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTOperationDeleteCommand;
import it.unibz.udig.omtg.td.model.OMTOperation;

import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class OMTOperationConnectionEditPolicy extends ConnectionEditPolicy
{

	@Override
	protected OMTOperationDeleteCommand getDeleteCommand( GroupRequest request )
	{
		OMTOperationDeleteCommand command = new OMTOperationDeleteCommand();
		command.setRelation( (OMTOperation)getHost().getModel() );
		return command;
	}

}
