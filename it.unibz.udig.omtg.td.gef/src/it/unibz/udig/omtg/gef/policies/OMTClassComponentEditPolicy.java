package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTClassDeleteCommand;
import it.unibz.udig.omtg.td.model.OMTClass;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class OMTClassComponentEditPolicy extends ComponentEditPolicy
{

	@Override
	protected Command createDeleteCommand( GroupRequest deleteRequest )
	{
		OMTClassDeleteCommand command = new OMTClassDeleteCommand();
		command.setNode( (OMTClass)getHost().getModel() );
		return command;
	}
}
