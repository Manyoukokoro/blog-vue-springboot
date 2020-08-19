package com.nekotori.service;

import java.util.List;

import com.nekotori.entity.Category;
import com.nekotori.vo.CategoryVO;

/**
 * @author nekotori
 * <p>
 * 2018年1月25日
 */
public interface CategoryService {

    List<Category> findAll();

    Category getCategoryById(Integer id);

    Integer saveCategory(Category category);

    Integer updateCategory(Category category);

    void deleteCategoryById(Integer id);

    List<CategoryVO> findAllDetail();

    CategoryVO getCategoryDetail(Integer categoryId);

}
