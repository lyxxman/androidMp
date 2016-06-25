package com.ly.baseproject.utils;

import android.content.Context;

/**
 * Created date on 2016/4/19 0019.
 * describe :屏幕密度转换工具类
 * author : ly
 * email : 839482621@qq.com
 */
public class DensityUtil {
	
	/**
	 * 获取手机高度px
	 * @param context
	 * @return
	 */
	public static final int getHeightInPx(Context context) {
		final int height = context.getResources().getDisplayMetrics().heightPixels;
		return height;
	}

	/**
	 * 获取宽度px
	 * @param context
	 * @return
	 */
	public static final int getWidthInPx(Context context) {
		final int width = context.getResources().getDisplayMetrics().widthPixels;
		return width;
	}

	/**
	 * 获取手机高度dp
	 * @param context
	 * @return
	 */
	public static final int getHeightInDp(Context context) {
		final float height = context.getResources().getDisplayMetrics().heightPixels;
		int heightInDp = px2dip(context, height);
		return heightInDp;
	}

	/**
	 * 获取手机宽度dp
	 * @param context
	 * @return
	 */
	public static final int getWidthInDp(Context context) {
		final float height = context.getResources().getDisplayMetrics().heightPixels;
		int widthInDp = px2dip(context, height);
		return widthInDp;
	}

	/**
	 * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

	/**
	 * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
	 */
	public static int px2dip(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}

	/**
	 * 将px值转换为sp值，保证文字大小不变
	 * 
	 * @param context
	 * @param pxValue
	 *            （DisplayMetrics类中属性scaledDensity）
	 * @return
	 */
	public static int px2sp(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}

	/**
	 * 将sp值转换为px值，保证文字大小不变
	 * 
	 * @param context
	 * @param spValue
	 *            （DisplayMetrics类中属性scaledDensity）
	 * @return
	 */
	public static int sp2px(Context context, float spValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (spValue * scale + 0.5f);
	}
}