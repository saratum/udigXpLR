package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.pd.model.OMTConventionalClass;
import it.unibz.udig.omtg.pd.model.PDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTConventionalClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return PDFactory.eINSTANCE.createOMTConventionalClass();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTConventionalClass.class;
	}

}
