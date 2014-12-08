package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClassKind;

import org.eclipse.gef.requests.CreationFactory;

public class OMTNodeGeoObjectClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeoObjectTopologyClass obj = CDFactory.eINSTANCE.createOMTGeoObjectTopologyClass();
		obj.setRepresentation( OMTGeoObjectTopologyClassKind.NODE );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeoObjectTopologyClass.class;
	}
}
