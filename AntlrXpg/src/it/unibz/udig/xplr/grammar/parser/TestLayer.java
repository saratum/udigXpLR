package it.unibz.udig.xplr.grammar.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestLayer
{

	public static void main(String[ ] args)
	{
		try
		{
			new TestLayer( );
		}
		catch ( IOException e )
		{
			e.printStackTrace( );
		}
	}

	public TestLayer() throws IOException
	{
		final String filename = "/Users/sara/git/udigXpLR/regole/grammar_lamp.xpg";
//		final String filename = "/Users/sara/git/udigXpLR/AntlrXpg/xpg_tester3.txt";
		XpLRParser p = new XpLRParser( filename );
		
	}
}
