package org.tud.inf.st.mbt.automation.android.record;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.android.recorder.RecorderConstants;
import org.tud.inf.st.mbt.automation.record.AbstractRecorder;
import org.tud.inf.st.mbt.automation.record.AbstractRecorderListener;
import org.tud.inf.st.mbt.automation.record.UIState;

import com.android.ide.eclipse.adt.AdtPlugin;

@SuppressWarnings("restriction")
public class AndroidRecorder extends AbstractRecorder {

	private Process process;
	private final ExecutorService executor = Executors.newFixedThreadPool(2);
	private static JSONParser parser = new JSONParser();
	private boolean init = false;
	private Map<AbstractRecorderListener, ListenerSupplier> suppliers = new HashMap<>();
	private JSONObject event;
	private boolean terminated = false;
	private Object termLock = new Object(), screenLock = new Object();
	private File screenFile;
	private List<File> tempFiles = new ArrayList<>();

	public AndroidRecorder(String connection) {
		super(connection);
	}

	@Override
	public void start() {
		try {
			executor.submit(new Runnable() {
				public void run() {
					String shell = AdtPlugin.getOsAbsoluteAdb()
							+ " -s "
							+ getConnection()
							+ " shell export run_base=/data/local/tmp;export base=/system;"
							+ "export CLASSPATH=/system/app/recorder.apk;"
							+ "export LD_LIBRARY_PATH=/system/lib:/vendor/lib;"
							+ "exec app_process ${base}/bin org.tud.inf.st.mbt.automation.android.recorderservice.Recorder";

					try {
						process = Runtime.getRuntime().exec(shell);

						BufferedReader reader = new BufferedReader(
								new InputStreamReader(process.getInputStream()));

						char c;
						StringBuffer currentLine = new StringBuffer();
						while ((c = (char) reader.read()) != -1
								&& !isTerminated()) {
							if (c == '\n') {
								String msg = currentLine.toString().trim();
								interpret(msg);
								currentLine = new StringBuffer();
							}
							currentLine.append(c);
						}

					} catch (IOException e) {
						e.printStackTrace();
					}
					for (AbstractRecorderListener l : getListeners())
						l.terminate();
					process.destroy();
				}
			});

			executor.submit(new Runnable() {
				public void run() {
					Image screen = null;
					while (!isTerminated()) {
						try {
							process.exitValue();
							break;
						} catch (Exception e) {
							// everything OK
						}

						try {
							synchronized (screenLock) {
								screenFile = CustomizedAndroidBridge
										.screenshot(getConnection());
							}

							if (screenFile != null) {
								tempFiles.add(screenFile);

								Image old = screen;

								screen = new Image(Display.getDefault(),
										screenFile.toString());

								for (ListenerSupplier s : suppliers.values()) {
									s.setCurrentImg(screenFile, screen);
								}

								if (old != null) {
									old.dispose();
								}

								report();
							}

							Thread.sleep(200);
						} catch (Exception e) {
							e.printStackTrace();
							break;
						}
					}
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private File savePNG(String encoded) {
		try {
			File tmp = CustomizedAndroidBridge.getTmpFile();
			FileOutputStream fos = new FileOutputStream(tmp);
			for (String s : encoded.split(" ")) {
				byte b = Byte.parseByte(s);
				fos.write(b);
			}
			fos.close();
			return tmp;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void interpret(String msg) {
		System.out.println(msg);
		try {
			event = (JSONObject) parser.parse(msg);
			// Thread.sleep(500);// wait for screen animations

			// String post_png = event.get(RecorderConstants.EVENT_POST_PNG) +
			// "";
			// screenFile = savePNG(post_png);

			if ((event.get(RecorderConstants.EVENT_TYPE) + "")
					.equals(RecorderConstants.REPORT + "")) {
				System.err.println("event stream initiated");
				init = true;
				for (AbstractRecorderListener l : getListeners()) {
					ListenerSupplier s = suppliers.get(l);
					s.interpret(event);
				}
			} else {
				if (!init) {
					System.err.println("not yet initiated");
					return;
				}

				for (AbstractRecorderListener l : getListeners()) {
					ListenerSupplier s = suppliers.get(l);
					s.interpret(event);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void simulateAction(PreGenerationAction action){
		for (AbstractRecorderListener l : getListeners()) {
			ListenerSupplier s = suppliers.get(l);
			s.simulateAction(action);
		}
	}
	
	public void induceValidation(PreGenerationAction action){
		for (AbstractRecorderListener l : getListeners()) {
			ListenerSupplier s = suppliers.get(l);
			s.induceValidation(action);
		}
	}

	@Override
	public void terminate() {
		synchronized (termLock) {
			terminated = true;
		}
		for (ListenerSupplier s : suppliers.values())
			s.disposeImages();
		for (File f : tempFiles) {
			try {
				f.delete();
			} catch (Exception e) {
			}
		}
	}

	public boolean isTerminated() {
		synchronized (termLock) {
			return terminated;
		}
	}

	@Override
	public void registerListener(AbstractRecorderListener l) {
		super.registerListener(l);
		ListenerSupplier s = new ListenerSupplier(l);
		suppliers.put(l, s);
		if (event != null) {
			s.interpret(event);
		}
	}

	@Override
	public void unregisterListener(AbstractRecorderListener l) {
		super.unregisterListener(l);
		suppliers.remove(l);
	}

	@Override
	public void buildState(AbstractRecorderListener l,
			PreGenerationAction action) {
		suppliers.get(l).buildState(action);
	}

	@Override
	public void identifyState(AbstractRecorderListener l, UIState state,
			PreGenerationAction action) {
		suppliers.get(l).identifyState(state, action);
	}

	@Override
	public void simulateSwipe(Point from, Point to) {
		CustomizedAndroidBridge.swipe(getConnection(), from, to);
		report();
	}

	@Override
	public void simulateTap(Point at) {
		CustomizedAndroidBridge.tap(getConnection(), at);
		report();
	}

	@Override
	public void simulateTextInput(String txt) {
		CustomizedAndroidBridge.text(getConnection(), txt);
		report();
	}

	private void report() {
		try {
			process.getOutputStream().write(666);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public File screenshot() {
		File result = null;
		int tryOutsLeft = 10;
		while (result == null && tryOutsLeft > 0) {
			synchronized (screenLock) {
				result = screenFile;
			}
			if (result == null) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				tryOutsLeft--;
			}
		}
		return result;
	}

	@Override
	public void reset() {
		CustomizedAndroidBridge.initADB();
	}
}
