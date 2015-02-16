package it.unibz.udig.xplr.grammar.entities;

import java.util.ArrayList;

public class XpgItem
{

	private XpgNonTerminal			leftelem;
	private ArrayList< Object >		rightelem;
	private Integer					dot			= 0;
	private Integer					gotoitem	= 0;
	private ArrayList< XpgDelta >	deltaRules;
	private ArrayList< XpgTriple >	triples;			//gamma
	private Object					semanticRules;

	public XpgItem()
	{

		this.rightelem = new ArrayList< Object >( );
		this.triples = new ArrayList< XpgTriple >( );
		this.deltaRules = new ArrayList< XpgDelta >( );
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

	public ArrayList< XpgTriple > getTriples()
	{
		return triples;
	}

	public void setTriples(ArrayList< XpgTriple > triples)
	{
		this.triples = triples;
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

	public ArrayList< XpgDelta > getDeltaRules()
	{
		return deltaRules;
	}

	public void setDeltaRules(ArrayList< XpgDelta > deltaRules)
	{
		this.deltaRules = deltaRules;
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

		StringBuilder drb = new StringBuilder( );
		for ( XpgDelta d : deltaRules )
		{
			drb.append( d.getLeftElem( ).concat( "=" ).concat( d.getRightElem( ).toString( ) ) );
			drb.append( "; " );
		}

		StringBuilder tr = new StringBuilder( );
		for ( XpgTriple t : triples )
		{
			System.out.println("yeye");
			tr.append( t.toString( ));
			tr.append( "; " );
		}

		return this.leftelem.getContent( ).concat( "->" ).concat( re.toString( ) ).concat( " Delta:" ).concat( drb.toString( ) ).concat(" Gamma: ").concat( tr.toString( ) );
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
