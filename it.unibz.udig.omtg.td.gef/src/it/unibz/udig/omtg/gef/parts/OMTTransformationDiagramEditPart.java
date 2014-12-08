package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.policies.OMTTransformationDiagramXYLayoutPolicy;
import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;

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

public class OMTTransformationDiagramEditPart extends AbstractGraphicalEditPart
{

	private OMTTransformationDiagramAdapter	adapter;

	public OMTTransformationDiagramEditPart()
	{
		super();
		adapter = new OMTTransformationDiagramAdapter();

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
		installEditPolicy( EditPolicy.LAYOUT_ROLE, new OMTTransformationDiagramXYLayoutPolicy() );

	}

	@Override
	protected List< OMTClass > getModelChildren( )
	{
		OMTTransformationDiagram model = (OMTTransformationDiagram)getModel();
		return model.getClasses();
	}

	@Override
	public void activate( )
	{
		if ( !isActive() )
		{
			((OMTTransformationDiagram)getModel()).eAdapters().add( adapter );
		}
		super.activate();
	}

	@Override
	public void deactivate( )
	{
		if ( isActive() )
		{
			((OMTTransformationDiagram)getModel()).eAdapters().remove( adapter );
		}
		super.deactivate();
	}

	public class OMTTransformationDiagramAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshChildren();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTTransformationDiagram)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTTransformationDiagram.class );
		}
	}

}
