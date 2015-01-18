package it.unibz.udig.xplr.grammar.entities;

import java.util.ArrayList;

public class XpgItem
{

	private XpgNonTerminal		leftelem;
	private ArrayList< Object >	rightelem;
	private Integer				dot			= 0;
	private Integer				gotoitem	= 0;

	public XpgItem()
	{

		this.rightelem = new ArrayList< Object >( );
		this.leftelem = null;
	}

	public ArrayList< Object > getRightelem()
	{
		return rightelem;
	}

	public XpgNonTerminal getLeftelem()
	{
		return leftelem;
	}

	public void setRightelem(ArrayList< Object > rightelem)
	{
		this.rightelem = rightelem;
	}

	public void setLeftelem(XpgNonTerminal leftelem)
	{
		this.leftelem = leftelem;
	}

	public Integer getDot()
	{
		return dot;
	}

	public void setDot(Integer dot)
	{
		this.dot = dot;
	}

	@Override
	public String toString()
	{
		StringBuilder re = new StringBuilder( );

		for ( int i = 0; i < this.rightelem.size( ); i ++ )
		{
			if ( this.dot == i )
				re.append( "." );

			re.append( this.rightelem.get( i ).toString( ) );

		}

		if ( this.rightelem.size( ) == this.dot )
			re.append( "." );

		return this.leftelem.getContent( ).concat( "->" ).concat( re.toString( ) );
	}

	public void setGotoitem(Integer gotoitem)
	{
		this.gotoitem = gotoitem;
	}

	public Integer getGotoitem()
	{
		return gotoitem;
	}

	@Override
	public boolean equals(Object obj)
	{
		if ( obj.getClass( ).isAssignableFrom( this.getClass( ) ) )
		{
			XpgItem elem = ( XpgItem ) obj;

			return ( ( elem.getLeftelem( ).equals( this.leftelem ) ) && ( elem.getRightelem( ).equals( this.rightelem ) ) && ( elem.getDot( ).equals( this.dot ) ) );
		}
		else
			return false;
	}

	@Override
	public int hashCode()
	{
		return this.leftelem.hashCode( ) + this.getRightelem( ).hashCode( ) + this.getDot( ).hashCode( );
	}
}
