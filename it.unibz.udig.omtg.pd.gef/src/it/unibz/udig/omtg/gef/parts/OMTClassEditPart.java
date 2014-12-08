package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.figures.OMTClassFigure;
import it.unibz.udig.omtg.gef.figures.OMTPDNodeFigure;
import it.unibz.udig.omtg.gef.policies.OMTClassComponentEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTClassLabelDirectEditPolicy;
import it.unibz.udig.omtg.gef.policies.OMTPDNodeGraphicalNodeEditPolicy;
import it.unibz.udig.omtg.pd.model.ClassAttribute;
import it.unibz.udig.omtg.pd.model.ClassOperation;
import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;

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
import org.eclipse.jface.viewers.TextCellEditor;
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
		installEditPolicy( EditPolicy.GRAPHICAL_NODE_ROLE, new OMTPDNodeGraphicalNodeEditPolicy() );
		installEditPolicy( EditPolicy.DIRECT_EDIT_ROLE, new OMTClassLabelDirectEditPolicy() );

	}

	@Override
	public void performRequest( Request req )
	{
		if ( req.getType() == REQ_DIRECT_EDIT )
		{
			performDirectLabelEditing();
		}
	}

	private void performDirectLabelEditing( )
	{
		Label label = ((OMTClassFigure)getFigure()).getClassLabel();
		TextDirectEditManager manager = new TextDirectEditManager( this, TextCellEditor.class,
				new OMTClassLabelCellEditorLocator( label ), label );
		manager.show();
	}

	@Override
	protected void refreshVisuals( )
	{
		OMTClassFigure figure = (OMTClassFigure)getFigure();
		OMTClass model = (OMTClass)getModel();
		OMTPresentationDiagramEditPart parent = (OMTPresentationDiagramEditPart)getParent();

		figure.getClassLabel().setText( model.getName() );

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
	protected List< OMTTPOperation > getModelSourceConnections( )
	{
		OMTClass model = (OMTClass)getModel();
		return model.getOutgoingRelations();
	}

	@Override
	protected List< OMTTPOperation > getModelTargetConnections( )
	{
		return null;
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
		return ((OMTPDNodeFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor( ConnectionEditPart connection )
	{
		return ((OMTPDNodeFigure)getFigure()).getTargetConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor( Request request )
	{
		return ((OMTPDNodeFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor( Request request )
	{
		return ((OMTPDNodeFigure)getFigure()).getTargetConnectionAnchor();
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
