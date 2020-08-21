package com.nekotori.converter;

import com.nekotori.entity.Article;
import com.nekotori.entity.ArticleBody;
import com.nekotori.entity.DO.ArticleBodyDO;

public class ArticleBodyDOtoArticleBodyConverter {
    private ArticleBodyDO articleBodyDO;
    public ArticleBodyDOtoArticleBodyConverter(ArticleBodyDO articleBodyDO){this.articleBodyDO = articleBodyDO;}
    public ArticleBody Convert(){return (ArticleBody) articleBodyDO;}
}
