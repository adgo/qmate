package org.tud.inf.st.mbt.emf.ui.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;

public abstract class SourceViewerUtil {
	public static final String ANNO_TYPE = "com.mycompany.element";
	public static final String ANNO_KEY_HIGHLIGHT = "annotateElemHighlight";
	public static final String ANNO_KEY_OVERVIEW = "annotateElemOverviewRuler";
	public static final String ANNO_KEY_VERTICAL = "annotateElemVertialRuler";
	public static final String ANNO_KEY_TEXT = "annotateElemText";
	public static final String ANNO_KEY_COLOR = "annotateElemColor";

	private ProjectionViewer viewer;
	
	private int styles = SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI | SWT.BORDER
			| SWT.FULL_SELECTION;
	
	protected abstract String getInput();
	protected abstract Resource createResource();
	protected abstract ITokenScanner createTokenScanner(Resource resource);
	
	public ProjectionViewer getViewer() {
		return viewer;
	}
	
	public void toogleStyles(int xorToggle){
		styles ^= xorToggle; 
	}
	
	public ProjectionViewer createSourceViewer(Composite container) {
		final int RULER_WIDTH = 12;

		ISharedTextColors colors = EditorsPlugin.getDefault()
				.getSharedTextColors();

		CompositeRuler cRuler = new CompositeRuler(RULER_WIDTH);
		OverviewRuler oRuler = new OverviewRuler(null, RULER_WIDTH, colors);

		String content = getInput();
		final Resource resource = createResource();
		try {
			resource.load(new ByteArrayInputStream(content.getBytes()),new HashMap<Object, Object>());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Document doc = new Document(content);

		AnnotationModel annotationModel = new AnnotationModel();
		annotationModel.connect(doc);

		viewer = new ProjectionViewer(container, cRuler,
				oRuler, true, styles);
		viewer.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		viewer.configure(new SourceViewerConfiguration(){
			@Override
			public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
				PresentationReconciler pr = new PresentationReconciler();
				DefaultDamagerRepairer dr = new DefaultDamagerRepairer(createTokenScanner(resource));
				pr.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
				pr.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
				return pr;
			}
		});

		SourceViewerDecorationSupport decoration = new SourceViewerDecorationSupport(
				viewer, oRuler, null, colors);

		AnnotationPreference ap = new AnnotationPreference();
		ap.setColorPreferenceKey(ANNO_KEY_COLOR);
		ap.setHighlightPreferenceKey(ANNO_KEY_HIGHLIGHT);
		ap.setVerticalRulerPreferenceKey(ANNO_KEY_VERTICAL);
		ap.setOverviewRulerPreferenceKey(ANNO_KEY_OVERVIEW);
		ap.setTextPreferenceKey(ANNO_KEY_TEXT);
		ap.setAnnotationType(ANNO_TYPE);
		decoration.setAnnotationPreference(ap);
		
		viewer.setDocument(doc, annotationModel);
		
		cRuler.addDecorator(0, new LineNumberRulerColumn());
		
		Annotation anno = new Annotation(false);
		anno.setType(ANNO_TYPE);
		Position pos = new Position(0, 4);
		annotationModel.addAnnotation(anno, pos);
		
		return viewer;
	}	
	
	public EObject getContent(){
		IDocument doc = viewer.getDocument();
		Resource resource = createResource();
		try {
			resource.load(new ByteArrayInputStream(doc.get().getBytes()),new HashMap<Object, Object>());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (EObject) resource.getContents().get(0);
	}
}
