package it.unibz.udig.omtg.gef.factories.relationships;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.OMTRelationship;

import org.eclipse.gef.requests.CreationFactory;

public class OMTRelationshipFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		return CDFactory.eINSTANCE.createOMTRelationship();
	}

	@Override
	public Object getObjectType( )
	{
		return OMTRelationship.class;
	}

}
