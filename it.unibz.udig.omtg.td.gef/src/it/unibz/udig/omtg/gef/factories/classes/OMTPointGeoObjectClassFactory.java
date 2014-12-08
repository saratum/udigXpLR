package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClassKind;
import it.unibz.udig.omtg.td.model.TDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTPointGeoObjectClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeoObjectGeometryClass obj = TDFactory.eINSTANCE.createOMTGeoObjectGeometryClass();
		obj.setRepresentation( OMTGeoObjectGeometryClassKind.POINT );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeoObjectGeometryClass.class;
	}
}
