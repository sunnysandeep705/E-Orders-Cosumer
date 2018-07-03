package com.example.sriven.eodersconsumer;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
LinearLayout details_lt,status_lt;
TextView details_txt,status_txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Toolbar
		Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowTitleEnabled(false);
		getSupportActionBar().setHomeButtonEnabled(false);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		getSupportActionBar().setDisplayShowCustomEnabled(true);
		ActionBar.LayoutParams	layoutParams = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.MATCH_PARENT);
		LayoutInflater inflater = getLayoutInflater();
		View view = inflater.inflate(R.layout.order_toolbar,null);
		getSupportActionBar().setCustomView(view, layoutParams);
		Toolbar parent = (Toolbar)view.getParent();
		parent.setContentInsetsAbsolute(0,0);

		final ViewPager viewPager = (ViewPager)findViewById(R.id.main_viewpager);
		Oder_ViewPager oder_viewPager = new Oder_ViewPager(getSupportFragmentManager());
		viewPager.setAdapter(oder_viewPager);


		details_lt = (LinearLayout)findViewById(R.id.details_tab);
		details_txt = (TextView)findViewById(R.id.details_textview);
		status_lt = (LinearLayout)findViewById(R.id.status_tab);
		status_txt = (TextView)findViewById(R.id.status_textview);
		viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
				if (viewPager.getCurrentItem()==0) {
					details_lt.setBackgroundColor(getResources().getColor(R.color.round_tab_color));
				//	details_lt.setBackground(getDrawable(R.drawable.rounded_cornerstwo));
					details_txt.setTextColor(getResources().getColor(R.color.colorPrimary));
					status_lt.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
					status_txt.setTextColor(getResources().getColor(R.color.round_tab_color));
				}
				else {
					details_lt.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
					details_txt.setTextColor(getResources().getColor(R.color.round_tab_color));
					status_lt.setBackgroundColor(getResources().getColor(R.color.round_tab_color));
					status_txt.setTextColor(getResources().getColor(R.color.colorPrimary));
				}
			}

			@Override
			public void onPageSelected(int position) {

			}

			@Override
			public void onPageScrollStateChanged(int state) {

			}
		});

		details_lt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				viewPager.setCurrentItem(0);
				details_lt.setBackgroundColor(getResources().getColor(R.color.round_tab_color));
				//	details_lt.setBackground(getDrawable(R.drawable.rounded_cornerstwo));
				details_txt.setTextColor(getResources().getColor(R.color.colorPrimary));
				status_lt.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
				status_txt.setTextColor(getResources().getColor(R.color.round_tab_color));
			}
		});
		status_lt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				viewPager.setCurrentItem(1);
				details_lt.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
				details_txt.setTextColor(getResources().getColor(R.color.round_tab_color));
				status_lt.setBackgroundColor(getResources().getColor(R.color.round_tab_color));
				status_txt.setTextColor(getResources().getColor(R.color.colorPrimary));
			}
		});
	}
}
