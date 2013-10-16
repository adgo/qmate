package org.tud.inf.st.mbt.emf.graphicaleditor;

import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteToolbar;
import org.eclipse.gef.palette.SelectionToolEntry;

public class EMFPaletteRoot extends PaletteRoot {
	public EMFPaletteRoot() {

		PaletteToolbar selToolbar = new PaletteToolbar("Selection");

		SelectionToolEntry select = new SelectionToolEntry();
		selToolbar.add(select);

		MarqueeToolEntry marquee = new MarqueeToolEntry();
		selToolbar.add(marquee);

		this.setDefaultEntry(select);
		this.add(selToolbar);

		addEntries();

	}

	protected void addEntries() {

	}
}
