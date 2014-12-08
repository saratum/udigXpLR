package it.unibz.udig.omtg.gef.factories.relationships;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.OMTAggregation;

import org.eclipse.gef.requests.CreationFactory;

public class OMTAggregationFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return CDFactory.eINSTANCE.createOMTAggregation();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTAggregation.class;
	}

}
