package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.flowershop.mapper.FlowerJuMapper;
import com.chen.flowershop.mapper.FlowerMapper;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.FlowerJu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerJuServiceImpl implements FlowerJuService {
    @Autowired
    private FlowerJuMapper flowerJuMapper;
    @Override
    public Boolean addFlowerJu(FlowerJu flowerJu) {
        return flowerJuMapper.insert(flowerJu)>0;
    }

    @Override
    public Boolean delFlowerJu(String fid) {
        return flowerJuMapper.deleteById(fid)>0;
    }

    @Override
    public Boolean updateFlowerJu(FlowerJu flowerJu) {
        return flowerJuMapper.updateById(flowerJu)>0;
    }

    @Override
    public List<FlowerJu> selectFlowerJuByName(String fname) {
        LambdaQueryWrapper<FlowerJu> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(fname!=null,FlowerJu::getFname,fname);
        return flowerJuMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<FlowerJu> selectFlowerJuById(String fid) {
        LambdaQueryWrapper<FlowerJu> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(fid!=null,FlowerJu::getFid,fid);
        return flowerJuMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<FlowerJu> selectAllFlowerJu() {
        return flowerJuMapper.selectList(null);
    }

    @Override
    public IPage<FlowerJu> getPage(int currentPage, int pageSize) {
        IPage<FlowerJu> page = new Page<>(currentPage,pageSize);
        flowerJuMapper.selectPage(page,null);
        return page;
    }
}
