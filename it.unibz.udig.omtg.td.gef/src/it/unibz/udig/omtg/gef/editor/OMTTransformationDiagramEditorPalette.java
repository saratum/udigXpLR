package it.unibz.udig.omtg.gef.editor;

import it.unibz.udig.omtg.gef.factories.OMTOperationFactory;
import it.unibz.udig.omtg.gef.factories.OMTTROperationFactory;
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
import it.unibz.udig.omtg.gef.tools.CreateAndDirectEditTool;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;

public class OMTTransformationDiagramEditorPalette extends PaletteRoot
{

	public OMTTransformationDiagramEditorPalette()
	{
		add( addGeneralTools() );
		add( addOMTGeoreferencedClassTool() );
		add( addOMTGeoreferencedClassTool2() );
		add( addOperations() );
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

		return drawer;

	}

	//	
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

	private PaletteDrawer addOperations( )
	{
		PaletteDrawer group = new PaletteDrawer( "Operations" );

		ConnectionCreationToolEntry entry;

		entry = new ConnectionCreationToolEntry( " Operation", "Create a new Operation",
				new OMTOperationFactory(), null, null );
		group.add( entry );
		entry = new ConnectionCreationToolEntry( " TR Operation", "Create a new TR Operation",
				new OMTTROperationFactory(), null, null );
		group.add( entry );

		return group;
	}
}
