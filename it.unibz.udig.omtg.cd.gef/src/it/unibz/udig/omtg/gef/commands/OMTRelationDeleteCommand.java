package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTRelationship;

import org.eclipse.gef.commands.Command;

public class OMTRelationDeleteCommand extends Command
{

	private OMTRelationship	relation;
	private OMTClassDiagram	diagram;
	private OMTClass		source;
	private OMTClass		target;

	@Override
	public boolean canExecute( )
	{
		return relation != null;
	}

	@Override
	public void execute( )
	{
		diagram = relation.getDiagram();
		source = relation.getSource();
		target = relation.getTarget();

		relation.setSource( null );
		relation.setTarget( null );
		relation.setDiagram( null );
	}

	@Override
	public void undo( )
	{
		relation.setSource( source );
		relation.setTarget( target );
		relation.setDiagram( diagram );
	}

	public void setRelation( final OMTRelationship rel )
	{
		relation = rel;
	}

}
