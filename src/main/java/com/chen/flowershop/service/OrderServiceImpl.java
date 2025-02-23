package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.flowershop.mapper.FlowerMapper;
import com.chen.flowershop.mapper.OrderMapper;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.Flower;
import com.chen.flowershop.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Boolean addOrder(Order order) {
        return orderMapper.insert(order)>0;
    }

    @Override
    public Boolean delOrder(String oid) {
        return orderMapper.deleteById(oid)>0;
    }

    @Override
    public Boolean updateOrder(Order order) {
        return orderMapper.updateById(order)>0;
    }

    @Override
    public List<Order> selectOrderByName(String name) {
        LambdaQueryWrapper<Order> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name!=null,Order::getName,name);
        return orderMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Order> selectOrderByUid(String uid) {
        LambdaQueryWrapper<Order> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(uid!=null,Order::getUid,uid);
        return orderMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Order> selectOrderByPid(String pid) {
        LambdaQueryWrapper<Order> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(pid!=null,Order::getPid,pid);
        return orderMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Order> selectAllOrder() {
        return orderMapper.selectList(null);
    }

    @Override
    public IPage<Order> getPage(int currentPage, int pageSize) {
        IPage<Order> page = new Page<>(currentPage,pageSize);
        orderMapper.selectPage(page,null);
        return page;
    }
}
