package it.unibz.udig.xplr.tool.select;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import net.refractions.udig.core.IProvider;
import net.refractions.udig.core.filter.AdaptingFilter;
import net.refractions.udig.core.filter.AdaptingFilterFactory;
import net.refractions.udig.project.EditManagerEvent;
import net.refractions.udig.project.IEditManagerListener;
import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.ILayerListener;
import net.refractions.udig.project.IMapCompositionListener;
import net.refractions.udig.project.LayerEvent;
import net.refractions.udig.project.MapCompositionEvent;
import net.refractions.udig.project.command.AbstractCommand;
import net.refractions.udig.project.command.MapCommand;
import net.refractions.udig.project.command.UndoableCommand;
import net.refractions.udig.project.command.UndoableComposite;
import net.refractions.udig.project.command.factory.EditCommandFactory;
import net.refractions.udig.project.command.factory.SelectionCommandFactory;
import net.refractions.udig.project.internal.Layer;
import net.refractions.udig.project.internal.Map;
import net.refractions.udig.project.internal.ProjectPlugin;
import net.refractions.udig.project.ui.ApplicationGIS;
import net.refractions.udig.project.ui.IUDIGView;
import net.refractions.udig.project.ui.internal.MapPart;
import net.refractions.udig.project.ui.internal.tool.display.ToolManager;
import net.refractions.udig.project.ui.tool.IToolContext;
import net.refractions.udig.project.ui.tool.ToolsConstants;
import net.refractions.udig.tool.select.AdaptableFeatureCollection;
import net.refractions.udig.tool.select.FeatureTypeCellModifier;
import net.refractions.udig.ui.FeatureTableControl;
import net.refractions.udig.ui.IFeatureTableLoadingListener;
import net.refractions.udig.ui.PlatformGIS;
import net.refractions.udig.ui.ProgressManager;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.geotools.data.DefaultQuery;
import org.geotools.data.FeatureEvent;
import org.geotools.data.FeatureSource;
import org.geotools.data.FeatureStore;
import org.geotools.data.Query;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.factory.GeoTools;
import org.geotools.feature.FeatureCollection;
import org.geotools.feature.Schema;
import org.geotools.filter.IllegalFilterException;
import org.geotools.referencing.CRS;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.feature.type.AttributeDescriptor;
import org.opengis.feature.type.GeometryDescriptor;
import org.opengis.filter.Filter;
import org.opengis.filter.FilterFactory;
import org.opengis.filter.Id;
import org.opengis.filter.spatial.BBOX;
import org.opengis.referencing.FactoryException;

import com.vividsolutions.jts.geom.Envelope;

@SuppressWarnings("deprecation")
public class XpLRViewPart extends org.eclipse.ui.part.ViewPart implements ISelectionProvider, IUDIGView
{

	public static final String VIEW_ID = "it.unibz.udig.xplr.tool.select.xplrView";

	public Text output;
	public boolean firstCall = true;

	/** Used to show the current feature source */
	FeatureTableControl table;

	/** Current editor */
	MapPart currentEditor;

	/** Current layer under study */
	Layer layer;

	/** Toolbar entry used to turn on selection mode */
	private IAction select;

	/**
	 * This listener watches the workbench selection and reports back anything
	 * that.
	 */
	private ISelectionListener workbenchSelectionListener = new ISelectionListener()
	{

		public void selectionChanged(IWorkbenchPart part, ISelection selection)
		{
			if (part instanceof MapPart)
			{
				editorActivated((MapPart) part);
				return; // we already have sorted out map / layer
			}
			if (!(selection instanceof IStructuredSelection))
			{
				return;
			}
			if (part == getSite().getPart())
			{
				// we are swapping to ourself!
				return; // ignore
			}

			Object selected = ((IStructuredSelection) selection).getFirstElement();

			final Layer selectedLayer;
			// this is horribly inelegant. is there not some other way?
			if (selected instanceof Map)
			{
				selectedLayer = ((Map) selected).getEditManagerInternal().getSelectedLayer();
			}
			else if (selected instanceof Layer)
			{
				selectedLayer = (Layer) selected;
			}
			else if (selected instanceof IAdaptable)
			{
				// This is often an AdaptableFilter
				IAdaptable adaptable = (IAdaptable) selected;
				selectedLayer = (Layer) adaptable.getAdapter(Layer.class);
			}
			else
			{
				return;
			}

			if (selectedLayer != null)
			{
				PlatformGIS.run(new ISafeRunnable()
				{

					public void handleException(Throwable exception)
					{
						//SelectPlugin.log("error selecting layer", exception); //$NON-NLS-1$
						System.err.println("error selecting layer: " + exception.getMessage());
					}

					public void run() throws Exception
					{
						layerSelected(selectedLayer);
					}
				});

				// todo add layer event
			}
		}
	};

	/**
	 * page that the part listener and the workbenchSelectionListener are
	 * listening to.
	 */
	private IWorkbenchPage page;

	/**
	 * Listener that deactivates/reactivates view when it is hidden/shown
	 */
	private IPartListener2 activePartListener;

	private MenuManager contextMenu;

	/**
	 * Indicates whether the view is visible and therefore is active
	 */
	private volatile boolean active = false;

	/**
	 * Indicates that the features in the view need to be reloaded when the view
	 * is visible again.
	 */
	protected volatile boolean reloadNeeded = false;

	/**
	 * Indicates that the selection filter has changed while inactive
	 */
	protected volatile boolean filterChange = false;

	/**
	 * Indicates that the a feature is being updated by the table view so it is
	 * not necessary to load the change indicated by the feature event.
	 */
	protected volatile boolean editing = false;

	/**
	 * Indicates that the selection of the table is being updated by the view
	 * because the filter has been updated on the layer.
	 */
	private volatile boolean updatingSelection = false;

	/**
	 * Indicates that the view is updating the layer's filter because the
	 * selection on the table has changed.
	 */
	protected volatile boolean updatingLayerFilter;

	private PromoteSelectionAction promoteSelection;

	private Label featuresSelected;

	private IAction zoom;

	public XpLRViewPart()
	{
		super();
	}

	@Override
	public void createPartControl(Composite parent)
	{
		active = true;

		featuresSelected = new Label(parent, SWT.NONE);
		featuresSelected.setText("TableView_featureSelected+0");

		IProvider<IProgressMonitor> provider = new IProvider<IProgressMonitor>()
		{

			public IProgressMonitor get(Object... params)
			{
				IStatusLineManager statusLineManager = getViewSite().getActionBars().getStatusLineManager();
				statusLineManager.setCancelEnabled(true);
				return statusLineManager.getProgressMonitor();
			}

		};

		output = new Text(parent, SWT.WRAP);
		output.setEditable(false);

		table = new FeatureTableControl(provider);
		table.createTableControl(parent);
		table.setSelectionColor(new IProvider<RGB>()
		{

			public RGB get(Object... params)
			{
				ScopedPreferenceStore store = ProjectPlugin.getPlugin().getPreferenceStore();
				String key = net.refractions.udig.project.preferences.PreferenceConstants.P_SELECTION_COLOR;
				RGB color = PreferenceConverter.getColor(store, key);
				return color;
			}

		});

		table.addLoadingListener(new IFeatureTableLoadingListener()
		{

			@Override
			public void loadingStarted(IProgressMonitor monitor)
			{
			}

			@Override
			public void loadingStopped(boolean canceled)
			{
			}
		});
		layoutComponents(parent);

		// Create menu and toolbars
		createActions();
		createMenu();
		createToolbar();
		createContextMenu();

		// restore state (from previous session)

		page = getSite().getPage();

		if (page.getActiveEditor() instanceof MapPart)
		{
			editorActivated((MapPart) page.getActiveEditor());
		}

		addTableSelectionListener();
		addWorkbenchSelectionListener();
		addPageListener();

		// provide workbench selections
		getSite().setSelectionProvider(this);

		ApplicationGIS.getToolManager().registerActionsWithPart(this);

	}

	private void addTableSelectionListener()
	{
		table.addSelectionChangedListener(new ISelectionChangedListener()
		{

			public void selectionChanged(SelectionChangedEvent event)
			{
				if (event.getSource() == table) featuresSelected.setText("TableView_featureSelected " + table.getSelectionCount());

				if (updatingSelection)
				{
					updatingSelection = false;
					return;
				}

				ISelection selection = getSelection();
				if (selection.isEmpty())
				{
					updateLayerFilter((Filter) Filter.EXCLUDE);
				}
				else if (selection instanceof IStructuredSelection)
				{
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					Filter firstElement = (Filter) structuredSelection.getFirstElement();
					updateLayerFilter(firstElement);
				}

				fireSelectionChanged();
			}
		});
	}

	private void updateLayerFilter(Filter filter)
	{
		updatingLayerFilter = true;
		MapCommand createSelectCommand = SelectionCommandFactory.getInstance().createSelectCommand(layer, filter);

		if (layer.getMap() != null) layer.getMap().sendCommandSync(createSelectCommand);
		updatingLayerFilter = false;

		setZoomToSelectionToolEnablement();
	}

	private void layoutComponents(Composite parent)
	{
		FormLayout layout = new FormLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.spacing = 0;
		parent.setLayout(layout);

		FormData dLabel = new FormData(); // bind to left & text
		dLabel.left = new FormAttachment(0, 5);
		dLabel.top = new FormAttachment(0);
		dLabel.right = new FormAttachment(100, -5);
		featuresSelected.setLayoutData(dLabel);

		FormData dContents = new FormData(100, 50); // text & bottom
		dContents.right = new FormAttachment(50); // bind to right of form
		dContents.left = new FormAttachment(0); // bind to left of form
		dContents.top = new FormAttachment(featuresSelected, 2); // attach with
																	// 2 pixel
																	// offset
		dContents.bottom = new FormAttachment(100); // bind to bottom of form
		table.getControl().setLayoutData(dContents);

		FormData tContents = new FormData(100, 50);
		tContents.left = new FormAttachment(table.getControl(), 5);
		tContents.right = new FormAttachment(100); // bind to right of form
		tContents.top = new FormAttachment(featuresSelected, 2); // attach with
																	// 2 pixel
																	// offset
		tContents.bottom = new FormAttachment(100); // bind to bottom of form

		output.setLayoutData(tContents);

	}

	/**
	 * Adds a post selection listener that listens to the workbench's selection
	 * for maps, layers or MapEditor.
	 */
	private void addWorkbenchSelectionListener()
	{
		ISelectionService selectionService = getSite().getWorkbenchWindow().getSelectionService();
		selectionService.addPostSelectionListener(workbenchSelectionListener);
	}

	/**
	 * Adds a listener to {@link #page} that deactivates the view when part is
	 * hidden and reactivates it when it is made visible. This is to prevent a
	 * bunch of featurestore accesses when view is not visible.
	 */
	private void addPageListener()
	{
		activePartListener = new IPartListener2()
		{

			public void partActivated(IWorkbenchPartReference partRef)
			{
			}

			public void partBroughtToTop(IWorkbenchPartReference partRef)
			{
			}

			public void partClosed(IWorkbenchPartReference partRef)
			{
			}

			public void partDeactivated(IWorkbenchPartReference partRef)
			{
			}

			public void partOpened(IWorkbenchPartReference partRef)
			{
			}

			public void partHidden(IWorkbenchPartReference partRef)
			{
				if (partRef.getPart(false) == XpLRViewPart.this) deactivate();
			}

			public void partVisible(IWorkbenchPartReference partRef)
			{
				if (partRef.getPart(false) == XpLRViewPart.this) activate();
			}

			public void partInputChanged(IWorkbenchPartReference partRef)
			{
			}
		};
		// listen for editor changes
		page.addPartListener(activePartListener);
	}

	protected void activate()
	{
		if (active) return;

		PlatformGIS.run(new ISafeRunnable()
		{

			public void handleException(Throwable exception)
			{
				//SelectPlugin.log("error activating table", exception); //$NON-NLS-1$
				System.err.println("error activating table: " + exception.getMessage());
			}

			public void run() throws Exception
			{
				active = true;
				if (reloadNeeded) reloadFeatures(layer);
				if (!updates.isEmpty()) updateTable(layer);
				if (filterChange) updateSelection(layer);
				//SelectPlugin.log("OK", null); //$NON-NLS-1$
			}

		});
	}

	protected void deactivate()
	{
		active = false;
	}

	/**
	 * Create actions, linking view to current map.
	 */
	private void createActions()
	{
		select = ApplicationGIS.getToolManager().createToolAction("net.refractions.udig.tools.BBoxSelect", ToolsConstants.SELECTION_CATEGORY);
		ImageDescriptor icon = AbstractUIPlugin.imageDescriptorFromPlugin("net.refractions.udig.tool.select", "icons/eview16/select_view.gif"); //$NON-NLS-1$
		select.setImageDescriptor(icon);

		this.promoteSelection = new PromoteSelectionAction();

		zoom = ((ToolManager) ApplicationGIS.getToolManager()).createToolAction("net.refractions.udig.tool.default.show.selection",
				ToolsConstants.ZOOM_CATEGORY);
		icon = AbstractUIPlugin.imageDescriptorFromPlugin("net.refractions.udig.tool.select", "icons/elcl16/zoom_select_co.png"); //$NON-NLS-1$
		zoom.setImageDescriptor(icon);
		zoom.setText("TableView_zoomToolText");
		zoom.setToolTipText("TableView_zoomToolToolTip");

	}

	/* Called when a Layer is selected */
	void layerSelected(ILayer selected)
	{
		if (layer == selected)
		{
			return; // we already know
		}
		if (layer != null)
		{
			layer.removeListener(layerListener);
			if (layer.getMap() != null)
			{
				layer.getMap().removeMapCompositionListener(compositionListener);
				layer.getMap().getEditManager().removeListener(editManagerListener);
			}
		}

		if (selected == null || !selected.hasResource(FeatureSource.class) || selected.getMap() == null)
		{
			if (currentEditor != null)
			{
				currentEditor.getMap().getEditManager().addListener(editManagerListener);
			}
			layer = null;
			filterChange = false;
			reloadNeeded = false;
			table.getControl().getDisplay().asyncExec(new Runnable()
			{

				public void run()
				{
					table.clear();
					table.message("TableView_noFeatureWarning");
				}
			});
			return;
		}

		layer = (Layer) selected;
		layer.addListener(layerListener);
		layer.getMap().addMapCompositionListener(compositionListener);
		layer.getMap().getEditManager().addListener(editManagerListener);

		if (!active)
		{
			filterChange = true;
			reloadNeeded = true;
			return;
		}

		setZoomToSelectionToolEnablement();
		reloadFeatures(layer);
		updateSelection(layer);
	}

	private void setZoomToSelectionToolEnablement()
	{
		final boolean enabled;

		if (layer.getMap() == ApplicationGIS.getActiveMap() && layer.getFilter() != Filter.EXCLUDE)
			enabled = true;
		else
			enabled = false;

		table.getControl().getDisplay().asyncExec(new Runnable()
		{

			public void run()
			{
				zoom.setEnabled(enabled);
			}
		});
	}

	/**
	 * The list of updates that have occurred but have not yet been applied to
	 * the FeatureTable
	 */
	private List<FeatureEvent> updates = Collections.synchronizedList(new ArrayList<FeatureEvent>());

	/**
	 * Listener that watches the current layer; and will update the table
	 * selection to match
	 */
	@SuppressWarnings(
		{ "incomplete-switch" })
	private ILayerListener layerListener = new ILayerListener()
	{

		public void refresh(LayerEvent event)
		{
			final ILayer notifierLayer = event.getSource();
			assert layer == notifierLayer;

			switch (event.getType())
			{
			case EDIT_EVENT:
				if (!editing)
				{
					if (event.getNewValue() == null)
					{
						// there are now bounds associated with this event so we
						// are going to have to
						// reload everyone!
						reloadFeatures(notifierLayer);
						return;
					}
					// okay we will add these bounds to the list of "updates"
					// and updateTable can fetch
					// everything
					// when we are back to being "active"
					updates.add((FeatureEvent) event.getNewValue());
					if (active)
					{
						updateTable(notifierLayer);
					}
				}
				break;
			case FILTER:
				if (active)
				{
					updateSelection(notifierLayer);
				}
				else
				{
					filterChange = true;
				}
				break;
			}

		}

	};

	private IMapCompositionListener compositionListener = new IMapCompositionListener()
	{

		public void changed(MapCompositionEvent event)
		{

			if (event.getType() == MapCompositionEvent.EventType.REMOVED)
			{
				if (event.getLayer() == layer)
				{
					layerSelected(null);
				}
			}
			else if (event.getType() == MapCompositionEvent.EventType.MANY_REMOVED)
			{
				if (((List<?>) event.getNewValue()).contains(layer)) layerSelected(null);
			}
		}

	};

	private IEditManagerListener editManagerListener = new IEditManagerListener()
	{

		public void changed(EditManagerEvent event)
		{
			assert layer == null || (layer != null && layer.getMap() == event.getSource().getMap());

			switch (event.getType())
			{
			case EditManagerEvent.POST_COMMIT:
			case EditManagerEvent.POST_ROLLBACK:
				if (!active)
				{
					reloadNeeded = true;
					return;
				}
				reloadFeatures(layer);
				break;
			case EditManagerEvent.SELECTED_LAYER:
				layerSelected((ILayer) event.getNewValue());
				break;
			default:
				break;
			}
		}

	};
	private Set<ISelectionChangedListener> selectionChangeListeners = new CopyOnWriteArraySet<ISelectionChangedListener>();

	private IToolContext currentContext;

	/**
	 * Watch current editor to indicate current selectable layers.
	 * 
	 * @param editor
	 */
	protected void editorActivated(MapPart editor)
	{
		if (currentEditor == editor) return;

		currentEditor = editor;
		if (editor == null)
		{
			select.setEnabled(false);
			table.clear();
			table.update();
			return;
		}

		Map map = currentEditor.getMap();

		if (getContext() != null)
		{
			List<ILayer> l = getContext().getMapLayers();
			for (ILayer iLayer : l)
			{
				final ILayer selectedLayer = iLayer;
				if (selectedLayer == null && layer == null)
				{
					map.getEditManager().addListener(editManagerListener);
					return;
				}

				PlatformGIS.run(new ISafeRunnable()
				{

					public void handleException(Throwable exception)
					{
						System.err.println("error selecting layer: " + exception.getMessage());
					}

					public void run() throws Exception
					{
						layerSelected(selectedLayer);
					}

				});
				if (selectedLayer != null) select.setEnabled(true);
			}
		}

	}

	private void createToolbar()
	{
		IToolBarManager toolbar = getViewSite().getActionBars().getToolBarManager();
		toolbar.add(select);
		toolbar.add(zoom);
		toolbar.add(promoteSelection);
	}

	private void createContextMenu()
	{
		contextMenu = new MenuManager();

		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(new IMenuListener()
		{

			public void menuAboutToShow(IMenuManager mgr)
			{
				contextMenu.add(zoom);
				contextMenu.add(promoteSelection);
				contextMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
				contextMenu.add(ApplicationGIS.getToolManager().createOperationsContextMenu(getSelection()));
				contextMenu.add(ActionFactory.EXPORT.create(getSite().getWorkbenchWindow()));
			}

		});

		// Create menu.
		table.setMenuManager(contextMenu);
		getSite().registerContextMenu(contextMenu, this);
	}

	private void createMenu()
	{
		// create view menu, consider sync
	}

	@Override
	public void setFocus()
	{
		// select your "main" control
		if (table.getControl() != null) table.getControl().setFocus();
	}

	@Override
	public void dispose()
	{
		if (table != null) table.dispose();

		super.dispose();
		if (activePartListener != null) page.removePartListener(activePartListener);
		if (workbenchSelectionListener != null)
		{
			ISelectionService selectionService = getSite().getWorkbenchWindow().getSelectionService();
			selectionService.removePostSelectionListener(workbenchSelectionListener);
		}
		if (layer != null && layerListener != null) layer.removeListener(layerListener);
		table = null;
		activePartListener = null;
		workbenchSelectionListener = null;
		layer = null;
		layerListener = null;
	}

	@SuppressWarnings(
		{ "unchecked" })
	protected void updateSelection(final ILayer notifierLayer) // ST
	{
		if (!active)
		{
			filterChange = true;
			return;
		}
		if (updatingLayerFilter)
		{
			return; // our own table view is updating the selection (so we can
					// ignore this
					// notification)
		}

		try
		{
			final FeatureSource<SimpleFeatureType, SimpleFeature> featureSource = notifierLayer.getResource(FeatureSource.class, null);
			filterChange = false;
			Display.getDefault().asyncExec(new Runnable()
			{

				public void run()
				{
					updatingSelection = true;
					if (updatingLayerFilter)
					{
						return; // we are updating table so please ignore this
								// one
					}
					Filter filter = (Filter) notifierLayer.getFilter();
					if (filter == Filter.EXCLUDE)
					{
						table.setSelection(new StructuredSelection());
						return;
					}

					try
					{
						table.clear();
						final SimpleFeatureType schema = notifierLayer.getSchema();

						final List<String> queryAtts = obtainQueryAttributesForFeatureTable(schema);

						final Query query = new DefaultQuery(schema.getName().getLocalPart(), filter, queryAtts.toArray(new String[0]));
						FeatureCollection<SimpleFeatureType, SimpleFeature> featuresF = featureSource.getFeatures(query);
						final FeatureCollection<SimpleFeatureType, SimpleFeature> features = featuresF;

						AdaptableFeatureCollection adaptableCollection = new AdaptableFeatureCollection(features);
						table.setFeatures(adaptableCollection);

					}
					catch (Exception e)
					{
					}
				}
			});
		}
		catch (IOException e)
		{

			System.err.println(e.getMessage());

		}
	}

	@SuppressWarnings(
		{ "unchecked" })
	protected void updateTable(final ILayer notifierLayer)
	{
		try
		{
			// Envelope indicating the bounds of the added features from all the
			// updates currently available
			// in the
			// updates field;
			Envelope addedBounds = null;
			// Envelope indicating the bounds of the modified features from all
			// the updates currently
			// available in the
			// updates field;
			Envelope modifiedBounds = null;

			synchronized (updates)
			{
				for (FeatureEvent event : updates)
				{
					Envelope bounds = event.getBounds();
					switch (event.getEventType())
					{
					case FeatureEvent.FEATURES_ADDED:
						if (bounds != null)
						{
							if (addedBounds == null)
							{
								addedBounds = new Envelope(bounds);
							}
							else
							{
								addedBounds.expandToInclude(bounds);
							}
						}
						break;
					case FeatureEvent.FEATURES_REMOVED:
						// With current Event API there is no way to know what
						// was removed
						reloadNeeded = true;
						if (active) reloadFeatures(notifierLayer);
						return;

					case FeatureEvent.FEATURES_CHANGED:
						if (event.getBounds() == null)
						{
							return;
						}
						if (modifiedBounds == null)
						{
							modifiedBounds = new Envelope(bounds);
						}
						else
						{
							modifiedBounds.expandToInclude(bounds);
						}
						break;

					default:
						break;
					}
				}
				updates.clear();
			}
			// check if we actually go something out of all that
			if (addedBounds == null && modifiedBounds == null)
			{
				// fine we did not get anything we will need to reload
				if (active)
				{
					reloadFeatures(notifierLayer);
				}
				else
				{
					reloadNeeded = true;
				}
				return;
			}
			// okay now we will do a query for everything in the added or
			// modified bounds
			FeatureSource<SimpleFeatureType, SimpleFeature> source = notifierLayer.getResource(FeatureSource.class, ProgressManager.instance().get());
			SimpleFeatureType schema = source.getSchema();

			FilterFactory fac = CommonFactoryFinder.getFilterFactory(GeoTools.getDefaultHints());
			final List<String> queryAtts = obtainQueryAttributesForFeatureTable(schema);
			final DefaultQuery query = new DefaultQuery(schema.getName().getLocalPart(), Filter.EXCLUDE, queryAtts.toArray(new String[0]));

			String name = schema.getGeometryDescriptor().getName().getLocalPart();
			// add new features
			if (addedBounds != null)
			{
				double minx = addedBounds.getMinX();
				double miny = addedBounds.getMinY();
				double maxx = addedBounds.getMaxX();
				double maxy = addedBounds.getMaxY();
				String srs = CRS.lookupIdentifier(schema.getCoordinateReferenceSystem(), false);
				BBOX bboxFilter = fac.bbox(name, minx, miny, maxx, maxy, srs);

				query.setFilter(bboxFilter);
				FeatureCollection<SimpleFeatureType, SimpleFeature> features = source.getFeatures(query);
				this.table.update(features);
			}
			// update modified features
			if (modifiedBounds != null)
			{
				double minx = modifiedBounds.getMinX();
				double miny = modifiedBounds.getMinY();
				double maxx = modifiedBounds.getMaxX();
				double maxy = modifiedBounds.getMaxY();
				String srs = CRS.lookupIdentifier(schema.getCoordinateReferenceSystem(), false);
				BBOX bboxFilter = fac.bbox(name, minx, miny, maxx, maxy, srs);

				query.setFilter(bboxFilter);
				FeatureCollection<SimpleFeatureType, SimpleFeature> features = source.getFeatures(query);
				this.table.update(features);
			}
		}
		catch (IOException e)
		{
			if (active)
			{
				reloadFeatures(notifierLayer);
			}
			else
			{
				reloadNeeded = true;
			}
		}
		catch (IllegalFilterException e)
		{
			if (active)
			{
				reloadFeatures(notifierLayer);
			}
			else
			{
				reloadNeeded = true;
			}
		}
		catch (FactoryException e)
		{
			if (active)
			{
				reloadFeatures(notifierLayer);
			}
			else
			{
				reloadNeeded = true;
			}
		}
	}

	@SuppressWarnings(
		{ "unchecked" })
	protected void reloadFeatures(final ILayer notifierLayer)
	{

		try
		{
			reloadNeeded = false;
			updates.clear();

			// icon = getLayerIcon()
			final FeatureTypeCellModifier featureTypeCellModifier = new FeatureTypeCellModifier(notifierLayer)
			{

				@Override
				public Object getValue(Object element, String property)
				{
					ApplicationGIS.getToolManager().unregisterActions(XpLRViewPart.this);

					return super.getValue(element, property);
				}

				@Override
				protected void makeModification(SimpleFeature feature, ILayer layer, String property, Object value, Item item)
				{
					if (value == null)
					{
						// not a valid entry.
						return;
					}
					TableItem tableItem = (TableItem) item;
					Schema schema = new Schema();
					int columnIndex = schema.getIndexOf(feature.getFeatureType(), property);
					tableItem.setText(columnIndex + 1, value.toString());

					UndoableComposite composite = new UndoableComposite();
					composite.getCommands().add(new SetEditingFlag(true));

					composite.getCommands().add(EditCommandFactory.getInstance().createSetAttributeCommand(feature, layer, property, value));
					composite.getFinalizerCommands().add(new SetEditingFlag(false));
					layer.getMap().sendCommandASync(composite);
				}
			};

			final SimpleFeatureType schema = notifierLayer.getSchema();
			Filter filter = Filter.INCLUDE;
			final FeatureSource<SimpleFeatureType, SimpleFeature> featureSource = notifierLayer.getResource(FeatureSource.class, null);
			final List<String> queryAtts = obtainQueryAttributesForFeatureTable(schema);

			final Query query = new DefaultQuery(schema.getName().getLocalPart(), filter, queryAtts.toArray(new String[0]));
			FeatureCollection<SimpleFeatureType, SimpleFeature> featuresF = featureSource.getFeatures(query);

			final FeatureCollection<SimpleFeatureType, SimpleFeature> features = featuresF;

			Display.getDefault().asyncExec(new Runnable()
			{

				public void run()
				{
					if (!table.showWarning(table.getControl().getDisplay()))
					{
						// user doesn't want to show table.
						return;
					}

					AdaptableFeatureCollection adaptableCollection = new AdaptableFeatureCollection(features);

					if (featureSource instanceof FeatureStore) enableEditing(featureTypeCellModifier, query, adaptableCollection);

					table.setFeatures(adaptableCollection);
				}

				private void enableEditing(final FeatureTypeCellModifier featureTypeCellModifier, final Query query,
						AdaptableFeatureCollection adaptableCollection)
				{
					adaptableCollection.addAdapter(featureTypeCellModifier);
					ICellEditorListener[] keyBindingActivators = new ICellEditorListener[query.getPropertyNames().length];
					for (int i = 0; i < keyBindingActivators.length; i++)
					{
						keyBindingActivators[i] = new ICellEditorListener()
						{

							public void applyEditorValue()
							{
								ApplicationGIS.getToolManager().registerActionsWithPart(XpLRViewPart.this);
							}

							public void cancelEditor()
							{
								applyEditorValue();
							}

							public void editorValueChanged(boolean oldValidState, boolean newValidState)
							{

							}

						};
					}
					adaptableCollection.addAdapter(keyBindingActivators);
				}
			});
		}
		catch (final IOException e)
		{
			Display.getDefault().asyncExec(new Runnable()
			{

				public void run()
				{
					table.message(e.getMessage());
				}
			});
		}
	}

	private List<String> obtainQueryAttributesForFeatureTable(final SimpleFeatureType schema)
	{
		final List<String> queryAtts = new ArrayList<String>();

		for (int i = 0; i < schema.getAttributeCount(); i++)
		{
			AttributeDescriptor attr = schema.getDescriptor(i);
			if (!(attr instanceof GeometryDescriptor))
			{
				queryAtts.add(attr.getName().getLocalPart());
			}
		}
		return queryAtts;
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener)
	{
		selectionChangeListeners.add(listener);
	}

	public ISelection getSelection()
	{
		Id firstElement = getFilter();
		if (firstElement == null)
		{
			return new StructuredSelection();
		}
		@SuppressWarnings("rawtypes")
		AdaptingFilter filter = AdaptingFilterFactory.createAdaptingFilter(firstElement, layer);
		if (layer.getGeoResource().canResolve(FeatureSource.class))
		{
			try
			{
				FeatureSource<?, ?> resolve = layer.getGeoResource().resolve(FeatureSource.class, null);
				FeatureCollection<?, ?> features = resolve.getFeatures(filter);
				filter.addAdapter(features);
			}
			catch (IOException e)
			{
				throw (RuntimeException) new RuntimeException().initCause(e);
			}
		}
		return new StructuredSelection(filter);
	}

	private Id getFilter()
	{
		IStructuredSelection selection = (IStructuredSelection) table.getSelection();
		if (selection.isEmpty()) return null;

		Id firstElement = (Id) selection.getFirstElement();
		return firstElement;
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener)
	{
		selectionChangeListeners.remove(listener);
	}

	protected void fireSelectionChanged()
	{
		final SelectionChangedEvent event = new SelectionChangedEvent(this, getSelection());
		for (ISelectionChangedListener listener : selectionChangeListeners)
		{
			final ISelectionChangedListener l = listener;
			SafeRunnable.run(new SafeRunnable()
			{

				public void run()
				{
					l.selectionChanged(event);
				}
			});
		}
	}

	public void setSelection(ISelection selection)
	{
		table.setSelection(selection);
	}

	private class PromoteSelectionAction extends Action
	{

		public PromoteSelectionAction()
		{
			setText("TableView_promote_text");
			setToolTipText("tableView_promote_tooltip");
			setImageDescriptor(AbstractUIPlugin
					.imageDescriptorFromPlugin("net.refractions.udig.tool.select", "icons/elcl16/promote_selection_co.gif")); //$NON-NLS-1$
		}

		@Override
		public void run()
		{
			table.promoteSelection();
		}

	}

	private class SetEditingFlag extends AbstractCommand implements UndoableCommand
	{

		boolean oldState;
		final boolean newState;

		public SetEditingFlag(boolean newState)
		{
			this.newState = newState;
		}

		public void rollback(IProgressMonitor monitor) throws Exception
		{
			editing = oldState;
		}

		public String getName()
		{
			return "Set Editing Flag"; //$NON-NLS-1$
		}

		public void run(IProgressMonitor monitor) throws Exception
		{
			oldState = editing;
			editing = newState;
		}

	}

	public void editFeatureChanged(SimpleFeature feature)
	{
		if (feature == null)
		{
			return;
		}
		if (getContext().getEditManager().getSelectedLayer() != layer || updatingLayerFilter) return;

		if (table.getSelectionCount() == 1 && getFilter().getIDs().toArray(new String[0])[0].equals(feature.getID())) return;

		updatingLayerFilter = true;
		try
		{
			StructuredSelection structuredSelection;
			structuredSelection = new StructuredSelection(feature);

			setSelection(structuredSelection);
		}
		finally
		{
			updatingLayerFilter = false;
		}
	}

	public IToolContext getContext()
	{
		return currentContext;
	}

	public void setContext(IToolContext newContext)
	{
		this.currentContext = newContext;
	}

}
