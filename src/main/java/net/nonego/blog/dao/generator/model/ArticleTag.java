package net.nonego.blog.dao.generator.model;

public class ArticleTag {
    private Integer articleId;

    private Integer tagId;

    private Tag tag;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag=tag;
    }
}