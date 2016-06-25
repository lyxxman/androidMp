package com.ly.baseproject.model;


import com.ly.baseproject.utils.StringUtils;

/**
 * @author ly
 * @version V1.0
 * @Title: LocalWineAreaDetailActivity.java
 * @Package com.blueteam.castwineparty.main.localwine
 * @Description: TODO(请输入一段描述)
 * @date 2015/9/4 15:17
 */
public class ArticleInfo {
    /*
     * 文章标识
    **/
    private long ArticleId;

    /*
     * 文章类型id
    **/
    private long ArticleTypeId;

    /*
     * 文章标题
    **/
    private String Title;

    /*
     * 摘要
    **/
    private String Digest;

    /*
     * 内容
    **/
    private String Content;

    /*
     * 关键词
    **/
    private String KeyWord;

    /*
     * 图片地址
    **/
    private String Img;

    /*
     * 阅读次数
    **/
    private long ReadNum;

    /*
     * 企业id
    **/
    private long CorpId;

    /*
     * 状态
    **/
    private String Status;

    /*
     * 外键关联字段
    **/
    private String ForeignKey;

    /*
     * 序号
    **/
    private long SortNumber;

    /*
     * 大图
    **/
    private String BigImg;

    /*
     * 文章类型名称
    **/
    private String TypeName;

    /*
     * 文章类型编码
    **/
    private String TypeCode;

    /*
     * 月份
    **/
    private int Monthval;

    /*
     * 总记录数
    **/
    private long SumTotal;

    /*
     * 父级文章类型编码
    **/
    private String ParentParentArticleTypeCode;

    /*
     * 显示地址
    **/
    private String DisplayUrl;

    public ArticleInfo() {
    }

    public ArticleInfo(long articleId, long articleTypeId, String title, String digest, String content, String keyWord, String img,
                       long readNum, long corpId, String status, String foreignKey, long sortNumber, String bigImg, String typeName,
                       String typeCode, int monthval, long sumTotal, String parentParentArticleTypeCode, String displayUrl) {
        ArticleId = articleId;
        ArticleTypeId = articleTypeId;
        Title = title;
        Digest = digest;
        Content = content;
        KeyWord = keyWord;
        Img = img;
        ReadNum = readNum;
        CorpId = corpId;
        Status = status;
        ForeignKey = foreignKey;
        SortNumber = sortNumber;
        BigImg = bigImg;
        TypeName = typeName;
        TypeCode = typeCode;
        Monthval = monthval;
        SumTotal = sumTotal;
        ParentParentArticleTypeCode = parentParentArticleTypeCode;
        DisplayUrl = displayUrl;
    }

    public long getArticleId() {
        return ArticleId;
    }

    public void setArticleId(long articleId) {
        ArticleId = articleId;
    }

    public long getArticleTypeId() {
        return ArticleTypeId;
    }

    public void setArticleTypeId(long articleTypeId) {
        ArticleTypeId = articleTypeId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDigest() {
        return Digest;
    }

    public void setDigest(String digest) {
        Digest = digest;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getKeyWord() {
        return KeyWord;
    }

    public void setKeyWord(String keyWord) {
        KeyWord = keyWord;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public long getReadNum() {
        return ReadNum;
    }

    public void setReadNum(long readNum) {
        ReadNum = readNum;
    }

    public long getCorpId() {
        return CorpId;
    }

    public void setCorpId(long corpId) {
        CorpId = corpId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getForeignKey() {
        return ForeignKey;
    }

    public void setForeignKey(String foreignKey) {
        ForeignKey = foreignKey;
    }

    public long getSortNumber() {
        return SortNumber;
    }

    public void setSortNumber(long sortNumber) {
        SortNumber = sortNumber;
    }

    public String getBigImg() {
        return BigImg;
    }

    public void setBigImg(String bigImg) {
        BigImg = bigImg;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    public String getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(String typeCode) {
        TypeCode = typeCode;
    }

    public int getMonthval() {
        return Monthval;
    }

    public void setMonthval(int monthval) {
        Monthval = monthval;
    }

    public long getSumTotal() {
        return SumTotal;
    }

    public void setSumTotal(long sumTotal) {
        SumTotal = sumTotal;
    }

    public String getParentParentArticleTypeCode() {
        return ParentParentArticleTypeCode;
    }

    public void setParentParentArticleTypeCode(String parentParentArticleTypeCode) {
        ParentParentArticleTypeCode = parentParentArticleTypeCode;
    }

    public String getDisplayUrl() {
        return StringUtils.getDisPlayUrl(DisplayUrl);
    }

    public void setDisplayUrl(String displayUrl) {
        DisplayUrl = displayUrl;
    }
}
