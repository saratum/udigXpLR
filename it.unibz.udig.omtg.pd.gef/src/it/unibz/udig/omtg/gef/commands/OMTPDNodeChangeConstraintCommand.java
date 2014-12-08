package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTPDNode;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class OMTPDNodeChangeConstraintCommand extends Command
{

	private Rectangle	oldConstraint;
	private Rectangle	newConstraint;

	private OMTPDNode	model;

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

	public void setModel( OMTPDNode model )
	{
		this.model = model;
	}

	public void setNewConstraint( Rectangle newConstraint )
	{
		this.newConstraint = newConstraint;
	}
}
