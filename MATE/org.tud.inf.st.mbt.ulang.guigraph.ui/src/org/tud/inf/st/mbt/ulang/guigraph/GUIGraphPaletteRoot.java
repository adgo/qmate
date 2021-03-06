package org.tud.inf.st.mbt.ulang.guigraph;

import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFCreationFactory;
import org.tud.inf.st.mbt.emf.graphicaleditor.EMFPaletteRoot;
import org.tud.inf.st.mbt.emf.ui.MBTConstants;

public class GUIGraphPaletteRoot extends EMFPaletteRoot {
	@Override
	public void addEntries() {
		PaletteGroup scGroup = new PaletteGroup("GUI Graph");

		scGroup.add(new CreationToolEntry("Form/Widget",
				"Create a new form or widget.", new EMFCreationFactory(
						GuigraphPackage.eINSTANCE.getWidget()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/widget.png"), null));
		scGroup.add(new CreationToolEntry("Non-Widget Node",
				"Create a new non-widget node.", new EMFCreationFactory(
						GuigraphPackage.eINSTANCE.getNoWidgetNode()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/nwn.png"), null));
		scGroup.add(new CreationToolEntry("C/A Transition",
				"Create a new condition/action transition.",
				new EMFCreationFactory(GuigraphPackage.eINSTANCE
						.getConditionActionTransition()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/trans.png"), null));
		scGroup.add(new CreationToolEntry("Page Transition",
				"Create a new page transition.",
				new EMFCreationFactory(GuigraphPackage.eINSTANCE
						.getPageTransition()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/page.png"), null));

		if (!Platform.getProduct().getId().equals(MBTConstants.PRODUCT_MOBILE)) {
			scGroup.add(new CreationToolEntry("Timer Transition",
					"Create a new timer transition.", new EMFCreationFactory(
							GuigraphPackage.eINSTANCE.getTimerTransition()),
					Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
							"icons/clock_16.png"), null));
		}
		
		scGroup.add(new ConnectionCreationToolEntry("Arc", "Create a new arc.",
				new EMFCreationFactory(GuigraphPackage.eINSTANCE
						.getStandardArc()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/arc.png"), null));
		scGroup.add(new ConnectionCreationToolEntry("Inhibitor Arc",
				"Create a new inhibitor arc.", new EMFCreationFactory(
						GuigraphPackage.eINSTANCE.getInhibitorArc()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/inhibitor.png"), null));
		scGroup.add(new ConnectionCreationToolEntry("Page Mapping Arc",
				"Create a new page mapping arc.", new EMFCreationFactory(
						GuigraphPackage.eINSTANCE.getPageMappingArc()), Activator
						.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
								"icons/arc.png"), null));

		this.add(scGroup);
	}
}
