package ru.javahelp.viewpagerindicator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

import com.viewpagerindicator.CirclePageIndicator;

public class CircleDefault extends Activity {
	
	CheckBox chbDefaultCircleIndicatorSnap;
	
	CirclePageIndicator circleIndicator;
	ViewPagerAdapter viewPagerAdapter;
	ViewPager viewPager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.circle_default);
		
		chbDefaultCircleIndicatorSnap = (CheckBox) findViewById(R.id.chbDefaultCircleIndicatorSnap);
		chbDefaultCircleIndicatorSnap.setOnCheckedChangeListener(onCheckedChange);
				
		viewPager = (ViewPager)findViewById(R.id.circle_default_pager);

		viewPagerAdapter = new ViewPagerAdapter(this);
		viewPager.setAdapter(viewPagerAdapter);

		circleIndicator = (CirclePageIndicator)findViewById(R.id.circle_default_indicator);
		circleIndicator.setViewPager(viewPager);
		
	}
	
	OnCheckedChangeListener onCheckedChange = new OnCheckedChangeListener(){

		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
			circleIndicator.setSnap(arg1);
		}
		
	};
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.add_page:
            	viewPagerAdapter.setCount(viewPagerAdapter.getCount()+1);
            	viewPagerAdapter.notifyDataSetChanged();
            	circleIndicator.notifyDataSetChanged();
            return true;
            
            case R.id.remove_page:
            	viewPagerAdapter.setCount(viewPagerAdapter.getCount()-1);
            	viewPagerAdapter.notifyDataSetChanged();
            	circleIndicator.notifyDataSetChanged();
            return true;
            
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
