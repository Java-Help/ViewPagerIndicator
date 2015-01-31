package ru.javahelp.viewpagerindicator;

import com.viewpagerindicator.LinePageIndicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class LinesThemedJava extends Activity {

	ViewPagerAdapter viewPagerAdapter;
	ViewPager viewPager;
	LinePageIndicator linePageIndicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lines_themed_java);

		viewPagerAdapter = new ViewPagerAdapter(this);

		viewPager = (ViewPager) findViewById(R.id.lines_themed_java_pager);
		viewPager.setAdapter(viewPagerAdapter);

		linePageIndicator = (LinePageIndicator) findViewById(R.id.lines_themed_java_indicator);
		linePageIndicator.setViewPager(viewPager);

		
		 final float density = getResources().getDisplayMetrics().density;
		 linePageIndicator.setSelectedColor(0x88FF0000);
		 linePageIndicator.setUnselectedColor(0xFF888888);
		 linePageIndicator.setStrokeWidth(4 * density);
		 linePageIndicator.setLineWidth(30 * density);
	}
}
	