package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

public class OMTClassDeleteCommand extends Command
{

	private OMTClass						cl;
	private OMTPresentationDiagram			diagram;
	private List< OMTTPOperation >			operations;

	private Map< OMTTPOperation, OMTClass >	operationSources;
	private Map< OMTTPOperation, OMTClass >	operationTargets;

	@Override
	public void execute( )
	{
		detachRelations();
		cl.setDiagram( null );
	}

	@Override
	public void undo( )
	{
		reattachRelations();
		cl.setDiagram( diagram );
	}

	public void setNode( OMTClass n )
	{
		this.cl = n;
		this.diagram = n.getDiagram();

	}

	private void detachRelations( )
	{
		operations = new ArrayList< OMTTPOperation >();
		operationSources = new HashMap< OMTTPOperation, OMTClass >();
		operationTargets = new HashMap< OMTTPOperation, OMTClass >();
		operations.addAll( cl.getOutgoingRelations() );
		for ( OMTTPOperation rel : operations )
		{
			//			relationSources.put(rel, rel.getSource());
			//			relationTargets.put(rel, rel.getTarget());
			//			rel.s   Source(null);
			//			rel.setTarget(null);
			rel.setDiagram( null );
		}
	}

	private void reattachRelations( )
	{
		for ( OMTTPOperation rel : operations )
		{
			//			rel.setSource(relationSources.get(rel));
			//			rel.setTarget(relationTargets.get(rel));
			rel.setDiagram( diagram );
		}

	}

}
