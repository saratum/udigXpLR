package it.unibz.udig.omtg.gef.parts;

import it.unibz.udig.omtg.td.model.OMTOperation;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;

public class OMTOperationEditPart extends OMTTDConnectionEditPart
{

	public OMTOperationEditPart()
	{
		super();
	}

	@Override
	protected PolylineConnection createFigure( )
	{
		PolylineConnection c = super.createFigure();
		try
		{
			OMTOperation model = (OMTOperation)getModel();

			if ( model.getOperator() != null )
			{
				Label relationshipLabel = new Label( model.getOperator() );
				if ( targetLabelLocator != null )
					c.add( relationshipLabel, targetLabelLocator );
				else
					c.add( relationshipLabel );
			}

			c.setConnectionRouter( new BendpointConnectionRouter() );
			c.setTargetDecoration( new PolylineDecoration() );

		}
		catch ( Exception ex )
		{
			ex.printStackTrace();

		}
		return c;
	}
}
