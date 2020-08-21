package com.nekotori.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.nekotori.entity.DO.CategoryDO;
import org.hibernate.validator.constraints.NotBlank;

import com.nekotori.common.entity.BaseEntity;

/**
 * 文章分类
 *
 * @author nekotori
 * <p>
 * 2018年1月23日
 */
@Entity
@Table(name = "me_category")
public class Category extends CategoryDO {
    private static final long serialVersionUID = 5025313969040054182L;


}
