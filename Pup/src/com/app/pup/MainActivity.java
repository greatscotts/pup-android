package com.app.pup;

import android.app.Activity;
import android.content.Intent;


import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.analytics.tracking.android.EasyTracker;
import com.portal.R;

public class MainActivity extends Activity{
	  @Override
	    public void onStart() {
	      super.onStart();
	      EasyTracker.getInstance().setContext(this);
	      EasyTracker.getInstance().activityStart(this); // Add this method.
	    }
	 
	
	@Override
	protected void onCreate(Bundle gianjavelona) {
		// TODO Auto-generated method stub
		super.onCreate(gianjavelona);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
	    
		setContentView(R.layout.activity_main);
		
		Thread timer = new Thread(){
		public void run(){
			try{
				sleep(3000);
				
			} catch (InterruptedException e){
				e.printStackTrace();
			} finally{
				Intent openLogon = new Intent("com.app.pup.LOGON");
				startActivity(openLogon);
			}
		}
		};
		timer.start();
	}
	@Override
    public void onStop() {
      super.onStop();
     
      EasyTracker.getInstance().activityStop(this); // Add this method.
    }
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		finish();
	}
	

}
	
		
	