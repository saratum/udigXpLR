package it.unibz.udig.omtg.gef.factories.generalizations;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.GeneralizationKind;
import it.unibz.udig.omtg.cd.model.OMTGeneralization;

import org.eclipse.gef.requests.CreationFactory;

public class OMTOverlapGeneralizationFactory implements CreationFactory
{

	@Override
	public Object getNewObject( )
	{
		OMTGeneralization obj = CDFactory.eINSTANCE.createOMTGeneralization();
		obj.setKind( GeneralizationKind.OVERLAP );
		return obj;
	}

	@Override
	public Object getObjectType( )
	{
		return OMTGeneralization.class;
	}

}
