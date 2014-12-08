package it.unibz.udig.omtg.gef.figures.helpers;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;

public class CompartmentFigure extends Figure
{

	public CompartmentFigure()
	{
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment( ToolbarLayout.ALIGN_CENTER );
		layout.setStretchMinorAxis( false );
		layout.setSpacing( 5 );
		setLayoutManager( layout );
		setBorder( new CompartmentFigureBorder() );
	}

	public class CompartmentFigureBorder extends AbstractBorder
	{

		public Insets getInsets( IFigure figure )
		{
			return new Insets( 5, 5, 0, 0 );
		}

		public void paint( IFigure figure, Graphics graphics, Insets insets )
		{
			graphics.drawLine( getPaintRectangle( figure, insets ).getTopLeft(), tempRect.getTopRight() );
		}
	}
}
