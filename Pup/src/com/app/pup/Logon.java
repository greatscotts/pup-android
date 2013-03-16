package com.app.pup;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.analytics.tracking.android.EasyTracker;
import com.portal.R;


public class Logon extends Activity {
	
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
		
		setContentView(R.layout.logon);
		
		 Button c = (Button) findViewById(R.id.btnStud);
	     c.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Sisstud.class);
	        startActivity(i);
	        } 
	     });

		 Button d = (Button) findViewById(R.id.btnProf);
	     d.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Faculty.class);
	        startActivity(i);
	        } 
	     });
	     
	     Button e = (Button) findViewById(R.id.btnGuest);
	     e.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Apply.class);
	        startActivity(i);
	        } 
	     });
		
	     Button f = (Button) findViewById(R.id.btnAlum);
	     f.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Alumni.class);
	        startActivity(i);
	        } 
	     });
	     
	     Button g = (Button) findViewById(R.id.button4);
	     g.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Social.class);
	        startActivity(i);
	        finish();
	        } 
	     });
	     
	     Button q = (Button) findViewById(R.id.button2);
	     q.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Info.class);
	        startActivity(i);
	        finish();
	        } 
	     });
	     
	     Button b = (Button) findViewById(R.id.button3);
	     b.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Misc.class);
	        startActivity(i);
	        finish();
	        } 
	     });
	     
	     Button z = (Button) findViewById(R.id.button1);
	     z.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Test.class);
	        startActivity(i);
	        finish();
	        } 
	     });
	     
	     Button n = (Button) findViewById(R.id.button6);
	     n.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        Intent i = new Intent(Logon.this,Stat.class);
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
	  


@Override
public void onBackPressed() {
    new AlertDialog.Builder(this)
        .setIcon(android.R.drawable.ic_dialog_alert)
        .setTitle("Closing Application")
        .setMessage("Are you sure you want exit PUP MOBILE PORTAL?")
        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
        public void onClick(DialogInterface dialog, int which) {
            finish();    
        }

    })
    .setNegativeButton("No", null)
    .show();
}





}









