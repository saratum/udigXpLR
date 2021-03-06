package it.unibz.udig.xplr.grammar.entities;

public class XpgRelation
{

	private XpgElem	driver;
	private XpgElem	tester;

	public XpgRelation()
	{
		this.driver = new XpgElem( "" );
		this.tester = new XpgElem( "" );
	}

	public XpgRelation( String driverContent)
	{
		this.driver = new XpgElem( driverContent );
		this.tester = new XpgElem( "" );
	}

	public XpgRelation( String driverContent, String testerContent)
	{
		this.driver = new XpgElem( driverContent );
		this.tester = new XpgElem( testerContent );
	}

	public XpgElem getDriver()
	{
		return driver;
	}

	public XpgElem getTester()
	{
		return tester;
	}

	public void setDriver(XpgElem driver)
	{
		this.driver = driver;
	}

	public void setTester(XpgElem tester)
	{
		this.tester = tester;
	}

	@Override
	public boolean equals(Object obj)
	{
		if ( obj instanceof XpgRelation )
			return this.toString( ).equals( ( ( XpgRelation ) obj ).toString( ) );
		else
			return false;
	}

	@Override
	public String toString()
	{
		String rv = "<".concat( this.driver.getContent( ) );
		if ( ! this.tester.getContent( ).isEmpty( ) )
			rv = rv.concat( "," ).concat( this.tester.getContent( ) );

		return rv.concat( ">" );
	}

	@Override
	public int hashCode()
	{
		return this.toString( ).hashCode( );
	}
}
