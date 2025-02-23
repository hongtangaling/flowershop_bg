package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.flowershop.mapper.StoreJuMapper;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.StoreJu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreJuServiceImpl implements StoreJuService {
    @Autowired
    private StoreJuMapper storeJuMapper;

    @Override
    public Boolean addStoreJu(StoreJu storeJu) {
        return storeJuMapper.insert(storeJu)>0;
    }

    @Override
    public Boolean delStoreJu(String sid) {
        return storeJuMapper.deleteById(sid)>0;
    }

    @Override
    public Boolean updateStoreJu(StoreJu storeJu) {
        return storeJuMapper.updateById(storeJu)>0;
    }

    @Override
    public List<StoreJu> selectStoreJuByName(String name) {
        LambdaQueryWrapper<StoreJu> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name!=null,StoreJu::getName,name);
        return storeJuMapper.selectList(lambdaQueryWrapper);

    }

    @Override
    public List<StoreJu> selectStoreJuByUid(String uid) {
        LambdaQueryWrapper<StoreJu> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(uid!=null,StoreJu::getPid,uid);
        return storeJuMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<StoreJu> selectAllStoreJu() {
        return storeJuMapper.selectList(null);
    }

    @Override
    public IPage<StoreJu> getPage(int currentPage, int pageSize) {
        IPage<StoreJu> page = new Page<>(currentPage,pageSize);
        storeJuMapper.selectPage(page,null);
        return page;
    }
}
