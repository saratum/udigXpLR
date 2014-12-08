package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind;

import org.eclipse.gef.requests.CreationFactory;

public class OMTTesselationGeoFieldClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeoFieldClass obj = CDFactory.eINSTANCE.createOMTGeoFieldClass();
		obj.setRepresentation( OMTGeoFieldClassKind.TESSELATION );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeoFieldClass.class;
	}
}
