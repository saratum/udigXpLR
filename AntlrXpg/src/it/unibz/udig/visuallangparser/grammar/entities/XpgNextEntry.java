package it.unibz.udig.visuallangparser.grammar.entities;

import java.io.Serializable;

public class XpgNextEntry implements Comparable<XpgNextEntry>, Serializable
{

	XpgElem driverRelation;
	XpgElem x; // terminal or non terminal

	public XpgNextEntry()
	{
		this.driverRelation = new XpgElem();
		this.x = new XpgElem();
	}

	public XpgElem getDriverRelation()
	{
		return driverRelation;
	}

	public XpgElem getX()
	{
		return x;
	}

	public void setDriverRelation(XpgElem driverRelation)
	{
		this.driverRelation = driverRelation;
	}

	public void setX(XpgElem x)
	{
		this.x = x;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(this.driverRelation.toString());
		sb.append(",");
		sb.append(this.x);

		return sb.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof XpgNextEntry)
		{
			XpgNextEntry elem = (XpgNextEntry) obj;
			return this.toString().equals(elem.toString());
		}
		else
			return false;

	}

	@Override
	public int compareTo(XpgNextEntry o)
	{

		return this.toString().compareTo(o.toString());
	}

	@Override
	public int hashCode()
	{

		return this.toString().hashCode();
	}

}
