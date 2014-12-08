package it.unibz.udig.xplr.grammar.entities;

import java.util.ArrayList;

public class XpgParsingTableRow
{
	Integer state;
	ArrayList<XpgParsingTableState> substates;

	public XpgParsingTableRow()
	{
		substates = new ArrayList<XpgParsingTableState>();
	}

	public Integer getState()
	{
		return state;
	}

	public ArrayList<XpgParsingTableState> getSubstates()
	{
		return substates;
	}

	public void setState(Integer state)
	{
		this.state = state;
	}

	public void setSubstates(ArrayList<XpgParsingTableState> substates)
	{
		this.substates = substates;
	}

}
