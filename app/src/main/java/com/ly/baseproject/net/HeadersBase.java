package com.ly.baseproject.net;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName:HeadersBase
 * @Description:公共请求头文件
 * @Author: zxj
 * @Date:2015年2月28日下午2:10:36
 *
 */
public class HeadersBase {

	public static Map<String, String> getHeaders() {
		Map<String, String> headers = new HashMap<String, String>();
//		if (AppManager.isLogin())
//			headers.put("Cookie", "JSESSIONID="
//					+ AppManager.getClientUser().JSESSIONID);
		return headers;
	}
}
