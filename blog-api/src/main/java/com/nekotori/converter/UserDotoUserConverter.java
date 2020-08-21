package com.nekotori.converter;

import com.nekotori.entity.DO.UserDO;
import com.nekotori.entity.User;

public class UserDotoUserConverter {
    private UserDO userDO;
    public UserDotoUserConverter(UserDO userDO){this.userDO = userDO;}
    public User Convert(){
        return (User)userDO;
    }
}
