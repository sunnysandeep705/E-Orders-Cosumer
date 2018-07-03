package com.example.sriven.eodersconsumer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by sriven on 7/2/2018.
 */

public class Oder_ViewPager extends FragmentStatePagerAdapter {
	public Oder_ViewPager(FragmentManager fragmentManager){
		super(fragmentManager);
	}
	@Override
	public Fragment getItem(int position){
		if (position==0){
				return new OderDetails_Fragment();
		}
		else{
			return new OderStatus_Fragment();
		}


	}
	@Override
	public int getCount(){
		return 2;
	}
}
