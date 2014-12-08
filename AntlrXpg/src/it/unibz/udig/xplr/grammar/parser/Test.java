package it.unibz.udig.xplr.grammar.parser;

import java.io.IOException;

public class Test
{

	final String filename = "/Users/sara/git/udigXpLR/regole/lamp.xpg";
	XpgLoader loader = new XpgLoader(filename);

	public static void main(String[] args)
	{
		try
		{
			new Test();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public Test() throws IOException
	{
		new XpLRParser(filename);
	}

}
