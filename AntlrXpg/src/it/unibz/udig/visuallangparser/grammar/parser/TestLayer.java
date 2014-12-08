package it.unibz.udig.visuallangparser.grammar.parser;

import it.unibz.udig.visuallangparser.grammar.generated.XpgLexer;
import it.unibz.udig.visuallangparser.grammar.generated.XpgParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestLayer
{
	XpgLoader loader = new XpgLoader();

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
		prepareLoader("/Users/sara/git/mymasterthesis/regole/lamp.xpg");

		for (String s : loader.getLayers())
		{
			System.out.println("LAYER:" + s);
		}

	}

	private void prepareLoader(String inputfile) throws IOException
	{
		InputStream is;
		ANTLRInputStream input;

		is = new FileInputStream(inputfile);
		input = new ANTLRInputStream(is);

		XpgLexer lexer = new XpgLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		XpgParser parser = new XpgParser(tokens);
		parser.setBuildParseTree(true);

		ParseTree tree = parser.xpgfile(); // start

		ParseTreeWalker walker = new ParseTreeWalker();

		walker.walk(loader, tree); // walk parse tree

	}
}
