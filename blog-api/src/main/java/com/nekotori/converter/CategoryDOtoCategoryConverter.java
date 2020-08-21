package com.nekotori.converter;

import com.nekotori.entity.Category;
import com.nekotori.entity.DO.CategoryDO;

public class CategoryDOtoCategoryConverter {
    private CategoryDO categoryDO;
    public CategoryDOtoCategoryConverter(CategoryDO categoryDO){this.categoryDO = categoryDO;}
    public Category Convert(){return (Category)categoryDO;}
}
