package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.cd.model.ClassAttribute;
import it.unibz.udig.omtg.cd.model.ClassOperation;
import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.gef.figures.OMTClassFigure;
import it.unibz.udig.omtg.gef.policies.OMTClassComponentEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTClassGraphicalNodeEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTClassLabelDirectEditPolicy;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;

public abstract class OMTClassEditPart extends AbstractGraphicalEditPart implements NodeEditPart
{

	OMTClassAdapter	adapter;

	public OMTClassEditPart()
	{
		super();
		adapter = new OMTClassAdapter();
	}

	@Override
	protected void createEditPolicies( )
	{
		installEditPolicy( EditPolicy.COMPONENT_ROLE, new OMTClassComponentEditPolicy() );
		installEditPolicy( EditPolicy.GRAPHICAL_NODE_ROLE, new OMTClassGraphicalNodeEditPolicy() );
		installEditPolicy( EditPolicy.DIRECT_EDIT_ROLE, new OMTClassLabelDirectEditPolicy() );

	}

	@Override
	protected void refreshVisuals( )
	{
		OMTClassFigure figure = (OMTClassFigure)getFigure();
		OMTClass model = (OMTClass)getModel();
		OMTClassDiagramEditPart parent = (OMTClassDiagramEditPart)getParent();

		figure.getNameLabel().setText( model.getName() );

		if ( figure.getAttributes() != null ) figure.getAttributes().removeAll();

		List< ClassAttribute > attrs = model.getAttributes();
		for ( Iterator< ClassAttribute > itAttr = attrs.iterator(); itAttr.hasNext(); )
		{
			ClassAttribute obj = itAttr.next();
			Label str = new Label( obj.getName() + "::" + obj.getType() );
			Font fk = new Font( null, "Lucida Grande", 11, SWT.BOLD );
			Font fn = new Font( null, "Lucida Grande", 11, SWT.NORMAL );

			if ( obj.isKey() )
				str.setFont( fk );
			else
				str.setFont( fn );

			figure.getAttributes().add( str );
		}

		if ( figure.getOperations() != null ) figure.getOperations().removeAll();

		List< ClassOperation > ops = model.getOperations();
		for ( Iterator< ClassOperation > itOp = ops.iterator(); itOp.hasNext(); )
		{
			ClassOperation obj = itOp.next();
			figure.getOperations().add( new Label( obj.getName() + "::" + obj.getType() ) );
		}

		parent.setLayoutConstraint( this, (IFigure)figure, model.getConstraint() );
	}

	@Override
	protected List< OMTRelationship > getModelSourceConnections( )
	{
		OMTClass model = (OMTClass)getModel();
		return model.getOutgoingRelations();
	}

	@Override
	protected List< OMTRelationship > getModelTargetConnections( )
	{
		OMTClass model = (OMTClass)getModel();
		return model.getIncomingRelations();
	}

	@Override
	public void activate( )
	{
		if ( !isActive() )
		{
			((OMTClass)getModel()).eAdapters().add( adapter );
		}
		super.activate();
	}

	@Override
	public void deactivate( )
	{
		if ( isActive() )
		{
			((OMTClass)getModel()).eAdapters().remove( adapter );
		}
		super.deactivate();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor( ConnectionEditPart connection )
	{
		return ((OMTClassFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor( ConnectionEditPart connection )
	{
		return ((OMTClassFigure)getFigure()).getTargetConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor( Request request )
	{
		return ((OMTClassFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor( Request request )
	{
		return ((OMTClassFigure)getFigure()).getTargetConnectionAnchor();
	}

	public class OMTClassAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshVisuals();
			refreshSourceConnections();
			refreshTargetConnections();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTClass)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTClass.class );
		}
	}

}
