package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;

import org.eclipse.gef.commands.Command;

public class OMTOperationDeleteCommand extends Command
{

	private OMTOperation				relation;
	private OMTTransformationDiagram	diagram;
	private OMTClass					source;
	private OMTClass					target;

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

	public void setRelation( final OMTOperation rel )
	{
		relation = rel;
	}

}
