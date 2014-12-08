package it.unibz.udig.omtg.gef.factories;

import it.unibz.udig.omtg.td.model.OMTTROperation;
import it.unibz.udig.omtg.td.model.TDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTTROperationFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return TDFactory.eINSTANCE.createOMTTROperation();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTTROperation.class;
	}

}
