package com.nekotori.mapper;

import com.nekotori.entity.DO.ArticleTagDO;

public interface ArticleTagDOMapper {
    int insert(ArticleTagDO record);

    int insertSelective(ArticleTagDO record);
}