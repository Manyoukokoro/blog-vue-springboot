package com.nekotori.converter;

import com.nekotori.entity.UserStatus;

@Deprecated
public class UserStatustoStringConverter {
    private UserStatus userStatus;
    UserStatustoStringConverter(UserStatus userStatus){this.userStatus = userStatus;}
    public String Convert(){
        return this.userStatus.getInfo();
    }
}
