package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind;
import it.unibz.udig.omtg.pd.model.PDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTNodeGeoObjectClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeoObjectTopologyClass obj = PDFactory.eINSTANCE.createOMTGeoObjectTopologyClass();
		obj.setRepresentation( OMTGeoObjectTopologyClassKind.NODE );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeoObjectTopologyClass.class;
	}
}
