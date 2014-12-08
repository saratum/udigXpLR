package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.gef.commands.Command;

public class OMTPresentationSpecificationDeleteCommand extends Command
{

	private OMTPresentationSpecification	cl;
	private OMTPresentationDiagram			diagram;
	private OMTTPOperation					operation;

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

	public void setNode( OMTPresentationSpecification n )
	{
		this.cl = n;
		this.diagram = n.getDiagram();

	}

	private void detachRelations( )
	{
		//operation = cl.getIncomingOperation();

		//rel.setDiagram(null);
		//		}
	}

	private void reattachRelations( )
	{
		//		for (OMTTPOperation rel : operations)
		//		{
		//			rel.setSource(relationSources.get(rel));
		//			rel.setTarget(relationTargets.get(rel));
		//			rel.setDiagram(diagram);
		//		}

	}

}
