package com.nekotori.repository.wrapper;

import com.nekotori.entity.Article;
import com.nekotori.vo.ArticleVO;
import com.nekotori.vo.PageVO;

import java.util.List;

public interface ArticleWrapper {
    List<Article> listArticles(PageVO page);

    List<Article> listArticles(ArticleVO article, PageVO page);

    List<ArticleVO> listArchives();

}
