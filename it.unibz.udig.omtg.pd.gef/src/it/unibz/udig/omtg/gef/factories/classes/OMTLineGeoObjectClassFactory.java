package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClassKind;
import it.unibz.udig.omtg.pd.model.PDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTLineGeoObjectClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeoObjectGeometryClass obj = PDFactory.eINSTANCE.createOMTGeoObjectGeometryClass();
		obj.setRepresentation( OMTGeoObjectGeometryClassKind.LINE );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeoObjectGeometryClass.class;
	}
}
