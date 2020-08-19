package com.nekotori.mapper;

import com.nekotori.entity.ArticleBodyDO;

public interface ArticleBodyDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleBodyDO record);

    int insertSelective(ArticleBodyDO record);

    ArticleBodyDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleBodyDO record);

    int updateByPrimaryKeyWithBLOBs(ArticleBodyDO record);
}