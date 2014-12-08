package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.figures.OMTGeoObjectTopologyClassFigure;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass;

import org.eclipse.draw2d.IFigure;

public class OMTGeoObjectTopologyClassEditPart extends OMTClassEditPart
{

	@Override
	protected IFigure createFigure( )
	{
		OMTGeoObjectTopologyClass model = (OMTGeoObjectTopologyClass)getModel();
		figure = new OMTGeoObjectTopologyClassFigure( model.getRepresentation() );
		return figure;
	}

}
