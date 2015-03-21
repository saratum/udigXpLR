package it.unibz.udig.xplr.grammar.entities;

import java.util.ArrayList;

public class Dictionary
{

	private ArrayList<DictionaryEntry> entries; // attribute-based
												// representation

	public Dictionary()
	{
		this.entries = new ArrayList<DictionaryEntry>();
	}

	public ArrayList<DictionaryEntry> getEntries()
	{
		return entries;
	}
}
