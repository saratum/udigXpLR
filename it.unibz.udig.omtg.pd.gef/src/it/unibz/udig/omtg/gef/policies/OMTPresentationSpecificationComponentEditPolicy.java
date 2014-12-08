package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTPresentationSpecificationDeleteCommand;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class OMTPresentationSpecificationComponentEditPolicy extends ComponentEditPolicy
{

	@Override
	protected Command createDeleteCommand( GroupRequest deleteRequest )
	{
		OMTPresentationSpecificationDeleteCommand command = new OMTPresentationSpecificationDeleteCommand();
		command.setNode( (OMTPresentationSpecification)getHost().getModel() );
		return command;
	}

}
