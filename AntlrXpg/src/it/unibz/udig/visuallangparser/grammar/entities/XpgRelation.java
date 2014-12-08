package it.unibz.udig.visuallangparser.grammar.entities;

public class XpgRelation implements Comparable<XpgRelation>
{

	private XpgElem driver;
	private XpgElem tester;

	public XpgRelation()
	{
		this.driver = new XpgElem("");
		this.tester = new XpgElem("");
	}

	public XpgRelation(String driverContent)
	{
		this.driver = new XpgElem(driverContent);
		this.tester = new XpgElem("");
	}

	public XpgRelation(String driverContent, String testerContent)
	{
		this.driver = new XpgElem(driverContent);
		this.tester = new XpgElem(testerContent);
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
		if (obj.getClass().isAssignableFrom(this.getClass()))
			return super.equals(obj);
		else
			return false;
	}

	@Override
	public String toString()
	{
		String rv = "<".concat(this.driver.getContent());
		if (!this.tester.getContent().isEmpty()) rv = rv.concat(",").concat(this.tester.getContent());

		return rv.concat(">");
	}

	@Override
	public int compareTo(XpgRelation o)
	{
		return this.toString().compareTo(o.toString());
	}

	@Override
	public int hashCode()
	{
		return this.toString().hashCode();
	}

}
