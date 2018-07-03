package com.example.sriven.eodersconsumer;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by sriven on 6/30/2018.
 */

public class SlidingPageAdapter extends PagerAdapter {
	ArrayList<ViewPager_Data> images;
	Context context;

	public SlidingPageAdapter(Context context,ArrayList<ViewPager_Data> images){
		this.context=context;
		this.images=images;
	}
	@Override
	public int getCount(){
		return images.size();
	}
	@Override
	public boolean isViewFromObject(View view , Object object){
		return view == object;
	}
	@Override
	public Object instantiateItem(ViewGroup viewGroup , int position){
		LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = layoutInflater.inflate(R.layout.viewpager_image,viewGroup,false);

		ImageView imageView = (ImageView)view.findViewById(R.id.viewpager_image);
		Picasso.get().load(images.get(position).images).into(imageView);

		ViewPager viewPager = (ViewPager) viewGroup;
		viewPager.addView(view,0);
		return view;
	}
	@Override
	public void destroyItem(ViewGroup viewGroup , int postion ,Object object){
		ViewPager viewPager = (ViewPager)viewGroup;
		View view = (View)object;
		viewPager.removeView(view);
	}
	/*@Override
	public int getCount(){
		return images.size();
	}
	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == object;
	}
	@Override
	*/
}
