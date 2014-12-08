package it.unibz.udig.omtg.gef.commands;

import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

public abstract class AbstractBendpointCommand extends Command
{

	private int				index;
	private Point			location;

	private OMTTPOperation	relation;

	protected Bendpoint		bendPoint;
	protected Dimension		d1, d2;

	public Bendpoint getBendPoint( )
	{
		return bendPoint;
	}

	public void setBendPoint( Bendpoint bendPoint )
	{
		this.bendPoint = bendPoint;
	}

	public Dimension getD1( )
	{
		return d1;
	}

	public Dimension getD2( )
	{
		return d2;
	}

	public int getIndex( )
	{
		return index;
	}

	public Point getLocation( )
	{
		return location;
	}

	public OMTTPOperation getRelation( )
	{
		return relation;
	}

	public void setRelation( OMTTPOperation relation )
	{
		this.relation = relation;
	}

	@Override
	public void redo( )
	{
		execute();
	}

	public void setRelativeDimensions( Dimension dim1, Dimension dim2 )
	{
		d1 = dim1;
		d2 = dim2;
	}
}
