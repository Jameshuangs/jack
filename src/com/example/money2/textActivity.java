package com.example.money2;


import com.example.money2.R;

import android.app.Activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class textActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.text);
	    
	    Bundle bundle01 = this.getIntent().getExtras();
	    String Class = bundle01.getString("Class");
	    String Place = bundle01.getString("Place");
	    String Time = bundle01.getString("Time");
	    String Other = bundle01.getString("Other");
	    TextView tv1 = (TextView)findViewById(R.id.textView1);
	    TextView tv2 = (TextView)findViewById(R.id.textView2);
	    TextView tv3 = (TextView)findViewById(R.id.textView3);
	    TextView tv4 = (TextView)findViewById(R.id.textView4);
	    tv1.setText("�ҵ{�G"+Class);
	    tv2.setText("�a�I�G"+Place);
	    tv3.setText("�ɶ��G"+Time);
	    tv4.setText("�Ƶ�:"+Other);
	}
	
}
