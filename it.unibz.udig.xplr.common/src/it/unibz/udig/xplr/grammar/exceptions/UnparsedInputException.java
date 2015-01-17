package it.unibz.udig.xplr.grammar.exceptions;

public class UnparsedInputException extends Exception
{
	private static final long serialVersionUID = 1L;
	String errorMessage;

	public UnparsedInputException()
	{
		super();
		errorMessage = "Error: unparsed input";
	}

	public UnparsedInputException(String err)
	{
		super(err);
		errorMessage = err;
	}

	public String getError()
	{
		return errorMessage;
	}

}
