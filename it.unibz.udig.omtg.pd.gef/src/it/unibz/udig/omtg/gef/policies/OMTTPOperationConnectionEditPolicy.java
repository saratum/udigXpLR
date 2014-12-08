package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTTPOperationDeleteCommand;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class OMTTPOperationConnectionEditPolicy extends ConnectionEditPolicy
{

	@Override
	protected OMTTPOperationDeleteCommand getDeleteCommand( GroupRequest request )
	{
		OMTTPOperationDeleteCommand command = new OMTTPOperationDeleteCommand();
		command.setOperation( (OMTTPOperation)getHost().getModel() );
		return command;
	}

}
