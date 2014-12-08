package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.gef.commands.OMTRelationDeleteCommand;

import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class OMTRelationConnectionEditPolicy extends ConnectionEditPolicy
{

	@Override
	protected OMTRelationDeleteCommand getDeleteCommand( GroupRequest request )
	{
		OMTRelationDeleteCommand command = new OMTRelationDeleteCommand();
		command.setRelation( (OMTRelationship)getHost().getModel() );
		return command;
	}

}
