package org.tud.inf.st.mbt.ulang.guigraph.wizards;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;
import org.tud.inf.st.mbt.automation.record.AbstractRecorder;
import org.tud.inf.st.mbt.automation.record.AbstractRecorderListener;
import org.tud.inf.st.mbt.automation.record.ImageTool;
import org.tud.inf.st.mbt.automation.record.UIState;
import org.tud.inf.st.mbt.emf.graphicaleditor.GraphicalEMFEditor;
import org.tud.inf.st.mbt.ulang.guigraph.Form;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;
import org.tud.inf.st.mbt.ulang.guigraph.LayoutCommand;
import org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode;

public class RecordingDialog extends TitleAreaDialog {

	private class MouseMonitor implements MouseListener, KeyListener {

		private Point start = null;

		@Override
		public void mouseDoubleClick(MouseEvent e) {
			recorder.simulateTap(new Point((int) (e.x * 1 / screenScale),
					(int) (e.y * 1 / screenScale)));
			recorder.simulateTap(new Point((int) (e.x * 1 / screenScale),
					(int) (e.y * 1 / screenScale)));
		}

		@Override
		public void mouseDown(MouseEvent e) {
			start = new Point((int) (e.x * 1 / screenScale),
					(int) (e.y * 1 / screenScale));
		}

		@Override
		public void mouseUp(MouseEvent e) {
			if (start != null) {
				Point end = new Point((int) (e.x * 1 / screenScale),
						(int) (e.y * 1 / screenScale));
				if (start.distance(end) > 10) {

					recorder.simulateSwipe(start, end);
				} else {
					recorder.simulateTap(start);
				}
				start = null;
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.keyCode == SWT.F1)buildState();
			else if(e.keyCode == SWT.F2)identifyState();
			else recorder.simulateTextInput(e.character + "");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e);
		}

	}

	private AbstractRecorder recorder;
	private AbstractRecorderListener builderListener, automationListener;
	private GraphicalEMFEditor ged;
	private String imgFolder, relativeImgFolder;
	private boolean automationFlag = false;
	private float screenScale = 1;
	private MouseMonitor mouseMonitor = new MouseMonitor();
	private ListViewer lstEvents;
	private ListViewer lstValidations;
	private TreeViewer tvStates;

	public RecordingDialog(Shell parentShell, AbstractRecorder recorder,
			GraphicalEMFEditor ged, String imgFolder, String relativeImgFolder) {
		super(parentShell);
		setTitle("Recording from " + recorder.getConnection());
		this.recorder = recorder;
		this.ged = ged;
		this.imgFolder = imgFolder;
		this.relativeImgFolder = relativeImgFolder;

		automationListener = new AbstractRecorderListener(
				(GuiGraph) ged.getGraph(), null, null) {
			@Override
			public void updateModel() {
				if (automationFlag) {
					automationFlag = false;
					RecordingDialog.this.recorder.buildState(builderListener,
							compileActionText());
					automationFlag = true;
				}
			}
		};
		this.recorder.registerListener(automationListener);
	}

	@Override
	protected Control createDialogArea(Composite outer) {
		outer.setLayout(new GridLayout(1, true));

		Composite parent = new Composite(outer, SWT.NONE);
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		parent.setLayout(new GridLayout(4, true));

		final Canvas canvas = new Canvas(parent, SWT.None);
		ImageData data = new ImageData(recorder.screenshot().toString());
		final Dimension desiredSize = new Dimension(200, 500);

		canvas.setBackgroundImage(ImageTool.resize(new Image(this.getShell()
				.getDisplay(), data),
				screenScale = ImageTool.computeScale(data, desiredSize)));

		canvas.addMouseListener(mouseMonitor);
		canvas.addKeyListener(mouseMonitor);

		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd.widthHint = canvas.getBackgroundImage().getImageData().width;
		gd.heightHint = canvas.getBackgroundImage().getImageData().height;
		canvas.setLayoutData(gd);

		Composite actions = new Composite(parent, SWT.None);
		actions.setLayout(new FillLayout(SWT.VERTICAL));
		actions.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		IStructuredContentProvider termListCP = new IStructuredContentProvider() {

			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement == null)
					return new Object[0];
				String s = inputElement + "";
				s = s.trim();
				if (s.length() > 0) {
					return s.split("\n");
				} else {
					return new String[0];
				}
			}
		};

		Group grpEvents = new Group(actions, SWT.None);
		grpEvents.setText("Events");
		grpEvents.setLayout(new FillLayout());
		lstEvents = new ListViewer(grpEvents, SWT.MULTI);
		lstEvents.setContentProvider(termListCP);
		lstEvents.setLabelProvider(new LabelProvider());

		Group grpValidations = new Group(actions, SWT.None);
		grpValidations.setText("Validations");
		grpValidations.setLayout(new FillLayout());
		lstValidations = new ListViewer(grpValidations, SWT.MULTI);
		lstValidations.setContentProvider(termListCP);
		lstValidations.setLabelProvider(new LabelProvider());

		Group grpStates = new Group(parent, SWT.None);
		grpStates.setText("States");
		grpStates.setLayout(new FillLayout());
		grpStates.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));
		tvStates = new TreeViewer(grpStates, SWT.MULTI);
		final Map<Image, Image> stateImg2treeImg = new HashMap<>();
		tvStates.setContentProvider(new ITreeContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public void dispose() {
				for (Image i : stateImg2treeImg.values())
					i.dispose();
			}

			@Override
			public Object[] getElements(Object inputElement) {
				@SuppressWarnings("unchecked")
				Map<UIState, List<UIState>> tree = (Map<UIState, List<UIState>>) inputElement;
				return tree.entrySet().toArray();
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				@SuppressWarnings("unchecked")
				Entry<UIState, List<UIState>> e = (Entry<UIState, List<UIState>>) parentElement;
				return e.getValue().toArray();
			}

			@Override
			public Object getParent(Object element) {
				return null;
			}

			@SuppressWarnings("unchecked")
			@Override
			public boolean hasChildren(Object element) {
				return element instanceof Entry<?, ?>
						&& !((Entry<UIState, List<UIState>>) element)
								.getValue().isEmpty();
			}
		});
		tvStates.setLabelProvider(new LabelProvider() {
			@SuppressWarnings("rawtypes")
			@Override
			public String getText(Object element) {
				if (element instanceof Entry<?, ?>)
					element = ((Entry) element).getKey();
				UIState s = (UIState) element;
				String txt = "";
				txt = s.getScreenNode().getId() + " & [";
				Iterator<NoWidgetNode> i = s.getNoScreenNodes().iterator();
				while (i.hasNext()) {
					NoWidgetNode nwn = i.next();
					txt += nwn.getId() == null ? "NEW STATE" : nwn.getId();
					if (i.hasNext())
						txt += ",";
				}
				return txt + "]";
			}

			@SuppressWarnings("rawtypes")
			@Override
			public Image getImage(Object element) {
				if (element instanceof Entry<?, ?>)
					element = ((Entry) element).getKey();
				UIState s = (UIState) element;
				if (s.getImg() != null) {
					Image i = s.getImg();
					if (stateImg2treeImg.get(i) == null) {
						Image ti = ImageTool.resize(i, new Dimension(50, 50));
						stateImg2treeImg.put(i, ti);
						return ti;
					} else {
						return stateImg2treeImg.get(i);
					}
				} else
					return null;
			}
		});

		Button btnNewState = new Button(parent, SWT.None);
		btnNewState.setText("Build new state");
		btnNewState.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));
		btnNewState.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				buildState();
			}
		});

		final Button chkAutomate = new Button(parent, SWT.TOGGLE);
		chkAutomate.setText("Activate complete automation");
		chkAutomate.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				2, 1));
		chkAutomate.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				if (automationFlag) {
					automationFlag = false;
					chkAutomate.setText("Activate automated recording");
				} else {
					automationFlag = true;
					chkAutomate.setText("Deactivate automated recording");
				}
				chkAutomate.setSelection(automationFlag);
			}
		});

		Button btnIdentifyState = new Button(parent, SWT.None);
		btnIdentifyState.setText("Identify with selected state");
		btnIdentifyState.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		btnIdentifyState.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				identifyState();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		recorder.registerListener(builderListener = new AbstractRecorderListener(
				(GuiGraph) ged.getGraph(), imgFolder, relativeImgFolder) {
			@Override
			public void updateScreen(Image img) {
				if (img != null) {
					final Image imgCopy = new Image(img.getDevice(), img,
							SWT.IMAGE_COPY);
					RecordingDialog.this.getShell().getDisplay()
							.asyncExec(new Runnable() {
								@Override
								public void run() {
									Image old = canvas.getBackgroundImage();
									canvas.setBackgroundImage(ImageTool.resize(
											imgCopy, screenScale));
									old.dispose();
								}
							});

				}
			}

			@Override
			public void updateModel() {
				try {
					ResourcesPlugin.getWorkspace().getRoot()
							.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
				ged.executeCommand(new LayoutCommand(ged));
				ZoomManager zoom = (ZoomManager) ged.getAdapter(ZoomManager.class);
				zoom.setZoomAsText(ZoomManager.FIT_ALL);
				if(zoom.getZoom()>1d)zoom.setZoom(1d);
			}

			@Override
			public void updateEventActionsText(final String eat) {
				RecordingDialog.this.getShell().getDisplay()
						.asyncExec(new Runnable() {
							@SuppressWarnings("unchecked")
							@Override
							public void run() {
								List<Object> nonSelectedBefore = new ArrayList<Object>(
										Arrays.asList(((IStructuredContentProvider) lstEvents
												.getContentProvider())
												.getElements(lstEvents
														.getInput())));
								List<Object> selectionBefore = ((IStructuredSelection) lstEvents
										.getSelection()).toList();
								nonSelectedBefore.removeAll(selectionBefore);

								lstEvents.setInput(eat);
								List<Object> allElements = new ArrayList<Object>(
										Arrays.asList(((IStructuredContentProvider) lstEvents
												.getContentProvider())
												.getElements(eat)));
								allElements.removeAll(nonSelectedBefore);
								lstEvents.setSelection(new StructuredSelection(
										allElements));
							}
						});
			}

			@Override
			public void updateValidationActionsText(final String vat) {
				RecordingDialog.this.getShell().getDisplay()
						.asyncExec(new Runnable() {
							@Override
							public void run() {
								lstValidations.setInput(vat);
							}
						});
			}

			@Override
			public void updateSimilarStatesList(
					final List<? extends UIState> states) {
				RecordingDialog.this.getShell().getDisplay()
						.asyncExec(new Runnable() {
							@Override
							public void run() {
								if (states == null || states.isEmpty())
									return;

								Map<UIState, List<UIState>> tree = new HashMap<>();
								Map<Form, UIState> screens = new HashMap<>();
								Object mostSimilar = states.get(0);

								// at first find base states
								for (UIState s : states) {
									if (s.getNoScreenNodes().isEmpty()) {
										tree.put(s, new ArrayList<UIState>());

										UIState newState;
										try {
											newState = s.clone();
										} catch (CloneNotSupportedException e1) {
											e1.printStackTrace();
											return;
										}
										newState.getNoScreenNodes().add(
												GuigraphFactory.eINSTANCE
														.createNoWidgetNode());
										newState.setImg(s.getImg());
										tree.get(s).add(newState);
										screens.put(s.getScreenNode(), s);

										if (s == mostSimilar) {
											for (Entry<UIState, List<UIState>> e : tree
													.entrySet()) {
												if (e.getKey() == s) {
													mostSimilar = e;
													break;
												}
											}
										}
									}
								}

								// find children
								for (UIState s : states) {
									if (screens.containsKey(s.getScreenNode())
											&& !s.getNoScreenNodes().isEmpty()) {
										UIState base = screens.get(s
												.getScreenNode());
										List<UIState> others = tree.get(base);
										others.add(s);
									}
								}

								tvStates.setInput(tree);
								tvStates.setSelection(new StructuredSelection(
										mostSimilar));
							}
						});
			}

			@Override
			public void terminate() {
				RecordingDialog.this.getShell().getDisplay()
						.asyncExec(new Runnable() {
							@Override
							public void run() {
								RecordingDialog.this.close();
							}
						});
			}
		});

		ProgressBar bar = new ProgressBar(parent, SWT.INDETERMINATE);
		bar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));

		setMessage("Recording from " + recorder.getConnection());

		return outer;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 3;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.CENTER;

		// Create Cancel button
		Button stopBtn = createButton(parent, OK, "Stop", true);
		// Add a SelectionListener
		stopBtn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setReturnCode(CANCEL);
				recorder.unregisterListener(builderListener);
				close();
			}
		});
	}

	private String compileActionText() {
		StringBuffer result = new StringBuffer();
		IStructuredSelection sel = (IStructuredSelection) lstEvents
				.getSelection();
		for (Object o : sel.toArray())
			result.append(o + "\n");

		sel = (IStructuredSelection) lstValidations.getSelection();
		for (Object o : sel.toArray())
			result.append(o + "\n");

		return result.toString();
	}
	
	private void buildState(){
		recorder.buildState(builderListener, compileActionText());
	}

	private void identifyState() {
		IStructuredSelection sel = (IStructuredSelection) tvStates
				.getSelection();
		if (!sel.isEmpty()) {
			Object o = sel.getFirstElement();
			if (o instanceof Entry<?, ?>)
				o = ((Entry<?, ?>) o).getKey();
			recorder.identifyState(builderListener, (UIState) o,
					compileActionText());
		}
	}

}
