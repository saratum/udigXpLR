package it.unibz.udig.xplr.grammar.exceptions;

public class SyntaxErrorException extends Exception
{
	private static final long serialVersionUID = 1L;
	String errorMessage;

	public SyntaxErrorException()
	{
		super();
		errorMessage = "unknown";
	}

	public SyntaxErrorException(String err)
	{
		super(err);
		errorMessage = err;
	}

	public String getError()
	{
		return errorMessage;
	}

}
