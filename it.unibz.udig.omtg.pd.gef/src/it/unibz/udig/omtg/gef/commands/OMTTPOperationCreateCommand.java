package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.gef.commands.Command;

public class OMTTPOperationCreateCommand extends Command
{

	private OMTClass						source;
	private OMTPresentationSpecification	target;
	private OMTTPOperation					relation;
	private OMTPresentationDiagram			diagram;

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
		relation.getTarget().setIncomingOperation( null );
		relation.setSource( null );
		relation.setTarget( null );
		relation.setDiagram( null );
	}

	public void setSource( OMTClass source )
	{
		this.source = source;
	}

	public void setTarget( OMTPresentationSpecification target )
	{
		this.target = target;
	}

	public void setRelation( OMTTPOperation relation )
	{
		this.relation = relation;
	}

	public void setDiagram( OMTPresentationDiagram diagram )
	{
		this.diagram = diagram;
	}

}
