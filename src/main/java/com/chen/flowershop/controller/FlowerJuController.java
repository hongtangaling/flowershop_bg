package com.chen.flowershop.controller;

import com.chen.flowershop.config.R;
import com.chen.flowershop.pojo.Flower;
import com.chen.flowershop.pojo.FlowerJu;
import com.chen.flowershop.service.FlowerJuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/flowerju")
public class FlowerJuController {
    @Autowired
    private FlowerJuService flowerJuService;
    //查询所有
    @GetMapping("flowerJuList")
    public R flowerList() {
        return new R(true, flowerJuService.selectAllFlowerJu());
    }

    //根据名字查询
    @GetMapping("find/{fname}")
    public R findByName(@PathVariable String fname) {
        return new R(true, flowerJuService.selectFlowerJuByName(fname));
    }
    //根据id查询
    @GetMapping("findByFid/{fid}")
    public R findByFid(@PathVariable String fid) {
        return new R(true, flowerJuService.selectFlowerJuById(fid));
    }

    //根据id删除
    @DeleteMapping("del/{fid}")
    public R delFlowerJu(@PathVariable String fid) {
        return new R(flowerJuService.delFlowerJu(fid));
    }

    //更新数据
    @PutMapping("update")
    public R updateFlower(@RequestBody FlowerJu flowerJu) {
        return new R(flowerJuService.updateFlowerJu(flowerJu));
    }

    //增加数据
    @PostMapping("add")
    public R addFlowerJu(@RequestBody FlowerJu flowerJu) {
        flowerJu.setFid(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,6));
        return new R(flowerJuService.addFlowerJu(flowerJu));
    }

    @GetMapping("{curr}/{size}")                //分页
    public R getPage(@PathVariable int curr, @PathVariable int size) {
        return new R(true, flowerJuService.getPage(curr, size));
    }
}
