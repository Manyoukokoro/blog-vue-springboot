package com.nekotori.repository.wrapper;

import java.util.List;

import com.nekotori.vo.TagVO;

/**
 * @author nekotori
 * <p>
 * 2018年1月25日
 */
public interface TagWrapper {

    List<TagVO> findAllDetail();

    TagVO getTagDetail(Integer tagId);
}
