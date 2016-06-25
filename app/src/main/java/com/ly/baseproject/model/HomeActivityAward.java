package com.ly.baseproject.model;


import com.ly.baseproject.utils.StringUtils;

/**
 * @author ly
 * @version V1.0
 * @Package com.blueteam.ganjiuhui.model
 * @Description: 首页活动模型
 * @date 2016/3/5 11:26
 */
public class HomeActivityAward {
    private int Id; //id
    private int ActivityId; //活动id
    private int ProductId; //产品id
    private String AwardName; //奖品名称
    private int AwardCount; //奖品数量
    private String Img; //图片封面
    private int SlCount; //申领人数
    private String DisplayUrl;

    public String getDisplayUrl() {
        return StringUtils.getDisPlayUrl(DisplayUrl);
    }

    public void setDisplayUrl(String displayUrl) {
        DisplayUrl = displayUrl;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getActivityId() {
        return ActivityId;
    }

    public void setActivityId(int activityId) {
        ActivityId = activityId;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getAwardName() {
        return AwardName;
    }

    public void setAwardName(String awardName) {
        AwardName = awardName;
    }

    public int getAwardCount() {
        return AwardCount;
    }

    public void setAwardCount(int awardCount) {
        AwardCount = awardCount;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public int getSlCount() {
        return SlCount;
    }

    public void setSlCount(int slCount) {
        SlCount = slCount;
    }
}
