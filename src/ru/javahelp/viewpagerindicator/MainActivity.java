package ru.javahelp.viewpagerindicator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button maBtnCircleDefault,
    maBtnCircleStyledXml,
    maBtnCircleStyledProgrammatically,
    maBtnLinesDefault,
    maBtnLinesStyledXml,
    maBtnLinesStyledProgrammatically,
    maBtnUnderineDefault,
    maBtnUnderineStyledXml,
    maBtnUnderineStyledProgrammatically;
	
	
	Intent intent;
	Context context = this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		maBtnCircleDefault = (Button) findViewById(R.id.maBtnCircleDefault);
		maBtnCircleStyledXml = (Button) findViewById(R.id.maBtnCircleStyledXml);
		maBtnCircleStyledProgrammatically = (Button) findViewById(R.id.maBtnCircleStyledProgrammatically);
	
		maBtnLinesDefault = (Button) findViewById(R.id.maBtnLinesDefault);
		maBtnLinesStyledXml = (Button) findViewById(R.id.maBtnLinesStyledXml);
		maBtnLinesStyledProgrammatically = (Button) findViewById(R.id.maBtnLinesStyledProgrammatically);
	
		maBtnUnderineDefault = (Button) findViewById(R.id.maBtnUnderineDefault);
		maBtnUnderineStyledXml = (Button) findViewById(R.id.maBtnUnderineStyledXml);
		maBtnUnderineStyledProgrammatically = (Button) findViewById(R.id.maBtnUnderineStyledProgrammatically);
	
		
		maBtnCircleDefault.setOnClickListener(onClick);
		maBtnCircleStyledXml.setOnClickListener(onClick);
		maBtnCircleStyledProgrammatically.setOnClickListener(onClick);
		maBtnLinesDefault.setOnClickListener(onClick);
		maBtnLinesStyledXml.setOnClickListener(onClick);
		maBtnLinesStyledProgrammatically.setOnClickListener(onClick);
		maBtnUnderineDefault.setOnClickListener(onClick);
		maBtnUnderineStyledXml.setOnClickListener(onClick);
		maBtnUnderineStyledProgrammatically.setOnClickListener(onClick);
	}
	
	
	OnClickListener onClick  = new OnClickListener(){

		@Override
		public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.maBtnCircleDefault:
			intent  = new Intent(context, CircleDefault.class);
			startActivity(intent);
			
		break;
		
		case R.id.maBtnCircleStyledXml:
			intent  = new Intent(context, CircleThemedXml.class);
			startActivity(intent);
		break;
			
		case R.id.maBtnCircleStyledProgrammatically:
			intent  = new Intent(context, CircleThemedJava.class);
			startActivity(intent);
		break;

		case R.id.maBtnLinesDefault:
			intent  = new Intent(context, LinesDefault.class);
			startActivity(intent);
			
		break;
		
		case R.id.maBtnLinesStyledXml:
			intent  = new Intent(context, LinesThemedXml.class);
			startActivity(intent);
		break;
			
		case R.id.maBtnLinesStyledProgrammatically:
			intent  = new Intent(context, LinesThemedJava.class);
			startActivity(intent);
		break;
		
		case R.id.maBtnUnderineDefault:
			intent  = new Intent(context, UnderlineDefault.class);
			startActivity(intent);
			
		break;
		
		case R.id.maBtnUnderineStyledXml:
			intent  = new Intent(context, UnderlineThemedXml.class);
			startActivity(intent);
		break;
			
		case R.id.maBtnUnderineStyledProgrammatically:
			intent  = new Intent(context, UnderlineThemedJava.class);
			startActivity(intent);
		break;
		}
			
		}


		
	};
	
}
