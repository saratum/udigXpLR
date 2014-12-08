package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.cd.model.OMTRelationship;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

public class OMTRelationMoveBendpointCommand extends Command
{

	private Point			oldLocation;
	private Point			newLocation;
	private int				index;
	private OMTRelationship	relation;

	public void execute( )
	{
		if ( oldLocation == null )
		{
			oldLocation = (Point)relation.getBendpoints().get( index );
		}
		relation.getBendpoints().set( index, newLocation );
	}

	/** Restore the old location of the bendpoint. */
	@Override
	public void undo( )
	{
		relation.getBendpoints().set( index, oldLocation );
	}

	/** 
	 * Set the index where the bendpoint is located in the bendpoint list.
	 * @param index the index where the bendpoint is located. 
	 */
	public void setIndex( final int index )
	{
		this.index = index;
	}

	/**
	 * Set the link where the bendpoint is located. 
	 * @param link the link where the bendpoint is located. 
	 */
	public void setRelation( final OMTRelationship link )
	{
		this.relation = link;
	}

	/**
	 * Set the new location of the bendpoint. 
	 * @param newLocation the new location of the bendpoint. 
	 */
	public void setLocation( final Point newLocation )
	{
		this.newLocation = newLocation;
	}
}
