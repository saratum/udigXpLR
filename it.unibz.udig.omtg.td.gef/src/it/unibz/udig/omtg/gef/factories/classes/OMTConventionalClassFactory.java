package it.unibz.udig.omtg.gef.factories.classes;

import it.unibz.udig.omtg.td.model.OMTConventionalClass;
import it.unibz.udig.omtg.td.model.TDFactory;

import org.eclipse.gef.requests.CreationFactory;

public class OMTConventionalClassFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return TDFactory.eINSTANCE.createOMTConventionalClass();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTConventionalClass.class;
	}

}
