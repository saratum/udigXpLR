package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTPDNode;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class OMTPDNodeCreateCommand extends Command
{

	private OMTPDNode				newClass;
	private Rectangle				constraint;
	private OMTPresentationDiagram	diagram;

	@Override
	public boolean canExecute( )
	{
		return newClass != null && constraint != null && diagram != null;
	}

	@Override
	public void execute( )
	{
		newClass.setConstraint( constraint );
		newClass.setDiagram( diagram );
	}

	@Override
	public void undo( )
	{
		newClass.setDiagram( null );
	}

	public void setConstraints( final Rectangle r )
	{
		this.constraint = r;
	}

	public void setParent( final OMTPresentationDiagram d )
	{
		this.diagram = d;
	}

	public void setNode( final OMTPDNode c )
	{
		this.newClass = c;
	}

}
