package it.unibz.udig.omtg.gef.policies;

import it.unibz.udig.omtg.gef.commands.OMTPDNodeChangeConstraintCommand;
import it.unibz.udig.omtg.gef.commands.OMTPDNodeCreateCommand;
import it.unibz.udig.omtg.pd.model.OMTConventionalClass;
import it.unibz.udig.omtg.pd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.pd.model.OMTPDNode;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

public class OMTPresentationDiagramXYLayoutPolicy extends XYLayoutEditPolicy
{

	final Dimension	DEFAULT_THING_DIMENSION	= new Dimension( 50, 50 );

	@Override
	protected Command createChangeConstraintCommand( EditPart child, Object constraint )
	{
		OMTPDNodeChangeConstraintCommand command = new OMTPDNodeChangeConstraintCommand();
		command.setModel( (OMTPDNode)child.getModel() );
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
				|| (request.getNewObjectType().equals( OMTGeoObjectTopologyClass.class ))
				|| (request.getNewObjectType().equals( OMTPresentationSpecification.class )) )
		{
			OMTPDNodeCreateCommand command = new OMTPDNodeCreateCommand();
			command.setConstraints( new Rectangle( request.getLocation(), DEFAULT_THING_DIMENSION ) );
			command.setParent( (OMTPresentationDiagram)getHost().getModel() );

			if ( request.getNewObjectType().equals( OMTConventionalClass.class ) )
				command.setNode( (OMTConventionalClass)(request.getNewObject()) );
			else if ( request.getNewObjectType().equals( OMTGeoFieldClass.class ) )
				command.setNode( (OMTGeoFieldClass)(request.getNewObject()) );
			else if ( request.getNewObjectType().equals( OMTGeoObjectGeometryClass.class ) )
				command.setNode( (OMTGeoObjectGeometryClass)(request.getNewObject()) );
			else if ( request.getNewObjectType().equals( OMTGeoObjectTopologyClass.class ) )
				command.setNode( (OMTGeoObjectTopologyClass)(request.getNewObject()) );
			else if ( request.getNewObjectType().equals( OMTPresentationSpecification.class ) )
				command.setNode( (OMTPresentationSpecification)(request.getNewObject()) );

			retVal = command;
		}

		return retVal;
	}
}
