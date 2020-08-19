package com.nekotori.repository.wrapper;

import java.util.List;

import com.nekotori.vo.CategoryVO;

/**
 * @author nekotori
 * <p>
 * 2018年1月25日
 */
public interface CategoryWrapper {

    List<CategoryVO> findAllDetail();

    CategoryVO getCategoryDetail(Integer categoryId);
}
