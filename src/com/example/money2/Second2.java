package com.example.money2;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;



public class Second2 extends Activity {
	EditText date2;
	EditText dollar2;
	EditText detail2;
    Button cancel;
	Button clear;
	Button enter;
	

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_activity2);
        
        clear=(Button)findViewById(R.id.clear);
        enter=(Button)findViewById(R.id.enter);
        cancel=(Button)findViewById(R.id.cancel);
        date2=(EditText)findViewById(R.id.date2);
        dollar2=(EditText)findViewById(R.id.dollar2);
        detail2=(EditText)findViewById(R.id.detail2);

        Intent intent = this.getIntent();


        clear.setOnClickListener( new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				date2.setText("");
				dollar2.setText("");
				detail2.setText("");
			}
			
        });

        enter.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText EditTextDate2 = (EditText)findViewById(R.id.date2);
                Editable Strdate2;
                Strdate2 = EditTextDate2.getText();
                String date2 = Strdate2.toString();

                EditText EditTextDollar2 = (EditText)findViewById(R.id.dollar2);
                Editable Strdollar2;
                Strdollar2 = EditTextDollar2.getText();
                String dollar2 = Strdollar2.toString();

                EditText EditTextTime = (EditText)findViewById(R.id.detail2);
                Editable Strdetail2;
                Strdetail2 = EditTextTime.getText();
                String detail2 = Strdetail2.toString();

                Intent intent = new Intent();
                intent.setClass(Second2.this, item.class);

                Bundle bundle = new Bundle();
                bundle.putString("date2", date2);
                bundle.putString("dollar2", dollar2);
                bundle.putString("detail2", detail2);
                intent.putExtras(bundle);
                startActivity(intent);
            }

        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private Button.OnClickListener clearListener=new Button.OnClickListener(){
        public void onClick(View v){
            //Intent intent=new Intent();
            //intent.setClass(Second2.this,Second2_1.class);
            //startActivity(intent);


        }
    };
    
    
}