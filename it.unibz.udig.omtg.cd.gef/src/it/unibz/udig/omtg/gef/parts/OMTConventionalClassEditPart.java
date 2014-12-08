package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.figures.OMTClassFigure;
import it.unibz.udig.omtg.gef.figures.OMTConventionalClassFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.Request;
import org.eclipse.jface.viewers.TextCellEditor;

public class OMTConventionalClassEditPart extends OMTClassEditPart
{

	@Override
	protected IFigure createFigure( )
	{
		return new OMTConventionalClassFigure();
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
		Label label = ((OMTClassFigure)getFigure()).getNameLabel();
		TextDirectEditManager manager = new TextDirectEditManager( this, TextCellEditor.class,
				new OMTClassLabelCellEditorLocator( label ), label );
		manager.show();
	}

}
