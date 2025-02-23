package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.flowershop.mapper.FlowerMapper;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerServiceImpl implements FlowerService{
    @Autowired
    private FlowerMapper flowerMapper;

    @Override
    public Boolean addFlower(Flower flower) {
        return flowerMapper.insert(flower)>0;
    }

    @Override
    public Boolean delFlower(String fid) {
        return flowerMapper.deleteById(fid)>0;
    }

    @Override
    public Boolean delFlowerByStore(String sid) {
        LambdaQueryWrapper<Flower> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(sid!=null,Flower::getSid,sid);
        return flowerMapper.delete(lambdaQueryWrapper)>=0;
    }

    @Override
    public Boolean updateFlower(Flower flower) {
        return flowerMapper.updateById(flower)>0;
    }

    @Override
    public List<Flower> selectFlowerByName(String fname) {
        LambdaQueryWrapper<Flower> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(fname!=null,Flower::getFname,fname);
        return flowerMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Flower> selectFlowerById(String fid) {
        LambdaQueryWrapper<Flower> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(fid!=null,Flower::getFid,fid);
        return flowerMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Flower> selectFlowerByKinds(String kinds) {
        LambdaQueryWrapper<Flower> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(kinds!=null,Flower::getKinds,kinds);
        return flowerMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Flower> selectAllFlower() {
        return flowerMapper.selectList(null);
    }

    @Override
    public IPage<Flower> getPage(int currentPage, int pageSize) {
        IPage<Flower> page = new Page<>(currentPage,pageSize);
        flowerMapper.selectPage(page,null);
        return page;
    }
}
