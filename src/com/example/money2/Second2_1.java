package com.example.money2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Second2_1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);

	    Button addbtn=(Button)findViewById(R.id.addbtn);
	    addbtn.setOnClickListener(addbtnListner); 
		
	    String[] data = {
				 "1",
	             "2",
	             "3"};
	        int layoutId = android.R.layout.simple_list_item_1;
	        ArrayAdapter<String> adapter =
	        new ArrayAdapter<String>(this, layoutId, data);
	        ListView listView1 = (ListView) findViewById(R.id.listView1);
	        listView1.setAdapter(adapter);
		}

		Intent intent = this.getIntent();
    
    
    private Button.OnClickListener addbtnListner=new Button.OnClickListener(){
    	public void onClick(View v){
    		Intent intent=new Intent();
    		intent.setClass(Second2_1.this, Second2.class);
    		startActivity(intent);
    		

    	}
    };
}