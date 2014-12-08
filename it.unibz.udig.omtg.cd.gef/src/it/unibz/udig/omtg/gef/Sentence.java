package it.unibz.udig.omtg.gef;

import java.io.Serializable;
import java.util.ArrayList;

public class Sentence implements Serializable, Comparable< Sentence >
{

	private String				leftAssignment;
	private ArrayList< String >	rightAssignment;
	private ArrayList< String >	delta;
	private ArrayList< String >	gamma;
	private ArrayList< String >	constraint;

	public Sentence()
	{
		this.leftAssignment = "";
		this.rightAssignment = new ArrayList<>();
		this.delta = new ArrayList<>();
		this.gamma = new ArrayList<>();
		this.constraint = new ArrayList<>();
	}

	public ArrayList< String > getConstraint( )
	{
		return constraint;
	}

	public ArrayList< String > getDelta( )
	{
		return delta;
	}

	public ArrayList< String > getGamma( )
	{
		return gamma;
	}

	public String getLeftAssignment( )
	{
		return leftAssignment;
	}

	public ArrayList< String > getRightAssignment( )
	{
		return rightAssignment;
	}

	public void setLeftAssignment( String leftAssignment )
	{
		this.leftAssignment = leftAssignment;
	}

	@Override
	public int compareTo( Sentence o )
	{
		return (this.toString()).compareTo( o.toString() );

	}

	@Override
	public boolean equals( Object o )
	{
		if ( !(o instanceof Sentence) ) return false;
		Sentence n = (Sentence)o;
		return (n.toString()).equals( this.toString() );
	}

	@Override
	public int hashCode( )
	{
		return 2 * (this.toString()).hashCode();
	}

	@Override
	public String toString( )
	{
		StringBuilder rv = new StringBuilder( this.leftAssignment + " -> " );

		for ( String ra : this.rightAssignment )
		{
			rv.append( ra );
		}

		return rv.toString();
	}
}
