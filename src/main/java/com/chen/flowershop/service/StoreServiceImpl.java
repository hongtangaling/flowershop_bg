package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.flowershop.mapper.StoreMapper;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public Boolean addStore(Store store) {
        return storeMapper.insert(store)>0;
    }

    @Override
    public Boolean delStore(String sid) {
        return storeMapper.deleteById(sid)>0;
    }

    @Override
    public Boolean updateStore(Store store) {
        return storeMapper.updateById(store)>0;
    }

    @Override
    public List<Store> selectStoreByName(String name) {
        LambdaQueryWrapper<Store> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name!=null,Store::getName,name);
        return storeMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Store> selectStoreByPid(String pid) {
        LambdaQueryWrapper<Store> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(pid!=null,Store::getPid,pid);
        return storeMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Store> selectAllStore() {
        return storeMapper.selectList(null);
    }

    @Override
    public IPage<Store> getPage(int currentPage, int pageSize) {
        IPage<Store> page = new Page<>(currentPage,pageSize);
        storeMapper.selectPage(page,null);
        return page;
    }
}
