package it.unibz.udig.omtg.gef.factories;

import it.unibz.udig.omtg.pd.model.OMTTPOperation;
import it.unibz.udig.omtg.pd.model.PDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTTPOperationFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return PDFactory.eINSTANCE.createOMTTPOperation();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTTPOperation.class;
	}

}
