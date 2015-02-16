package it.unibz.udig.xplr.grammar.entities;


public class XpgDelta
{

	private String				leftElem;
	private XpgDeltaRightElem	rightElem;

	public XpgDelta()
	{
		// TODO Auto-generated constructor stub
	}

	public XpgDelta( String l, XpgDeltaRightElem r)
	{
		this.leftElem = l;
		this.rightElem = r;
	}

	public String getLeftElem()
	{
		return leftElem;
	}

	public XpgDeltaRightElem getRightElem()
	{
		return rightElem;
	}

	public void setLeftElem(String leftElem)
	{
		this.leftElem = leftElem;
	}

	public void setRightElem(XpgDeltaRightElem rightElem)
	{
		this.rightElem = rightElem;
	}

	@Override
	public String toString()
	{
		return this.leftElem.concat( "=" ).concat( this.rightElem.toString( ) );
	}
}
