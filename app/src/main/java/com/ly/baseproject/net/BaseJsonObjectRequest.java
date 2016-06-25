package com.ly.baseproject.net;

import com.android.volley.AuthFailureError;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.Map;

/**
 * 
 * @ClassName:ISKJsonObjectRequest
 * @Description:重构返回JsonObject请求
 * @Author: zxj
 * @Date:2015年2月28日下午2:15:29
 *
 */
public class BaseJsonObjectRequest extends JsonObjectRequest {
	
	public BaseJsonObjectRequest(int method, String url, JSONObject jsonRequest,
			Listener<JSONObject> listener, ErrorListener errorListener) {
		super(method, url, jsonRequest, listener, errorListener);
	}

	public BaseJsonObjectRequest(String url, JSONObject jsonRequest,
			Listener<JSONObject> listener, ErrorListener errorListener) {
		super(url, jsonRequest, listener, errorListener);
	}

	@Override
	public Map<String, String> getHeaders() throws AuthFailureError {
		return HeadersBase.getHeaders();
	}
}
