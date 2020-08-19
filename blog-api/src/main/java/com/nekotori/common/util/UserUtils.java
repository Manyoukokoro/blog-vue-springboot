package com.nekotori.common.util;

import com.nekotori.common.constant.Base;
import com.nekotori.entity.User;
import org.apache.shiro.SecurityUtils;

/**
 * @author nekotori
 * <p>
 * 2018年1月25日
 */
public class UserUtils {

    public static User getCurrentUser() {
        User user = (User) SecurityUtils.getSubject().getSession().getAttribute(Base.CURRENT_USER);
        return user;
    }
}
