package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTTPOperationCreateCommand;
import it.unibz.udig.omtg.gef.parts.OMTClassEditPart;
import it.unibz.udig.omtg.gef.parts.OMTPresentationSpecificationEditPart;
import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

public class OMTPDNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy
{

	@Override
	protected Command getConnectionCompleteCommand( CreateConnectionRequest request )
	{
		Command c = null;

		// non voglio che mostri la possibilit� di connettersi allo end a un class
		if ( request.getStartCommand() == null || request.getTargetEditPart() instanceof OMTClassEditPart )
			return null;

		OMTTPOperationCreateCommand linkCreateCommand = (OMTTPOperationCreateCommand)request
				.getStartCommand();
		linkCreateCommand.setTarget( (OMTPresentationSpecification)getHost().getModel() );
		c = linkCreateCommand;

		return c;
	}

	@Override
	protected Command getConnectionCreateCommand( CreateConnectionRequest request )
	{
		// non voglio che mostri la possibilit� di connettersi allo start a un PS
		if ( request.getSourceEditPart() instanceof OMTPresentationSpecificationEditPart ) return null;

		if ( OMTPresentationSpecification.class.isAssignableFrom( request.getNewObject().getClass() ) )
		{
			request.setStartCommand( new Command()
			{
			} );
			return request.getStartCommand();
		}

		OMTTPOperationCreateCommand command = new OMTTPOperationCreateCommand();

		command.setRelation( (OMTTPOperation)request.getNewObject() );

		if ( getHost().getModel() instanceof OMTClass )
		{
			command.setSource( (OMTClass)getHost().getModel() );
			command.setDiagram( ((OMTClass)getHost().getModel()).getDiagram() );
		}

		request.setStartCommand( command );
		return command;

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
