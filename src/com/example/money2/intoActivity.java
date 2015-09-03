package com.example.money2;

import com.example.money2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class intoActivity extends Activity {
	//123
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.into);
		Intent intent = this.getIntent();
		
		Button bt = (Button)findViewById(R.id.button1);
		bt.setOnClickListener(new Button.OnClickListener(){
			@Override
			 public void onClick(View v){
				 EditText EditTextClass = (EditText)findViewById(R.id.EditText01);
				 Editable StrClass;
				 StrClass = EditTextClass.getText();
				 String Class = StrClass.toString();
				 
				 EditText EditTextPlace = (EditText)findViewById(R.id.EditText02);
				 Editable StrPlace;
				 StrPlace = EditTextPlace.getText();
				 String Place = StrPlace.toString();
				 
				 EditText EditTextTime = (EditText)findViewById(R.id.EditText03);
				 Editable StrTime;
				 StrTime = EditTextTime.getText();
				 String Time = StrTime.toString();
				 
				 EditText EditTextOther = (EditText)findViewById(R.id.EditText04);
				 Editable StrOther;
				 StrOther = EditTextOther.getText();
				 String Other = StrOther.toString();
				 
				 Intent intent = new Intent();
			     intent.setClass(intoActivity.this,textActivity.class);
				 
			     Bundle bundle = new Bundle();
			     bundle.putString("Class", Class);
			     bundle.putString("Place", Place);
			     bundle.putString("Time", Time);
			     bundle.putString("Other", Other);
			     intent.putExtras(bundle);
			     startActivity(intent);
			}
			
		});
	
	}
	
}