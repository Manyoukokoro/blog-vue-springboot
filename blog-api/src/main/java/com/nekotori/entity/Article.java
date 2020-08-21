package com.nekotori.entity;

import com.nekotori.converter.UserDotoUserConverter;
import com.nekotori.dao.ArticleBodyDAO;
import com.nekotori.dao.CategoryDAO;
import com.nekotori.dao.UserDAO;
import com.nekotori.entity.DO.ArticleDO;
import com.nekotori.mapper.UserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 文章
 *
 * @author nekotori
 * <p>
 * 2018年1月23日
 */
public class Article extends ArticleDO {


    public static final int Article_TOP = 1;

    public static final int Article_Common = 0;

    private static final long serialVersionUID = -4470366380115322213L;

    private User author;

    private ArticleBody body;

    private Category category;

    private List<Tag> tags;

    private List<Comment> comments;


    private int weight = Article_Common;

    public Article(){
        this.author = new UserDAO().selectById(authorId);
        this.body = new ArticleBodyDAO().selectById(bodyId);
        this.category = new CategoryDAO().selectById(categoryId);
    }

    public User getAuthor() {
        return author;
    }


    public void setAuthor(User author) {
        this.author = author;
    }


    public ArticleBody getBody() {
        return body;
    }


    public void setBody(ArticleBody body) {
        this.body = body;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }


    public List<Tag> getTags() {
        return tags;
    }


    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    public List<Comment> getComments() {
        return comments;
    }


    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


}
