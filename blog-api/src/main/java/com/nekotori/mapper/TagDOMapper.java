package com.nekotori.mapper;

import com.nekotori.entity.DO.TagDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TagDO record);

    int insertSelective(TagDO record);

    TagDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TagDO record);

    int updateByPrimaryKey(TagDO record);
}