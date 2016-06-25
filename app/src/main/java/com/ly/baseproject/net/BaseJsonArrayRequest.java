package com.ly.baseproject.net;

import com.android.volley.AuthFailureError;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;

import java.util.Map;

/**
 * 
 * @ClassName:ISKJsonArrayRequest
 * @Description:重构请求返回JsonArray
 * @Author: zxj
 * @Date:2015年2月28日下午2:13:38
 *
 */
public class BaseJsonArrayRequest extends JsonArrayRequest {

	public BaseJsonArrayRequest(String url, Listener<JSONArray> listener,
			ErrorListener errorListener) {
		super(url, listener, errorListener);
	}

	@Override
	public Map<String, String> getHeaders() throws AuthFailureError {
		return HeadersBase.getHeaders();
	}

}
