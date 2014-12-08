package it.unibz.udig.omtg.gef.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

public class OMTNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy
{

	@Override
	protected Command getConnectionCompleteCommand( CreateConnectionRequest request )
	{
		return null;
	}

	@Override
	protected Command getConnectionCreateCommand( CreateConnectionRequest request )
	{
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

	//	
	//	private static final Dimension DEFAULT_AGGREGATOR_DIMENSION = new Dimension(30, 30);
	//
	//	@Override
	//	protected Command getConnectionCreateCommand(CreateConnectionRequest request)
	//	{
	//
	//		if (request.getSourceEditPart() instanceof OMTGeneralizationEditPart)
	//		{
	//			return null;
	//		}
	//
	//		if (request.getNewObject() instanceof OMTGeneralization)
	//		{
	//			request.setStartCommand(new Command()
	//			{
	//			});
	//			return request.getStartCommand();
	//		}
	//
	//		OMTRelationCreateCommand result = new OMTRelationCreateCommand();
	//		result.setSource((OMTNode) getHost().getModel());
	//		result.setRelation((OMTRelationship) request.getNewObject());
	//		result.setDiagram(((OMTNode) getHost().getModel()).getDiagram());
	//		request.setStartCommand(result);
	//		return result;
	//	}
	//
	//	@Override
	//	protected Command getConnectionCompleteCommand(CreateConnectionRequest request)
	//	{
	//		if (request.getStartCommand() == null || request.getTargetEditPart() instanceof OMTGeneralizationEditPart)
	//		{
	//			return null;
	//		}
	//
	//		Command command = null;
	//
	//		if (request.getNewObject() instanceof OMTGeneralization)
	//		{
	//			// create a structural link based on the request.
	//			command = handleRequest(request);
	//		}
	//		else
	//		{
	//			// Simple link creation command.
	//			OMTRelationCreateCommand linkCreateCommand = (OMTRelationCreateCommand) request.getStartCommand();
	//			linkCreateCommand.setTarget((OMTNode) getHost().getModel());
	//			command = linkCreateCommand;
	//		}
	//
	//		return command;
	//
	//	}
	//
	//	@Override
	//	protected Command getReconnectTargetCommand(ReconnectRequest request)
	//	{
	//		return null;
	//	}
	//
	//	@Override
	//	protected Command getReconnectSourceCommand(ReconnectRequest request)
	//	{
	//		return null;
	//	}
	//
	//	private Command handleRequest(CreateConnectionRequest request)
	//	{
	//		Command command = null;
	//
	//		OMTNode sourceNode = (OMTNode) request.getSourceEditPart().getModel();
	//		OMTNode targetNode = (OMTNode) request.getTargetEditPart().getModel();
	//		OMTGeneralization aggregatorNode = (OMTGeneralization) request.getNewObject();
	//
	//		boolean aggregatorFound = false;
	//		for (OMTRelationship structuralLink : sourceNode.getOutgoingGeneralizations())
	//		{
	//			OMTGeneralization existingAggregator = (OMTGeneralization) structuralLink.getTarget();
	//			if (existingAggregator.getKind() == aggregatorNode.getKind())
	//			{
	//				aggregatorFound = true;
	//				aggregatorNode = existingAggregator;
	//			}
	//		}
	//
	//		if (aggregatorFound)
	//		{
	//			// Just create a link from the aggregator to the target.
	//			OMTRelationCreateCommand linkCreateCommand = new OMTRelationCreateCommand();
	//			linkCreateCommand.setSource(aggregatorNode);
	//			linkCreateCommand.setTarget(targetNode);
	//			linkCreateCommand.setDiagram(aggregatorNode.getDiagram());
	//			linkCreateCommand.setRelation(OMTFactory.eINSTANCE.createOMTRelationship());
	//
	//			command = linkCreateCommand;
	//		}
	//		else
	//		{
	//			// Create a compound command consisting of three commands.
	//			CompoundCommand compoundCommand = new CompoundCommand();
	//			// create aggregator
	//			OMTNodeCreateCommand createAggregatorCommand = createCreateAggregatorNodeCommand(sourceNode, targetNode, aggregatorNode);
	//			compoundCommand.add(createAggregatorCommand);
	//			// connect aggregator to source.
	//			OMTRelationCreateCommand sourceLinkCreateCommand = createCreateOPMLlinkCreateCommand(sourceNode, aggregatorNode, sourceNode.getDiagram());
	//			compoundCommand.add(sourceLinkCreateCommand);
	//			// connect aggregator to target.
	//			OMTRelationCreateCommand targetLinkCreateCommand = createCreateOPMLlinkCreateCommand(aggregatorNode, targetNode, sourceNode.getDiagram());
	//			compoundCommand.add(targetLinkCreateCommand);
	//
	//			command = compoundCommand;
	//		}
	//
	//		return command;
	//	}
	//
	//	public OMTNodeCreateCommand createCreateAggregatorNodeCommand(OMTNode source, OMTNode target, OMTNode aggregator)
	//	{
	//		OMTNodeCreateCommand command = new OMTNodeCreateCommand();
	//		command.setNode(aggregator);
	//		command.setParent(source.getDiagram());
	//
	//		// Calculate location of aggregator, between the source and targetnodes.
	//		Rectangle sourceConstraints = source.getConstraint();
	//		Rectangle targetConstraints = target.getConstraint();
	//		Point sourceCenter = new Point(sourceConstraints.x + sourceConstraints.width / 2, sourceConstraints.y + sourceConstraints.height / 2);
	//		Point targetCenter = new Point(targetConstraints.x + targetConstraints.width / 2, targetConstraints.y + targetConstraints.height / 2);
	//		Point aggregatorLeftTopCorner = new Point();
	//		aggregatorLeftTopCorner.x = sourceCenter.x + (targetCenter.x - sourceCenter.x) / 2 - DEFAULT_AGGREGATOR_DIMENSION.width / 2;
	//		aggregatorLeftTopCorner.y = sourceCenter.y + (targetCenter.y - sourceCenter.y) / 2 - DEFAULT_AGGREGATOR_DIMENSION.height / 2;
	//		if (aggregatorLeftTopCorner.x < 0)
	//		{
	//			aggregatorLeftTopCorner.x = 0;
	//		}
	//		if (aggregatorLeftTopCorner.y < 0)
	//		{
	//			aggregatorLeftTopCorner.y = 0;
	//		}
	//		command.setConstraints(new Rectangle(aggregatorLeftTopCorner, DEFAULT_AGGREGATOR_DIMENSION));
	//
	//		return command;
	//	}
	//
	//	private OMTRelationCreateCommand createCreateOPMLlinkCreateCommand(OMTNode source, OMTNode target, OMTClassDiagram diagram)
	//	{
	//		OMTRelationCreateCommand command = new OMTRelationCreateCommand();
	//		command.setSource(source);
	//		command.setTarget(target);
	//		command.setDiagram(diagram);
	//		command.setRelation(OMTFactory.eINSTANCE.createOMTRelationship());
	//		return command;
	//	}

}
