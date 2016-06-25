package com.ly.baseproject.net;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;

import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ly
 * @version V1.0
 * @Title: LocalWineAreaDetailActivity.java
 * @Package com.blueteam.castwineparty.main.localwine
 * @Description: 上传图片
 * @date 2015/9/30 11:27
 */
public class UploadImageRequest extends Request<String> {

    private MultipartEntity entity = new MultipartEntity();

    private static final String FILE_PART_NAME = "image";

    private final Response.Listener<String> mListener;
    private final File mFilePart;

    public UploadImageRequest(String url, Response.ErrorListener errorListener, Response.Listener<String> listener, File file) {
        super(Method.POST, url, errorListener);

        mListener = listener;
        mFilePart = file;
        buildMultipartEntity();
    }

    private void buildMultipartEntity() {
        entity.addPart(FILE_PART_NAME, new FileBody(mFilePart));
    }

    @Override
    public String getBodyContentType() {
        return entity.getContentType().getValue();
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            entity.writeTo(bos);
        } catch (IOException e) {
            VolleyLog.e("IOException writing to ByteArrayOutputStream");
        }
        return bos.toByteArray();
    }

    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
        String parsed;
        try {
            parsed = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
        } catch (UnsupportedEncodingException var4) {
            parsed = new String(networkResponse.data);
        }

        return Response.success(parsed, HttpHeaderParser.parseCacheHeaders(networkResponse));
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
    protected void deliverResponse(String response) {
        mListener.onResponse(response);
    }
}
