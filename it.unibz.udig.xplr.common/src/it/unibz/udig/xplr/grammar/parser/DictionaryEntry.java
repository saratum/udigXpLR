package it.unibz.udig.xplr.grammar.parser;

import java.util.ArrayList;

public class DictionaryEntry
{

	String name;
	ArrayList<Attribute> attributes;
	ArrayList<Object> counter;
	boolean visited;

	public DictionaryEntry()
	{
		this.attributes = new ArrayList<Attribute>();
		this.counter = new ArrayList<Object>();
		visited = false;
	}

	public DictionaryEntry(String n, ArrayList<Attribute> t)
	{
		this.attributes = t;
		this.name = n;
		this.counter = new ArrayList<Object>();
		visited = false;
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
		return getName() + "(" + counter.size() + ")" + " - " + visited;
	}
}
