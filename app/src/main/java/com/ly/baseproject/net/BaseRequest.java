package com.ly.baseproject.net;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.RetryPolicy;

import java.util.Map;

/**
 * 
 * @ClassName:ISKBaseRequest
 * @Description:自定义请求
 * @Author: zxj
 * @Date:2015年4月1日下午1:44:24
 *
 */
public class BaseRequest<T> extends Request<T> {

	public BaseRequest(int method, String url, ErrorListener listener) {
		super(method, url, listener);
	}

	@Override
	protected Response<T> parseNetworkResponse(NetworkResponse response) {
		return null;
	}

	@Override
	protected void deliverResponse(T response) {

	}

	@Override
	public Map<String, String> getHeaders() throws AuthFailureError {
		return HeadersBase.getHeaders();
	}

	@Override
	public RetryPolicy getRetryPolicy() {
		RetryPolicy retryPolicy = new DefaultRetryPolicy(20*2000,1,1.0f);
		return retryPolicy;
	}

	@Override
	public void setRetryPolicy(RetryPolicy retryPolicy) {
		retryPolicy = new DefaultRetryPolicy(20*2000,1,1.0f);
		super.setRetryPolicy(retryPolicy);
	}
}