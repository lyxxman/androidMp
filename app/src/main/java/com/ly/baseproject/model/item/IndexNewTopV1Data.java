package com.ly.baseproject.model.item;


import com.ly.baseproject.model.AdsImage;
import com.ly.baseproject.model.ArticleInfo;
import com.ly.baseproject.model.HomeActivityAward;

import java.util.ArrayList;

/**
 * @author ly
 * @version V1.0
 * @Package com.blueteam.ganjiuhui.model.item
 * @Description: 首页顶部第一个返回数据集
 * @date 2016/3/3 11:31
 */
public class IndexNewTopV1Data {
    private ArrayList<AdsImage> Banner; //首页banner
    private ArrayList<AdsImage> FunctionIcons;//功能呢Icon
    private ArrayList<ArticleInfo> TjNews; //赶酒会头条
    private int MfslActivityId;//免费申领活动Id
    private ArrayList<HomeActivityAward> MfslAward;//免费申领奖品信息
    private int QktmActivityId;//清苦特卖活动id
    private ArrayList<HomeActivityAward> QktmAward;//清苦特卖奖品信息
    private int ZcActivityId;//众筹活动Id
    private int YpsxActivityId;//样品试销

    public int getMfslActivityId() {
        return MfslActivityId;
    }

    public void setMfslActivityId(int mfslActivityId) {
        MfslActivityId = mfslActivityId;
    }

    public ArrayList<HomeActivityAward> getMfslAward() {
        return MfslAward;
    }

    public void setMfslAward(ArrayList<HomeActivityAward> mfslAward) {
        MfslAward = mfslAward;
    }

    public int getQktmActivityId() {
        return QktmActivityId;
    }

    public void setQktmActivityId(int qktmActivityId) {
        QktmActivityId = qktmActivityId;
    }

    public ArrayList<HomeActivityAward> getQktmAward() {
        return QktmAward;
    }

    public void setQktmAward(ArrayList<HomeActivityAward> qktmAward) {
        QktmAward = qktmAward;
    }

    public int getZcActivityId() {
        return ZcActivityId;
    }

    public void setZcActivityId(int zcActivityId) {
        ZcActivityId = zcActivityId;
    }

    public int getYpsxActivityId() {
        return YpsxActivityId;
    }

    public void setYpsxActivityId(int ypsxActivityId) {
        YpsxActivityId = ypsxActivityId;
    }

    public ArrayList<AdsImage> getBanner() {
        return Banner;
    }

    public void setBanner(ArrayList<AdsImage> banner) {
        Banner = banner;
    }

    public ArrayList<AdsImage> getFunctionIcons() {
        return FunctionIcons;
    }

    public void setFunctionIcons(ArrayList<AdsImage> functionIcons) {
        FunctionIcons = functionIcons;
    }

    public ArrayList<ArticleInfo> getTjNews() {
        return TjNews;
    }

    public void setTjNews(ArrayList<ArticleInfo> tjNews) {
        TjNews = tjNews;
    }
}
