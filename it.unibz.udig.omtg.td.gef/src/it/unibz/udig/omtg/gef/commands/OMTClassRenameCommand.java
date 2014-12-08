package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.td.model.OMTClass;

import org.eclipse.gef.commands.Command;

public class OMTClassRenameCommand extends Command
{

	private String		oldName, newName;
	private OMTClass	model;

	@Override
	public void execute( )
	{
		oldName = model.getName();
		model.setName( newName );
	}

	@Override
	public void undo( )
	{
		model.setName( oldName );
	}

	public void setNewName( String newName )
	{
		this.newName = newName;
	}

	public void setModel( OMTClass model )
	{
		this.model = model;
	}

}
