package net.nonego.blog.dao.generator.model;

import java.util.Date;
import java.util.List;

public class Article {
    private Integer articleId;

    private Integer typeId;

    private String title;

    private Integer userId;

    private Date createTime;

    private String sourceUrl;

    private String content;

    private User user;

    private Type type;

    private List<ArticleTag> articleTags;

    private List<ArticleCategory> articleCategorys;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl == null ? null : sourceUrl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type=type;
    }

    public List<ArticleTag> getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(List<ArticleTag> articleTags) {
        this.articleTags=articleTags;
    }

    public List<ArticleCategory> getArticleCategorys() {
        return articleCategorys;
    }

    public void setArticleCategorys(List<ArticleCategory> articleCategorys) {
        this.articleCategorys=articleCategorys;
    }
}