package com.ly.baseproject.net.request;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.ly.baseproject.R;
import com.ly.baseproject.application.BaseApplication;
import com.ly.baseproject.net.BaseStringRequest;
import com.ly.baseproject.net.JsonResolve;
import com.ly.baseproject.net.ResultPostExecute;
import com.ly.baseproject.net.VolleyErrorHelper;
import com.ly.baseproject.net.response.IndexNewTopResponse;


/**
 * @author ly
 * @version V1.0
 * @Package com.blueteam.ganjiuhui.net.request
 * @Description: 获取首页顶部第一部分数据
 * @date 2016/3/3 13:39
 */
public class GetIndexNewTopV1Request extends
        ResultPostExecute<IndexNewTopResponse> {
    private Context mContext;

    public void request(Context context) {
        mContext = context;
        try {
            BaseStringRequest request = new BaseStringRequest(Request.Method.GET
                    ,
                    "http://192.168.0.111:8077"+"/api/v1"+"/Home/GetTopV2", new Response.Listener<String>() {

                @Override
                public void onResponse(String response) {
                    // TODO Auto-generated method stub
                    parserJson(response);
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    // TODO Auto-generated method stub

                    onErrorExecute(VolleyErrorHelper.getMessage(error,
                            mContext));
                }
            });
            BaseApplication.getInstance().addToRequestQueue(request);
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
            onErrorExecute(mContext.getResources().getString(
                    R.string.load_data_error));
        }
    }

    /**
     * json解析
     *
     * @param json
     */
    private void parserJson(String json) {
        try {
            IndexNewTopResponse response = JsonResolve.instance()
                    .getGson()
                    .fromJson(json,IndexNewTopResponse.class);
            if (response != null) {
                if (response.getStatus() == 200) {
                    onPostExecute(response);
                } else {
                    onErrorExecute(response.getErrorMsg());
                }
            } else {
                onErrorExecute(mContext.getResources().getString(
                        R.string.response_data_empty));
            }

        } catch (Exception e) {
            // TODO: handle exception
            onErrorExecute(mContext.getResources().getString(
                    R.string.json_pare_error));
        }
    }
}
