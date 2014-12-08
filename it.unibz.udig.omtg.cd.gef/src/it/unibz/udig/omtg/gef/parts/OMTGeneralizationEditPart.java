package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.cd.model.GeneralizationKind;
import it.unibz.udig.omtg.cd.model.OMTGeneralization;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;

public class OMTGeneralizationEditPart extends OMTRelationshipEditPart
{

	@Override
	protected PolylineConnection createFigure( )
	{
		PolylineConnection connection = super.createFigure();
		OMTGeneralization model = (OMTGeneralization)getModel();

		connection.setConnectionRouter( new BendpointConnectionRouter() );

		decorateConnection( connection, model.getKind(), model.isTotal() );
		return connection;
	}

	/**
	 * Decorate a connection depending on its kind.
	 * 
	 * @param connection
	 *            the {@link PolylineConnection} to decorate.
	 * @param kind
	 *            the {@link OPMProceduralLinkKind} of the model entity.
	 */
	private void decorateConnection( PolylineConnection connection, GeneralizationKind kind, boolean total )
	{
		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint( 0, 0 );
		decorationPointList.addPoint( -4, 4 );
		decorationPointList.addPoint( -4, -4 );
		decoration.setTemplate( decorationPointList );
		decoration.setFill( true );

		connection.setTargetDecoration( decoration );

		switch ( kind )
		{
			case DISJOINT:
				decoration.setBackgroundColor( ColorConstants.white );
				break;
			case OVERLAP:
				decoration.setBackgroundColor( ColorConstants.black );

				break;
			default:
				throw new IllegalArgumentException( "No case for kind " + kind );
		}

		if ( total )
		{
			// TODO aggiunta pallino
			//decoration.add(new CircleDecoration(), 0);
		}
	}

}
