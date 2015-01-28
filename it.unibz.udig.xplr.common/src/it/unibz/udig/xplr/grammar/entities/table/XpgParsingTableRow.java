package it.unibz.udig.xplr.grammar.entities.table;

import java.util.ArrayList;

public class XpgParsingTableRow
{
	Integer stateIdx;
	ArrayList<XpgParsingTableState> substates;

	public XpgParsingTableRow()
	{
		substates = new ArrayList<XpgParsingTableState>();
	}

	public Integer getStateIdx()
	{
		return stateIdx;
	}

	public ArrayList<XpgParsingTableState> getSubstates()
	{
		return substates;
	}

	public void setState(Integer state)
	{
		this.stateIdx = state;
	}

	public void setSubstates(ArrayList<XpgParsingTableState> substates)
	{
		this.substates = substates;
	}

}
