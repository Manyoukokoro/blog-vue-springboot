package com.nekotori.converter;

import com.nekotori.entity.UserStatus;

public class StringtoUserStatusConverter {
    private String string;
    public StringtoUserStatusConverter(String string){this.string = string;}
    public UserStatus Convert(){
        if(this.string.equals("normal"))return UserStatus.normal;
        else if(this.string.equals("blocked"))return UserStatus.blocked;
        else return UserStatus.normal;
    }
}
