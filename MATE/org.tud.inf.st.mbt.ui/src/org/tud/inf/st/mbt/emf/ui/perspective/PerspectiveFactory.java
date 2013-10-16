package org.tud.inf.st.mbt.emf.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.15f, layout.getEditorArea());
		left.addView(IPageLayout.ID_OUTLINE);
		
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.85f, layout.getEditorArea());
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		
	}

}
