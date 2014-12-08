package it.unibz.udig.omtg.gef.editor;

import it.unibz.udig.omtg.gef.factories.classes.OMTBidirectionalGeoObjectClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTConventionalClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTIsolineGeoFieldClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTLineGeoObjectClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTNodeGeoObjectClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTPlanarGeoFieldClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTPointGeoObjectClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTPolygonGeoObjectClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTSamplingGeoFieldClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTTINGeoFieldClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTTesselationGeoFieldClassFactory;
import it.unibz.udig.omtg.gef.factories.classes.OMTUnidirectionalGeoObjectClassFactory;
import it.unibz.udig.omtg.gef.factories.generalizations.OMTDisjointGeneralizationFactory;
import it.unibz.udig.omtg.gef.factories.generalizations.OMTOverlapGeneralizationFactory;
import it.unibz.udig.omtg.gef.factories.relationships.OMTAggregationFactory;
import it.unibz.udig.omtg.gef.factories.relationships.OMTRelationshipCrossFactory;
import it.unibz.udig.omtg.gef.factories.relationships.OMTRelationshipDisjointFactory;
import it.unibz.udig.omtg.gef.factories.relationships.OMTRelationshipFactory;
import it.unibz.udig.omtg.gef.factories.relationships.OMTRelationshipInFactory;
import it.unibz.udig.omtg.gef.factories.relationships.OMTRelationshipOverlapFactory;
import it.unibz.udig.omtg.gef.factories.relationships.OMTRelationshipTouchFactory;
import it.unibz.udig.omtg.gef.factories.relationships.special.OMTRelationshipAdjacentToFactory;
import it.unibz.udig.omtg.gef.factories.relationships.special.OMTRelationshipCoincideFactory;
import it.unibz.udig.omtg.gef.factories.relationships.special.OMTRelationshipContainFactory;
import it.unibz.udig.omtg.gef.factories.relationships.special.OMTRelationshipNearFactory;
import it.unibz.udig.omtg.gef.tools.CreateAndDirectEditTool;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;

public class OMTClassDiagramGraphicalEditorPalette extends PaletteRoot
{

	public OMTClassDiagramGraphicalEditorPalette()
	{
		add( addGeneralTools() );
		add( addOMTGeoreferencedClassTool() );
		add( addOMTGeoreferencedClassTool2() );
		add( addOMTRelationshipTool() );
		add( addOMTSimpleAssociationsTool() );
		add( addOMTGeneralizationsTool() );
	}

	private PaletteDrawer addOMTGeoreferencedClassTool( )
	{
		PaletteDrawer group = new PaletteDrawer( "Geo-field classes" );

		CreationToolEntry entry = new CreationToolEntry( " Isoline Geo-field Class",
				"Create a new Isoline Geo-field Class", new OMTIsolineGeoFieldClassFactory(), null, null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		entry = new CreationToolEntry( " TIN Geo-field Class", "Create a new TIN Geo-field Class",
				new OMTTINGeoFieldClassFactory(), null, null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		entry = new CreationToolEntry( " Planar Subdivision Geo-field Class",
				"Create a new Planar Subdivision Geo-field Class", new OMTPlanarGeoFieldClassFactory(), null,
				null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		entry = new CreationToolEntry( " Tesselation Geo-field Class",
				"Create a new Tesselation Geo-field Class", new OMTTesselationGeoFieldClassFactory(), null,
				null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		entry = new CreationToolEntry( " Sampling Geo-field Class",
				"Create a new Planar Sampling Geo-field Class", new OMTSamplingGeoFieldClassFactory(), null,
				null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		return group;
	}

	private PaletteDrawer addOMTGeoreferencedClassTool2( )
	{
		PaletteDrawer group = new PaletteDrawer( "Geo-object classes" );

		CreationToolEntry entry = new CreationToolEntry( " Point Geometry Geo-object Class",
				"Create a new Point Geometry Geo-object Class", new OMTPointGeoObjectClassFactory(), null,
				null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		entry = new CreationToolEntry( " Line Geometry Geo-object Class",
				"Create a new Line Geometry Geo-object Class", new OMTLineGeoObjectClassFactory(), null, null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		entry = new CreationToolEntry( " Polygon Geometry Geo-object Class",
				"Create a new Polygon Geometry Geo-object Class", new OMTPolygonGeoObjectClassFactory(),
				null, null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		//****************//

		entry = new CreationToolEntry( " Node Topology Geo-object Class",
				"Create a new Node Topology Geo-object Class", new OMTNodeGeoObjectClassFactory(), null, null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		entry = new CreationToolEntry( " Unidir. line Topology Geo-object Class",
				"Create a new unidirectional Topology Geo-object Class",
				new OMTUnidirectionalGeoObjectClassFactory(), null, null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		entry = new CreationToolEntry( " Bidir. line Topology Geo-object Class",
				"Create a new bidirectional Topology Geo-object Class",
				new OMTBidirectionalGeoObjectClassFactory(), null, null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		group.add( entry );

		return group;
	}

	private PaletteDrawer addOMTGeneralizationsTool( )
	{
		PaletteDrawer group = new PaletteDrawer( "Generalizations" );

		ConnectionCreationToolEntry entry;

		entry = new ConnectionCreationToolEntry( "Disjoint generalization",
				"Create a new  disjoint generalization", new OMTDisjointGeneralizationFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( "Overlap generalization",
				"Create a new  overlap generalization", new OMTOverlapGeneralizationFactory(), null, null );
		group.add( entry );

		return group;

	}

	private PaletteDrawer addOMTSimpleAssociationsTool( )
	{
		PaletteDrawer group = new PaletteDrawer( "Simple associations" );
		ConnectionCreationToolEntry entry;

		entry = new ConnectionCreationToolEntry( " AdjacentTo relation", "Create a new  AdjacentTo relation",
				new OMTRelationshipAdjacentToFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( " Coincide relation", "Create a new  Coincide relation",
				new OMTRelationshipCoincideFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( " Contain relation", "Create a new  Contain relation",
				new OMTRelationshipContainFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( " Cross relation", "Create a new  Cross relation",
				new OMTRelationshipCrossFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( " Disjoint relation", "Create a new  Disjoint relation",
				new OMTRelationshipDisjointFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( " in relation", "Create a new  in relation",
				new OMTRelationshipInFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( " near relation", "Create a new  near relation",
				new OMTRelationshipNearFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( " Overlap relation", "Create a new  Overlap relation",
				new OMTRelationshipOverlapFactory(), null, null );
		group.add( entry );

		entry = new ConnectionCreationToolEntry( " Touch relation", "Create a new  Touch relation",
				new OMTRelationshipTouchFactory(), null, null );
		group.add( entry );
		return group;
	}

	private PaletteDrawer addOMTRelationshipTool( )
	{
		PaletteDrawer group = new PaletteDrawer( "Relatioship" );
		ConnectionCreationToolEntry e = new ConnectionCreationToolEntry( "Relationship",
				"Create a new relationship", new OMTRelationshipFactory(), null, null );
		group.add( e );
		return group;
	}

	private PaletteDrawer addGeneralTools( )
	{
		PaletteDrawer drawer = new PaletteDrawer( "General" );
		ToolEntry tool = new PanningSelectionToolEntry();
		drawer.add( tool );
		setDefaultEntry( tool );

		CreationToolEntry entry = new CreationToolEntry( "Conventional class",
				"Create a new Conventional class", new OMTConventionalClassFactory(), null, null );
		entry.setToolClass( CreateAndDirectEditTool.class );
		drawer.add( entry );

		ConnectionCreationToolEntry entry2 = new ConnectionCreationToolEntry( "Aggregation",
				"Create a new aggregation association", new OMTAggregationFactory(), null, null );
		drawer.add( entry2 );

		return drawer;

	}

}
