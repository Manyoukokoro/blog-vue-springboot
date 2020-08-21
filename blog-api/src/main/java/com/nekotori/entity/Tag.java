package com.nekotori.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.nekotori.entity.DO.TagDO;
import org.hibernate.validator.constraints.NotBlank;

import com.nekotori.common.entity.BaseEntity;

/**
 * 文章标签
 *
 * @author nekotori
 * <p>
 * 2018年1月23日
*/
public class Tag extends TagDO {

    private static final long serialVersionUID = 5025313969040054182L;


    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


}
