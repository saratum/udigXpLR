package it.unibz.udig.xplr.grammar.parser;

import java.io.IOException;

public class Test
{

//	final String filename = "/Users/sara/git/udigXpLR/AntlrXpg/xpg_tester4.txt";
	final String filename = "/Users/sara/git/udigXpLR/regole/lamp.xpg";

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
