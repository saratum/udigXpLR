package it.unibz.udig.omtg.gef.figures;

import it.unibz.udig.omtg.gef.figures.helpers.CompartmentFigure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Label;

public interface OMTClassFigure
{

	public Label getNameLabel( );

	public CompartmentFigure getAttributes( );

	public CompartmentFigure getOperations( );

	public void setTemporary( boolean t );

	/**
	 * Get the anchor used for links who use this figure as their source. 
	 * @return the anchor for source links.
	 */
	public abstract ConnectionAnchor getSourceConnectionAnchor( );

	/**
	 * Get the anchor used for links who use this figure as their target.
	 * @return the anchor for target links.
	 */
	public abstract ConnectionAnchor getTargetConnectionAnchor( );

}
