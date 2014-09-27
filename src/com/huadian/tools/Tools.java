package com.huadian.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;


/**
 * 工具类
 * @author sunpeng
 *
 */
public class Tools {
	
	private  static Tools instance = null;
	
	private Tools(){}
	
	/**
	 * 获取实例对象
	 * @return
	 */
	public static Tools getInstance(){
		if(null == instance){
			instance = new Tools();
		}
		return instance;
	}
	
	/**
	 * 通用跳转
	 * @param intent
	 * @param context
	 * @param className
	 * @param isClose
	 */
	public void goToActivity(Intent intent,Context context , Class<?> className , boolean isClose ){
		intent.setClass(context, className);
		if(isClose){
			((Activity)context).finish();
		}
	}
	
	/**
	 * 带动画效果的跳转
	 * @param intent
	 * @param context
	 * @param className
	 * @param isClose
	 * @param enterAnim
	 * @param exitAnim
	 */
	public void  goToActivity(Intent intent,Context context , Class<?> className , boolean isClose ,int enterAnim , int exitAnim) {
		goToActivity(intent ,context , className , isClose);
		((Activity)context).overridePendingTransition(enterAnim, exitAnim);
	}
	
	

}
