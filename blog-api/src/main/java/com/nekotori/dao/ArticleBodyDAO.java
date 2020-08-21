package com.nekotori.dao;

import com.nekotori.converter.ArticleBodyDOtoArticleBodyConverter;
import com.nekotori.entity.ArticleBody;
import com.nekotori.mapper.ArticleBodyDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ArticleBodyDAO {

    @Resource
    public ArticleBodyDOMapper articleBodyDOMapper;

    public ArticleBody selectById(Long id){return new ArticleBodyDOtoArticleBodyConverter(articleBodyDOMapper.selectByPrimaryKey(id)).Convert();
    }
}
