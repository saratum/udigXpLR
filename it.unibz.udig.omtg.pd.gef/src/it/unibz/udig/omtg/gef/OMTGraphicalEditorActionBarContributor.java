package it.unibz.udig.omtg.gef;

import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.DeleteRetargetAction;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.actions.ActionFactory;

public class OMTGraphicalEditorActionBarContributor extends ActionBarContributor
{

	@Override
	protected void buildActions( )
	{
		addRetargetAction( new UndoRetargetAction() );
		addRetargetAction( new RedoRetargetAction() );
		addRetargetAction( new DeleteRetargetAction() );

	}

	@Override
	public void contributeToToolBar( IToolBarManager toolBarManager )
	{
		super.contributeToToolBar( toolBarManager );
		toolBarManager.add( getAction( ActionFactory.UNDO.getId() ) );
		toolBarManager.add( getAction( ActionFactory.REDO.getId() ) );
		toolBarManager.add( getAction( ActionFactory.DELETE.getId() ) );
		toolBarManager.add( new AntLrExportAction( getPage().getWorkbenchWindow() ) );
	}

	@Override
	protected void declareGlobalActionKeys( )
	{
	}

}
