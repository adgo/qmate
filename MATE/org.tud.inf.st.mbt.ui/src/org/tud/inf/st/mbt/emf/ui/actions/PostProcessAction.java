package org.tud.inf.st.mbt.emf.ui.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.actions.ActionDelegate;
import org.tud.inf.st.mbt.emf.postprocess.PostProcessorManager;
import org.tud.inf.st.pceditor.emf.PCCSResourceSetImpl;

public class PostProcessAction extends ActionDelegate {
	private List<IFile> selected = new ArrayList<IFile>();

	@Override
	public void run(IAction action) {
		if(selected.isEmpty())return;
		
		final ResourceSet rs = new PCCSResourceSetImpl();

		for(IFile f:selected){			
			final Resource r = rs.createResource(URI.createURI("platform:/resource"+f.getFullPath().toString()));
			
			try {
				r.load(Collections.EMPTY_MAP);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			rs.getResources().add(r);
		}		

		EcoreUtil.resolveAll(rs);
		
		PostProcessorManager.getInstance().processAll(rs);
			
		for(Resource r:rs.getResources()){
			try {
			r.save(Collections.EMPTY_MAP);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected.clear();
		Iterator<?> i = ((StructuredSelection) selection).iterator();
		while(i.hasNext()){
			Object o = i.next();
			if(o instanceof IFile){
				selected.add((IFile) o);
			}
		}
	}
}