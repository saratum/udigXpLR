package it.unibz.udig.omtg.gef.factories;

import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.PDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTPresentationSpecificationFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return PDFactory.eINSTANCE.createOMTPresentationSpecification();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTPresentationSpecification.class;
	}

}
