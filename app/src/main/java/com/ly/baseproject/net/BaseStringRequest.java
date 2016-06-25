package com.ly.baseproject.net;

import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.RetryPolicy;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName:ISKStringRequest
 * @Description:重构返回String请求
 * @Author: ly
 * @Date:2015年2月28日下午2:16:37
 */
public class BaseStringRequest extends StringRequest {

    public BaseStringRequest(int method, String url, Listener<String> listener,
                             ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }

    public BaseStringRequest(String url, Listener<String> listener,
                             ErrorListener errorListener) {
        super(url, listener, errorListener);
    }

    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
        String mHeader;
        String cookieFromResponse = "";
        mHeader = response.headers.toString();
        Pattern pattern = Pattern.compile("Set-Cookie.*?;");
        Matcher m = pattern.matcher(mHeader);
         if (m.find()) {
            cookieFromResponse = m.group();
            //去掉cookie末尾的分号
             cookieFromResponse = cookieFromResponse.substring(11, cookieFromResponse.length() - 1);
//            BaseApplication.getInstance().saveCookie(cookieFromResponse);
            Log.w("LOG", "cookie from server " + cookieFromResponse);
        }

        Log.w("LOG", "cookie substring " + cookieFromResponse);

        return super.parseNetworkResponse(response);
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> header = new HashMap<String, String>();
//        if (BaseApplication.getInstance().isLogin()) {
//            header.put("Token", BaseApplication.getInstance().getToken());
//        }
//        String cookie = BaseApplication.getInstance().getCookie();
//        if (!StringUtils.isEmpty(cookie)) {
//            header.put("Cookie", cookie);
//        }

        return header;
    }

    @Override
    public RetryPolicy getRetryPolicy() {
        // TODO Auto-generated method stub
        RetryPolicy retryPolicy = new DefaultRetryPolicy(20 * 1000, 1, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        return retryPolicy;
    }
}
