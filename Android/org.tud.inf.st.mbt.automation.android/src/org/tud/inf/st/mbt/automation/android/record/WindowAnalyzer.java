package org.tud.inf.st.mbt.automation.android.record;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.android.recorder.RecorderConstants;

import cern.colt.bitvector.BitMatrix;

import static org.tud.inf.st.mbt.emf.util.ModelUtil.functorAction;

public class WindowAnalyzer {

	public abstract static class WindowDiff {
		public Rectangle bounds;
		public Long id;

		public WindowDiff(Rectangle bounds, Long id) {
			this.bounds = bounds;
			this.id = id;
		}

		public abstract PreGenerationAction toValidationAction();

	}

	public static class TreeStructureDiff extends WindowDiff {
		public TreeStructureDiff(Rectangle bounds, Long id) {
			super(bounds, id);
		}

		@Override
		public PreGenerationAction toValidationAction() {
			return functorAction("validate_tree");
		}
	}

	public static class AppearedDiff extends WindowDiff {

		public AppearedDiff(Rectangle bounds, Long id) {
			super(bounds, id);
		}

		@Override
		public PreGenerationAction toValidationAction() {
			return functorAction("validate_appeared", id);
		}

	}

	public static class DisappearedDiff extends WindowDiff {

		public DisappearedDiff(Rectangle bounds, Long id) {
			super(bounds, id);
		}

		@Override
		public PreGenerationAction toValidationAction() {
			return functorAction("validate_disappeared", id);
		}
	}

	public static class TextDiff extends WindowDiff {
		public String text;

		public TextDiff(Rectangle bounds, Long id, String text) {
			super(bounds, id);
			this.text = text;
		}

		@Override
		public PreGenerationAction toValidationAction() {
			return functorAction("validate_text", id, text);
		}
	}

	public static class FocusedDiff extends WindowDiff {
		public Boolean focused;

		public FocusedDiff(Rectangle bounds, Long id, Boolean focused) {
			super(bounds, id);
			this.focused = focused;
		}

		@Override
		public PreGenerationAction toValidationAction() {
			return functorAction("validate_focus", id, focused);
		}
	}

	public static class SelectedDiff extends WindowDiff {
		public Boolean selected;

		public SelectedDiff(Rectangle bounds, Long id, Boolean selected) {
			super(bounds, id);
			this.selected = selected;
		}

		@Override
		public PreGenerationAction toValidationAction() {
			return functorAction("validate_select", id, selected);
		}
	}

	public static class CheckedDiff extends WindowDiff {
		public Boolean checked;

		public CheckedDiff(Rectangle bounds, Long id, Boolean checked) {
			super(bounds, id);
			this.checked = checked;
		}

		@Override
		public PreGenerationAction toValidationAction() {
			return functorAction("validate_check", id, checked);
		}
	}

	public static class BoundsDiff extends WindowDiff {

		public BoundsDiff(Rectangle bounds, Long id) {
			super(bounds, id);
		}

		@Override
		public PreGenerationAction toValidationAction() {
			return functorAction("validate_bounds", id, bounds.x, bounds.y,
					bounds.width, bounds.height);
		}
	}

	public static int measureSimilarity(JSONObject s1, JSONObject s2) {
		try{
			return -diff(s1, s2).size();
		} catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}

	public static List<WindowDiff> diff(JSONObject before, JSONObject after) {
		List<WindowDiff> result = new ArrayList<>();

		JSONArray childrenBefore = (JSONArray) before
				.get(RecorderConstants.INFO_CHILDREN);
		JSONArray childrenAfter = (JSONArray) after
				.get(RecorderConstants.INFO_CHILDREN);

		Rectangle boundsBefore = new Rectangle(
				Integer.parseInt(before.get(RecorderConstants.INFO_TOP) + ""),
				Integer.parseInt(before.get(RecorderConstants.INFO_LEFT) + ""),
				Integer.parseInt(before.get(RecorderConstants.INFO_RIGHT) + "")
						- Integer.parseInt(before
								.get(RecorderConstants.INFO_LEFT) + ""),
				Integer.parseInt(before.get(RecorderConstants.INFO_BOTTOM) + "")
						- Integer.parseInt(before
								.get(RecorderConstants.INFO_TOP) + ""));

		Rectangle boundsAfter = new Rectangle(Integer.parseInt(after
				.get(RecorderConstants.INFO_TOP) + ""), Integer.parseInt(after
				.get(RecorderConstants.INFO_LEFT) + ""),
				Integer.parseInt(after.get(RecorderConstants.INFO_RIGHT) + "")
						- Integer.parseInt(after
								.get(RecorderConstants.INFO_LEFT) + ""),
				Integer.parseInt(after.get(RecorderConstants.INFO_BOTTOM) + "")
						- Integer.parseInt(after
								.get(RecorderConstants.INFO_TOP) + ""));

		Long id = Long.parseLong(after.get(RecorderConstants.INFO_ID) + "");

		if (!boundsBefore.equals(boundsAfter)) {
			result.add(new BoundsDiff(boundsAfter, id));
		}

		if (!(after.get(RecorderConstants.INFO_CHECKED)).equals(before
				.get(RecorderConstants.INFO_CHECKED))) {
			result.add(new CheckedDiff(boundsAfter, id, Boolean
					.parseBoolean(after.get(RecorderConstants.INFO_CHECKED)
							+ "")));
		}

		if (!(after.get(RecorderConstants.INFO_FOCUSED)).equals(before
				.get(RecorderConstants.INFO_FOCUSED))) {
			result.add(new FocusedDiff(boundsAfter, id, Boolean
					.parseBoolean(after.get(RecorderConstants.INFO_FOCUSED)
							+ "")));
		}

		if (!(after.get(RecorderConstants.INFO_SELECTED)).equals(before
				.get(RecorderConstants.INFO_SELECTED))) {
			result.add(new SelectedDiff(boundsAfter, id, Boolean
					.parseBoolean(after.get(RecorderConstants.INFO_SELECTED)
							+ "")));
		}

		if (!(after.get(RecorderConstants.INFO_TEXT) + "").equals(before
				.get(RecorderConstants.INFO_TEXT) + "")) {
			result.add(new TextDiff(boundsAfter, id, after
					.get(RecorderConstants.INFO_TEXT) + ""));
		}

		List<Long> remained = new ArrayList<>();
		boolean orderChanged = false;

		for (Object ob : childrenBefore) {
			JSONObject jb = (JSONObject) ob;

			Rectangle boundsB = new Rectangle(
					Integer.parseInt(jb.get(RecorderConstants.INFO_TOP) + ""),
					Integer.parseInt(jb.get(RecorderConstants.INFO_LEFT) + ""),
					Integer.parseInt(jb.get(RecorderConstants.INFO_RIGHT) + "")
							- Integer.parseInt(jb
									.get(RecorderConstants.INFO_LEFT) + ""),
					Integer.parseInt(jb.get(RecorderConstants.INFO_BOTTOM) + "")
							- Integer.parseInt(jb
									.get(RecorderConstants.INFO_TOP) + ""));

			Long idb = Long.parseLong(jb.get(RecorderConstants.INFO_ID) + "");
			JSONObject ja = getByID(childrenAfter, idb);
			if (ja == null) {
				result.add(new DisappearedDiff(boundsB, idb));
			} else {
				remained.add(idb);
				if (!((Long) ja.get(RecorderConstants.INFO_IDX)).equals(jb
						.get(RecorderConstants.INFO_IDX))) {
					orderChanged = true;
				}
				result.addAll(diff(jb, ja));
			}

		}

		if (orderChanged) {
			result.add(new TreeStructureDiff(boundsAfter, id));
		}

		for (Object oa : childrenAfter) {
			JSONObject ja = (JSONObject) oa;
			Long ida = Long.parseLong(ja.get(RecorderConstants.INFO_ID) + "");
			if (remained.contains(ida))
				continue;

			Rectangle boundsA = new Rectangle(
					Integer.parseInt(ja.get(RecorderConstants.INFO_TOP) + ""),
					Integer.parseInt(ja.get(RecorderConstants.INFO_LEFT) + ""),
					Integer.parseInt(ja.get(RecorderConstants.INFO_RIGHT) + "")
							- Integer.parseInt(ja
									.get(RecorderConstants.INFO_LEFT) + ""),
					Integer.parseInt(ja.get(RecorderConstants.INFO_BOTTOM) + "")
							- Integer.parseInt(ja
									.get(RecorderConstants.INFO_TOP) + ""));
			result.add(new AppearedDiff(boundsA, ida));
		}

		return result;
	}

	public static Rectangle findBoundsByWindowID(JSONObject struct, int idNeedle) {
		int id = Integer.parseInt(struct.get(RecorderConstants.INFO_ID) + "");
		if (idNeedle == id) {
			Rectangle bounds = new Rectangle(Integer.parseInt(struct
					.get(RecorderConstants.INFO_TOP) + ""),
					Integer.parseInt(struct.get(RecorderConstants.INFO_LEFT)
							+ ""), Integer.parseInt(struct
							.get(RecorderConstants.INFO_RIGHT) + "")
							- Integer.parseInt(struct
									.get(RecorderConstants.INFO_LEFT) + ""),
					Integer.parseInt(struct.get(RecorderConstants.INFO_BOTTOM)
							+ "")
							- Integer.parseInt(struct
									.get(RecorderConstants.INFO_TOP) + ""));
			return bounds;
		} else {
			JSONArray children = (JSONArray) struct
					.get(RecorderConstants.INFO_CHILDREN);
			for (Object o : children) {
				Rectangle bounds = findBoundsByWindowID((JSONObject) o,
						idNeedle);
				if (bounds != null)
					return bounds;
			}
		}

		return null;
	}

	private static JSONObject getByID(JSONArray arr, Long id) {
		Iterator<?> i = arr.iterator();
		while (i.hasNext()) {
			JSONObject o = (JSONObject) i.next();
			if (o.containsKey(RecorderConstants.INFO_ID)
					&& id.equals(Long.parseLong(o
							.get(RecorderConstants.INFO_ID) + ""))) {
				return o;
			}
		}
		return null;
	}

	/**
	 * @return a point on a widget which is not coverered by its children
	 */
	public static Point getRandomPointOn(JSONObject screenState, long needleId) {
		BitMatrix mask = getMask(screenState, needleId);
		for (int y = 0; y < mask.rows(); y++)
			for (int x = 0; x < mask.columns(); x++)
				if (mask.getQuick(x, y))
					return new Point(x, y);
		return null;
	}

	/**
	 * @return a bit-wise matrix of pixels where the object with ID is visible
	 */
	public static BitMatrix getMask(JSONObject screenState, long needleId) {
		int w = Integer.parseInt(""
				+ screenState.get(RecorderConstants.INFO_RIGHT));
		int h = Integer.parseInt(""
				+ screenState.get(RecorderConstants.INFO_BOTTOM));

		long id = Long.parseLong(""
				+ screenState.get(RecorderConstants.INFO_ID));

		BitMatrix m = new BitMatrix(w, h);

		if (id == needleId) {
			m.replaceBoxWith(0, 0, w, h, true);
		} else {
			m.clear();
		}

		JSONArray children = (JSONArray) screenState
				.get(RecorderConstants.INFO_CHILDREN);
		for (Object o : children) {
			m.or(getMask((JSONObject) o, 0));
		}

		return m;
	}
}
