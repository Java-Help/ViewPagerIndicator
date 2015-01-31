package ru.javahelp.viewpagerindicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.CirclePageIndicator;

public class CircleThemedJava extends Activity {

	CirclePageIndicator circleIndicator;
	ViewPagerAdapter viewPagerAdapter; 
	ViewPager viewPager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.circle_themed_java);

		viewPager = (ViewPager)findViewById(R.id.circle_themed_java_pager);

		viewPagerAdapter = new ViewPagerAdapter(this);
		viewPager.setAdapter(viewPagerAdapter);
		circleIndicator = (CirclePageIndicator)findViewById(R.id.circle_themed_java_indicator);

		circleIndicator.setViewPager(viewPager);
		
		float density = getResources().getDisplayMetrics().density;
		circleIndicator.setBackgroundColor(0xFFCCCCCC);
		circleIndicator.setRadius(10 * density);
		circleIndicator.setPageColor(0x880000FF);
		circleIndicator.setFillColor(0xFF888888);
		circleIndicator.setStrokeColor(0xFF000000);
		circleIndicator.setStrokeWidth(2 * density);
		

	}

}
