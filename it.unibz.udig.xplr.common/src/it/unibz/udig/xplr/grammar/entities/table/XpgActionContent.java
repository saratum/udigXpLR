package it.unibz.udig.xplr.grammar.entities.table;

import it.unibz.udig.xplr.grammar.entities.XpgElem;
import it.unibz.udig.xplr.grammar.entities.XpgItem;

public class XpgActionContent
{

	public static enum Value
	{
		SHIFT, REDUCE, ACCEPT, ERROR;
	}

	private Value	operation;
	private XpgElem	relTester;	// shift
	private int		shiftState; // shift
	private XpgItem	production; // reduce
	private Integer	reduceTo;

	public XpgActionContent( int shiftState, XpgElem tester)
	{
		this.operation = Value.SHIFT;
		this.shiftState = shiftState;
		this.relTester = tester;
	}

	public Integer getReduceTo()
	{
		return reduceTo;
	}

	public void setReduceTo(Integer reduceTo)
	{
		this.reduceTo = reduceTo;
	}

	public XpgActionContent( Value operation)
	{
		this.operation = operation;
	}

	public Value getOperation()
	{
		return operation;
	}

	public XpgElem getRelTester()
	{
		return relTester;
	}

	public int getState()
	{
		return shiftState;
	}

	public XpgItem getProduction()
	{
		return production;
	}

	public void setOperation(Value operation)
	{
		this.operation = operation;
	}

	public void setRelTester(XpgElem relTester)
	{
		this.relTester = relTester;
	}

	public void setState(int state)
	{
		this.shiftState = state;
	}

	public void setProduction(XpgItem production)
	{
		this.production = production;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder( );

		switch ( this.operation )
		{
			case SHIFT:
				sb.append( "action[" );
				sb.append( ( this.relTester == null ) ? "T" : this.relTester.toString( ) );
				sb.append( ":sh" );
				sb.append( this.shiftState );
				sb.append( "] " );
				break;
			case ACCEPT:
				sb.append( "ACC" );

				break;
			case ERROR:
				break;
			case REDUCE:
				sb.append( "action[r: " );
				sb.append( this.reduceTo );
				sb.append( "] " );

				break;

			default:
				break;
		}

		return sb.toString( );

	}

	@Override
	public boolean equals(Object obj)
	{
		if ( obj instanceof XpgActionContent )
			return this.toString( ).equals( obj.toString( ) );
		else
			return false;
	}

	@Override
	public int hashCode()
	{
		return this.toString( ).hashCode( );
	}
}
