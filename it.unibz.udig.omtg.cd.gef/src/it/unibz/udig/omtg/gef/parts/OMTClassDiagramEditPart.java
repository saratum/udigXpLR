package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.gef.policies.OMTClassDiagramXYLayoutPolicy;

import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class OMTClassDiagramEditPart extends AbstractGraphicalEditPart
{

	private OMTClassDiagramAdapter	adapter;

	public OMTClassDiagramEditPart()
	{
		super();
		adapter = new OMTClassDiagramAdapter();

	}

	@Override
	protected IFigure createFigure( )
	{
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager( new FreeformLayout() );
		layer.setBorder( new LineBorder( 1 ) );
		return layer;
	}

	@Override
	protected void createEditPolicies( )
	{
		installEditPolicy( EditPolicy.LAYOUT_ROLE, new OMTClassDiagramXYLayoutPolicy() );

	}

	@Override
	protected List< OMTClass > getModelChildren( )
	{
		OMTClassDiagram model = (OMTClassDiagram)getModel();
		return model.getClasses();
	}

	@Override
	public void activate( )
	{
		if ( !isActive() )
		{
			((OMTClassDiagram)getModel()).eAdapters().add( adapter );
		}
		super.activate();
	}

	@Override
	public void deactivate( )
	{
		if ( isActive() )
		{
			((OMTClassDiagram)getModel()).eAdapters().remove( adapter );
		}
		super.deactivate();
	}

	public class OMTClassDiagramAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshChildren();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTClassDiagram)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTClassDiagram.class );
		}
	}
}
