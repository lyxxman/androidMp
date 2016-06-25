package com.ly.baseproject.net;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

import com.android.volley.AuthFailureError;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.ImageRequest;

import java.util.Map;

/**
 * 
 * @ClassName:ISKImageRequest
 * @Description:重构图片请求
 * @Author: zxj
 * @Date:2015年2月28日下午2:12:20
 *
 */
public class BaseImageRequest extends ImageRequest {

	public BaseImageRequest(String url, Listener<Bitmap> listener, int maxWidth,
			int maxHeight, Config decodeConfig, ErrorListener errorListener) {
		super(url, listener, maxWidth, maxHeight, decodeConfig, errorListener);
	}

	@Override
	public Map<String, String> getHeaders() throws AuthFailureError {
		return HeadersBase.getHeaders();
	}
}
