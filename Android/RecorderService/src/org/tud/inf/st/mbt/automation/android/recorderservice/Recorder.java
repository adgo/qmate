package org.tud.inf.st.mbt.automation.android.recorderservice;

import static android.view.accessibility.AccessibilityEvent.TYPE_GESTURE_DETECTION_END;
import static android.view.accessibility.AccessibilityEvent.TYPE_GESTURE_DETECTION_START;
import static android.view.accessibility.AccessibilityEvent.TYPE_TOUCH_EXPLORATION_GESTURE_END;
import static android.view.accessibility.AccessibilityEvent.TYPE_TOUCH_EXPLORATION_GESTURE_START;
import static android.view.accessibility.AccessibilityEvent.TYPE_TOUCH_INTERACTION_END;
import static android.view.accessibility.AccessibilityEvent.TYPE_TOUCH_INTERACTION_START;
import static android.view.accessibility.AccessibilityEvent.TYPE_VIEW_CLICKED;
import static android.view.accessibility.AccessibilityEvent.TYPE_VIEW_HOVER_ENTER;
import static android.view.accessibility.AccessibilityEvent.TYPE_VIEW_HOVER_EXIT;
import static android.view.accessibility.AccessibilityEvent.TYPE_VIEW_LONG_CLICKED;
import static android.view.accessibility.AccessibilityEvent.TYPE_VIEW_SCROLLED;
import static android.view.accessibility.AccessibilityEvent.TYPE_VIEW_SELECTED;
import static android.view.accessibility.AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED;

import static org.tud.inf.st.mbt.automation.android.recorderservice.RecorderConstants.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.accessibilityservice.UiTestAutomationBridge;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class Recorder {

	private static final List<Integer> relevantEvents = Arrays
			.asList(new Integer[] { TYPE_GESTURE_DETECTION_END,
					TYPE_GESTURE_DETECTION_START,
					TYPE_TOUCH_EXPLORATION_GESTURE_START,
					TYPE_TOUCH_EXPLORATION_GESTURE_END,
					TYPE_TOUCH_INTERACTION_END, TYPE_TOUCH_INTERACTION_START,
					TYPE_VIEW_CLICKED, TYPE_VIEW_HOVER_ENTER,
					TYPE_VIEW_HOVER_EXIT, TYPE_VIEW_LONG_CLICKED,
					TYPE_VIEW_SCROLLED, TYPE_VIEW_SELECTED,
					TYPE_VIEW_TEXT_CHANGED });

	public static void main(String[] args) {
		final UiTestAutomationBridge bridge = new UiTestAutomationBridge() {
			@Override
			public void onAccessibilityEvent(AccessibilityEvent event) {
				try {
					if (isRelevant(event)) {
						JSONObject out = event2JSON(event);
						JSONObject report = report(this);
						out.put(EVENT_POST,
								report.get(EVENT_POST));
						//out.put(EVENT_POST_PNG,
						//		report.get(EVENT_POST_PNG));
						System.out.println(out);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}			
		
		};
		bridge.connect();

		System.out.println(report(bridge));
		
		try {
			while(System.in.read()!=-1){
				System.out.println(report(bridge));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private static JSONObject report(UiTestAutomationBridge bridge){
		JSONObject report = new JSONObject();
		try {
			report.put(EVENT_TYPE, REPORT);
			report.put(
					EVENT_POST,
					nodeInfo2JSON(
							bridge.getRootAccessibilityNodeInfoInActiveWindow(),
							0));
			
			/*FileInputStream fis = null;
			try {
				Runtime.getRuntime().exec("/system/bin/screencap /mnt/sdcard/screen.png").waitFor();
				fis = new FileInputStream(new File("/mnt/sdcard/screen.png"));
				StringBuffer sb = new StringBuffer();
				byte[] buf = new byte[100];
				int read = 0;
				while((read=fis.read(buf))!=-1){
					for(int i=0;i<read;i++)sb.append(buf[i]+" ");
				}
				report.put(EVENT_POST_PNG, sb.toString());
			} catch (Exception e){
				e.printStackTrace();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			} finally {
				if(fis != null)
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}*/
			
			return report;
		} catch (JSONException e1) {
			e1.printStackTrace();
			return null;
		}
	}

	private static boolean isRelevant(AccessibilityEvent event) {
		return relevantEvents.contains(event.getEventType());
	}

	private static JSONObject event2JSON(AccessibilityEvent event)
			throws JSONException {
		JSONObject out = new JSONObject();
		out.put(EVENT_TYPE,
				event.getEventType());
		if(event.getSource()!=null)out.put(EVENT_SOURCE, event.getSource().getWindowId());
		out.put(EVENT_TEXT, event.getText().isEmpty() ? "" : event.getText()
				.get(0));
		out.put(EVENT_CHECKED, event.isChecked());
		out.put(EVENT_TIME, event.getEventTime());

		if (event.getSource() != null) {
			Rect bounds = new Rect();
			event.getSource().getBoundsInScreen(bounds);

			out.put(EVENT_BOTTOM, bounds.bottom);
			out.put(EVENT_TOP, bounds.top);
			out.put(EVENT_LEFT, bounds.left);
			out.put(EVENT_RIGHT, bounds.right);
		}

		return out;
	}

	private static JSONObject nodeInfo2JSON(AccessibilityNodeInfo info, int idx)
			throws JSONException {
		JSONObject out = new JSONObject();
		if (info == null)
			return out;

		out.put(INFO_IDX, idx);
		out.put(INFO_ID, info.getWindowId());
		if (info.getText() != null)
			out.put(INFO_TEXT, info.getText());
		out.put(INFO_CHECKED, info.isChecked());
		out.put(INFO_FOCUSED, info.isFocused());
		out.put(INFO_SELECTED, info.isSelected());
		out.put(INFO_VISIBLE, info.isVisibleToUser());
		out.put(INFO_CLASS, info.getClass());

		JSONArray children = new JSONArray();

		for (int i = 0; i < info.getChildCount(); i++) {
			children.put(i, nodeInfo2JSON(info.getChild(i), i));
		}

		out.put(INFO_CHILDREN, children);

		Rect bounds = new Rect();
		info.getBoundsInScreen(bounds);

		out.put(INFO_BOTTOM, bounds.bottom);
		out.put(INFO_TOP, bounds.top);
		out.put(INFO_LEFT, bounds.left);
		out.put(INFO_RIGHT, bounds.right);

		return out;
	}
}
