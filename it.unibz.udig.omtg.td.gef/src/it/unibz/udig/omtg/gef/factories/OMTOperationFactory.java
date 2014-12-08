package it.unibz.udig.omtg.gef.factories;

import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.TDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTOperationFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return TDFactory.eINSTANCE.createOMTOperation();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTOperation.class;
	}

}
