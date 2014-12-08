package it.unibz.udig.xplr.grammar.parser;

import java.util.ArrayList;

public class DictionaryEntry
{

	String name;
	ArrayList<Attribute> attributes;

	public DictionaryEntry()
	{
		this.attributes = new ArrayList<Attribute>();
	}

	public DictionaryEntry(String n, ArrayList<Attribute> t)
	{
		this.attributes = t;
		this.name = n;
	}

	public ArrayList<Attribute> getAttributes()
	{
		return attributes;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return getName();
	}
}
