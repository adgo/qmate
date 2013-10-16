package org.tud.inf.st.mbt.automation.record;

import java.util.ArrayList;
import java.util.List;

public class RecorderManager {
	private static List<AbstractRecorderType> recorderTypes = new ArrayList<>();	
	
	public static void terminate(){
		for(AbstractRecorderType t:recorderTypes)t.terminate();
	}
	
	public static void registerType(AbstractRecorderType t){
		recorderTypes.add(t);
	}
	
	public static List<AbstractRecorderType> getTypes(){
		return new ArrayList<>(recorderTypes);
	}
}
