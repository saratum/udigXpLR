package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.OMTConventionalClass;

import org.eclipse.gef.requests.CreationFactory;

public class OMTConventionalClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return CDFactory.eINSTANCE.createOMTConventionalClass();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTConventionalClass.class;
	}

}
