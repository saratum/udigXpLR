package it.unibz.udig.xplr.grammar.entities;

import org.antlr.v4.parse.BlockSetTransformer.setAlt_return;

/**
 * gamma element
 * @author sara
 *
 */

public class XpgTriple
{

	private XpgTerminal	t;
	private String		condition;	// stringa che può anche contenere true o false
	private XpgDelta	d;

	public XpgTriple()
	{
		// TODO Auto-generated constructor stub
	}

	public String getCondition()
	{
		return condition;
	}

	public XpgDelta getD()
	{
		return d;
	}

	public XpgTerminal getT()
	{
		return t;
	}

	public void setCondition(String condition)
	{
		this.condition = condition;
	}

	public void setD(XpgDelta d)
	{
		this.d = d;
	}

	public void setT(XpgTerminal t)
	{
		this.t = t;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "(".concat( t.toString( ) ).concat( ";" ).concat( condition ).concat( ";" ).concat( this.d.toString( ) ).concat( " )" );
	}
}
