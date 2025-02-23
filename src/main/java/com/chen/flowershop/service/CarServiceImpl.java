package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.flowershop.mapper.CarMapper;
import com.chen.flowershop.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;
    @Override
    public Boolean addCar(Car car) {
        return carMapper.insert(car)>0;
    }

    @Override
    public Boolean delCar(String cid) {
        return carMapper.deleteById(cid)>0;
    }

    @Override
    public Boolean updateCar(Car car) {
        return carMapper.updateById(car)>0;
    }

    @Override
    public List<Car> selectCarByName(String cname) {
        LambdaQueryWrapper<Car> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(cname!=null,Car::getCname,cname);
        return carMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Car> selectCarByUid(String uid) {
        LambdaQueryWrapper<Car> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(uid!=null,Car::getUid,uid);
        return carMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Car> selectAllCar() {
        return carMapper.selectList(null);
    }

    @Override
    public IPage<Car> getPage(int currentPage, int pageSize) {
        IPage<Car> page = new Page<>(currentPage,pageSize);
        carMapper.selectPage(page,null);
        return page;
    }
}
