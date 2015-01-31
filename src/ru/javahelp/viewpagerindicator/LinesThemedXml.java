package ru.javahelp.viewpagerindicator;

import com.viewpagerindicator.LinePageIndicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class LinesThemedXml extends Activity {

	ViewPagerAdapter viewPagerAdapter;
	ViewPager viewPager;
	LinePageIndicator linePageIndicator;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lines_themed_xml);

		viewPagerAdapter = new ViewPagerAdapter(this);

		viewPager = (ViewPager)findViewById(R.id.lines_themed_xml_pager);
		viewPager.setAdapter(viewPagerAdapter);

		linePageIndicator = (LinePageIndicator)findViewById(R.id.lines_themed_xml_indicator);
		linePageIndicator.setViewPager(viewPager);
        
	}
	
}

