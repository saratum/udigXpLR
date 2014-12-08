package it.unibz.udig.xplr.grammar.exceptions;

public class BadItemException extends Exception
{
	private static final long serialVersionUID = 1L;
	String errorMessage;

	public BadItemException()
	{
		super();
		errorMessage = "unknown";
	}

	public BadItemException(String err)
	{
		super("Item ".concat(err).concat(" is wrong"));
		errorMessage = err;
	}

	public String getError()
	{
		return errorMessage;
	}
}
