package com.screen.qd;

import com.screen.qd.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	private EditText edt_px2,edt_dp1;
	
	private EditText edt_dp2,edt_px1;
	
	private TextView txttip;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edt_px2=(EditText) findViewById(R.id.edt_px2);
		edt_dp1=(EditText) findViewById(R.id.edt_dp1);
		
		
		edt_dp2=(EditText) findViewById(R.id.edt_dp2);
		edt_px1=(EditText) findViewById(R.id.edt_px1);
		
		txttip =(TextView) findViewById(R.id.txttip);
		txttip.setText("w="+ScreenUtils.getScreenWidth(MainActivity.this)+"px,h="+ScreenUtils.getScreenHeight(MainActivity.this)+"px");
		
		
		edt_px2.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				if(!"".equals(edt_px2.getText().toString().trim())){
					
					float px=Float.valueOf(edt_px2.getText().toString());
				    int dp=ScreenUtils.px2dip(MainActivity.this, px);
					edt_dp2.setText(dp+"dp");
				}
				else{
					edt_dp2.setText("");
				}
				
			}
		});
		
		
		edt_dp1.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				if(!"".equals(edt_dp1.getText().toString().trim())){
					
					float dp=Float.valueOf(edt_dp1.getText().toString());
					
				    int px=ScreenUtils.dip2px(MainActivity.this, dp);
				    edt_px1.setText(px+"px");
				}
				else{
					edt_px1.setText("");
				}
				
			}
		});
	
		
	}
}
