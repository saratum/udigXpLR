package it.unibz.udig.xplr.grammar.entities;

public class XpgNextEntry
{

	XpgElem	driverRelation;
	XpgElem	x;				// terminal or non terminal

	public XpgNextEntry()
	{
		this.driverRelation = null; //new XpgElem( );
		this.x = null; //new XpgElem( );
	}

	public XpgElem getDriverRelation()
	{
		return driverRelation;
	}

	public XpgElem getX()
	{
		return x;
	}

	public void setDriverRelation(XpgElem driverRelation)
	{
		this.driverRelation = driverRelation;
	}

	public void setX(XpgElem x)
	{
		this.x = x;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder( );
		sb.append( this.driverRelation );
		sb.append( "," );
		sb.append( this.x );

		return sb.toString( );
	}

	@Override
	public boolean equals(Object obj)
	{
		if ( obj instanceof XpgNextEntry )

			return this.toString( ).equals( ( ( XpgNextEntry ) obj ).toString( ) );
		else
			return false;
	}

	@Override
	public int hashCode()
	{
		return this.toString( ).hashCode( );
	}
}
