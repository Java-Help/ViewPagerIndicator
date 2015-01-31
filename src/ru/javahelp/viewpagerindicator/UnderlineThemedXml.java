package ru.javahelp.viewpagerindicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.UnderlinePageIndicator;

public class UnderlineThemedXml extends Activity{
	ViewPagerAdapter viewPagerAdapter;
	ViewPager viewPager;
	UnderlinePageIndicator underlinePageIndicator;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.underline_themed_xml);

			viewPagerAdapter = new ViewPagerAdapter(this);
		    
			viewPager = (ViewPager)findViewById(R.id.underline_themed_xml_pager);
			viewPager.setAdapter(viewPagerAdapter);

			underlinePageIndicator = (UnderlinePageIndicator)findViewById(R.id.underline_themed_xml_indicator);
			underlinePageIndicator.setViewPager(viewPager);
	}
	
}
