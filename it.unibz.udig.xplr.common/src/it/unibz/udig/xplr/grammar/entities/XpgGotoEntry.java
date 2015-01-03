package it.unibz.udig.xplr.grammar.entities;

import java.io.Serializable;

public class XpgGotoEntry implements Serializable
{
	XpgElem testerRelation;
	Integer state;

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
		// TODO Auto-generated method stub
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		//if (obj.getClass().isAssignableFrom(this.getClass()))
		if(obj instanceof XpgGotoEntry)
		{
			XpgGotoEntry elem = (XpgGotoEntry) obj;

			return ((elem.getState() == this.state) && (elem.getTesterRelation().equals(this.testerRelation))&& (elem.getState() == this.getState()));
		}
		else
			return false;
	}

	@Override
	public int hashCode()
	{
		return this.state.hashCode() + this.testerRelation.hashCode() + this.state.hashCode();
	}

}