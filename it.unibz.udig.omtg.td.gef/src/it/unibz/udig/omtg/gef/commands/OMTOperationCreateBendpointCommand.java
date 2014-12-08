package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.td.model.OMTOperation;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

public class OMTOperationCreateBendpointCommand extends Command
{

	private int				index;
	private Point			location;

	private OMTOperation	relation;

	@Override
	public void execute( )
	{
		relation.getBendpoints().add( index, location );
	}

	@Override
	public void undo( )
	{
		relation.getBendpoints().remove( index );
	}

	/**
	 * Set the index on which the bendpoint is added.
	 * @param index Index on which the bendpoint should be added.
	 */
	public void setIndex( final int index )
	{
		this.index = index;
	}

	/**
	 * Set the location where the new bendpoint is added.
	 * @param location point in the diagram where the new bendpoint
	 * is added.
	 */
	public void setLocation( final Point location )
	{
		this.location = location;
	}

	/**
	 * Set the link on which the new bendpoint is added.
	 * @param link link on which the bendpoint is added.
	 */
	public void setOMTLink( final OMTOperation rel )
	{
		this.relation = rel;
	}

}
