package it.unibz.udig.visuallangparser.grammar.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class XpgActionEntry implements Serializable, Comparable<XpgActionEntry>
{

	private ArrayList<XpgActionContent> content;

	public XpgActionEntry()
	{
		this.content = new ArrayList<XpgActionContent>();
	}

	public ArrayList<XpgActionContent> getContent()
	{
		return content;
	}

	public void setContent(ArrayList<XpgActionContent> content)
	{
		this.content = content;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		for (XpgActionContent ac : this.content)
		{
			sb.append(ac.toString());
		}
		return sb.toString();
	}

	@Override
	public int compareTo(XpgActionEntry o)
	{

		return this.toString().compareTo(o.toString());
	}

	@Override
	public int hashCode()
	{

		return this.toString().hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof XpgActionEntry)
		{
			XpgActionEntry elem = (XpgActionEntry) obj;
			return elem.toString().equals(this.toString());
		}
		else
		{
			return false;
		}
	}

}
