package com.ly.baseproject.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @name Json数据包解析类
 * @created 2014年9月24日 14:57:04
 * @author luoyi
 */

public class JsonResolve {

	private static JsonResolve instance;
	private Gson gson;

	private JsonResolve() {

		gson =  new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	}

	public static JsonResolve instance() {
		if (instance == null) {
			instance = new JsonResolve();
		}
		return instance;
	}

	public Gson getGson() {
		return gson;
	}

	
}
