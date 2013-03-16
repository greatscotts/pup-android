package com.app.pup;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

import com.google.analytics.tracking.android.EasyTracker;
import com.portal.R;

 
public class Technology extends Activity {
    private WebView webView;
    WebView ourBrow;
    @Override
    public void onStart() {
      super.onStart();
      EasyTracker.getInstance().setContext(this);
      EasyTracker.getInstance().activityStart(this); // Add this method.
    }
 

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
	    if ((keyCode == KeyEvent.KEYCODE_BACK))
	    {
	    	Intent openLogon = new Intent("com.app.pup.TEST");
			startActivity(openLogon);
			finish();
	    }
	    return super.onKeyDown(keyCode, event);
	}
 
    @SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
 
        setContentView(R.layout.news);
    
        
    	
	    Button q = (Button) findViewById(R.id.button2);
	     q.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Technology.this,Info.class);
	        startActivity(i);
	        finish();
	        } 
	     });
	     
	     Button b = (Button) findViewById(R.id.button3);
	     b.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Technology.this,Misc.class);
	        startActivity(i);
	        finish();
	        } 
	     });
	     
	     Button g = (Button) findViewById(R.id.button4);
	     g.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Technology.this,Social.class);
	        startActivity(i);
	        finish();
	        } 
	     });
	     
	     Button z = (Button) findViewById(R.id.button5);
	     z.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Technology.this,Logon.class);
	        startActivity(i);
	        finish();
	        } 
	     });
	     
	   
	 
 
        webView = (WebView) findViewById(R.id.webView1);
       
        WebView webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setGeolocationEnabled(true);
		webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);
        
		webView.getSettings().setJavaScriptEnabled(true);
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.setWebViewClient(new WebViewClient());
        
		ourBrow = (WebView) findViewById(R.id.webView1);
		ourBrow.loadUrl("http://pupportaltech.wirenode.mobi");
        webView.setWebViewClient(new WebViewClient() {
        	
 
  
            @Override
            public void onReceivedError(WebView view, int errorCode,
                    String description, String failingUrl) {
                // TODO Auto-generated method stub
                super.onReceivedError(view, errorCode, description, failingUrl);
                loadError();
            }
        });
 
        webView.loadUrl("http://pupportaltech.wirenode.mobi");
    }
    
    
 
    @SuppressLint("NewApi")
  	private void loadError() {
    	 Intent intent = new Intent("com.app.pup.NEWS2");
    	    intent.setComponent(ComponentName.unflattenFromString("com.app.pup"));
    	    intent.addCategory("android.intent.category.DEFAULT");
    	    startActivity(intent);
    	    finish();
   
    
    }
    @Override
    public void onStop() {
      super.onStop();
     
      EasyTracker.getInstance().activityStop(this); // Add this method.
    }
        


public boolean isNetworkAvailable() {
ConnectivityManager cm = (ConnectivityManager)
getSystemService(Context.CONNECTIVITY_SERVICE);
NetworkInfo networkInfo = cm.getActiveNetworkInfo();
// if no network is available networkInfo will be null
// otherwise check if we are connected
if (networkInfo != null && networkInfo.isConnected()) {
    return true;
}
return false;
}
}



	
   	