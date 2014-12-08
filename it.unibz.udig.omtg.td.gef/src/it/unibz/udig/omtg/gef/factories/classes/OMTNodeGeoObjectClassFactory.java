package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind;
import it.unibz.udig.omtg.td.model.TDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTNodeGeoObjectClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeoObjectTopologyClass obj = TDFactory.eINSTANCE.createOMTGeoObjectTopologyClass();
		obj.setRepresentation( OMTGeoObjectTopologyClassKind.NODE );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeoObjectTopologyClass.class;
	}
}