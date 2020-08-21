package com.nekotori.dao;

import com.nekotori.entity.Article;
import com.nekotori.entity.Tag;
import com.nekotori.mapper.ArticleDOMapper;
import com.nekotori.mapper.ArticleTagDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ArticleDAO {

    @Resource
    public ArticleTagDOMapper articleTagDOMapper;

    @Resource
    public ArticleDOMapper articleDOMapper;

    public List<Tag> findTagsByArticle(Article article){
    return null;
    }
}
