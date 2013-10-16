package org.tud.inf.st.mbt.automation.java;

import android.app.Activity;
import android.app.Service;
import android.location.Location;
import android.location.LocationManager;

import com.jayway.android.robotium.solo.Solo;

public abstract class KeywordProvider {
	
	private Solo solo;
	private Activity activity;
	private LocationManager lm;

	public KeywordProvider(Solo solo,Activity activity) {
		this.solo = solo;
		this.activity = activity;
		setUpLocationMockUp();
	}	
	
	protected final Solo solo(){
		return solo;
	}
	
	protected Activity getActivity() {
		return activity;
	}
		
	private void setUpLocationMockUp(){
		lm = (LocationManager) getActivity().getSystemService(Service.LOCATION_SERVICE);
		lm.addTestProvider(LocationManager.GPS_PROVIDER, false, false, false, false, false, false, false, 0,5);
		lm.setTestProviderEnabled(LocationManager.GPS_PROVIDER, true);
	}
	
	protected void locate(Double latitude,Double longitude,Long time){
		Location l = new Location(LocationManager.GPS_PROVIDER);
		l.setTime(time == null ? System.currentTimeMillis() : time);
		l.setLatitude(latitude);
		l.setLongitude(longitude);
		lm.setTestProviderLocation(LocationManager.GPS_PROVIDER, l);	
	}

}
