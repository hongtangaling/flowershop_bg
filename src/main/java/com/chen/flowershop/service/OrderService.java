package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chen.flowershop.pojo.Flower;
import com.chen.flowershop.pojo.Order;

import java.util.List;

public interface OrderService {
    Boolean addOrder(Order order);

    Boolean delOrder(String oid);

    Boolean updateOrder(Order order);

    List<Order> selectOrderByName(String name);

    List<Order> selectOrderByUid(String uid);

    List<Order> selectOrderByPid(String pid);

    List<Order> selectAllOrder();

    IPage<Order> getPage(int currentPage, int pageSize);
}
