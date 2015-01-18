package it.unibz.udig.xplr.grammar.entities;

public class XpgNonTerminal extends XpgElem
{

	public XpgNonTerminal(String content)
	{
		super(content);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof XpgNonTerminal)
			return super.equals(obj);
		else
			return false;
	}

}
