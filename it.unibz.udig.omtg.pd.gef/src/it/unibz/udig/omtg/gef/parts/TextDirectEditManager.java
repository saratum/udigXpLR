package it.unibz.udig.omtg.gef.parts;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;

public class TextDirectEditManager extends DirectEditManager
{

	public TextDirectEditManager(GraphicalEditPart source, Class< ? > editorType, CellEditorLocator locator,
			Label l)
	{
		super( source, editorType, locator );
		this.label = l;
	}

	Label	label;

	@Override
	protected void initCellEditor( )
	{
		String initialLabelText = label.getText();
		getCellEditor().setValue( initialLabelText );
	}

}
