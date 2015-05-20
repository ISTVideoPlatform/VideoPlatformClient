package com.ist.vpclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends Activity {
	private static final String TAG = "HomeActivity";
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		Log.d(TAG,"OnCreate method");   
		textView = (TextView) findViewById(R.id.textView1);
		
	}
}
