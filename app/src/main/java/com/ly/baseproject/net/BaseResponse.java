package com.ly.baseproject.net;

/**
 * @Title: BaseResponse.java
 * @Package com.blueteam.castwineparty.net
 * @Description: 基础返回类
 * @author ly
 * @date 2015年8月5日 上午9:09:42
 * @version V1.0
 */
public class BaseResponse {
	private int Status;
	private String ErrorMsg;

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getErrorMsg() {
		return ErrorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}

}
