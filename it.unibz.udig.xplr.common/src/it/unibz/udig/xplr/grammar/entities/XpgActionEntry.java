package it.unibz.udig.xplr.grammar.entities;

import java.util.ArrayList;

public class XpgActionEntry
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

}
