package com.nekotori.mapper;

import com.nekotori.entity.userDO;

public interface userDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(userDO record);

    int insertSelective(userDO record);

    userDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(userDO record);

    int updateByPrimaryKey(userDO record);
}