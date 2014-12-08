package it.unibz.udig.visuallangparser.grammar.parser.newversion;

import it.unibz.udig.visuallangparser.grammar.entities.XpgActionContent;
import it.unibz.udig.visuallangparser.grammar.entities.XpgActionEntry;
import it.unibz.udig.visuallangparser.grammar.entities.XpgElem;
import it.unibz.udig.visuallangparser.grammar.entities.XpgGotoEntry;
import it.unibz.udig.visuallangparser.grammar.entities.XpgItem;
import it.unibz.udig.visuallangparser.grammar.entities.XpgNextEntry;
import it.unibz.udig.visuallangparser.grammar.entities.XpgNonTerminal;
import it.unibz.udig.visuallangparser.grammar.entities.XpgParsingTableRow;
import it.unibz.udig.visuallangparser.grammar.entities.XpgParsingTableState;
import it.unibz.udig.visuallangparser.grammar.entities.XpgRelation;
import it.unibz.udig.visuallangparser.grammar.entities.XpgTerminal;
import it.unibz.udig.visuallangparser.grammar.exceptions.BadItemException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParsingTableConstructor2
{

	private XpgLoader2 loader;
	private ArrayList<XpgParsingTableRow> table;

	public ParsingTableConstructor2(XpgLoader2 _loader)
	{
		this.loader = _loader;

		// XpgItem augItem = new XpgItem( );
		// augItem.getRightelem( ).add( loader.getItems( ).get( 0 ).getLeftelem(
		// ) );
		// augItem.setLeftelem( new XpgNonTerminal( "S'" ) );
		// loader.getAugmentedItems( ).add( augItem );
		// loader.getAugmentedItems( ).addAll( loader.getItems( ) );
		//
	}

	public ParsingTableConstructor2()
	{
		table = new ArrayList<XpgParsingTableRow>();
	}

	public ArrayList<XpgParsingTableRow> createTable(CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>> items)
	{
		try
		{
			ArrayList<XpgItem> augmentedGrammar = loader.getAugmentedItems();
			ArrayList<XpgParsingTableRow> p = buildParsingTable(augmentedGrammar.get(0), items);

			setTable(p);

		}
		catch (BadItemException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getTable();
	}

	private ArrayList<XpgParsingTableRow> buildParsingTable(XpgItem start,
			CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>> itemsSet) throws Exception
	{

		ArrayList<XpgTerminal> terminals = new ArrayList<XpgTerminal>();
		for (XpgItem i : loader.getItems())
		{
			ArrayList<Object> rightelems = i.getRightelem();
			for (Object object : rightelems)
			{
				if (XpgTerminal.class.isAssignableFrom(object.getClass()))
				{
					XpgTerminal terminal = (XpgTerminal) object;
					if (!terminals.contains(terminal)) terminals.add(terminal);
				}
			}
		}

		terminals.add(new XpgTerminal("EOI"));

		XpgItem end = new XpgItem();
		end.setLeftelem(start.getLeftelem());
		end.setRightelem(start.getRightelem());
		end.setDot(1);

		ArrayList<XpgParsingTableRow> rv = new ArrayList<XpgParsingTableRow>();

		for (CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> its : itemsSet)
		{
			int stateindex = itemsSet.indexOf(its);
			// System.out.println(stateindex);
			XpgParsingTableRow row = new XpgParsingTableRow();
			row.setState(stateindex);

			for (CopyOnWriteArrayList<XpgItem> it : its)
			{
				XpgParsingTableState substate = new XpgParsingTableState();
				substate.setState(its.indexOf(it) + 1);
				// System.out.println(substate.getState());
				ArrayList<HashMap<XpgElem, XpgActionEntry>> actions = substate.getActionEntry();
				XpgNextEntry next = substate.getNextEntry();

				for (XpgItem item : it)
				{
					if (item.equals(end))
					{
						XpgActionContent ac = new XpgActionContent(XpgActionContent.Value.ACCEPT);
						XpgActionEntry ae = new XpgActionEntry();
						ae.getContent().add(ac);

						HashMap<XpgElem, XpgActionEntry> entry = new HashMap<XpgElem, XpgActionEntry>();
						entry.put(new XpgElem("EOI"), ae);
						actions.add(entry);

						next.setX(new XpgElem("EOI"));
						next.setDriverRelation(new XpgElem("end"));
						break;
					}
					else
					{
						if (item.getDot() < item.getRightelem().size())
						{
							// action
							if (ItemConstructor2.hasTester(item))
							{
								Object orel = item.getRightelem().get(item.getDot());

								if (XpgRelation.class.isAssignableFrom(orel.getClass()))
								{
									Object trel = item.getRightelem().get(item.getDot() + 1);

									// a is required to be a terminal
									if (XpgTerminal.class.isAssignableFrom(trel.getClass()))
									{
										XpgTerminal rightelem = (XpgTerminal) trel;
										CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> itemSetj = ItemConstructor2.gotoItemSet(it,
												(XpgRelation) orel, rightelem, loader);

										if (itemsSet.contains(itemSetj))
										{
											XpgElem relTester = ((XpgRelation) orel).getTester();
											XpgActionEntry ae = new XpgActionEntry();
											XpgActionContent ac = new XpgActionContent(itemsSet.indexOf(itemSetj), relTester);
											ae.getContent().add(ac);

											HashMap<XpgElem, XpgActionEntry> entry = new HashMap<XpgElem, XpgActionEntry>();

											entry.put(rightelem, ae);
											actions.add(entry);
										}
										else
											throw new Exception();

									}
								}

							}
							else
							// no tester
							{
								Object o = item.getRightelem().get(item.getDot());
								if (XpgRelation.class.isAssignableFrom(o.getClass())) o = item.getRightelem().get(item.getDot() + 1);

								// a is required to be a terminal
								if (XpgTerminal.class.isAssignableFrom(o.getClass()))
								{
									XpgTerminal rightelem = (XpgTerminal) o;
									CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> itemSetj = ItemConstructor2.gotoItemSet(it, null, rightelem,
											loader);

									if (itemsSet.contains(itemSetj))
									{
										XpgElem relTester = new XpgElem("T");
										XpgActionEntry ae = new XpgActionEntry();
										XpgActionContent ac = new XpgActionContent(itemsSet.indexOf(itemSetj), relTester);
										ae.getContent().add(ac);

										HashMap<XpgElem, XpgActionEntry> entry = new HashMap<XpgElem, XpgActionEntry>();

										entry.put(rightelem, ae);
										actions.add(entry);
									}
									else
									{
										System.out.println(itemSetj);
										System.out.println("WWWWWWWWWWWWWWW");
									}

								}
							}

							// next
							if (item.equals(start))
							{
								next.setX((XpgElem) item.getRightelem().get(item.getDot()));
								next.setDriverRelation(new XpgElem("Start"));
							}
							else
							{
								if (item.getRightelem().size() > item.getDot())
								{
									Object o = item.getRightelem().get(item.getDot());
									if (XpgRelation.class.isAssignableFrom(o.getClass()))
									{
										XpgRelation rel = (XpgRelation) o;
										XpgElem elem = (XpgElem) item.getRightelem().get(item.getDot() + 1);

										next.setX(elem);
										next.setDriverRelation(rel.getDriver());
									}
								}
							}
						}
						else
						{
							// action reduce

							HashMap<XpgElem, XpgActionEntry> entry = new HashMap<XpgElem, XpgActionEntry>();
							for (XpgTerminal elem : terminals)
							{
								// CopyOnWriteArrayList< CopyOnWriteArrayList<
								// XpgItem >> itemSetj = ItemConstructor
								// .gotoItemSet( it, null, elem, loader );
								//
								// if ( ! itemsSet.contains( itemSetj ) )
								// {
								XpgActionContent ac = new XpgActionContent(XpgActionContent.Value.REDUCE);
								ac.setState(itemsSet.indexOf(it));
								item.setDot(0);
								int idx = loader.getItems().indexOf(item);
								ac.setProduction(item);
								ac.setReduceTo(idx + 1);

								XpgActionEntry ae = new XpgActionEntry();
								ae.getContent().add(ac);
								entry.put(elem, ae);
								// }

							}
							actions.add(entry);
						}
					}

					// goto
					if (item.getDot() < item.getRightelem().size())
					{
						if (ItemConstructor2.hasTester(item))
						{
							Object orel = item.getRightelem().get(item.getDot());

							if (XpgRelation.class.isAssignableFrom(orel.getClass()))
							{
								Object nrel = item.getRightelem().get(item.getDot() + 1);

								// a is required to be a terminal
								if (XpgNonTerminal.class.isAssignableFrom(nrel.getClass()))
								{
									XpgNonTerminal rightelem = (XpgNonTerminal) nrel;

									CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> itemSetj = ItemConstructor2.gotoItemSet(it,
											(XpgRelation) orel, rightelem, loader);

									if (itemsSet.contains(itemSetj))
									{
										XpgGotoEntry ge = new XpgGotoEntry();
										ge.setState(itemsSet.indexOf(itemSetj));
										ge.setTesterRelation(((XpgRelation) orel).getTester());
										HashMap<XpgElem, XpgGotoEntry> entry = new HashMap<XpgElem, XpgGotoEntry>();

										entry.put(rightelem, ge);
										if (!substate.getGotoEntry().contains(entry)) substate.getGotoEntry().add(entry);
									}
									// else
									// throw new Exception( );

								}
							}
						}
						else
						{
							Object o = item.getRightelem().get(item.getDot());
							if (XpgRelation.class.isAssignableFrom(o.getClass())) o = item.getRightelem().get(item.getDot() + 1);

							// a is required to be a terminal
							if (XpgNonTerminal.class.isAssignableFrom(o.getClass()))
							{
								XpgNonTerminal rightelem = (XpgNonTerminal) o;
								CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>> itemSetj = ItemConstructor2.gotoItemSet(it, null, rightelem,
										loader);
								if (itemsSet.contains(itemSetj))
								{
									XpgGotoEntry ge = new XpgGotoEntry();
									ge.setState(itemsSet.indexOf(itemSetj));
									ge.setTesterRelation(new XpgElem("T"));
									HashMap<XpgElem, XpgGotoEntry> entry = new HashMap<XpgElem, XpgGotoEntry>();

									entry.put(rightelem, ge);
									if (!substate.getGotoEntry().contains(entry)) substate.getGotoEntry().add(entry);
								}
							}
						}

					}
				}

				row.getSubstates().add(substate);

			}

			rv.add(row);
		}
		return rv;
	}

	public static void outTable(ArrayList<XpgParsingTableRow> rv)
	{
		for (XpgParsingTableRow tablerow : rv)
		{
			System.out.println(tablerow.getState());

			for (XpgParsingTableState substate : tablerow.getSubstates())
			{
				StringBuilder sb = new StringBuilder();
				sb.append("STATE: ");
				sb.append(substate.getState());
				sb.append(" - ");
				sb.append("ACTION: ");
				sb.append(substate.getActionEntry().toString());
				sb.append(" - ");
				sb.append("GOTO: ");
				sb.append(substate.getGotoEntry().toString());
				sb.append(" - ");
				sb.append("NEXT: ");
				sb.append(substate.getNextEntry().toString());

				System.out.println(sb.toString());

				System.out.println("..................................................................................................");
			}
			System.out.println("--------------------------------------------------------------------------------------------------");
		}
	}

	public ArrayList<XpgParsingTableRow> getTable()
	{
		return table;
	}

	public void setTable(ArrayList<XpgParsingTableRow> table)
	{
		this.table = table;
	}

}
