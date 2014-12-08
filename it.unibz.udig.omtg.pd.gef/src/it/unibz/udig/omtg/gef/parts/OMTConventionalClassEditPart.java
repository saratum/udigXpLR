package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.gef.figures.OMTConventionalClassFigure;

import org.eclipse.draw2d.IFigure;

public class OMTConventionalClassEditPart extends OMTClassEditPart
{

	@Override
	protected IFigure createFigure( )
	{
		return new OMTConventionalClassFigure();
	}

}
