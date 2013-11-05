package org.tud.inf.st.mbt.automation.android.recorderservice;

import android.app.Instrumentation;
import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.IBinder;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecorderService extends Service implements OnTouchListener, OnLongClickListener {

	public static final String TAG = "Recorder";
	private static final int resolution = 20;

	private WindowManager windowManager;
	private android.view.WindowManager.LayoutParams params;
	private Instrumentation instr;
	private Point displaySize;

	@Override
	public void onCreate() {
		super.onCreate();

		windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
		windowManager.getDefaultDisplay().getSize(displaySize = new Point());

		for (int x = 0; x < displaySize.x; x += resolution * 2)
			for (int y = 0; y < displaySize.y; y += resolution * 2) {
				TextView l = new TextView(this);
				l.setBackgroundColor(Color.RED);
				//LinearLayout l = new LinearLayout(this);
				l.setLayoutParams(new LayoutParams(x, y));
				l.setOnTouchListener(this);
				l.setOnLongClickListener(this);

				params = new WindowManager.LayoutParams(resolution, resolution,
						x, y, WindowManager.LayoutParams.TYPE_PHONE,
						WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
						PixelFormat.TRANSLUCENT);

				windowManager.addView(l, params);
			}

		instr = new Instrumentation();

		Log.d(TAG, "onCreate done");
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public boolean onTouch(View v, final MotionEvent event) {
		Log.v(TAG, "onTouch");

		new AsyncTask<Void, Void, Void>() {

			@Override
			protected Void doInBackground(Void... params) {
				Log.d(TAG, "in background");
				
				Log.d(TAG, "real event on "+event.getX()+" "+event.getY());
				
				MotionEvent copy = MotionEvent.obtain(event);
				copy.setLocation(copy.getX()+resolution, copy.getY()+20);
				
				instr.sendPointerSync(copy);
				return null;
			}


		}.execute();

		return true;
	}

	@Override
	public boolean onLongClick(View arg0) {
		Log.d(TAG, "exiting");
		System.exit(0);
		return true;
	}

}
