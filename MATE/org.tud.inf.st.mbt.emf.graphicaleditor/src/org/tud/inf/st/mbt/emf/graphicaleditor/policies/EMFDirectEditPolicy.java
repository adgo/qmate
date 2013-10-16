package org.tud.inf.st.mbt.emf.graphicaleditor.policies;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFTextProvider;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.ui.PCCSCellEditor;

public class EMFDirectEditPolicy extends DirectEditPolicy {

	private EMFTextProvider textProvider;
	private PCCSResourceSetImpl rs;
	
	private EStructuralFeature feature;
	private ConcreteSyntax[] syntax;
	private Label label;

	public EMFDirectEditPolicy(EMFTextProvider textProvider) {
		this.textProvider = textProvider;
	}

	public EMFDirectEditPolicy(EMFTextProvider textProvider,PCCSResourceSetImpl rs) {
		this.textProvider = textProvider;
		this.rs = rs;
	}
	
	public void activateEditing(GraphicalEditPart part, Label label, EStructuralFeature f, ConcreteSyntax[] syntax) {
		this.label = label;
		this.feature = f;
		this.syntax = syntax;
		new EMFDirectEditManager(part, TextCellEditor.class,
				new EMFCellEditorLocator()).show();
	}

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		return new DirectEditCommand((EObject) getHost().getModel(), request
				.getCellEditor().getValue().toString());
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		textProvider.setText((EObject) getHost().getModel(),feature, request
				.getCellEditor().getValue().toString());
	}

	public class DirectEditCommand extends Command {
		private String oldText, newText;
		private EObject model;

		public DirectEditCommand(EObject model, String newText) {
			this.model = model;
			this.oldText = textProvider.getText(model,feature);
			this.newText = newText;
		}

		@Override
		public void execute() {
			textProvider.setText(model, feature, newText);
		}

		@Override
		public void undo() {
			textProvider.setText(model, feature,oldText);
		}
	}

	public class EMFDirectEditManager extends DirectEditManager {
		public EMFDirectEditManager(GraphicalEditPart source,
				Class<?> editorType, CellEditorLocator locator) {
			super(source, editorType, locator);
		}

		protected void initCellEditor() {
			getCellEditor().setValue(
					textProvider.getText((EObject) this.getEditPart()
							.getModel(),feature));
		}

		@Override
		protected CellEditor createCellEditorOn(Composite composite) {
			CellEditor ce = null;
			if (syntax == null) {
				ce = new TextCellEditor(composite, SWT.MULTI | SWT.WRAP);
			} else {
				ce = new PCCSCellEditor(composite, syntax, rs);
			}

			Control c = (Control) ce.getControl();
			c.setBackground(ColorConstants.white);
			c.setForeground(ColorConstants.darkBlue);
			return ce;
		}

	}

	public class EMFCellEditorLocator implements CellEditorLocator {

		public void relocate(CellEditor celleditor) {
			Control text = (Control) celleditor.getControl();
			Rectangle rect = label.getBounds().getCopy();
			label.translateToAbsolute(rect);
			text.setBounds(rect.x,rect.y,rect.width,rect.height);
		}

	}

}
