package com.nekotori.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nekotori.BlogApiApplicationTests;
import com.nekotori.repository.CategoryRepository;

public class CategoryRepositoryTest extends BlogApiApplicationTests{

	@Autowired
	private CategoryRepository	categoryRepository;

	@Test
	public void test() {
	}
}
