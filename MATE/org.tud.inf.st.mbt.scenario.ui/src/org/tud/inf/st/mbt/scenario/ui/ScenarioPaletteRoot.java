package org.tud.inf.st.mbt.scenario.ui;

import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFCreationFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFPaletteRoot;
import org.tud.inf.st.mbt.scenario.ScenarioPackage;

public class ScenarioPaletteRoot extends EMFPaletteRoot {
	@Override
	public void addEntries() {
		PaletteGroup scGroup = new PaletteGroup("Scenarios");
		
		scGroup.add(new CreationToolEntry(
				"Item Placement",
				"Place an item.",
				new EMFCreationFactory(ScenarioPackage.eINSTANCE.getPlacement()),
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						"icons/item.png"), null));
		
		this.add(scGroup);
	}
}
