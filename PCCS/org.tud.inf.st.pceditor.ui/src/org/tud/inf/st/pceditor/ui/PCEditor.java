package org.tud.inf.st.pceditor.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.source.ISourceViewerExtension2;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.emf.PCCSResourceFactoryImpl.PCCSResourceImpl;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;
import org.tud.inf.st.pceditor.exceptions.InterpretationException;
import org.tud.inf.st.pceditor.interpreter.PCCSInterpreter;
import org.tud.inf.st.pceditor.interpreter.ParserError;
import org.tud.inf.st.pceditor.interpreter.ParserResult;
import org.tud.inf.st.pceditor.interpreter.ParserWrapper;
import org.tud.inf.st.pceditor.interpreter.Util;

public class PCEditor extends TextEditor {
	private class PCEditorDocumentListener implements IDocumentListener {

		public void documentAboutToBeChanged(DocumentEvent event) {
		}

		public void documentChanged(DocumentEvent event) {
			runParser(event.getDocument().get());
		}

	}

	public static class EObjectProblem {
		private EObject object;
		private String message;

		public EObjectProblem(EObject object, String message) {
			this.object = object;
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public EObject getObject() {
			return object;
		}
	}

	private ConcreteSyntax[] syntax;
	private ParserWrapper parser;
	private ParserResult lastResult;
	private PCCSOutline outline = new PCCSOutline(null);
	private PropertySheetPage properties;
	private PCCSResourceImpl contentResource;
	private PCCSResourceSetImpl contentResourceSet;
	private Thread parsing;
	private String textToParse = "";
	private Object lock = new Object();

	protected void runParser(String text) {
		if (parsing == null) {
			parsing = new Thread("Parser") {
				@Override
				public void run() {
					String parsedText = "";

					while (!isInterrupted()) {
						boolean update = true;
						synchronized (lock) {
							if (parsedText.equals(textToParse)) {
								update = false;
							} else
								parsedText = textToParse;
						}

						if (update) {
							final String parsedTextFinal = parsedText;

							Display.getDefault().asyncExec(new Runnable() {
								@Override
								public void run() {
									lastResult = getParser().parse(
											parsedTextFinal);
									contentResourceSet.resolveImports();
									contentResourceSet.computeReferenceErrors();
									setParsingResult(lastResult.getObjects());
									if (lastResult != null)
										setErrors(lastResult.getErrors());
								}
							});
						}

						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							return;
						}
					}
				}

			};
			parsing.start();
		}

		synchronized (lock) {
			textToParse = text;
		}
	}

	@Override
	public void dispose() {
		parsing.interrupt();
	}

	private void setErrors(List<ParserError> errors) {
		IFile resource = ((IFileEditorInput) getEditorInput()).getFile();
		try {
			resource.deleteMarkers(null, true, IResource.DEPTH_INFINITE);
			for (ParserError e : errors) {
				IMarker marker = resource.createMarker(Activator.PLUGIN_ID
						+ ".pccsmarker");
				marker.setAttribute(IMarker.MESSAGE, e.getMessage());
				marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				marker.setAttribute(IMarker.LINE_NUMBER, e.getLine());
				if (e.getLocation() != null) {
					marker.setAttribute(IMarker.CHAR_START, e.getLocation()
							.getIndex());
					marker.setAttribute(IMarker.CHAR_END, e.getLocation()
							.getIndex() + e.getLocation().getLength());
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public ParserWrapper getParser() throws InterpretationException {
		if (parser == null) {
			if(syntax == null){
				Util.registerPCCSExtensions();
				syntax = Util.getSyntax_Level2();
			}
			parser = PCCSInterpreter.interpret(syntax, getContentResource());
		}
		return parser;
	}

	protected PCCSResourceImpl getContentResource() {
		if (contentResource == null) {
			IFileEditorInput fei = (IFileEditorInput) getEditorInput();

			contentResourceSet = new PCCSResourceSetImpl();
			contentResource = (PCCSResourceImpl) contentResourceSet.createResource(URI
					.createURI("platform:/resource"
							+ fei.getFile().getFullPath()),PCCSResourceSetImpl.CONTENT_TYPE_MANUAL);

		}
		return contentResource;
	}

	protected void renewContentSyntax(ConcreteSyntax[] syntax)
			throws InterpretationException {
		if (parsing != null) {
			parsing.interrupt();
			parsing = null;
		}
		parser = null;
		this.syntax = syntax;
	}

	protected void setOutlineInput(Object o) {
		outline.setInput(o);
	}

	protected void setParsingResult(Object o) {
		setOutlineInput(o);
	}

	public IResource getLoadedResource() {
		IEditorInput ei = getEditorInput();
		if (ei instanceof FileEditorInput) {
			return ((FileEditorInput) ei).getFile();
		} else
			return null;
	}

	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		super.doSetInput(input);
		
		if(syntax == null){
			Util.registerPCCSExtensions();
			syntax = Util.getSyntax_Level2();
		}
		
		getDocumentProvider().getDocument(input).addDocumentListener(
				new PCEditorDocumentListener());
		runParser(getDocumentProvider().getDocument(input).get());
		setSourceViewerConfiguration(new PCCSSourceViewerConfiguration(syntax,
				(SourceViewer) getSourceViewer(),
				(PCCSResourceSetImpl) getContentResource().getResourceSet()));
	}

	protected void refreshSourceViewerConfiguration() {
		((ISourceViewerExtension2) getSourceViewer()).unconfigure();
		getSourceViewer().configure(
				new PCCSSourceViewerConfiguration(syntax,
						(SourceViewer) getSourceViewer(),
						(PCCSResourceSetImpl) getContentResource()
								.getResourceSet()));
	}

	/**
	 * Please override
	 */
	protected Collection<EObjectProblem> validate(Object o) {
		return Collections.emptyList();
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class type) {
		if (type.equals(IPropertySheetPage.class)) {
			if (properties == null) {
				properties = (PropertySheetPage) super.getAdapter(type);
				if (properties == null) {
					properties = new PropertySheetPage();
				}
				properties
						.setPropertySourceProvider(new IPropertySourceProvider() {
							public IPropertySource getPropertySource(
									final Object object) {
								return new IPropertySource() {

									public void setPropertyValue(Object id,
											Object value) {
									}

									public void resetPropertyValue(Object id) {
									}

									public boolean isPropertySet(Object id) {
										return true;
									}

									public Object getPropertyValue(Object id) {
										if (object instanceof EObject) {
											EObject eo = (EObject) object;

											return eo
													.eGet((EStructuralFeature) id);

										} else
											return object != null ? object
													.toString() : "";
									}

									public IPropertyDescriptor[] getPropertyDescriptors() {
										if (object instanceof EObject) {
											EObject eo = (EObject) object;

											List<IPropertyDescriptor> descs = new ArrayList<>();

											List<EStructuralFeature> features = new ArrayList<>();
											features.addAll(eo.eClass()
													.getEAllAttributes());
											features.addAll(eo.eClass()
													.getEAllReferences());

											for (EStructuralFeature f : features) {
												PropertyDescriptor d = new PropertyDescriptor(
														f, f.getName());
												descs.add(d);
												d.setLabelProvider(new LabelProvider() {
													@Override
													public String getText(
															Object element) {
														if (element instanceof EObject) {
															EObject eo = (EObject) element;
															EClass ec = eo
																	.eClass();
															String text = ec
																	.getName();
															if (ec.getEIDAttribute() != null) {
																text += " "
																		+ eo.eGet(ec
																				.getEIDAttribute());
															}
															return text;
														}
														return element + "";
													}
												});
											}

											return descs
													.toArray(new IPropertyDescriptor[] {});
										} else
											return new IPropertyDescriptor[] {};
									}

									public Object getEditableValue() {
										return object;
									}
								};
							}
						});
			}
			return properties;
		}
		if (type.equals(IContentOutlinePage.class)) {
			return outline;
		}
		return super.getAdapter(type);
	}
}
