package com.nekotori.dao;

import com.nekotori.converter.UserDotoUserConverter;
import com.nekotori.entity.User;
import com.nekotori.mapper.UserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDAO {
    @Resource
    public UserDOMapper userDOMapper;

    public User selectById(Long id){return new UserDotoUserConverter(userDOMapper.selectByPrimaryKey(id)).Convert();}
}
