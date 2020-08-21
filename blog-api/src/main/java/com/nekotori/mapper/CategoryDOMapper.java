package com.nekotori.mapper;

import com.nekotori.entity.DO.CategoryDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CategoryDO record);

    int insertSelective(CategoryDO record);

    CategoryDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CategoryDO record);

    int updateByPrimaryKey(CategoryDO record);
}