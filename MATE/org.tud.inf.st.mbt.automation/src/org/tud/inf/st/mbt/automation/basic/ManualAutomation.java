package org.tud.inf.st.mbt.automation.basic;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.tud.inf.st.mbt.actions.FailAction;
import org.tud.inf.st.mbt.actions.GetFeatureStateAction;
import org.tud.inf.st.mbt.actions.GetPropertyAction;
import org.tud.inf.st.mbt.actions.GetRealTimeAction;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.PostGenerationSequence;
import org.tud.inf.st.mbt.automation.execute.ISimulationAutomation;
import org.tud.inf.st.mbt.automation.execute.ISimulationResponder;
import org.tud.inf.st.mbt.data.DataClass;
import org.tud.inf.st.mbt.data.DataElement;
import org.tud.inf.st.mbt.data.DataLeaf;
import org.tud.inf.st.mbt.data.TypedDataClass;
import org.tud.inf.st.mbt.features.FeatureVersion;
import org.tud.inf.st.mbt.features.IFeature;
import org.tud.inf.st.mbt.featuretree.TreeFeature;

public class ManualAutomation implements ISimulationAutomation {

	private long lastRealTime = System.currentTimeMillis();

	public boolean automate(final PostGenerationAction action,
			ISimulationResponder simulationAccessor) {
		if (action instanceof FailAction) {
			return false;
		} else if (action instanceof PostGenerationSequence) {
			for (PostGenerationAction e : ((PostGenerationSequence) action)
					.getActions().toArray(new PostGenerationAction[0])) {
				if (!automate(e, simulationAccessor))
					return false;
			}
			return true;
		} else if (action instanceof GetPropertyAction) {
			DataLeaf leaf = ((GetPropertyAction) action).getProperty();
			DataElement e = leaf.getDomain();
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
					Display.getCurrent().getActiveShell(), new LabelProvider(),
					new ITreeContentProvider() {

						@Override
						public void inputChanged(Viewer viewer,
								Object oldInput, Object newInput) {
						}

						@Override
						public void dispose() {
						}

						@Override
						public boolean hasChildren(Object element) {
							return getChildren(element).length > 0;
						}

						@Override
						public Object getParent(Object element) {
							return null;
						}

						@Override
						public Object[] getElements(Object inputElement) {
							return getChildren(inputElement);
						}

						@Override
						public Object[] getChildren(Object parentElement) {
							if (parentElement instanceof Object[]) {
								return (Object[]) parentElement;
							} else if (parentElement instanceof DataClass) {
								return ((DataClass) parentElement)
										.getChildren().toArray(
												new DataElement[0]);
							} else if (parentElement instanceof TypedDataClass){
								return ((TypedDataClass) parentElement)
										.getChildren().toArray(
												new DataElement[0]);
							}
							else return new Object[0];
						}
					});
			dialog.setInput(new Object[] { e });
			dialog.setTitle("Value assignment");
			dialog.setMessage("Select a value for " + leaf);
			dialog.setAllowMultiple(false);
			while (dialog.open() != Window.OK || dialog.getResult() == null
					|| dialog.getResult().length != 1)
				;
			DataElement select = (DataElement) dialog.getResult()[0];
			simulationAccessor.setProperty(leaf, select);
			return true;
		} else if (action instanceof GetFeatureStateAction) {
			IFeature f = ((GetFeatureStateAction) action).getFeature();
			int result = new MessageDialog(Display.getCurrent()
					.getActiveShell(), "Feature state request", null,
					"Is the following feature active: " + f + "?",
					MessageDialog.QUESTION, new String[] { "&YES", "&NO",
							"&Cancel" }, 0).open();
			if (result == 2) {
				throw new RuntimeException("Test execution canceled!");
			} else if (result == 0) {
				FeatureVersion v = null;
				if (f instanceof TreeFeature
						&& !((TreeFeature) f).getVersions().isEmpty()) {
					ElementListSelectionDialog dialog = new ElementListSelectionDialog(
							Display.getCurrent().getActiveShell(),
							new LabelProvider());
					dialog.setTitle("Version selection");
					dialog.setMessage("Select a version of this feature");
					dialog.setMultipleSelection(false);
					dialog.setElements(((TreeFeature) f).getVersions()
							.toArray());
					while (dialog.open() != Window.OK
							|| dialog.getResult() == null
							|| dialog.getResult().length != 1)
						;
					v = (FeatureVersion) dialog.getResult()[0];
				}
				simulationAccessor.setFeatureActivated(f, v, true);
			} else {
				simulationAccessor.setFeatureActivated(f, null, false);
			}

			return true;
		} else if (action instanceof GetRealTimeAction) {
			long elapsed = System.currentTimeMillis()
					- lastRealTime;
			
			long hint = ((GetRealTimeAction) action).getTimeHint();
			
			simulationAccessor.elapseRealTime(elapsed>hint ? elapsed : hint);
			return true;
		} else {
			class DialogRun implements Runnable {

				int result = -1;

				@Override
				public void run() {
					result = new MessageDialog(Display.getDefault()
							.getActiveShell(), "Please execute", null,
							"Execute the following action: " + action,
							MessageDialog.QUESTION, new String[] { "&OK",
									"&FAILURE", "&Cancel" }, 0).open();
				}

			}
			DialogRun run = new DialogRun();
			Display.getDefault().syncExec(run);

			if (run.result == 2)
				throw new RuntimeException("Test execution canceled!");
			else if (run.result != 0)
				return false;
			else
				return true;
		}
	}

	@Override
	public void reset() {
		lastRealTime = System.currentTimeMillis();
	}

	@Override
	public void terminate() {
	}

}
