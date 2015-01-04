package it.unibz.udig.xplr.tool.select;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class XpLRViewPart extends ViewPart
{

	public static final String VIEW_ID = "it.unibz.udig.xplr.tool.select.xplrView";
	private Text text;

	@Override
	public void createPartControl(Composite parent)
	{
		text = new Text(parent, SWT.BORDER);
		FontData errFont = new FontData();
		
		
		
	}

	@Override
	public void setFocus()
	{
	}
	
	public void setOutputText(String t)
	{
		text.setText(t);
	}

}