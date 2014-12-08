package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.td.model.OMTConventionalClass;
import it.unibz.udig.omtg.td.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTROperation;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class OMTTDEditPartFactory implements EditPartFactory
{

	@Override
	public EditPart createEditPart( EditPart context, Object model )
	{
		EditPart ep = null;

		if ( model instanceof OMTTransformationDiagram )
			ep = new OMTTransformationDiagramEditPart();
		else if ( model instanceof OMTConventionalClass )
			ep = new OMTConventionalClassEditPart();
		else if ( model instanceof OMTGeoFieldClass )
			ep = new OMTGeoFieldClassEditPart();
		else if ( model instanceof OMTGeoObjectGeometryClass )
			ep = new OMTGeoObjectGeometryClassEditPart();
		else if ( model instanceof OMTGeoObjectTopologyClass )
			ep = new OMTGeoObjectTopologyClassEditPart();
		else if ( model instanceof OMTOperation )
			ep = new OMTOperationEditPart();
		else if ( model instanceof OMTTROperation )
			ep = new OMTTROperationEditPart();
		else
			throw new IllegalArgumentException( "Model class " + model.getClass() + " not supported yet." );

		if ( ep != null ) ep.setModel( model );

		return ep;
	}

}
