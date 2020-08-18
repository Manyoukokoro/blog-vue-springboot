package com.nekotori.service;

import java.util.List;

import com.nekotori.entity.Article;
import com.nekotori.vo.ArticleVO;
import com.nekotori.vo.PageVO;

/**
 * @author shimh
 * <p>
 * 2018年1月25日
 */
public interface ArticleService {

    List<Article> listArticles(PageVO page);

    List<Article> listArticles(ArticleVO article, PageVO page);

    List<Article> findAll();

    Article getArticleById(Integer id);

    Integer publishArticle(Article article);

    Integer saveArticle(Article article);

    Integer updateArticle(Article article);

    void deleteArticleById(Integer id);

    List<Article> listArticlesByTag(Integer id);

    List<Article> listArticlesByCategory(Integer id);

    Article getArticleAndAddViews(Integer id);

    List<Article> listHotArticles(int limit);

    List<Article> listNewArticles(int limit);

    List<ArticleVO> listArchives();

}
