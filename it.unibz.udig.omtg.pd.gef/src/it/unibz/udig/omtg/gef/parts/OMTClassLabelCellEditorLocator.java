package it.unibz.udig.omtg.gef.parts;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;

public class OMTClassLabelCellEditorLocator implements CellEditorLocator
{

	private Label	nameLabel;

	public OMTClassLabelCellEditorLocator(Label l)
	{
		this.nameLabel = l;
	}

	@Override
	public void relocate( CellEditor celleditor )
	{
		Text text = (Text)celleditor.getControl();
		Point pref = text.computeSize( SWT.DEFAULT, SWT.DEFAULT );
		Rectangle rect = nameLabel.getTextBounds().getCopy();
		nameLabel.translateToAbsolute( rect );
		text.setBounds( rect.x - 1, rect.y - 1, pref.x + 1, pref.y + 1 );

	}

}
