package it.unibz.udig.xplr.grammar.entities;

import java.util.ArrayList;

public class DictionaryEntry
{

	private String name;
	private XpgTerminal terminalName;
	private ArrayList<Attribute> attributes;
	private ArrayList<Object> counter;
	private boolean visited;

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
	
	
	public XpgTerminal getTerminalName()
	{
		return terminalName;
	}
	
	
	public void setTerminalName(XpgTerminal terminalName)
	{
		this.terminalName = terminalName;
	}

	public boolean isVisited()
	{
		return visited;
	}

	public void setVisited(boolean visited)
	{
		this.visited = visited;
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
		return getName() + "(" + counter.size() + ")" + " - " + terminalName + " - " + visited;
	}
}
