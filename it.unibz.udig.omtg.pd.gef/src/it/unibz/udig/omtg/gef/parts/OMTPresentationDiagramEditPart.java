package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.policies.OMTPresentationDiagramXYLayoutPolicy;
import it.unibz.udig.omtg.pd.model.OMTPDNode;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;

import java.util.ArrayList;
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

public class OMTPresentationDiagramEditPart extends AbstractGraphicalEditPart
{

	private OMTPresentationDiagramAdapter	adapter;

	public OMTPresentationDiagramEditPart()
	{
		super();
		adapter = new OMTPresentationDiagramAdapter();
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
		installEditPolicy( EditPolicy.LAYOUT_ROLE, new OMTPresentationDiagramXYLayoutPolicy() );

	}

	@Override
	protected List< OMTPDNode > getModelChildren( )
	{

		List< OMTPDNode > retVal = new ArrayList< OMTPDNode >();
		OMTPresentationDiagram opd = (OMTPresentationDiagram)getModel();
		retVal.addAll( opd.getObjects() );
		return retVal;
	}

	@Override
	public void activate( )
	{
		if ( !isActive() )
		{
			((OMTPresentationDiagram)getModel()).eAdapters().add( adapter );
		}
		super.activate();
	}

	@Override
	public void deactivate( )
	{
		if ( isActive() )
		{
			((OMTPresentationDiagram)getModel()).eAdapters().remove( adapter );
		}
		super.deactivate();
	}

	class OMTPresentationDiagramAdapter implements Adapter
	{

		@Override
		public void notifyChanged( Notification notification )
		{
			refreshChildren();
		}

		@Override
		public Notifier getTarget( )
		{
			return (OMTPresentationDiagram)getModel();
		}

		@Override
		public void setTarget( Notifier newTarget )
		{
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType( Object type )
		{
			return type.equals( OMTPresentationDiagram.class );
		}
	}

}
