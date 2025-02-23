package com.chen.flowershop.controller;

import com.chen.flowershop.config.R;
import com.chen.flowershop.pojo.StoreJu;
import com.chen.flowershop.pojo.TagChange;
import com.chen.flowershop.service.TagChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/tagchange")
public class TagChangeController {
    @Autowired
    private TagChangeService tagChangeService;
    @GetMapping("storeList")
    public R tagChangeList() {
        return new R(true, tagChangeService.selectAllTagChange());
    }

    //根据名字查询
    @GetMapping("find/{uid}")
    public R findByName(@PathVariable String uid) {
        return new R(true, tagChangeService.selectTagChangeByUid(uid));
    }

    //根据id删除
    @DeleteMapping("del/{sid}")
    public R delTagChange(@PathVariable String sid) {
        return new R(tagChangeService.delTagChange(sid));
    }

    //更新数据
    @PutMapping("update")
    public R updateTagChange(@RequestBody TagChange tagChange) {
        return new R(tagChangeService.updateTagChange(tagChange));
    }

    //增加数据
    @PostMapping("add")
    public R addTagChange(@RequestBody TagChange tagChange) {
        return new R(tagChangeService.addTagChange(tagChange));
    }

    @GetMapping("{curr}/{size}")                //分页
    public R getPage(@PathVariable int curr, @PathVariable int size) {
        return new R(true, tagChangeService.getPage(curr, size));
    }
}
