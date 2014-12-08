package it.unibz.udig.omtg.gef;

import it.unibz.udig.omtg.cd.model.ClassAttribute;
import it.unibz.udig.omtg.cd.model.OMTAggregation;
import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTConventionalClass;
import it.unibz.udig.omtg.cd.model.OMTGeneralization;
import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.cd.model.OMTRelationshipType;
import it.unibz.udig.omtg.cd.model.SpatialIntegrityRule;
import it.unibz.udig.omtg.gef.parts.OMTClassDiagramEditPart;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

public class AntLrExportAction extends Action implements IWorkbenchAction
{

	private final IWorkbenchWindow	window;
	public static final String		ID	= "";
	private IStructuredSelection	selection;

	public AntLrExportAction(IWorkbenchWindow win)
	{
		this.window = win;
		setId( ID );
		setText( "Export to AntLR" );
		setImageDescriptor( new ImageDescriptor()
		{

			@Override
			public ImageData getImageData( )
			{
				return DEFAULT_IMAGE_DATA;
			}
		} );
	}

	@Override
	public void dispose( )
	{
	}

	Stack	elemStack	= new Stack();

	@Override
	public void run( )
	{

		selection = (IStructuredSelection)window.getSelectionService().getSelection();

		if ( selection.getFirstElement() instanceof OMTClassDiagramEditPart )
		{
			OMTClassDiagramEditPart cdep = (OMTClassDiagramEditPart)selection.getFirstElement();
			OMTClassDiagram cd = (OMTClassDiagram)cdep.getModel();

			for ( OMTClass cl : cd.getClasses() )
			{
				if ( !OMTConventionalClass.class.isAssignableFrom( cl.getClass() ) )
				{
					if ( !elemStack.getElemList().contains( cl ) ) elemStack.getElemList().add( cl );

					// la root ha solo outgoing e non incoming relations di qualsiasi tipo
					if ( cl.getOutgoingRelations().size() > 0 && cl.getIncomingRelations().size() == 0 )
					{
						Sentence s = new Sentence();

						s.setLeftAssignment( "s" );
						s.getRightAssignment().add( cl.getName().toLowerCase() );
						if ( !elemStack.getSentences().contains( s ) ) elemStack.getSentences().add( s );

					}
					else
					{
						step1( cl );

					}

				}
			}

			for ( Object o : elemStack.getElemList() )
			{
				if ( o instanceof OMTClass )
				{
					OMTClass cl = (OMTClass)o;
					for ( OMTRelationship r : cl.getOutgoingRelations() )
					{
						if ( !(OMTAggregation.class.isAssignableFrom( r.getClass() ))
								&& !(OMTGeneralization.class.isAssignableFrom( r.getClass() )) )
						{

							if ( r.getType().equals( OMTRelationshipType.ARC_ARC_NETWORK ) )
							{
								String sourceName = r.getSource().getName().toLowerCase() + "s";

								Sentence arc = new Sentence();
								arc.setLeftAssignment( r.getLabel().toLowerCase() );
								arc.getRightAssignment().add( sourceName );

								if ( !elemStack.getNonterminalStack().contains( r.getLabel().toLowerCase() ) )
									elemStack.getNonterminalStack().add( r.getLabel().toLowerCase() );

								if ( !elemStack.getSentences().contains( arc ) )
									elemStack.getSentences().add( arc );

								arc = new Sentence();
								arc.setLeftAssignment( sourceName );
								arc.getRightAssignment().add( r.getSource().getName().toLowerCase() );
								arc.getDelta().add(
										sourceName + "_bound=" + r.getSource().getName().toLowerCase()
												+ "_bound" );

								if ( !elemStack.getSentences().contains( arc ) )
									elemStack.getSentences().add( arc );

								if ( !elemStack.getNonterminalStack().contains( sourceName ) )
									elemStack.getNonterminalStack().add( sourceName );

								arc = new Sentence();
								arc.setLeftAssignment( sourceName );
								arc.getRightAssignment().add(
										r.getSource().getName().toLowerCase() + "<touches>" + sourceName );
								arc.getDelta().add(
										sourceName + "_bound=" + r.getSource().getName().toLowerCase()
												+ "'_bound+" + sourceName + "_bound" );

								if ( !elemStack.getSentences().contains( arc ) )
									elemStack.getSentences().add( arc );

								if ( !elemStack.getNonterminalStack().contains( sourceName ) )
									elemStack.getNonterminalStack().add( sourceName );

								step1( r.getSource() );

							}
							else if ( r.getType().equals( OMTRelationshipType.ARC_NODE_NETWORK ) )
							{

							}
							else if ( r.getType().equals( OMTRelationshipType.SPATIAL ) )
							{
								OMTClass source = r.getSource();
								OMTClass target = r.getTarget();

								Sentence spat = new Sentence();
								spat.setLeftAssignment( source.getName().toLowerCase() );

								String endElem = target.getName().toLowerCase();
								for ( OMTRelationship rel : target.getIncomingRelations() )
								{
									if ( rel.getType().equals( OMTRelationshipType.ARC_ARC_NETWORK ) )
									{
										endElem = rel.getLabel();
										break;
									}
								}

								// municipality contains pip
								spat.getRightAssignment().add(
										source.getName().toUpperCase() + " <" + r.getLabel() + "> "
												+ endElem.toLowerCase() );
								spat.getConstraint().addAll( buildConstraint( r.getRule() ) );

								if ( !elemStack.getSentences().contains( spat ) )
									elemStack.getSentences().add( spat );

								if ( !elemStack.getNonterminalStack().contains( spat.getLeftAssignment() ) )
									elemStack.getNonterminalStack().add( spat.getLeftAssignment() );

								if ( !elemStack.getNonterminalStack().contains( endElem.toLowerCase() ) )
									elemStack.getNonterminalStack().add( endElem.toLowerCase() );

								if ( !elemStack.getTerminalStack().contains( source.getName().toUpperCase() ) )
									elemStack.getTerminalStack().add( source.getName().toUpperCase() );

								step1( source );
								step1( target );
							}

						}
					}
				}
			}

			FileWriter fstream = null;
			BufferedWriter out = null;
			try
			{
				fstream = new FileWriter( "/Users/sara/git/udigXpLR/regole/lamp.xpg" );
				out = new BufferedWriter( fstream );

				out.append( "LAYERS(" );
				out.newLine();
				out.append( ")" );
				out.newLine();
				out.newLine();

				for ( Sentence s : elemStack.getSentences() )
				{

					out.append( s.toString() );
					out.newLine();

					if ( !s.getDelta().isEmpty() )
					{
						out.append( "DELTA: (" );
						out.newLine();
						for ( String delta : s.getDelta() )
						{
							out.append( "\"" + delta + "\"," );
							out.newLine();
						}

						out.append( ")" );
						out.newLine();

					}

					if ( !s.getConstraint().isEmpty() )
					{
						out.append( "SEMANTICRULE: {\"" );
						out.newLine();

						for ( String constraint : s.getConstraint() )
						{
							out.append( constraint );
							out.newLine();
						}

						out.append( "\"}" );
					}
					out.append( ";" );
					out.newLine();

					out.flush();
				}

			}
			catch ( IOException e )
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					out.close();
					fstream.close();
				}
				catch ( IOException e )
				{
					e.printStackTrace();
				}

			}

		}
		else
			System.out.println( selection.getFirstElement().getClass().toString() );
	}

	private void step1( OMTClass cl )
	{
		Sentence s = new Sentence();
		String name = cl.getName();

		if ( !elemStack.getTerminalStack().contains( name.toUpperCase() ) )
			elemStack.getTerminalStack().add( name.toUpperCase() );
		if ( !elemStack.getNonterminalStack().contains( name.toLowerCase() ) )
			elemStack.getNonterminalStack().add( name.toLowerCase() );

		s.setLeftAssignment( name.toLowerCase() );
		s.getRightAssignment().add( name.toUpperCase() );
		s.getDelta().add( name.toLowerCase() + "_bound=" + name.toUpperCase() + "_bound" );

		if ( !cl.getAttributes().isEmpty() )
		{
			for ( ClassAttribute att : cl.getAttributes() )
			{
				s.getDelta().add( att.getName() + "=" + att.getType() );
			}

			s.getConstraint().add( "void onCreate(){" );
			for ( ClassAttribute ca : cl.getAttributes() )
			{
				if ( ca.getDefaultValue() != null && !ca.getDefaultValue().isEmpty() )
					s.getConstraint().add( ca.getName() + "=" + ca.getDefaultValue() );
			}
			s.getConstraint().add( "}" );
		}

		if ( !elemStack.getSentences().contains( s ) ) elemStack.getSentences().add( s );

	}

	private ArrayList< String > buildConstraint( SpatialIntegrityRule rule )
	{
		ArrayList< String > rv = new ArrayList<>();

		switch ( rule )
		{
			case CONTAIN:

				/*
				 * Let A,B be two geo-objects, where A is a member of the Polygon class. Then (A contain B) = TRUE iff ((B in A) = TRUE) and ((A coincide B) =FALSE)
				 */

				break;

			default:
				break;
		}

		return rv;
	}
}
