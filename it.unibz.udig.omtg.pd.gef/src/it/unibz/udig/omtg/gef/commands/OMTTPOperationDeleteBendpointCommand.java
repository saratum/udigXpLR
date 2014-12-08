package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

public class OMTTPOperationDeleteBendpointCommand extends Command
{

	private OMTTPOperation	operation;
	private int				index;
	private Point			location;

	/**
	 * Only execute is link is not null and index is valid.
	 */
	@Override
	public boolean canExecute( )
	{
		return (operation != null) && (operation.getBendpoints().size() > index);
	}

	/**
	 * Remove the bendpoint from the link.
	 */
	@Override
	public void execute( )
	{
		location = (Point)operation.getBendpoints().get( index );
		operation.getBendpoints().remove( index );
	}

	/**
	 * Reinsert the bendpoint in the link.
	 */
	@Override
	public void undo( )
	{
		operation.getBendpoints().add( index, location );
	}

	/**
	 * Set the index of the bendpoint that should be removed.
	 * 
	 * @param index
	 *            the index of the bendpoint to remove.
	 */
	public void setIndex( final int index )
	{
		this.index = index;
	}

	/**
	 * Set the link from which the bendpoint is removed.
	 * 
	 * @param link
	 *            the link from which the bendpoint is removed.
	 */
	public void setRelation( final OMTTPOperation link )
	{
		this.operation = link;
	}

}
