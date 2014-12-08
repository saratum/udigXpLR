package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.figures.OMTGeoFieldClassFigure;
import it.unibz.udig.omtg.pd.model.OMTGeoFieldClass;

import org.eclipse.draw2d.IFigure;

public class OMTGeoFieldClassEditPart extends OMTClassEditPart
{

	@Override
	protected IFigure createFigure( )
	{
		OMTGeoFieldClass model = (OMTGeoFieldClass)getModel();
		figure = new OMTGeoFieldClassFigure( model.getRepresentation() );
		return figure;
	}

}
