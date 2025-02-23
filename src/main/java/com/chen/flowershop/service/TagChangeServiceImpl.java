package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.flowershop.mapper.TagChangeMapper;
import com.chen.flowershop.pojo.TagChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagChangeServiceImpl implements TagChangeService{
    @Autowired
    private TagChangeMapper tagChangeMapper;
    @Override
    public Boolean addTagChange(TagChange tagChange) {
        return tagChangeMapper.insert(tagChange)>0;
    }

    @Override
    public Boolean delTagChange(String sid) {
        return tagChangeMapper.deleteById(sid)>0;
    }

    @Override
    public Boolean updateTagChange(TagChange tagChange) {
        return tagChangeMapper.updateById(tagChange)>0;

    }

    @Override
    public List<TagChange> selectTagChangeByUid(String uid) {
        LambdaQueryWrapper<TagChange> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(uid!=null,TagChange::getUid,uid);
        return tagChangeMapper.selectList(lambdaQueryWrapper);

    }

    @Override
    public List<TagChange> selectAllTagChange() {
        return tagChangeMapper.selectList(null);
    }

    @Override
    public IPage<TagChange> getPage(int currentPage, int pageSize) {
        IPage<TagChange> page = new Page<>(currentPage,pageSize);
        tagChangeMapper.selectPage(page,null);
        return page;
    }
}
