package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.cd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.gef.figures.OMTClassFigure;
import it.unibz.udig.omtg.gef.figures.OMTGeoFieldClassFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.Request;
import org.eclipse.jface.viewers.TextCellEditor;

public class OMTGeoFieldClassEditPart extends OMTClassEditPart
{

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
		Label label = ((OMTClassFigure)getFigure()).getNameLabel();
		TextDirectEditManager manager = new TextDirectEditManager( this, TextCellEditor.class,
				new OMTClassLabelCellEditorLocator( label ), label );
		manager.show();
	}

	@Override
	protected IFigure createFigure( )
	{
		OMTGeoFieldClass model = (OMTGeoFieldClass)getModel();
		figure = new OMTGeoFieldClassFigure( model.getRepresentation() );
		return figure;
	}

}
