package com.app.pup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;

import com.google.analytics.tracking.android.EasyTracker;
import com.portal.R;

public class Portal extends Activity  {

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
	    if ((keyCode == KeyEvent.KEYCODE_BACK))
	    {
	    	Intent openLast = new Intent("com.app.pup.INFO");
			startActivity(openLast);
			finish();
	    }
	    return super.onKeyDown(keyCode, event);
	}
	@Override
    public void onStart() {
      super.onStart();
      EasyTracker.getInstance().setContext(this);
      EasyTracker.getInstance().activityStart(this); // Add this method.
    }
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.portal);
		
	}
	@Override
    public void onStop() {
      super.onStop();
     
      EasyTracker.getInstance().activityStop(this); // Add this method.
    }
}