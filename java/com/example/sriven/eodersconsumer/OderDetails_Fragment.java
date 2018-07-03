package com.example.sriven.eodersconsumer;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by sriven on 7/2/2018.
 */

public class OderDetails_Fragment extends Fragment {
	ArrayList<ViewPager_Data> viewpager_data = new ArrayList<ViewPager_Data>();
	TabLayout indicator_tab;


	public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstance) {
		View view = inflater.inflate(R.layout.order_details, group, false);


		ViewPager viewPager = (ViewPager)view.findViewById(R.id.image_slider);

		viewpager_data.add(new ViewPager_Data("https://res.cloudinary.com/hlkdbdswu/image/upload/v1525129044/Services/icons/Photography.png"));
		viewpager_data.add(new ViewPager_Data("https://d1u18ka6p421dn.cloudfront.net/glasses-images/25666830-front-640x360.jpg"));
		viewpager_data.add(new ViewPager_Data("https://res.cloudinary.com/hlkdbdswu/image/upload/v1525129044/Services/icons/Photography.png"));
		viewpager_data.add(new ViewPager_Data("https://n1.sdlcdn.com/imgs/g/6/v/i91rev-6e974.jpg"));
		viewpager_data.add(new ViewPager_Data("https://res.cloudinary.com/hlkdbdswu/image/upload/v1525129044/Services/icons/Photography.png"));
		viewpager_data.add(new ViewPager_Data("https://d1u18ka6p421dn.cloudfront.net/glasses-images/25666830-front-640x360.jpg"));
		viewpager_data.add(new ViewPager_Data("https://res.cloudinary.com/hlkdbdswu/image/upload/v1525129044/Services/icons/Photography.png"));
		viewpager_data.add(new ViewPager_Data("https://res.cloudinary.com/hlkdbdswu/image/upload/v1525129044/Services/icons/Photography.png"));
		viewpager_data.add(new ViewPager_Data("https://n1.sdlcdn.com/imgs/g/6/v/i91rev-6e974.jpg"));
		viewpager_data.add(new ViewPager_Data("https://res.cloudinary.com/hlkdbdswu/image/upload/v1525129044/Services/icons/Photography.png"));
		viewpager_data.add(new ViewPager_Data("https://res.cloudinary.com/hlkdbdswu/image/upload/v1525129044/Services/icons/Photography.png"));
		SlidingPageAdapter slidingPageAdapter = new SlidingPageAdapter(getContext(), viewpager_data);
		viewPager.setAdapter(slidingPageAdapter);
		indicator_tab = (TabLayout)view.findViewById(R.id.indicator);
		indicator_tab.setupWithViewPager(viewPager, true);
		slidingPageAdapter.notifyDataSetChanged();
		return view;
	}
}
