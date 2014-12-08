package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

public class OMTTPOperationMoveBendpointCommand extends Command
{

	private Point			oldLocation;
	private Point			newLocation;
	private int				index;
	private OMTTPOperation	operation;

	public void execute( )
	{
		if ( oldLocation == null )
		{
			oldLocation = (Point)operation.getBendpoints().get( index );
		}
		operation.getBendpoints().set( index, newLocation );
	}

	/** Restore the old location of the bendpoint. */
	@Override
	public void undo( )
	{
		operation.getBendpoints().set( index, oldLocation );
	}

	/**
	 * Set the index where the bendpoint is located in the bendpoint list.
	 * 
	 * @param index
	 *            the index where the bendpoint is located.
	 */
	public void setIndex( final int index )
	{
		this.index = index;
	}

	/**
	 * Set the link where the bendpoint is located.
	 * 
	 * @param link
	 *            the link where the bendpoint is located.
	 */
	public void setRelation( final OMTTPOperation link )
	{
		this.operation = link;
	}

	/**
	 * Set the new location of the bendpoint.
	 * 
	 * @param newLocation
	 *            the new location of the bendpoint.
	 */
	public void setLocation( final Point newLocation )
	{
		this.newLocation = newLocation;
	}

}
