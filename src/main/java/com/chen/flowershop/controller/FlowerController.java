package com.chen.flowershop.controller;

import com.chen.flowershop.config.R;
import com.chen.flowershop.pojo.Flower;
import com.chen.flowershop.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/flower")
public class FlowerController {
    @Autowired
    private FlowerService flowerService;
    //查询所有
    @GetMapping("flowerList")
    public R flowerList() {
        return new R(true, flowerService.selectAllFlower());
    }

    //根据名字查询
    @GetMapping("find/{fname}")
    public R findByName(@PathVariable String fname) {
        return new R(true, flowerService.selectFlowerByName(fname));
    }
    //根据id查询
    @GetMapping("findById/{fid}")
    public R findById(@PathVariable String fid) {
        return new R(true, flowerService.selectFlowerById(fid));
    }

    //根据分类
    @GetMapping("findByKinds/{kinds}")
    public R findByKinds(@PathVariable String kinds) {
        return new R(true, flowerService.selectFlowerByKinds(kinds));
    }

    //根据id删除
    @DeleteMapping("del/{cid}")
    public R delFlower(@PathVariable String cid) {
        return new R(flowerService.delFlower(cid));
    }

    //根据店铺id删除
    @DeleteMapping("delBySid/{sid}")
    public R delBySid(@PathVariable String sid) {
        return new R(flowerService.delFlowerByStore(sid));
    }

    //更新数据
    @PutMapping("update")
    public R updateFlower(@RequestBody Flower flower) {
        return new R(flowerService.updateFlower(flower));
    }

    //增加数据
    @PostMapping("add")
    public R addFlower(@RequestBody Flower flower) {
        if (flower.getFid().equals(""))
            flower.setFid(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,6));
        return new R(flowerService.addFlower(flower));
    }

    @GetMapping("{curr}/{size}")                //分页
    public R getPage(@PathVariable int curr, @PathVariable int size) {
        return new R(true, flowerService.getPage(curr, size));
    }
}
