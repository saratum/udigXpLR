package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

public class OMTClassDeleteCommand extends Command
{

	private OMTClass						cl;
	private OMTTransformationDiagram		diagram;
	private List< OMTOperation >			relations;

	private Map< OMTOperation, OMTClass >	relationSources;
	private Map< OMTOperation, OMTClass >	relationTargets;

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
		relations = new ArrayList< OMTOperation >();
		relationSources = new HashMap< OMTOperation, OMTClass >();
		relationTargets = new HashMap< OMTOperation, OMTClass >();
		relations.addAll( cl.getIncomingRelations() );
		relations.addAll( cl.getOutgoingRelations() );
		for ( OMTOperation rel : relations )
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
		for ( OMTOperation rel : relations )
		{
			//			rel.setSource(relationSources.get(rel));
			//			rel.setTarget(relationTargets.get(rel));
			rel.setDiagram( diagram );
		}

	}

}
