package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chen.flowershop.pojo.TagChange;

import java.util.List;

public interface TagChangeService {
    Boolean addTagChange(TagChange tagChange);

    Boolean delTagChange(String sid);

    Boolean updateTagChange(TagChange tagChange);

    List<TagChange> selectTagChangeByUid(String uid);

    List<TagChange> selectAllTagChange();

    IPage<TagChange> getPage(int currentPage, int pageSize);
}
