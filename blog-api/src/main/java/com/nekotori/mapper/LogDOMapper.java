package com.nekotori.mapper;

import com.nekotori.entity.DO.LogDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogDO record);

    int insertSelective(LogDO record);

    LogDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogDO record);

    int updateByPrimaryKey(LogDO record);
}