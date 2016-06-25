package com.ly.baseproject.net.response;


import com.ly.baseproject.model.item.IndexNewTopV1Data;
import com.ly.baseproject.net.BaseResponse;

/**
 * @author ly
 * @version V1.0
 * @Package com.blueteam.ganjiuhui.net.response
 * @Description: 首页顶部请求返回
 * @date 2016/3/3 13:35
 */
public class IndexNewTopResponse extends BaseResponse {
    private IndexNewTopV1Data Data;

    public IndexNewTopV1Data getData() {
        return Data;
    }

    public void setData(IndexNewTopV1Data data) {
        Data = data;
    }
}
