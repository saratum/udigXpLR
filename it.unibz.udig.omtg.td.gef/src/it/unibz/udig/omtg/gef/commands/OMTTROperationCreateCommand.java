package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTTROperation;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;

import org.eclipse.gef.commands.Command;

public class OMTTROperationCreateCommand extends Command
{

	private OMTClass					source;
	private OMTClass					target;
	private OMTTROperation				relation;
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
		relation.getSource().setOutgoingTrOperation( null );
		relation.setSource( null );
		relation.getTarget().setIncomingTrOperation( null );
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

	public void setRelation( OMTTROperation relation )
	{
		this.relation = relation;
	}

	public void setDiagram( OMTTransformationDiagram diagram )
	{
		this.diagram = diagram;
	}

}
