package it.unibz.udig.xplr.grammar.entities.table;

import it.unibz.udig.xplr.grammar.entities.XpgElem;

import java.util.ArrayList;
import java.util.HashMap;

public class XpgParsingTableState
{
	Integer state; // i
	ArrayList<HashMap<XpgElem, XpgActionEntry>> actionEntry;
	ArrayList<HashMap<XpgElem, XpgGotoEntry>> gotoEntry;
	XpgNextEntry nextEntry;

	public XpgParsingTableState()
	{
		this.state = 0;
		this.actionEntry = new ArrayList<HashMap<XpgElem, XpgActionEntry>>();
		this.gotoEntry = new ArrayList<HashMap<XpgElem, XpgGotoEntry>>();
		this.nextEntry = null;
	}

	public Integer getState()
	{
		return state;
	}

	public ArrayList<HashMap<XpgElem, XpgActionEntry>> getActionEntry()
	{
		return actionEntry;
	}

	public ArrayList<HashMap<XpgElem, XpgGotoEntry>> getGotoEntry()
	{
		return gotoEntry;
	}

	public XpgNextEntry getNextEntry()
	{
		return nextEntry;
	}

	public void setState(Integer state)
	{
		this.state = state;
	}

	public void setActionEntry(ArrayList<HashMap<XpgElem, XpgActionEntry>> actionEntry)
	{
		this.actionEntry = actionEntry;
	}

	public void setGotoEntry(ArrayList<HashMap<XpgElem, XpgGotoEntry>> gotoEntry)
	{
		this.gotoEntry = gotoEntry;
	}

	public void setNextEntry(XpgNextEntry nextEntry)
	{
		this.nextEntry = nextEntry;
	}

}