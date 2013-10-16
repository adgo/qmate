package org.tud.inf.st.mbt.automation.android.record;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.android.ddmlib.AndroidDebugBridge;
import com.android.ddmlib.IDevice;
import com.android.ddmlib.RawImage;
import com.android.ide.eclipse.adt.AdtPlugin;

/**
 * The most of this bridge avoids to use ddmlib, because WE CAN.
 * @author Georg
 */
@SuppressWarnings("restriction")
public final class AndroidRecorderBridge {

	private static final long TIMEOUT = 4000;
	private static final long TIME_INC = 100;
	
	private static AndroidDebugBridge adb;
	
	public static void initADB(){
		if(adb == null){
			String adbLocation = AdtPlugin.getOsAbsoluteAdb();
			AndroidDebugBridge.init(false);
			adb = AndroidDebugBridge.createBridge(adbLocation,true);
		}
		if(adb == null){
			System.err.println("Failed to create ADB!");
		}
	}
	
	public static void terminateADB(){
		AndroidDebugBridge.terminate();
		adb = null;
	}
	
	public static void startScreenShotThread(String deviceName){
		initADB();
		if(adb != null){
			IDevice device = null;
			for(IDevice d:adb.getDevices()){
				if(d.getName().equals(device)){
					device = d;
					break;
				}
			}
			if(device == null){
				System.err.println("Device not found!");
			} else {
				//?
			}
		}
	}

	public static boolean waitReady(Reader r, Process p) {
		return waitReady(r, p, TIMEOUT, TIME_INC);
	}

	public static boolean waitReady(Reader r, Process p, long timeout, long inc) {
		boolean success = true;
		try {
			long waited = 0;
			while (!r.ready()) {
				Thread.sleep(inc);
				waited += inc;
				if (waited > timeout) {
					success = false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			success = false;
		}
		if (!success) {
			p.destroy();
			try {
				p.waitFor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	public static String[] getDevices() {
		Process p = null;
		List<String> result = new ArrayList<String>();

		try {
			p = Runtime.getRuntime().exec(
					AdtPlugin.getOsAbsoluteAdb() + " devices");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			String line;
			boolean skip = true;
			while (waitReady(reader, p) && (line = reader.readLine()) != null) {
				if (skip) {
					if (line.contains("devices attached")) {
						skip = false;
					}
					continue;
				}
				if (line.trim().length() > 0){
					String[] lineArr = line.split("\\s");
					String state = lineArr[1].trim();
					if(!state.equals("offline")){
						result.add(lineArr[0].trim());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (p != null) {
				p.destroy();
				try {
					p.waitFor();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		return result.toArray(new String[0]);
	}
	
	public static File getTmpFile(){
		String targetFile = System.getProperty("java.io.tmpdir") + "tempfile_"
				+ new Random().nextInt(Integer.MAX_VALUE);
		return new File(targetFile);
	}

	public static File pull(String device, String devicePath)
			throws InterruptedException, IOException {
		File targetFile = getTmpFile();
		int result = Runtime.getRuntime().exec(
				AdtPlugin.getOsAbsoluteAdb() + " pull " + devicePath + " " + targetFile).waitFor();
		if(result != 0){
			System.err.println("Getting screenshot failed!");
		}
		return targetFile;
	}

	public static String dump(String device) {
		try {
			shell(device, "uiautomator dump").waitFor();

			File local = pull(device, "/mnt/sdcard/window_dump.xml");
			BufferedReader reader = new BufferedReader(new FileReader(local));
			local.delete();
			StringBuffer buf = new StringBuffer();
			String line;
			while ((line = reader.readLine()) != null) {
				buf.append(line);
			}
			reader.close();
			return buf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static File screenshot(String device) {
		try {
			int result = shell(device, "/system/bin/screencap /mnt/sdcard/screen.png")
					.waitFor();
			if(result != 0){
				System.err.println("Capturing screenshot failed!");
			}
			File local = pull(device, "/mnt/sdcard/screen.png");
			return local;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void tap(String device, Point at) {
		try {
			shell(device, "input tap " + at.x + " " + at.y);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void swipe(String device, Point from, Point to) {
		try {
			shell(device, "input swipe " + from.x + " " + from.y + " " + to.x
					+ " " + to.y);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void text(String device, String txt) {
		try {
			shell(device, "input text " + txt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Process shell(String device, String cmd) throws IOException {
		return Runtime.getRuntime().exec(
				AdtPlugin.getOsAbsoluteAdb() + " -s " + device + " shell "
						+ cmd);
	}

}
