package it.unibz.udig.visuallangparser.grammar.entities;

import java.io.Serializable;

public class XpgGotoEntry implements Serializable, Comparable<XpgGotoEntry>
{

	private static final long serialVersionUID = 1L;
	private XpgElem testerRelation;
	private Integer state;

	public XpgGotoEntry()
	{
		this.testerRelation = new XpgElem();
		this.state = 0;
	}

	public XpgGotoEntry(XpgElem testerRelation, Integer state)
	{
		this.testerRelation = testerRelation;
		this.state = state;
	}

	public XpgElem getTesterRelation()
	{
		return testerRelation;
	}

	public void setTesterRelation(XpgElem testerRelation)
	{
		this.testerRelation = testerRelation;
	}

	public Integer getState()
	{
		return state;
	}

	public void setState(Integer state)
	{
		this.state = state;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append((this.testerRelation == null) ? "" : this.testerRelation.toString());
		sb.append(":");
		sb.append(this.state);

		return sb.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof XpgGotoEntry)
		{
			XpgGotoEntry elem = (XpgGotoEntry) obj;
			return elem.toString().equals(this.toString()); // &&
															// (elem.getTesterRelation().equals(this.testerRelation)));
		}
		else
		{
			return false;
		}
	}

	@Override
	public int hashCode()
	{
		return 2 * this.toString().hashCode();
	}

	@Override
	public int compareTo(XpgGotoEntry o)
	{

		return this.toString().compareTo(o.toString());
	}
}
