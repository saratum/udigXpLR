package it.unibz.udig.omtg.gef.factories.relationships;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.cd.model.SpatialIntegrityRule;

import org.eclipse.gef.requests.CreationFactory;

public class OMTRelationshipTouchFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTRelationship link = CDFactory.eINSTANCE.createOMTRelationship();
		link.setRule( SpatialIntegrityRule.TOUCH );
		return link;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTRelationship.class;
	}

}
