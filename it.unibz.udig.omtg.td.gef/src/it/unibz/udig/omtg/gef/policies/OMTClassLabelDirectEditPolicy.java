package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTClassRenameCommand;
import it.unibz.udig.omtg.gef.figures.OMTClassFigure;
import it.unibz.udig.omtg.td.model.OMTClass;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

public class OMTClassLabelDirectEditPolicy extends DirectEditPolicy
{

	@Override
	protected Command getDirectEditCommand( DirectEditRequest request )
	{
		OMTClassRenameCommand command = new OMTClassRenameCommand();
		command.setModel( (OMTClass)getHost().getModel() );
		command.setNewName( (String)request.getCellEditor().getValue() );
		return command;
	}

	@Override
	protected void showCurrentEditValue( DirectEditRequest request )
	{
		String value = (String)request.getCellEditor().getValue();
		((OMTClassFigure)getHostFigure()).getNameLabel().setText( value );
	}

}
