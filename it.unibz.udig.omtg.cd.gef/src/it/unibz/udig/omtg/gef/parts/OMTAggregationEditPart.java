package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.cd.model.OMTAggregation;
import it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectGeometryClassImpl;
import it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectTopologyClassImpl;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.SWT;

public class OMTAggregationEditPart extends OMTRelationshipEditPart
{

	@Override
	protected PolylineConnection createFigure( )
	{
		PolylineConnection connection = super.createFigure();
		OMTAggregation model = (OMTAggregation)getModel();

		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint( 0, 0 );
		decorationPointList.addPoint( -2, 2 );
		decorationPointList.addPoint( -4, 0 );
		decorationPointList.addPoint( -2, -2 );
		decoration.setTemplate( decorationPointList );
		decoration.setFill( true );
		decoration.setBackgroundColor( ColorConstants.white );

		if ( model.getSource() != null && model.getTarget() != null )
		{
			Class< ? > clazzSource = model.getSource().getClass();
			Class< ? > clazzTarget = model.getTarget().getClass();

			if ( (clazzSource.isAssignableFrom( OMTGeoObjectGeometryClassImpl.class )
					|| clazzSource.isAssignableFrom( OMTGeoObjectTopologyClassImpl.class ) || clazzSource
						.isAssignableFrom( OMTGeoObjectGeometryClassImpl.class ))
					&& (clazzTarget.isAssignableFrom( OMTGeoObjectGeometryClassImpl.class )
							|| clazzTarget.isAssignableFrom( OMTGeoObjectTopologyClassImpl.class ) || clazzTarget
								.isAssignableFrom( OMTGeoObjectGeometryClassImpl.class )) )

			{
				connection.setLineStyle( SWT.LINE_CUSTOM );
				connection.setLineDash( new float[ ]
				{ 10.0f, 10.0f } );
			}
			else
				System.out.println( clazzSource.toString() + " - " + clazzTarget.toString() );
		}

		connection.setTargetDecoration( decoration );

		return connection;
	}
}
