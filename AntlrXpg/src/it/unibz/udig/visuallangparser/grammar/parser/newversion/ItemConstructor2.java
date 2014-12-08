package it.unibz.udig.visuallangparser.grammar.parser.newversion;

import it.unibz.udig.visuallangparser.grammar.entities.XpgElem;
import it.unibz.udig.visuallangparser.grammar.entities.XpgItem;
import it.unibz.udig.visuallangparser.grammar.entities.XpgNonTerminal;
import it.unibz.udig.visuallangparser.grammar.entities.XpgRelation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class ItemConstructor2
{

	public static CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>> items(XpgLoader2 loader)
	{

		CopyOnWriteArrayList<XpgItem> start = new CopyOnWriteArrayList<XpgItem>();
		start.add(loader.getAugmentedItems().get(0));

		CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>> c = new CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>>();
		CopyOnWriteArrayList<XpgItem> startclosure = closure(start, loader);
		CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> startset = new CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>();
		startset.add(startclosure);

		c.add(startset); // let C = { <CLOSURE({[S� -> dot S]})> }

		for (int i = 0; i < c.size(); i++)
		{

			CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> itemsetset = c.get(i);
			for (int k = 0; k < itemsetset.size(); k++)
			{
				CopyOnWriteArrayList<XpgItem> itemset = itemsetset.get(k);

				for (int j = 0; j < itemset.size(); j++)
				{
					XpgItem item = itemset.get(j);
					// System.out.println( item.toString( ) );
					XpgElem elem = null;
					try
					{
						if (XpgRelation.class.isAssignableFrom(item.getRightelem().get(item.getDot()).getClass()))
							elem = (XpgElem) item.getRightelem().get(item.getDot() + 1);
						else if (XpgElem.class.isAssignableFrom(item.getRightelem().get(item.getDot()).getClass()))
							elem = (XpgElem) item.getRightelem().get(item.getDot());
					}
					catch (Exception e)
					{
						// e.printStackTrace();
					}

					if (elem != null)
					{
						CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> gotoelem = null;

						if (!hasTester(item))
							gotoelem = gotoItemSet(itemset, null, elem, loader);
						else
						{
							Object o = item.getRightelem().get(item.getDot());

							if (XpgRelation.class.isAssignableFrom(o.getClass())) gotoelem = gotoItemSet(itemset, (XpgRelation) o, elem, loader);
						}

						if (gotoelem != null) if (!c.contains(gotoelem)) c.add(gotoelem);
					}
				}
			}

			// if (c.size( ) > 2)
			// break;

		}

		return c;

	}

	public static CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> gotoItemSet(CopyOnWriteArrayList<XpgItem> i, XpgRelation rel, XpgElem x,
			XpgLoader2 loader)
	{

		CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> rv = new CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>();

		CopyOnWriteArrayList<XpgItem> j = new CopyOnWriteArrayList<XpgItem>();

		for (XpgItem item : i)
		{

			XpgElem elem = null;
			try
			{
				if (XpgRelation.class.isAssignableFrom(item.getRightelem().get(item.getDot()).getClass()))
					elem = (XpgElem) item.getRightelem().get(item.getDot() + 1);
				else if (XpgElem.class.isAssignableFrom(item.getRightelem().get(item.getDot()).getClass()))
					elem = (XpgElem) item.getRightelem().get(item.getDot());
			}
			catch (Exception e)
			{
				// e.printStackTrace();
			}

			if (elem != null && x.equals(elem))
			{
				if (rel == null)
				{
					if (item.getDot() < item.getRightelem().size())
					{
						XpgItem newItem = new XpgItem();
						newItem.setLeftelem(item.getLeftelem());
						newItem.setRightelem(item.getRightelem());

						if (item.getDot() == 0)
							// [A -> .x beta] diventa [A -> x .beta]
							newItem.setDot(item.getDot() + 1);
						else
							// [A -> alpha .R x beta] diventa [A -> alpha R x
							// .beta]
							newItem.setDot(item.getDot() + 2);

						j.add(newItem);
					}
					else
					{
						System.err.println("else");
					}
				}
				else
				{
					if (item.getDot() != 0)
					{
						if (XpgRelation.class.isAssignableFrom(item.getRightelem().get(item.getDot()).getClass()))
						{
							XpgRelation rell = (XpgRelation) item.getRightelem().get(item.getDot());

							if (rell.equals(rel))
							{
								XpgItem newItem = new XpgItem();
								newItem.setLeftelem(item.getLeftelem());
								newItem.setRightelem(item.getRightelem());

								newItem.setDot(item.getDot() + 2);

								j.add(newItem);
							}
						}
					}
				}
			}
		}

		CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> partitions = doPartition(j);

		for (CopyOnWriteArrayList<XpgItem> partition : partitions)
		{
			rv.add(closure(partition, loader));
		}
		return rv;

	}

	private static CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> doPartition(CopyOnWriteArrayList<XpgItem> itemset)
	{
		CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> rv = new CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>();

		ArrayList<XpgElem> d = new ArrayList<XpgElem>();

		for (XpgItem item : itemset)
		{
			try
			{
				if (item.getRightelem().size() > item.getDot())
				{
					Object o = item.getRightelem().get(item.getDot());
					if (XpgRelation.class.isAssignableFrom(o.getClass()))
					{
						XpgRelation rel = (XpgRelation) o;
						if (rel.getDriver() != null && !rel.getDriver().getContent().isEmpty())
							if (!d.contains(rel.getDriver())) d.add(rel.getDriver());
					}

				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		if (!d.isEmpty())
		{

			CopyOnWriteArrayList<XpgItem> newItemSet = null;

			for (XpgElem driverI : d)
			{
				newItemSet = new CopyOnWriteArrayList<XpgItem>();

				// tutti gli items in itemset che hanno il dot davanti a
				// xpgrelation.driver

				for (XpgItem item : itemset)
				{
					try
					{
						if (XpgRelation.class.isAssignableFrom(item.getRightelem().get(item.getDot()).getClass()))
						{
							XpgRelation rel = (XpgRelation) item.getRightelem().get(item.getDot());
							if (driverI.equals(rel.getDriver())) newItemSet.add(item);
						}
					}
					catch (Exception e)
					{
					}

				}

				rv.add(newItemSet);

			}

		}

		for (XpgItem item : itemset)
		{
			if (item.getRightelem().size() == item.getDot())
			{
				CopyOnWriteArrayList<XpgItem> newItemSet = new CopyOnWriteArrayList<XpgItem>();
				newItemSet.add(item);
				rv.add(newItemSet);
			}
		}

		if (!(d.size() > 1))
		{
			rv = new CopyOnWriteArrayList<>();
			rv.add(itemset);
		}

		return rv;
	}

	private static CopyOnWriteArrayList<XpgItem> closure(CopyOnWriteArrayList<XpgItem> items, XpgLoader2 loader)
	{

		for (int i = 0; i < items.size(); i++)
		{
			XpgItem item = items.get(i);

			if (item.getRightelem().size() > item.getDot())
			{

				XpgNonTerminal b = null;
				if (item.getDot() != 0)
				{
					// [A -> alpha .R B beta]
					if (XpgRelation.class.isAssignableFrom(item.getRightelem().get(item.getDot()).getClass()))
						if (XpgNonTerminal.class.isAssignableFrom(item.getRightelem().get(item.getDot() + 1).getClass()))
							b = (XpgNonTerminal) item.getRightelem().get(item.getDot() + 1);

				}
				else
				{
					// [A -> .B beta]
					if (XpgNonTerminal.class.isAssignableFrom(item.getRightelem().get(item.getDot()).getClass()))
						b = (XpgNonTerminal) item.getRightelem().get(item.getDot());
				}

				if (b != null)
				{
					for (XpgItem augItem : loader.getAugmentedItems())
					{
						if (augItem.getLeftelem().equals(b)) if (!items.contains(augItem)) // &&
																							// augItem.getDot(
																							// )
																							// ==
																							// 0
																							// )
							items.add(augItem);
					}
				}
			}
		}

		return items;

	}

	public static boolean hasTester(XpgItem i)
	{
		if (i.getDot() != 0)
		{
			Object o = null;
			if (i.getRightelem().size() > i.getDot())
			{
				o = i.getRightelem().get(i.getDot());

				if (XpgRelation.class.isAssignableFrom(o.getClass()))
				{
					XpgRelation rel = (XpgRelation) o;
					if (!rel.getTester().toString().isEmpty()) return true;
				}
			}
		}
		return false;
	}

	public static void outItems(CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>> items)
	{
		for (int i = 0; i < items.size(); i++)
		{
			System.out.println("I" + i);
			System.out.println("<");

			for (int j = 0; j < items.get(i).size(); j++)
			{
				CopyOnWriteArrayList<XpgItem> it = items.get(i).get(j);
				System.out.println("  J" + (j + 1));
				System.out.println("   {");
				for (XpgItem xpgItem : it)
				{
					System.out.println("     ".concat(xpgItem.toString()));

				}
				System.out.println("   }");

			}
			System.out.println(">");
		}

	}
}
