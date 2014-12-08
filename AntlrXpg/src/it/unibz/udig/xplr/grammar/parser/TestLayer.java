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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public TestLayer() throws IOException
	{
		
		try
		{
			final String filename = "/Users/sara/git/udigXpLR/regole/lamp.xpg";
			//XpgLoader loader = new XpgLoader(filename);

			XpLRParser p = new XpLRParser(filename);
			
			
			
			for (String s : p.layers)
			{
				System.out.println("LAYER:" + s);
			}
		}

		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
