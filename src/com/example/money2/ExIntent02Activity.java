package com.example.money2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.money2.R;
//i am james
public class ExIntent02Activity extends Activity {

//123
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex_intent02);
		
       
        Button btnPage2=(Button)findViewById(R.id.btnPage2);  
        Button btnPage3=(Button)findViewById(R.id.btnPage3);  
        
        btnPage2.setOnClickListener(btnPage2Listner);
        btnPage3.setOnClickListener(btnPage3Listner);
        
    }
    
    private Button.OnClickListener btnPage2Listner=new Button.OnClickListener(){
    	public void onClick(View v){
    		Intent intent=new Intent();
    		intent.setClass(ExIntent02Activity.this,Second2.class);
    		startActivity(intent);
    	}
    };
    
    private Button.OnClickListener btnPage3Listner=new Button.OnClickListener(){
    	public void onClick(View v){
    		Intent intent=new Intent();
    		intent.setClass(ExIntent02Activity.this,MainActivity.class);
    		startActivity(intent);
    	}
    };
    
}