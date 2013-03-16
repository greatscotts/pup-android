package com.app.pup;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.NetworkInfo;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.portal.R;

public class ConnectivityManager extends PhoneStateListener{

Activity activity;
public ConnectivityManager(Activity a){
    TelephonyManager telephonyManager = (TelephonyManager)a.getSystemService(Context.TELEPHONY_SERVICE);
    telephonyManager.listen(this, PhoneStateListener.LISTEN_DATA_CONNECTION_STATE);
    activity = a;
}

@Override
public void onDataConnectionStateChanged(int state) {
    super.onDataConnectionStateChanged(state);
    switch (state) {
    case TelephonyManager.DATA_DISCONNECTED:
        new AlertDialog.Builder(activity).
        setCancelable(false).
        setTitle("Connection Manager").
        setMessage("There is no network connection. Please connect to internet and start again.").
        setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                System.exit(0);
            }
        }).create();
        break;

    case TelephonyManager.DATA_CONNECTED:
        break;
    }
}

public NetworkInfo getActiveNetworkInfo() {
	// TODO Auto-generated method stub
	return null;
}
}
