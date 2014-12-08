package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.figures.OMTGeoObjectGeometryClassFigure;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass;

import org.eclipse.draw2d.IFigure;

public class OMTGeoObjectGeometryClassEditPart extends OMTClassEditPart
{

	@Override
	protected IFigure createFigure( )
	{
		OMTGeoObjectGeometryClass model = (OMTGeoObjectGeometryClass)getModel();
		figure = new OMTGeoObjectGeometryClassFigure( model.getRepresentation() );
		return figure;
	}

}
