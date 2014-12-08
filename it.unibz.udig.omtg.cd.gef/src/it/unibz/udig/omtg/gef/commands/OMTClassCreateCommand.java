package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class OMTClassCreateCommand extends Command
{

	private OMTClass		newClass;
	private Rectangle		constraint;
	private OMTClassDiagram	diagram;

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

	public void setParent( final OMTClassDiagram d )
	{
		this.diagram = d;
	}

	public void setNode( final OMTClass c )
	{
		this.newClass = c;
	}

}
