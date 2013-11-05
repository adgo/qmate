package org.tud.inf.st.mbt.automation.android.record;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.json.simple.JSONObject;
import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.actions.TermAction;
import org.tud.inf.st.mbt.android.recorder.RecorderConstants;
import org.tud.inf.st.mbt.automation.IAutomationConstants;
import org.tud.inf.st.mbt.automation.android.record.WindowAnalyzer.WindowDiff;
import org.tud.inf.st.mbt.automation.record.AbstractRecorderListener;
import org.tud.inf.st.mbt.automation.record.UIState;
import org.tud.inf.st.mbt.emf.util.ModelUtil;
import org.tud.inf.st.mbt.ulang.guigraph.Arc;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Form;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;
import org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode;
import org.tud.inf.st.mbt.ulang.guigraph.Place;
import org.eclipse.core.resources.*;

import android.view.accessibility.AccessibilityEvent;

public class ListenerSupplier {

	public static class JSONUIState extends UIState {
		private JSONObject json;

		public JSONUIState(JSONObject json, Form screenNode,
				NoWidgetNode... noScreenNodes) {
			super(screenNode, noScreenNodes);
			this.json = json;
		}

		public JSONObject getJson() {
			return json;
		}

		public void setJson(JSONObject json) {
			this.json = json;
		}

		@Override
		public JSONUIState clone() throws CloneNotSupportedException {
			JSONUIState clone = new JSONUIState(json, getScreenNode(),
					getNoScreenNodes().toArray(new NoWidgetNode[0]));
			clone.setImg(getImg());
			return clone;
		}
	}

	private static class JSONUIComparator implements Comparator<JSONUIState> {

		private JSONObject compareTo;

		public JSONUIComparator(JSONObject compareTo) {
			this.compareTo = compareTo;
		}

		@Override
		public int compare(JSONUIState s1, JSONUIState s2) {
			return WindowAnalyzer.measureSimilarity(s1.json, compareTo)
					- WindowAnalyzer.measureSimilarity(s2.json, compareTo);
		}

	};

	private static class Counter {
		int value = 0;
	}

	private static class AndroidEventQueue {
		private List<JSONObject> events = new LinkedList<>();

		public void add(JSONObject event) {
			events.add(event);
		}

		public Collection<PreGenerationAction> toActions() {
			List<PreGenerationAction> actions = new ArrayList<>();

			for (Counter i = new Counter(); i.value < events.size(); i.value++) {
				JSONObject json = events.get(i.value);
				int type = Integer.parseInt(json
						.get(RecorderConstants.EVENT_TYPE) + "");
				if (type == AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED) {
					PreGenerationAction pga = buildType(i);
					if(pga!=null)actions.add(pga);
				} else {
					PreGenerationAction pga = event2Action(json);
					if (pga != null)
						actions.add(pga);
				}
			}

			return actions;
		}

		public void clear() {
			events.clear();
		}

		private TermAction buildType(Counter i) {

			while (i.value < events.size()) {
				JSONObject json = events.get(i.value);
				String txt = json.get(RecorderConstants.EVENT_TEXT) + "";
				int type = Integer.parseInt(json
						.get(RecorderConstants.EVENT_TYPE) + "");

				if (type != AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED) {
					return ModelUtil.functorAction(IAutomationConstants.FUNCTOR_TYPE, txt);
				} else {
					i.value++;
				}
			}

			return null;
		}

		private PreGenerationAction event2Action(JSONObject event) {
			// Rectangle bounds = WindowAnalyzer.findBoundsByWindowID(
			// (JSONObject) event.get(RecorderConstants.EVENT_POST), Integer
			// .parseInt(event.get(RecorderConstants.EVENT_SOURCE)
			// + ""));
			Rectangle bounds = new Rectangle();
			if (event.get(RecorderConstants.EVENT_TOP) != null) {
				bounds = new Rectangle(
						Integer.parseInt(event.get(RecorderConstants.EVENT_TOP)
								+ ""),
						Integer.parseInt(event
								.get(RecorderConstants.EVENT_LEFT) + ""),
						Integer.parseInt(event
								.get(RecorderConstants.EVENT_RIGHT) + "")
								- Integer.parseInt(event
										.get(RecorderConstants.EVENT_LEFT) + ""),
						Integer.parseInt(event
								.get(RecorderConstants.EVENT_BOTTOM) + "")
								- Integer.parseInt(event
										.get(RecorderConstants.EVENT_TOP) + ""));
			}

			// boolean checked = Boolean.parseBoolean(event
			// .get(RecorderConstants.EVENT_CHECKED) + "");
			// if (checked) {
			// params.append(params.length() > 0 ? "," + checked : checked
			// + "");
			// }
			String txt = event.get(RecorderConstants.EVENT_TEXT) + "";

			int type = Integer.parseInt(event.get(RecorderConstants.EVENT_TYPE)
					+ "");

			if (type == AccessibilityEvent.TYPE_VIEW_CLICKED) {
				return ModelUtil.functorAction(IAutomationConstants.FUNCTOR_TAP, txt,
						bounds.getCenterX(), bounds.getCenterY());
			}

			return null;
		}
	}

	private static final GuigraphFactory factoryGG = GuigraphFactory.eINSTANCE;

	private AbstractRecorderListener listener;
	private List<JSONUIState> states = new ArrayList<>();
	private JSONUIState lastState;
	private ConditionActionTransition lastTransition;
	private int supplierPfx = new Random().nextInt(Integer.MAX_VALUE);
	private int lastIdx = 0;
	private AndroidEventQueue eventActionsQueue = new AndroidEventQueue();
	private Image currentImg;
	private File currentImgTmpFile;
	private JSONObject currentPostJSON;

	private List<PreGenerationAction> validationActions;

	public ListenerSupplier(AbstractRecorderListener listener) {
		this.listener = listener;
	}

	public void setCurrentImg(File f, Image i) {
		this.currentImg = i;
		this.currentImgTmpFile = f;
		listener.updateScreen(currentImg);
	}

	private String manifestImg(String id) {
		if (listener.getImgFolder() == null)
			return null;

		try {
			Files.copy(
					currentImgTmpFile.toPath(),
					Paths.get(ResourcesPlugin.getWorkspace().getRoot()
							.getRawLocation()
							+ "" + listener.getImgFolder() + "/" + id + ".png"));
			return listener.getImgFolder() + "/" + id + ".png";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void interpret(JSONObject event) {
		currentPostJSON = (JSONObject) event.get(RecorderConstants.EVENT_POST);

		boolean report = (event.get(RecorderConstants.EVENT_TYPE) + "")
				.equals(RecorderConstants.REPORT + "");

		if (!report) {
			eventActionsQueue.add(event);
			listener.updateEventActions(eventActionsQueue.toActions());

			if (lastState != null) {
				List<WindowDiff> diff = WindowAnalyzer.diff(lastState.json,
						currentPostJSON);
				List<PreGenerationAction> actions = new ArrayList<>();
				for (WindowDiff d : diff)
					actions.add(d.toValidationAction());
				this.validationActions = actions;
				listener.updateValidationActions(actions);
			}

			updateSimilarStatesList();
		}
	}

	private void updateSimilarStatesList() {
		Collections.sort(states, new JSONUIComparator(currentPostJSON));
		listener.updateSimilarStatesList(states);
	}

	private String id() {
		return supplierPfx + "_" + (lastIdx++);
	}

	public JSONUIState getLastState() {
		return lastState;
	}

	// build completely new state
	public void buildState(PreGenerationAction action) {
		if (currentPostJSON == null){
			System.err.println("No state was received yet!");
			return;// no state was received yet
		}

		Form f = factoryGG.createForm();
		f.setId(id());
		f.setName(f.getId());

		f.setImage(manifestImg(f.getId()));
		listener.getGraph().getNodes().add(f);

		JSONUIState s = new JSONUIState(currentPostJSON, f);
		s.setImg(new Image(currentImg.getDevice(), currentImg, SWT.IMAGE_COPY));
		
		if (lastState == null){
			NoWidgetNode start = factoryGG.createNoWidgetNode();
			start.setId(id());
			start.setName("start_"+start.getId());
			start.setInitialTokens(1);
			listener.getGraph().getNodes().add(start);
			lastState = new JSONUIState(currentPostJSON, null, start);
		}

		if (lastState != null) {
			if(lastTransition!=null)lastTransition.setTerminates(false);
			
			ConditionActionTransition cat = factoryGG
					.createConditionActionTransition();
			cat.setApplicationConditionText("true");
			cat.setTerminates(true);
			lastTransition = cat;
			
			String actions = action+"";
			actions = actions.replaceAll(";", ";\n");
			
			cat.setActionsText(action + "");
			cat.setId(id());
			listener.getGraph().getNodes().add(cat);

			for (Place p : lastState.getAllPlaces()) {
				Arc e = factoryGG.createStandardArc();
				e.setId(id());
				e.setSource(p);
				e.setTarget(cat);
				listener.getGraph().getArcs().add(e);

			}

			Arc e = factoryGG.createStandardArc();
			e.setId(id());
			e.setSource(cat);
			e.setTarget(f);
			listener.getGraph().getArcs().add(e);
		}

		lastState = s;
		states.add(s);

		eventActionsQueue.clear();

		listener.updateEventActions(Collections
				.<PreGenerationAction> emptyList());
		listener.updateValidationActions(Collections
				.<PreGenerationAction> emptyList());
		updateSimilarStatesList();
		listener.updateModel();
	}

	public void identifyState(UIState s, PreGenerationAction action) {
		if (s == null || !(s instanceof JSONUIState))
			return;

		if(lastTransition!=null)lastTransition.setTerminates(false);
		
		ConditionActionTransition cat = factoryGG
				.createConditionActionTransition();
		cat.setApplicationConditionText("true");
		cat.setActionsText(action + "");
		cat.setId(id());
		cat.setTerminates(true);
		lastTransition = cat;
		listener.getGraph().getNodes().add(cat);

		eventActionsQueue.clear();

		for (Place p : lastState.getAllPlaces()) {
			Arc e = factoryGG.createStandardArc();
			e.setId(id());
			e.setSource(p);
			e.setTarget(cat);
			listener.getGraph().getArcs().add(e);
		}

		for (Place p : s.getAllPlaces()) {
			if (!listener.getGraph().getNodes().contains(p)) {
				p.setId(id());
				p.setName(p.getId());
				listener.getGraph().getNodes().add(p);
			}
			Arc e = factoryGG.createStandardArc();
			e.setId(id());
			e.setSource(cat);
			e.setTarget(p);
			listener.getGraph().getArcs().add(e);
		}

		states.add((JSONUIState) s);

		lastState = (JSONUIState) s;

		listener.updateEventActions(Collections
				.<PreGenerationAction> emptyList());
		listener.updateValidationActions(Collections
				.<PreGenerationAction> emptyList());
		updateSimilarStatesList();
		listener.updateModel();
	}

	public void disposeImages() {
		for (JSONUIState s : states) {
			if (s.getImg() != null)
				s.getImg().dispose();
		}
	}
}
