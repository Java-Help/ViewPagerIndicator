package ru.javahelp.viewpagerindicator;

import com.viewpagerindicator.CirclePageIndicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class CircleThemedXml extends Activity {
	
	CirclePageIndicator circleIndicator;
	ViewPagerAdapter viewPagerAdapter; 
	ViewPager viewPager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.circle_themed_xml);
		
		
		viewPager = (ViewPager)findViewById(R.id.circle_themed_xml_pager);

		viewPagerAdapter = new ViewPagerAdapter(this);
		viewPager.setAdapter(viewPagerAdapter);

		circleIndicator = (CirclePageIndicator)findViewById(R.id.circle_themed_xml_indicator);
		circleIndicator.setViewPager(viewPager);
		
	}
	
}
