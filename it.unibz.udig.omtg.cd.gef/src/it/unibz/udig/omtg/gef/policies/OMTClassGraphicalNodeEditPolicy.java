package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTGeneralization;
import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.gef.commands.OMTClassCreateCommand;
import it.unibz.udig.omtg.gef.commands.OMTRelationCreateCommand;
import it.unibz.udig.omtg.gef.parts.OMTGeneralizationEditPart;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

public class OMTClassGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy
{

	private static final Dimension	DEFAULT_AGGREGATOR_DIMENSION	= new Dimension( 30, 30 );

	@Override
	protected Command getConnectionCompleteCommand( CreateConnectionRequest request )
	{
		if ( request.getStartCommand() == null
				|| request.getTargetEditPart() instanceof OMTGeneralizationEditPart )
		{
			return null;
		}

		Command command = null;

		if ( request.getNewObject() instanceof OMTGeneralization )
		{
			// create a structural link based on the request.
			//			command = handleOMTGeneralizationRequest(request);
		}
		else
		{
			// Simple link creation command.
			OMTRelationCreateCommand linkCreateCommand = (OMTRelationCreateCommand)request.getStartCommand();
			linkCreateCommand.setTarget( (OMTClass)getHost().getModel() );
			command = linkCreateCommand;

		}

		return command;
	}

	//	private Command handleOMTGeneralizationRequest(CreateConnectionRequest request)
	//	{
	//		Command command = null;
	//		
	//		OMTClass sourceNode = (OMTClass) request.getSourceEditPart().getModel();
	//		OMTClass targetNode = (OMTClass) request.getTargetEditPart().getModel();
	//		OMTGeneralization aggregatorNode = (OMTGeneralization) request.getNewObject();
	//		
	//		// Search for an outgoing structural link aggregator matching the requested kind.
	//		boolean aggregatorFound = false;
	//		for (OMTRelationship rel : sourceNode.getOutgoingRelations())
	//		{
	//			OMTGeneralization existingAggregator = (OMTGeneralization) rel.getTarget();
	//			if (existingAggregator.getKind() == aggregatorNode.getKind())
	//			{
	//				aggregatorFound = true;
	//				aggregatorNode = existingAggregator;
	//			}
	//		}
	//		
	//		if (aggregatorFound)
	//		{
	//			//            // Just create a link from the aggregator to the target.
	//			            OMTRelationCreateCommand linkCreateCommand = createCreateOPMLlinkCreateCommand(aggregatorNode, targetNode, aggregatorNode.getDiagram());
	//			           command = linkCreateCommand;
	//		}
	//		else
	//		{
	//			//            // Create a compound command consisting of three commands.
	//			            CompoundCommand compoundCommand = new CompoundCommand();
	//			//            // create aggregator
	//			            OMTClassCreateCommand createAggregatorCommand = createCreateAggregatorNodeCommand(sourceNode, targetNode, aggregatorNode);
	//			            compoundCommand.add(createAggregatorCommand);
	//			//            // connect aggregator to source.
	//			            OMTRelationCreateCommand sourceLinkCreateCommand = createCreateOPMLlinkCreateCommand(sourceNode, aggregatorNode, sourceNode.getDiagram());
	//			            compoundCommand.add(sourceLinkCreateCommand);
	//			//            // connect aggregator to target.
	//			            OMTRelationCreateCommand targetLinkCreateCommand = createCreateOPMLlinkCreateCommand(aggregatorNode, targetNode, sourceNode.getDiagram());
	//			            compoundCommand.add(targetLinkCreateCommand);
	//			//
	//			            command = compoundCommand;
	//		}
	//		
	//		return command;
	//	}

	public OMTClassCreateCommand createCreateAggregatorNodeCommand( OMTClass source, OMTClass target,
			OMTClass aggregator )
	{
		OMTClassCreateCommand command = new OMTClassCreateCommand();
		command.setNode( aggregator );
		command.setParent( source.getDiagram() );

		// Calculate location of aggregator, between the source and targetnodes.
		Rectangle sourceConstraints = source.getConstraint();
		Rectangle targetConstraints = target.getConstraint();
		Point sourceCenter = new Point( sourceConstraints.x + sourceConstraints.width / 2,
				sourceConstraints.y + sourceConstraints.height / 2 );
		Point targetCenter = new Point( targetConstraints.x + targetConstraints.width / 2,
				targetConstraints.y + targetConstraints.height / 2 );
		Point aggregatorLeftTopCorner = new Point();
		aggregatorLeftTopCorner.x = sourceCenter.x + (targetCenter.x - sourceCenter.x) / 2
				- DEFAULT_AGGREGATOR_DIMENSION.width / 2;
		aggregatorLeftTopCorner.y = sourceCenter.y + (targetCenter.y - sourceCenter.y) / 2
				- DEFAULT_AGGREGATOR_DIMENSION.height / 2;
		if ( aggregatorLeftTopCorner.x < 0 )
		{
			aggregatorLeftTopCorner.x = 0;
		}
		if ( aggregatorLeftTopCorner.y < 0 )
		{
			aggregatorLeftTopCorner.y = 0;
		}
		command.setConstraints( new Rectangle( aggregatorLeftTopCorner, DEFAULT_AGGREGATOR_DIMENSION ) );

		return command;
	}

	private OMTRelationCreateCommand createCreateOPMLlinkCreateCommand( OMTClass source, OMTClass target,
			OMTClassDiagram opd )
	{
		OMTRelationCreateCommand command = new OMTRelationCreateCommand();
		command.setSource( source );
		command.setTarget( target );
		command.setDiagram( opd );
		OMTRelationship link = CDFactory.eINSTANCE.createOMTRelationship();

		command.setRelation( link );
		return command;
	}

	@Override
	protected Command getConnectionCreateCommand( CreateConnectionRequest request )
	{

		if ( request.getSourceEditPart() instanceof OMTGeneralization )
		{
			return null;
		}

		if ( request.getNewObject() instanceof OMTGeneralization )
		{
			request.setStartCommand( new Command()
			{
			} );
			return request.getStartCommand();
		}

		OMTRelationCreateCommand command = new OMTRelationCreateCommand();
		command.setSource( (OMTClass)getHost().getModel() );
		command.setRelation( (OMTRelationship)request.getNewObject() );
		command.setDiagram( ((OMTClass)getHost().getModel()).getDiagram() );
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
