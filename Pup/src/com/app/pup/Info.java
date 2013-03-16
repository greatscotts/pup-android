package com.app.pup;

import android.app.Activity;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.analytics.tracking.android.EasyTracker;
import com.portal.R;

public class Info extends Activity {

	 private ListView lv1;
	 
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
	 @Override
	    public void onStart() {
	      super.onStart();
	      EasyTracker.getInstance().setContext(this);
	      EasyTracker.getInstance().activityStart(this); // Add this method.
	    }
	 

	 private String lv_arr[]={"About Us","About PUP MOBILE PORTAL","Website","Contact us"};
	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.info);
	        
	       
       	


	        lv1=(ListView)findViewById(R.id.listView1);

	        // By using setAdpater method in listview we an add string array in list.

	        lv1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , lv_arr));


	        lv1.setOnItemClickListener(new OnItemClickListener() {
	            public void onItemClick(AdapterView<?> parent, View view,
	                int position, long id) {
	                final TextView mTextView = (TextView)view;
	                switch (position) {
	                  case 0:
	                   Intent newActivity0 = new Intent(Info.this,About.class);     
	                   startActivity(newActivity0);
	                   finish();
	                  break;
	                  case 1:
	                   Intent newActivity1 = new Intent(Info.this,Portal.class);     
	                   startActivity(newActivity1);
	                   finish();
	                  break;
	                  
	                  case 2:
	                	  String url = "http://pupmobileportal.weebly.com/";
	                	  Intent i = new Intent(Intent.ACTION_VIEW);
	                	  i.setData(Uri.parse(url));
	                	  startActivity(i);
		                  
		                  break;
		                  
	                  case 3:
		                   Intent newActivity111 = new Intent(Info.this,Contact.class);     
		                   startActivity(newActivity111);
		                   finish();
		                  break;
	                  
	                
	                 
	                }

	            }
	          });

	       
	   	  Button c= (Button) findViewById(R.id.button1);
	   	     c.setOnClickListener(new View.OnClickListener() {
	   	        public void onClick(View arg0) {
	   	        Intent i = new Intent(Info.this,Test.class);
	   	        startActivity(i);
	   	        finish();
	   	        } 
	   	     });
	   	     
	   	     Button b = (Button) findViewById(R.id.button3);
	   	     b.setOnClickListener(new View.OnClickListener() {
	   	        public void onClick(View arg0) {
	   	        Intent i = new Intent(Info.this,Misc.class);
	   	        startActivity(i);
	   	        finish();
	   	        } 
	   	     });
	   	     
	   	     Button g = (Button) findViewById(R.id.button4);
	   	     g.setOnClickListener(new View.OnClickListener() {
	   	        public void onClick(View arg0) {
	   	        Intent i = new Intent(Info.this,Social.class);
	   	        startActivity(i);
	   	        finish();
	   	        } 
	   	     });
	   	     
	   	     
	   	     
	   	     Button z = (Button) findViewById(R.id.button5);
	   	     z.setOnClickListener(new View.OnClickListener() {
	   	        public void onClick(View arg0) {
	   	        Intent i = new Intent(Info.this,Logon.class);
	   	        startActivity(i);
	   	        finish();
	   	        } 
	   	     });
		    }

	    @Override
	    public void onStop() {
	      super.onStop();
	     
	      EasyTracker.getInstance().activityStop(this); // Add this method.
	    }
	        
	        
	          }

	
	
	


