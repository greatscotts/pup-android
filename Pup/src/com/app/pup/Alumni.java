package com.app.pup;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.analytics.tracking.android.EasyTracker;
import com.portal.R;
 
public class Alumni extends Activity {
    private WebView webView;
    WebView ourBrow;
    @Override
    public void onStart() {
      super.onStart();
      EasyTracker.getInstance().setContext(this);
      EasyTracker.getInstance().activityStart(this); // Add this method.
    }
 

    @SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
 
        setContentView(R.layout.alumni);
 
        webView = (WebView) findViewById(R.id.webView1);
       
        WebView webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setGeolocationEnabled(true);
		webView.getSettings().setJavaScriptEnabled(true);
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.setWebViewClient(new WebViewClient());
        
		ourBrow = (WebView) findViewById(R.id.webView1);
		ourBrow.loadUrl("http://www.pup.edu.ph/Alumni/");
        webView.setWebViewClient(new WebViewClient() {
 
            /*
             * (non-Javadoc)
             *
             * @see
             * android.webkit.WebViewClient#onReceivedError(android.webkit.WebView
             * , int, java.lang.String, java.lang.String)
             */
            @Override
            public void onReceivedError(WebView view, int errorCode,
                    String description, String failingUrl) {
                // TODO Auto-generated method stub
                super.onReceivedError(view, errorCode, description, failingUrl);
                loadError();
            }
        });
 
        webView.loadUrl("http://www.pup.edu.ph/Alumni/");
    }
 
    @SuppressLint("NewApi")
	private void loadError() {
    	  setContentView(R.layout.alumni2);
       
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