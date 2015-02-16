package it.unibz.udig.xplr.grammar.entities;

public class XpgDeltaRightElem
{

	private String	leftAssignment, rightAssignment;
	private String	operator;

	public XpgDeltaRightElem( String assignment)
	{
		this.leftAssignment = assignment;
	}

	public XpgDeltaRightElem( String leftAssignment, String operator, String rightAssignment)
	{
		this.leftAssignment = leftAssignment;
		this.rightAssignment = rightAssignment;
		this.operator = operator;
	}

	public String getLeftAssignment()
	{
		return leftAssignment;
	}

	public String getOperator()
	{
		return operator;
	}

	public String getRightAssignment()
	{
		return rightAssignment;
	}

	public void setLeftAssignment(String leftAssignment)
	{
		this.leftAssignment = leftAssignment;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
	}

	public void setRightAssignment(String rightAssignment)
	{
		this.rightAssignment = rightAssignment;
	}

	@Override
	public String toString()
	{
		if ( this.rightAssignment != null )
			return this.leftAssignment.concat( this.operator ).concat( this.rightAssignment );
		else
			return this.leftAssignment;
	}
}
