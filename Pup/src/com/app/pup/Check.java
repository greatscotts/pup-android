package com.app.pup;

import com.google.analytics.tracking.android.EasyTracker;
import com.portal.R;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class Check extends Activity {
	   private WebView webView;
	    WebView ourBrow;
	    
	    
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
       
        setContentView(R.layout.check);
        
        TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabSpec spec1=tabHost.newTabSpec("Profile");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("News",getResources().getDrawable(R.drawable.ac));
       
     
        TabSpec spec2=tabHost.newTabSpec("Profile");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("Profile",getResources().getDrawable(R.drawable.ad));
       
        TabSpec spec3=tabHost.newTabSpec("Social");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("",getResources().getDrawable(R.drawable.ar));
        
        TabSpec spec4=tabHost.newTabSpec("Social");
        spec4.setContent(R.id.tab4);
        spec4.setIndicator("Social",getResources().getDrawable(R.drawable.ab));
        
        TabSpec spec5=tabHost.newTabSpec("Social");
        spec5.setContent(R.id.tab5);
        spec5.setIndicator("Misc",getResources().getDrawable(R.drawable.ae));
       
      
       
      
        tabHost.addTab(spec1);
        
        tabHost.addTab(spec2);
      
        
        tabHost.addTab(spec3);
        tabHost.addTab(spec4);
        tabHost.addTab(spec5);
        
        
        
        
    }
    
    @Override
    public void onStop() {
      super.onStop();
     
      EasyTracker.getInstance().activityStop(this); // Add this method.
    }
        
        
}