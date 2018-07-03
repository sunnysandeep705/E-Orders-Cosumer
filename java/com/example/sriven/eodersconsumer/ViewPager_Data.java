package com.example.sriven.eodersconsumer;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sriven on 6/30/2018.
 */

public class ViewPager_Data {
	String images;
	public ViewPager_Data(String images){
		this.images=images;
	}
	public ViewPager_Data(JSONObject jsonObject){
		try {
			this.images = jsonObject.getString("images");
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}
}
