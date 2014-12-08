package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.td.model.OMTOperation;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

public class OMTOperationDeleteBendpointCommand extends Command
{

	/** Link that contains the bendpoint. */
	private OMTOperation	relation;
	/** Index where the bendpoint is located in the link's bendpoin list. */
	private int				index;
	/** Point in the diagram where the bendpoint is located. */
	private Point			location;

	/**
	 * Only execute is link is not null and index is valid.
	 */
	@Override
	public boolean canExecute( )
	{
		return (relation != null) && (relation.getBendpoints().size() > index);
	}

	/** 
	 * Remove the bendpoint from the link. 
	 */
	@Override
	public void execute( )
	{
		location = (Point)relation.getBendpoints().get( index );
		relation.getBendpoints().remove( index );
	}

	/**
	 * Reinsert the bendpoint in the link.
	 */
	@Override
	public void undo( )
	{
		relation.getBendpoints().add( index, location );
	}

	/**
	 * Set the index of the bendpoint that should be removed.
	 * @param index the index of the bendpoint to remove.
	 */
	public void setIndex( final int index )
	{
		this.index = index;
	}

	/**
	 * Set the link from which the bendpoint is removed.
	 * @param link the link from which the bendpoint is removed.
	 */
	public void setRelation( final OMTOperation link )
	{
		this.relation = link;
	}
}
