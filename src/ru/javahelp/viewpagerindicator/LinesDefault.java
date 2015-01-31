package ru.javahelp.viewpagerindicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.LinePageIndicator;

public class LinesDefault extends Activity {
	
	ViewPagerAdapter viewPagerAdapter;
	ViewPager viewPager;
	LinePageIndicator linePageIndicator;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lines_default);

		viewPagerAdapter = new ViewPagerAdapter(this);

		viewPager = (ViewPager)findViewById(R.id.lines_default_pager);
		viewPager.setAdapter(viewPagerAdapter);

		linePageIndicator = (LinePageIndicator)findViewById(R.id.lines_default_indicator);
		linePageIndicator.setViewPager(viewPager);
        
	}
	
}
