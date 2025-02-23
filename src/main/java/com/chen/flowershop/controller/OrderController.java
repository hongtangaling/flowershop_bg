package com.chen.flowershop.controller;

import com.chen.flowershop.config.R;
import com.chen.flowershop.pojo.Order;
import com.chen.flowershop.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    //查询所有
    @GetMapping("orderList")
    public R orderList() {
        return new R(true, orderService.selectAllOrder());
    }



    //根据名字查询
    @GetMapping("find/{name}")
    public R findByName(@PathVariable String name) {
        return new R(true, orderService.selectOrderByName(name));
    }

    //用户买家id查询
    @GetMapping("findByUid/{uid}")
    public R findByUid(@PathVariable String uid) {
        return new R(true, orderService.selectOrderByUid(uid));
    }
    //用户卖家id查询
    @GetMapping("findByPid/{pid}")
    public R findByPid(@PathVariable String pid) {
        return new R(true, orderService.selectOrderByPid(pid));
    }

    //根据id删除
    @DeleteMapping("del/{oid}")
    public R delOrder(@PathVariable String oid) {
        return new R(orderService.delOrder(oid));
    }

    //更新数据
    @PutMapping("update")
    public R updateOrder(@RequestBody Order order) {
        return new R(orderService.updateOrder(order));
    }

    //增加数据
    @PostMapping("add")
    public R addOrder(@RequestBody Order order) {
        order.setOrdertime(new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
        order.setOid(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,6));
        return new R(orderService.addOrder(order));
    }

    @GetMapping("{curr}/{size}")                //分页
    public R getPage(@PathVariable int curr, @PathVariable int size) {
        return new R(true, orderService.getPage(curr, size));
    }
}
