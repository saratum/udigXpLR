package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.pd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind;
import it.unibz.udig.omtg.pd.model.PDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTTINGeoFieldClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeoFieldClass obj = PDFactory.eINSTANCE.createOMTGeoFieldClass();
		obj.setRepresentation( OMTGeoFieldClassKind.TRIANGULAR_IRREGULAR_NETWORK );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeoFieldClass.class;
	}
}
