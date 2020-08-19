package com.nekotori.mapper;

import com.nekotori.entity.ArticleDO;

public interface ArticleDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleDO record);

    int insertSelective(ArticleDO record);

    ArticleDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleDO record);

    int updateByPrimaryKey(ArticleDO record);
}