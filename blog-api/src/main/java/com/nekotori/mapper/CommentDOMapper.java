package com.nekotori.mapper;

import com.nekotori.entity.DO.CommentDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentDO record);

    int insertSelective(CommentDO record);

    CommentDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommentDO record);

    int updateByPrimaryKey(CommentDO record);
}