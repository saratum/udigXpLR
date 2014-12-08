package it.unibz.udig.omtg.gef.figures;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;

public interface OMTPDNodeFigure extends IFigure
{

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
