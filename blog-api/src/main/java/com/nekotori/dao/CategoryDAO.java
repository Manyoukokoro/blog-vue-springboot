package com.nekotori.dao;

import com.nekotori.controller.CategoryController;
import com.nekotori.converter.CategoryDOtoCategoryConverter;
import com.nekotori.entity.Category;
import com.nekotori.mapper.CategoryDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class CategoryDAO {

    @Resource
    public CategoryDOMapper categoryDOMapper;

    public Category selectById(Integer id){
        return new CategoryDOtoCategoryConverter(categoryDOMapper.selectByPrimaryKey(id)).Convert();
    }
}
