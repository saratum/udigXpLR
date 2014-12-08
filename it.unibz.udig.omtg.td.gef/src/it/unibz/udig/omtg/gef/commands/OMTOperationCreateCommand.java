package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;

import org.eclipse.gef.commands.Command;

public class OMTOperationCreateCommand extends Command
{

	private OMTClass					source;
	private OMTClass					target;
	private OMTOperation				relation;
	private OMTTransformationDiagram	diagram;

	@Override
	public boolean canExecute( )
	{
		return source != null && target != null && relation != null;
	}

	@Override
	public void execute( )
	{
		relation.setSource( source );
		relation.setTarget( target );
		relation.setDiagram( diagram );

	}

	@Override
	public void undo( )
	{
		relation.getSource().getOutgoingRelations().remove( relation );
		relation.setSource( null );
		relation.getTarget().getIncomingRelations().remove( relation );
		relation.setTarget( null );
		relation.setDiagram( null );
	}

	public void setTarget( OMTClass target )
	{
		this.target = target;
	}

	public void setSource( OMTClass source )
	{
		this.source = source;
	}

	public void setRelation( OMTOperation relation )
	{
		this.relation = relation;
	}

	public void setDiagram( OMTTransformationDiagram diagram )
	{
		this.diagram = diagram;
	}
}
