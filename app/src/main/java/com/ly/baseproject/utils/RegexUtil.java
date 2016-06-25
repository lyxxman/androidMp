package com.ly.baseproject.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created date on 2016/4/19 0019.
 * describe :正则表达式验证工具
 * author : ly
 * email : 839482621@qq.com
 */
public class RegexUtil {
    public final static String userName = "[a-zA-Z0-9_]{5,18}";
    public final static String userPass = "[a-zA-Z0-9_]{6,20}";
    public final static String specialStr ="[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
    //	public final static String mobilePhone = "^1[3-7|8]\\d{9}$";
    //手机号码验证
    public final static String mobilePhone = "^1[34578][0-9]{9}$|^0[0-9]{2,3}[-_/\\\\.]?[0-9]{7,8}$";

    public final static String email ="^(\\w-*\\.*)+@(\\w-?)+(\\.\\w{2,})+$";
    public final static String adderss = "{0,50}$";
    public final static String isUserLogin = "^\\{\\\"code\\\":110001,\\}$";

    /**
     * 手机号验证
     *
     * @param str
     * @return 验证通过返回true
     */
    public static boolean isMobilePhone(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern
                .compile(mobilePhone); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }

    /**
     * 是否含有特殊字符串
     * @param str
     * @return 有true，没有false
     */
    public static boolean isHaveSpecialStr(String str){
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern
                .compile(specialStr); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }
    /**
     * 邮箱验证
     * @param str
     * @return 验证通过返回true
     */
    public static boolean isEmail(String str){
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern
                .compile(email); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }
    /**
     * 密码验证
     * @param str
     * @return 验证通过返回true
     */
    public static boolean isUserPwd(String str){
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern
                .compile(userPass); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }
    /**
     * 电话号码验证
     *
     * @param str
     * @return 验证通过返回true
     */
    public static boolean isTelPhone(String str) {
        Pattern p1 = null, p2 = null;
        Matcher m = null;
        boolean b = false;
        p1 = Pattern.compile("^(010|02\\d|0[3-9]\\d{2})-\\d{6,8}$"); // 验证带区号的
        p2 = Pattern.compile("^(010|02\\d|0[3-9]\\d{2})-?\\d{6,8}$"); // 验证没有区号的
        if (str.length() >10) {
            m = p1.matcher(str);
            b = m.matches();
        } else {
            m = p2.matcher(str);
            b = m.matches();
        }
        return b;
    }
}
