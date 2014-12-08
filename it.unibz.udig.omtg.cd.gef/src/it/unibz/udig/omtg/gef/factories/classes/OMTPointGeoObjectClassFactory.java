package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind;

import org.eclipse.gef.requests.CreationFactory;

public class OMTPointGeoObjectClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeoObjectGeometryClass obj = CDFactory.eINSTANCE.createOMTGeoObjectGeometryClass();
		obj.setRepresentation( OMTGeoObjectGeometryClassKind.POINT );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeoObjectGeometryClass.class;
	}
}
