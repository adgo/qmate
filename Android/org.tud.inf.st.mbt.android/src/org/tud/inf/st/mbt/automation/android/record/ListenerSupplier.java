package org.tud.inf.st.mbt.automation.android.record;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.json.simple.JSONObject;
import org.tud.inf.st.mbt.android.recorder.RecorderConstants;
import org.tud.inf.st.mbt.automation.android.record.WindowAnalyzer.WindowDiff;
import org.tud.inf.st.mbt.automation.record.AbstractRecorderListener;
import org.tud.inf.st.mbt.automation.record.UIState;
import org.tud.inf.st.mbt.ulang.guigraph.Arc;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Form;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;
import org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode;
import org.tud.inf.st.mbt.ulang.guigraph.Place;

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

		public String toActionText() {
			StringBuffer actionText = new StringBuffer();

			for (Counter i = new Counter(); i.value < events.size(); i.value++) {
				JSONObject json = events.get(i.value);
				int type = Integer.parseInt(json
						.get(RecorderConstants.EVENT_TYPE) + "");
				if (type == AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED) {
					actionText.append(buildTextEnter(i) + "\n");
				} else {
					actionText.append(event2ActionString(json) + "\n");
				}
			}

			return actionText.toString();
		}

		public void clear() {
			events.clear();
		}

		private String buildTextEnter(Counter i) {
			String txt = "";
			while (i.value < events.size()) {
				{
					JSONObject json = events.get(i.value);
					txt = json.get(RecorderConstants.EVENT_TEXT) + "";
				}
				{
					JSONObject json = events.get(i.value);
					int type = Integer.parseInt(json
							.get(RecorderConstants.EVENT_TYPE) + "");
					if (type != AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED) {
						return "enterText(" + txt + ")";
					} else {
						i.value++;
					}
				}
			}
			return "enterText(" + txt + ")";
		}

		private String event2ActionString(JSONObject event) {
			StringBuffer boundsStr = new StringBuffer();
			// Rectangle bounds = WindowAnalyzer.findBoundsByWindowID(
			// (JSONObject) event.get(RecorderConstants.EVENT_POST), Integer
			// .parseInt(event.get(RecorderConstants.EVENT_SOURCE)
			// + ""));

			if (event.get(RecorderConstants.EVENT_TOP) != null) {
				Rectangle bounds = new Rectangle(
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

				if (bounds != null) {
					boundsStr.append(bounds.x + "," + bounds.y + ","
							+ bounds.getMaxX() + "," + bounds.getMaxY());
				}
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
				String params = "tap(";
				if (txt != null) {
					params += "\"" + txt + "\"";
					if (boundsStr.toString().trim().length() > 0)
						params += ",";
				}
				params += boundsStr;
				return params + ")";
			} else
				return "";
		}
	}

	private static final GuigraphFactory factoryGG = GuigraphFactory.eINSTANCE;

	private AbstractRecorderListener listener;
	private List<JSONUIState> states = new ArrayList<>();
	private JSONUIState lastState;
	private int supplierPfx = new Random().nextInt(Integer.MAX_VALUE);
	private int lastIdx = 0;
	private AndroidEventQueue eventActionsTextQueue = new AndroidEventQueue();
	private Image currentImg;
	private File currentImgTmpFile;
	private JSONObject currentPostJSON;
	private String validationActionsText = "";

	public ListenerSupplier(AbstractRecorderListener listener) {
		this.listener = listener;
	}

	public void setCurrentImg(File f, Image i) {
		this.currentImg = i;
		this.currentImgTmpFile = f;
		listener.updateScreen(currentImg);
	}

	private String manifestImg(String id) {
		if (listener.getImgFolder() == null
				|| listener.getRelativeImgFolder() == null)
			return null;

		try {
			Files.copy(currentImgTmpFile.toPath(),
					Paths.get(listener.getImgFolder(), id + ".png"));
			return listener.getRelativeImgFolder() + id + ".png";
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
			eventActionsTextQueue.add(event);
			listener.updateEventActionsText(eventActionsTextQueue
					.toActionText());

			if (lastState != null) {
				List<WindowDiff> diff = WindowAnalyzer.diff(lastState.json,
						currentPostJSON);
				StringBuffer actionsText = new StringBuffer();
				for (WindowDiff d : diff)
					actionsText.append(d.toValidationActionString() + "\n");
				this.validationActionsText = actionsText.toString();
				listener.updateValidationActionsText(validationActionsText);
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
	public void buildState(String actionText) {
		if (currentPostJSON == null)
			return;// no state was received yet

		Form f = factoryGG.createForm();
		f.setId(id());
		f.setName(f.getId());

		f.setImage(manifestImg(f.getId()));
		listener.getGraph().getNodes().add(f);

		JSONUIState s = new JSONUIState(currentPostJSON, f);
		s.setImg(new Image(currentImg.getDevice(), currentImg, SWT.IMAGE_COPY));

		if (lastState != null) {
			ConditionActionTransition cat = factoryGG
					.createConditionActionTransition();
			cat.setApplicationConditionText("true");
			cat.setActionsText(actionText);
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

		eventActionsTextQueue.clear();

		listener.updateEventActionsText("");
		listener.updateValidationActionsText("");
		updateSimilarStatesList();
		listener.updateModel();
	}

	public void identifyState(UIState s, String actionText) {
		if (s == null || !(s instanceof JSONUIState))
			return;

		ConditionActionTransition cat = factoryGG
				.createConditionActionTransition();
		cat.setApplicationConditionText("true");
		cat.setActionsText(actionText);
		cat.setId(id());
		listener.getGraph().getNodes().add(cat);

		eventActionsTextQueue.clear();

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

		listener.updateEventActionsText("");
		listener.updateValidationActionsText("");
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
