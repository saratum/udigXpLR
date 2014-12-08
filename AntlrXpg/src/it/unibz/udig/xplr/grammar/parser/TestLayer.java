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

	public static void main(String[] args)
	{
		try
		{
			new TestLayer();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public TestLayer() throws IOException
	{
		final String filename = "/Users/sara/git/udigXpLR/regole/lamp.xpg";
		XpLRParser p = new XpLRParser(filename);
		for (String s : p.getLoader().getLayers())
		{
			System.out.println("LAYER:" + s);
		}
	}
}
