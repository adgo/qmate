package org.tud.inf.st.mbt.ulang.guigraph.wizards;

import java.util.Arrays;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.tud.inf.st.mbt.automation.AutomationManager;
import org.tud.inf.st.mbt.automation.AutomationProperty;
import org.tud.inf.st.mbt.automation.TestSuiteAutomationType;

public class AutomationWizard extends Wizard {

	private class PropertyEditingSupport extends EditingSupport {

		public PropertyEditingSupport(TableViewer viewer) {
			super(viewer);
		}

		@Override
		public TableViewer getViewer() {
			return (TableViewer) super.getViewer();
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			if (element instanceof AutomationProperty<?>) {
				return ((AutomationProperty<?>) element).value;
			} else
				return null;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof AutomationProperty<?>) {
				((AutomationProperty) element).value = value;
				page2.setProperties(page1.automationType
						.getAutomationProperties());
			}
		}

		@Override
		protected CellEditor getCellEditor(final Object element) {
			if (element instanceof AutomationProperty<?>) {
				Class<?> type = ((AutomationProperty<?>) element).type;
				if (type.equals(Boolean.class)) {
					return new CheckboxCellEditor(getViewer().getTable(),
							SWT.CHECK);
				} else if (type.equals(String.class)) {
					return new TextCellEditor(getViewer().getTable());
				} else if (type.equals(Integer.class)) {
					return new TextCellEditor(getViewer().getTable()) {
						@Override
						protected Object doGetValue() {
							return Integer.parseInt(super.doGetValue() + "");
						}
					};
				} else if (type.equals(Double.class)) {
					return new TextCellEditor(getViewer().getTable()) {
						@Override
						protected Object doGetValue() {
							return Double.parseDouble(super.doGetValue() + "");
						}
					};
				} else if (type.equals(IContainer.class)) {
					return new DialogCellEditor(getViewer().getTable()) {

						@Override
						protected Object openDialogBox(Control cellEditorWindow) {
							ContainerSelectionDialog dialog = new ContainerSelectionDialog(
									cellEditorWindow.getShell(),
									ResourcesPlugin.getWorkspace().getRoot(),
									false, "Select container...");
							if (dialog.open() == Window.OK) {
								IPath path = (IPath) dialog.getResult()[0];
								return ResourcesPlugin.getWorkspace().getRoot()
										.findMember(path);
							} else
								return ((AutomationProperty<?>) element).value;
						}
					};
				} else
					throw new UnsupportedOperationException();
			}
			return null;
		}

	}

	private class SelectTypeWizardPage extends WizardPage {
		private TestSuiteAutomationType automationType;
		private TestSuiteAutomationType[] types = AutomationManager.getInstance().getTestSuiteAutomationTypes();

		public SelectTypeWizardPage() {
			super("Select automation type");
			setTitle("Select automation type");
			setDescription("Select type for automation.");
			setControl(null);
		}

		private String[] getTypesArr() {
			String[] result = new String[types.length];
			for (int i = 0; i < result.length; i++) {
				result[i] = types[i].getName();
			}
			return result;
		}

		@Override
		public void createControl(Composite outer) {
			Composite parent = new Composite(outer, SWT.None);
			parent.setLayout(new GridLayout(2, true));

			Label l = new Label(parent, SWT.None);
			l.setText("Automation type:");
			final Combo cbType = new Combo(parent, SWT.NONE);
			cbType.setItems(getTypesArr());
			cbType.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

			cbType.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					int idx = cbType.getSelectionIndex();
					if (idx == -1) {
						setPageComplete(false);
					} else {
						setPageComplete(true);
						SelectTypeWizardPage.this.automationType = types[idx];
						page2.setProperties(automationType
								.getAutomationProperties());
						page2.setPageComplete(automationType.propertiesValid());
					}
				}
			});

			setControl(parent);
			setPageComplete(false);
		}

		public TestSuiteAutomationType getAutomationType() {
			return automationType;
		}
	};

	private class SetPropertiesPage extends WizardPage {

		private TableViewer table;

		public SetPropertiesPage() {
			super("Set automation properties");
			setTitle("Set automation properties");
			setDescription("Set properties for automation.");
			setControl(null);
		}

		@Override
		public void createControl(Composite outer) {
			Composite parent = new Composite(outer, SWT.None);
			parent.setLayout(new GridLayout(1, false));

			table = new TableViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL
					| SWT.BORDER | SWT.FULL_SELECTION);
			table.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			table.getTable().setLinesVisible(true);
			table.getTable().setHeaderVisible(true);
			table.setContentProvider(ArrayContentProvider.getInstance());

			createTableViewerColumn(table, 0, "Property", 200)
					.setLabelProvider(new ColumnLabelProvider() {
						@Override
						public String getText(Object element) {
							if (element instanceof AutomationProperty<?>) {
								AutomationProperty<?> p = (AutomationProperty<?>) element;
								return p.name;
							} else
								return null;
						}
					});

			TableViewerColumn vCol = createTableViewerColumn(table, 1, "Value", 400);
			vCol.setLabelProvider(
					new ColumnLabelProvider() {
						@Override
						public String getText(Object element) {
							if (element instanceof AutomationProperty<?>) {
								AutomationProperty<?> p = (AutomationProperty<?>) element;
								if (p.value == null)
									return "";
								else if (p.value instanceof IResource)
									return "<workspace>"
											+ ((IResource) p.value)
													.getFullPath() + "";
								return p.value + "";
							} else
								return null;
						}
					});
			vCol.setEditingSupport(new PropertyEditingSupport(table));
			

			Button btnReset = new Button(parent, SWT.NONE);
			btnReset.setText("Reset selected row");
			btnReset.addSelectionListener(new SelectionAdapter() {
				@SuppressWarnings({ "rawtypes", "unchecked" })
				@Override
				public void widgetSelected(SelectionEvent e) {
					Object o = ((IStructuredSelection) table.getSelection())
							.getFirstElement();
					if(o instanceof AutomationProperty<?>){
						((AutomationProperty) o).value = ((AutomationProperty) o).initialValue;
					}
					page2.setProperties(page1.automationType.getAutomationProperties());
				}
			});

			setControl(parent);
			setPageComplete(false);
		}

		private TableViewerColumn createTableViewerColumn(TableViewer tv,
				int colNr, String title, int width) {
			TableViewerColumn col = new TableViewerColumn(tv, SWT.NONE);
			col.getColumn().setText(title);
			col.getColumn().setResizable(true);
			col.getColumn().setMoveable(true);
			col.getColumn().setWidth(width);
			return col;
		}

		public void setProperties(AutomationProperty<?>[] props) {
			table.setInput(Arrays.asList(props));
		}
	}

	private SelectTypeWizardPage page1;
	private SetPropertiesPage page2;

	@Override
	public void addPages() {
		addPage(page1 = new SelectTypeWizardPage());
		addPage(page2 = new SetPropertiesPage());
	}

	@Override
	public boolean performFinish() {
		return true;
	}

	public TestSuiteAutomationType getAutomationType() {
		return page1.getAutomationType();
	}
}
