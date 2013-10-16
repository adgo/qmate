package org.tud.inf.st.mbt.ocm.ui;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFCreationFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFPaletteRoot;
import org.tud.inf.st.mbt.ocm.OcmPackage;

public class OCMPaletteRoot extends EMFPaletteRoot {
	@Override
	public void addEntries() {
		PaletteGroup scGroup = new PaletteGroup("OCM");		
		
		scGroup.add(new CreationToolEntry(
				"Set-based configuration",
				"Create a set-based configuration.",
				new EMFCreationFactory(OcmPackage.eINSTANCE.getStandardConfigurationNode()),
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						"icons/conf.png"), null));
		scGroup.add(new CreationToolEntry(
				"Action-based configuration",
				"Create a action-based configuration.",
				new EMFCreationFactory(OcmPackage.eINSTANCE.getReconfigurationActionNode()),
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						"icons/conf.png"), null));
		scGroup.add(new CreationToolEntry(
				"Union",
				"Create Union.",
				new EMFCreationFactory(OcmPackage.eINSTANCE.getComposedConfigurationNode()),
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						"icons/union.png"), null));

		scGroup.add(new ConnectionCreationToolEntry("Composition Edge",
				"Create a new composition edge.", new EMFCreationFactory(
						OcmPackage.eINSTANCE.getCompositionEdge()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/cedge.png"), null));

		scGroup.add(new ConnectionCreationToolEntry("Timed Edge",
				"Create a new timed edge.", new EMFCreationFactory(
						OcmPackage.eINSTANCE.getTimedEdge()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/tedge.png"), null));

		scGroup.add(new ConnectionCreationToolEntry("Event-guarded Edge",
				"Create a new event-guarded edge.", new EMFCreationFactory(
						OcmPackage.eINSTANCE.getEventGuardedEdge()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/egedge.png"), null));

		this.add(scGroup);
	}
}
