package org.tud.inf.st.mbt.automation.android.recorderservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RecorderActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.startService(new Intent(this, RecorderService.class));
	}
}
