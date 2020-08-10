package com.nekotori.repository.wrapper;

import com.nekotori.entity.Article;
import com.nekotori.vo.ArticleVo;
import com.nekotori.vo.PageVo;

import java.util.List;

public interface ArticleWrapper {
    List<Article> listArticles(PageVo page);

    List<Article> listArticles(ArticleVo article, PageVo page);

    List<ArticleVo> listArchives();

}
