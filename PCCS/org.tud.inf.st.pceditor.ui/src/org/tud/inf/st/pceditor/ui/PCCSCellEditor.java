package org.tud.inf.st.pceditor.ui;

import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

@SuppressWarnings("restriction")
public class PCCSCellEditor extends CellEditor {

	private static final int styles = SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI
			| SWT.BORDER | SWT.FULL_SELECTION | SWT.WRAP;
	private static final int RULER_WIDTH = 12;
	private static final ISharedTextColors colors = EditorsPlugin.getDefault()
			.getSharedTextColors();

	private SourceViewer viewer;
	private ConcreteSyntax[] syntax;
	private PCCSResourceSetImpl rs;

	public PCCSCellEditor(Composite parent, ConcreteSyntax[] syntax,
			PCCSResourceSetImpl rs) {

		setStyle(SWT.SINGLE);
		this.syntax = syntax;
		this.rs = rs;
		create(parent);

	}

	@Override
	protected Control createControl(Composite parent) {
		CompositeRuler cRuler = new CompositeRuler(RULER_WIDTH);
		OverviewRuler oRuler = new OverviewRuler(null, RULER_WIDTH, colors);

		Document doc = new Document("");

		viewer = new ProjectionViewer(parent, cRuler, oRuler, true, styles);
		viewer.configure(new PCCSSourceViewerConfiguration(syntax, viewer, rs));
		viewer.setDocument(doc);

		viewer.getTextWidget().addFocusListener(new FocusAdapter() {			
			public void focusLost(FocusEvent e) {
				PCCSCellEditor.this.focusLost();
			}
		});
		viewer.getTextWidget().addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				valueChanged(true, true);
				viewer.doOperation(ISourceViewer.CONTENTASSIST_PROPOSALS);
			}
		});
		viewer.getTextWidget().addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if((e.stateMask & SWT.CTRL)!=0 && e.character == ' '){
					viewer.doOperation(ISourceViewer.CONTENTASSIST_PROPOSALS);
				}
			}
		});

		return viewer.getControl();
	}

	@Override
	protected Object doGetValue() {
		return viewer.getDocument().get();
	}

	@Override
	protected void doSetFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	protected void doSetValue(Object value) {
		viewer.getDocument().set("" + value);
	}

}
