package com.ly.baseproject.net;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.ly.baseproject.R;

/**   
 * @Title: VolleyErrorHelper.java 
 * @Package com.blueteam.castwineparty.net 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author A18ccms A18ccms_gmail_com   
 * @date 2015年8月5日 上午10:06:51 
 * @version V1.0   
 */
public class VolleyErrorHelper {

	     /**
	     * Returns appropriate message which is to be displayed to the user 
	     * against the specified error object.
	     * 
	     * @param error
	     * @param context
	     * @return
	     */
	  public static String getMessage(Object error, Context context) {
	      if (error instanceof TimeoutError) {
	          return context.getResources().getString(R.string.socket_time_out);
	      }
	      else if (isServerProblem(error)) {
	    	  return context.getResources().getString(R.string.server_work_error);
	      }
	      else if (isNetworkProblem(error)) {
	          return context.getResources().getString(R.string.network_connection_fail);
	      }else if(isNetworkTimeOut(error)){
			  return context.getResources().getString(R.string.socket_time_out);
		  }
	      return context.getResources().getString(R.string.network_error);
	  }
	  
	  /**
	  * Determines whether the error is related to network
	  * @param error
	  * @return
	  */
	  private static boolean isNetworkProblem(Object error) {
	      return (error instanceof NetworkError) || (error instanceof NoConnectionError);
	  }
	/**
	 * Determines whether the error is related to network
	 * @param error
	 * @return
	 */
	private static boolean isNetworkTimeOut(Object error) {
		return (error instanceof TimeoutError);
	}
	  /**
	  * Determines whether the error is related to server
	  * @param error
	  * @return
	  */
	  private static boolean isServerProblem(Object error) {
	      return (error instanceof ServerError) || (error instanceof AuthFailureError);
	  }
	 

}
