package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTRelationship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

public class OMTClassDeleteCommand extends Command
{

	private OMTClass							cl;
	private OMTClassDiagram						diagram;
	private List< OMTRelationship >				relations;

	private Map< OMTRelationship, OMTClass >	relationSources;
	private Map< OMTRelationship, OMTClass >	relationTargets;

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
		relations = new ArrayList< OMTRelationship >();
		relationSources = new HashMap< OMTRelationship, OMTClass >();
		relationTargets = new HashMap< OMTRelationship, OMTClass >();
		relations.addAll( cl.getIncomingRelations() );
		relations.addAll( cl.getOutgoingRelations() );
		for ( OMTRelationship rel : relations )
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
		for ( OMTRelationship rel : relations )
		{
			//			rel.setSource(relationSources.get(rel));
			//			rel.setTarget(relationTargets.get(rel));
			rel.setDiagram( diagram );
		}

	}

}
