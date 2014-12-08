package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.gef.commands.Command;

public class OMTTPOperationDeleteCommand extends Command
{

	private OMTTPOperation					relation;
	private OMTPresentationDiagram			diagram;
	private OMTClass						source;
	private OMTPresentationSpecification	target;

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

	public void setOperation( final OMTTPOperation rel )
	{
		relation = rel;
	}

}
