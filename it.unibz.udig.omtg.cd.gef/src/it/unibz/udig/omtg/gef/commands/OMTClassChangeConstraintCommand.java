package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.cd.model.OMTClass;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class OMTClassChangeConstraintCommand extends Command
{

	private Rectangle	oldConstraint;
	private Rectangle	newConstraint;

	private OMTClass	model;

	@Override
	public void execute( )
	{
		if ( oldConstraint == null )
		{
			oldConstraint = model.getConstraint();
		}
		model.setConstraint( newConstraint );
	}

	@Override
	public void undo( )
	{
		model.setConstraint( oldConstraint );
	}

	public void setModel( OMTClass model )
	{
		this.model = model;
	}

	public void setNewConstraint( Rectangle newConstraint )
	{
		this.newConstraint = newConstraint;
	}
}
