package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.pd.model.OMTConventionalClass;
import it.unibz.udig.omtg.pd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class OMTPDEditPartFactory implements EditPartFactory
{

	@Override
	public EditPart createEditPart( EditPart context, Object model )
	{
		EditPart ep = null;

		if ( model instanceof OMTPresentationDiagram )
			ep = new OMTPresentationDiagramEditPart();
		else if ( model instanceof OMTConventionalClass )
			ep = new OMTConventionalClassEditPart();
		else if ( model instanceof OMTGeoFieldClass )
			ep = new OMTGeoFieldClassEditPart();
		else if ( model instanceof OMTGeoObjectGeometryClass )
			ep = new OMTGeoObjectGeometryClassEditPart();
		else if ( model instanceof OMTGeoObjectTopologyClass )
			ep = new OMTGeoObjectTopologyClassEditPart();
		else if ( model instanceof OMTPresentationSpecification )
			ep = new OMTPresentationSpecificationEditPart();
		else if ( model instanceof OMTTPOperation )
			ep = new OMTTPOperationEditPart();
		else
			throw new IllegalArgumentException( "Model class " + model.getClass() + " not supported yet." );

		if ( ep != null ) ep.setModel( model );

		return ep;
	}

}
