package org.tud.inf.st.mbt.automation.android;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.tud.inf.st.mbt.automation.AutomationProperty;
import org.tud.inf.st.mbt.automation.TestSuiteAutomationType;
import org.tud.inf.st.mbt.test.TestSuite;

public final class AndroidAutomationType extends TestSuiteAutomationType {

	private static final String NAME = "Android + Robotium";
	private static AutomationProperty<?>[] properties = new AutomationProperty[] {
			new AutomationProperty<IContainer>("Test case container",
					IContainer.class, ResourcesPlugin.getWorkspace().getRoot()),
			new AutomationProperty<String>("Keyword provider class name",
					String.class, "MyKeywordProvider"),
			new AutomationProperty<String>("Activity name", String.class,
					"MyActivity") };
	private static AndroidAutomationType instance;

	private AndroidAutomationType() {
		super(NAME);
	}

	public static AndroidAutomationType getInstance() {
		if (instance == null)
			instance = new AndroidAutomationType();
		return instance;
	}

	@Override
	public void automate(Resource r) {
		new AndroidAutomationRunner(
				((IContainer)properties[0].value).getLocation().toPortableString(), properties[1].value + "", properties[2].value + "", (TestSuite) r
						.getContents().get(0)).run();
	}

	@Override
	public AutomationProperty<?>[] getAutomationProperties() {
		return properties;
	}

	@Override
	public boolean propertiesValid() {
		return true;
	}
}
