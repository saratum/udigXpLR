package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.cd.model.OMTAggregation;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTConventionalClass;
import it.unibz.udig.omtg.cd.model.OMTGeneralization;
import it.unibz.udig.omtg.cd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.cd.model.OMTRelationship;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class OMTCDEditPartFactory implements EditPartFactory
{

	@Override
	public EditPart createEditPart( EditPart context, Object model )
	{
		EditPart ep = null;

		if ( model instanceof OMTClassDiagram )
			ep = new OMTClassDiagramEditPart();
		else if ( model instanceof OMTConventionalClass )
			ep = new OMTConventionalClassEditPart();
		else if ( model instanceof OMTGeoFieldClass )
			ep = new OMTGeoFieldClassEditPart();
		else if ( model instanceof OMTGeoObjectGeometryClass )
			ep = new OMTGeoObjectGeometryClassEditPart();
		else if ( model instanceof OMTGeoObjectTopologyClass )
			ep = new OMTGeoObjectTopologyClassEditPart();
		else if ( model instanceof OMTGeneralization )
			ep = new OMTGeneralizationEditPart();
		else if ( model instanceof OMTAggregation )
			ep = new OMTAggregationEditPart();
		else if ( model instanceof OMTRelationship )
			ep = new OMTRelationshipEditPart();
		else
			throw new IllegalArgumentException( "Model class " + model.getClass() + " not supported yet." );

		if ( ep != null ) ep.setModel( model );

		return ep;
	}
}
