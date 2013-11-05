package org.tud.inf.st.mbt.automation.android.recorderservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RecorderStarter extends BroadcastReceiver {

	@Override
	public void onReceive(Context ctx, Intent i) {
		ctx.startService(new Intent(ctx, RecorderService.class));
	}

}
