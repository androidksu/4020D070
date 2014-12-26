package com.example.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	EditText editText1, editText2;
	Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        Button button1 = ( Button ) findViewById(R.id.button1);
        //123132131
    }

    public void Calc (View view ) {
    
    	double height = Double.parseDouble(editText1.getText().toString()) / 100;
    	double weight = Double.parseDouble(editText2.getText().toString());
    	double BMI = weight / (height*height);
    	
    	TextView textView1 = (TextView) findViewById(R.id.textView1);
    	textView1.setText(String.valueOf(BMI));
    }
}
