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
import com.portal.R;

 
public class News2 extends Activity {
    private WebView webView;
    WebView ourBrow;
    

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
	    if ((keyCode == KeyEvent.KEYCODE_BACK))
	    {
	    	Intent openLogon = new Intent("com.app.pup.LOGON");
			startActivity(openLogon);
			finish();
	    }
	    return super.onKeyDown(keyCode, event);
	}
 
    @SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.news2);
    
       
        	

    	    Button q = (Button) findViewById(R.id.button2);
    	     q.setOnClickListener(new View.OnClickListener() {
    	        public void onClick(View arg0) {
    	        Intent i = new Intent(News2.this,Info.class);
    	        startActivity(i);
    	        finish();
    	        } 
    	     });
    	     
    	     Button b = (Button) findViewById(R.id.button3);
    	     b.setOnClickListener(new View.OnClickListener() {
    	        public void onClick(View arg0) {
    	        Intent i = new Intent(News2.this,Misc.class);
    	        startActivity(i);
    	        finish();
    	        } 
    	     });
    	     
    	     Button g = (Button) findViewById(R.id.button4);
    	     g.setOnClickListener(new View.OnClickListener() {
    	        public void onClick(View arg0) {
    	        Intent i = new Intent(News2.this,Social.class);
    	        startActivity(i);
    	        finish();
    	        } 
    	     });
    	     
    	     
    	     
    	     Button z = (Button) findViewById(R.id.button5);
    	     z.setOnClickListener(new View.OnClickListener() {
    	        public void onClick(View arg0) {
    	        Intent i = new Intent(News2.this,Logon.class);
    	        startActivity(i);
    	        finish();
    	        } 
    	     });
        }
}
        	
 
  
       



	
   