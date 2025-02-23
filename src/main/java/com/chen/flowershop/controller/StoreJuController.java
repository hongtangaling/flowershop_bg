package com.chen.flowershop.controller;

import com.chen.flowershop.config.R;
import com.chen.flowershop.pojo.Store;
import com.chen.flowershop.pojo.StoreJu;
import com.chen.flowershop.service.StoreJuService;
import com.chen.flowershop.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/storeju")
public class StoreJuController {
    @Autowired
    private StoreJuService storeJuService;
    //查询所有
    @GetMapping("storeList")
    public R storeJuList() {
        return new R(true, storeJuService.selectAllStoreJu());
    }

    //根据名字查询
    @GetMapping("find/{name}")
    public R findByName(@PathVariable String name) {
        return new R(true, storeJuService.selectStoreJuByName(name));
    }

    //根据账号查询
    @GetMapping("findByUid/{uid}")
    public R findByUid(@PathVariable String uid) {
        return new R(true, storeJuService.selectStoreJuByUid(uid));
    }

    //根据id删除
    @DeleteMapping("del/{sid}")
    public R delStoreJu(@PathVariable String sid) {
        return new R(storeJuService.delStoreJu(sid));
    }

    //更新数据
    @PutMapping("update")
    public R updateStoreJu(@RequestBody StoreJu storeJu) {
        return new R(storeJuService.updateStoreJu(storeJu));
    }

    //增加数据

    @PostMapping("add")
    public R addStoreJu(@RequestBody StoreJu storeJu) {
            storeJu.setSid(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,6));
        return new R(storeJuService.addStoreJu(storeJu));
    }

    @GetMapping("{curr}/{size}")                //分页
    public R getPage(@PathVariable int curr, @PathVariable int size) {
        return new R(true, storeJuService.getPage(curr, size));
    }
}
