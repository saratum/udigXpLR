package it.unibz.udig.visuallangparser.grammar.entities;

import java.io.Serializable;

public class XpgElem implements Comparable<XpgElem>, Serializable
{

	private static final long serialVersionUID = 5661690091832851137L;
	private String content;

	public XpgElem()
	{
	}

	public XpgElem(String content)
	{
		this.content = content;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	@Override
	public String toString()
	{
		return this.content;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof XpgElem)
			return ((XpgElem) obj).getContent().equals(this.content);
		else
			return false;
	}

	@Override
	public int compareTo(XpgElem o)
	{
		return this.content.compareTo(o.getContent());
	}

	@Override
	public int hashCode()
	{

		return this.content.hashCode();
	}

}
