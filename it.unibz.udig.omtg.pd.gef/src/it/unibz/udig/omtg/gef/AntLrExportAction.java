package it.unibz.udig.omtg.gef;

import it.unibz.udig.omtg.gef.parts.OMTPresentationDiagramEditPart;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

public class AntLrExportAction extends Action implements IWorkbenchAction
{

	private final IWorkbenchWindow	window;
	public static final String		ID	= "";
	private IStructuredSelection	selection;

	public AntLrExportAction(IWorkbenchWindow win)
	{
		this.window = win;
		setId( ID );
		setText( "Export to AntLR" );
		setImageDescriptor( new ImageDescriptor()
		{

			@Override
			public ImageData getImageData( )
			{
				return DEFAULT_IMAGE_DATA;
			}
		} );
	}

	@Override
	public void dispose( )
	{
	}

	@Override
	public void run( )
	{

		selection = (IStructuredSelection)window.getSelectionService().getSelection();

		if ( selection.getFirstElement() instanceof OMTPresentationDiagramEditPart )
		{
			OMTPresentationDiagramEditPart pdep = (OMTPresentationDiagramEditPart)selection.getFirstElement();
			OMTPresentationDiagram cd = (OMTPresentationDiagram)pdep.getModel();
			System.out.println( cd.getObjects().get( 0 ) );

		}
		else
			System.out.println( selection.getFirstElement().getClass().toString() );
	}

}
