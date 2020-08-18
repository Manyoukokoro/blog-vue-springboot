package com.shimh.service;

import java.util.List;

import com.nekotori.service.ArticleService;
import com.nekotori.vo.ArticleVO;
import com.nekotori.vo.PageVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shimh.BlogApiApplicationTests;
import com.nekotori.entity.Article;

public class ArticleServiceTest extends BlogApiApplicationTests{

	@Autowired
	private ArticleService articleService;
	
	
	
	@Test
	public void listArticlesByTagTest() {
		int id = 1;
		List<Article> as = articleService.listArticlesByTag(id);
		
		System.out.println(as.size());
		
	}
	
	@Test
	public void listArticlesByCategoryTest() {
		int id = 1;
		
		List<Article> as = articleService.listArticlesByCategory(id);

		System.out.println(as.size());
	}
	
	@Test
	public void listHotArticlesTest() {
		
		List<Article> as = articleService.listHotArticles(4);

		as.stream().forEach( a -> System.out.println(a.getTitle()));
		System.out.println(as.size());
	}
	
	@Test
	public void listNewArticlesTest() {

		List<Article> as = articleService.listNewArticles(4);

		as.stream().forEach( a -> System.out.println(a.getTitle()));
		System.out.println(as.size());
	}

	@Test
	public void listArticlesTest() {

		PageVO p = new PageVO();
		p.setPageNumber(1);
		p.setPageSize(5);
		p.setName("createDate");
		p.setSort("desc");

		List<Article> as = articleService.listArticles(p);

		as.stream().forEach( a -> System.out.println(a.getId()));

	}

	@Test
	public void listArticlesTest2() {

		PageVO p = new PageVO();
		p.setPageNumber(1);
		p.setPageSize(5);
		p.setName("a.createDate");
		p.setSort("desc");

		ArticleVO articleVo = new ArticleVO();
		articleVo.setYear(2018);
		articleVo.setMonth(2);
		//articleVo.setTagId(2);
		//articleVo.setCategoryId(3);

		List<Article> as = articleService.listArticles(articleVo, p);

		as.stream().forEach( a -> {
			System.out.println(a.getId());
			System.out.println(a.getTitle());

		});

	}
}
