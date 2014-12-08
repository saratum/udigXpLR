package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTConventionalClass;
import it.unibz.udig.omtg.cd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.gef.commands.OMTClassChangeConstraintCommand;
import it.unibz.udig.omtg.gef.commands.OMTClassCreateCommand;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

public class OMTClassDiagramXYLayoutPolicy extends XYLayoutEditPolicy
{

	final Dimension	DEFAULT_THING_DIMENSION	= new Dimension( 50, 50 );

	@Override
	protected Command createChangeConstraintCommand( EditPart child, Object constraint )
	{
		OMTClassChangeConstraintCommand command = new OMTClassChangeConstraintCommand();
		command.setModel( (OMTClass)child.getModel() );
		command.setNewConstraint( (Rectangle)constraint );
		return command;
	}

	@Override
	protected Command getCreateCommand( CreateRequest request )
	{
		Command retVal = null;

		if ( (request.getNewObjectType().equals( OMTConventionalClass.class ))
				|| (request.getNewObjectType().equals( OMTGeoFieldClass.class ))
				|| (request.getNewObjectType().equals( OMTGeoObjectGeometryClass.class ))
				|| (request.getNewObjectType().equals( OMTGeoObjectTopologyClass.class )) )
		{
			OMTClassCreateCommand command = new OMTClassCreateCommand();
			command.setConstraints( new Rectangle( request.getLocation(), DEFAULT_THING_DIMENSION ) );
			command.setParent( (OMTClassDiagram)getHost().getModel() );

			if ( request.getNewObjectType().equals( OMTConventionalClass.class ) )
				command.setNode( (OMTConventionalClass)(request.getNewObject()) );
			else if ( request.getNewObjectType().equals( OMTGeoFieldClass.class ) )
				command.setNode( (OMTGeoFieldClass)(request.getNewObject()) );
			else if ( request.getNewObjectType().equals( OMTGeoObjectGeometryClass.class ) )
				command.setNode( (OMTGeoObjectGeometryClass)(request.getNewObject()) );
			else if ( request.getNewObjectType().equals( OMTGeoObjectTopologyClass.class ) )
				command.setNode( (OMTGeoObjectTopologyClass)(request.getNewObject()) );

			retVal = command;
		}

		return retVal;
	}
}
