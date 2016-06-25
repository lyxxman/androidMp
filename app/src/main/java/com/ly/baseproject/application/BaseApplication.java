package com.ly.baseproject.application;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created date on 2016/4/19 0019.
 * describe : app程序
 * author : ly
 * email : 839482621@qq.com
 */
public class BaseApplication extends Application {

    public final static String TAG = "com.blueteam.castwineparty.application";

    private RequestQueue mRequestQueue;
    private static BaseApplication sIntance;
    @Override
    public void onCreate() {
        super.onCreate();
        sIntance = this;
    }
    /**
     * 获得application单例
     *
     * @return
     */
    public static synchronized BaseApplication getInstance() {
        return sIntance;
    }

    /**
     * 获取请求队列
     *
     * @return
     */
    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }

    /**
     * 添加请求到队
     *
     * @param req
     * @param tag
     */
    public <T> void addToRequestQueue(Request<T> req, String tag) {
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }

    /**
     * 以默认的tag方式添加到队
     *
     * @param req
     */
    public <T> void addToRequestQueue(Request<T> req) {
        req.setTag(TAG);
        getRequestQueue().add(req);
    }

    /**
     * 取消请求
     *
     * @param tag
     */
    public void cancelPendingRequests(String tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }

}
