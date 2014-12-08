package it.unibz.udig.omtg.gef;

import java.util.ArrayList;

public class Stack
{

	private ArrayList< Object >		elemList;
	private ArrayList< String >		terminalStack;
	private ArrayList< String >		nonterminalStack;
	private ArrayList< Sentence >	sentences;

	public Stack()
	{
		terminalStack = new ArrayList<>();
		nonterminalStack = new ArrayList<>();
		sentences = new ArrayList<>();
		elemList = new ArrayList<>();
	}

	public ArrayList< String > getNonterminalStack( )
	{
		return nonterminalStack;
	}

	public ArrayList< String > getTerminalStack( )
	{
		return terminalStack;
	}

	public ArrayList< Sentence > getSentences( )
	{
		return sentences;
	}

	public ArrayList< Object > getElemList( )
	{
		return elemList;
	}
}
