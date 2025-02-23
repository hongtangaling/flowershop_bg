package com.chen.flowershop.controller;

import com.chen.flowershop.config.R;
import com.chen.flowershop.pojo.Order;
import com.chen.flowershop.pojo.Store;
import com.chen.flowershop.pojo.StoreJu;
import com.chen.flowershop.service.OrderService;
import com.chen.flowershop.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/store")
public class StoreController {
    @Autowired
    private StoreService storeService;
    //查询所有
    @GetMapping("storeList")
    public R storeList() {
        return new R(true, storeService.selectAllStore());
    }

    //根据名字查询
    @GetMapping("find/{name}")
    public R findByName(@PathVariable String name) {
        return new R(true, storeService.selectStoreByName(name));
    }

    @GetMapping("findByPid/{pid}")
    public R findByPid(@PathVariable String pid) {
        return new R(true, storeService.selectStoreByPid(pid));
    }

    //根据id删除
    @DeleteMapping("del/{sid}")
    public R delStore(@PathVariable String sid) {
        return new R(storeService.delStore(sid));
    }

    //更新数据
    @PutMapping("update")
    public R updateStore(@RequestBody Store store) {
        return new R(storeService.updateStore(store));
    }

    //增加数据

    @PostMapping("add")
    public R addStore(@RequestBody Store store) {
            store.setSid(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,6));
        return new R(storeService.addStore(store));
    }

    @GetMapping("{curr}/{size}")                //分页
    public R getPage(@PathVariable int curr, @PathVariable int size) {
        return new R(true, storeService.getPage(curr, size));
    }
}
