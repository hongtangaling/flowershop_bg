package com.chen.flowershop.controller;
import com.chen.flowershop.config.R;
import com.chen.flowershop.pojo.User;
import com.chen.flowershop.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("userList")
    public R userList() {
        return new R(true, userService.selectAllUser());
    }

    //根据名字查询
    @GetMapping("find/{account}")
    public R findByName(@PathVariable String account) {
        return new R(true, userService.selectUserByName(account));
    }

    @GetMapping("findById/{uid}")
    public R findById(@PathVariable String uid){
        return new R(true,userService.selectUserById(uid));
    }

    //根据id删除
    @DeleteMapping("del/{uid}")
    public R deluser(@PathVariable String uid) {
        return new R(userService.delUser(uid));
    }

    //更新数据
    @PutMapping("update")
    public R updateUser(@RequestBody User user) {
        return new R(userService.updateUser(user));
    }

    //增加数据
        @PostMapping("add")
    public R addUser(@RequestBody User user) {
        user.setUid(new SimpleDateFormat("yyyyMM").format(new Date()) + UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,6));
        return new R(userService.addUser(user),user.getUid());
    }

    @GetMapping("{curr}/{size}")                //分页
    public R getPage(@PathVariable int curr, @PathVariable int size) {
        return new R(true, userService.getPage(curr, size));
    }
    @PostMapping("login")
    public R login(@RequestBody User user) {
        R r = new R();
        r.setFlag(userService.login(user).size() == 1);
        r.setData(userService.login(user));
        return r;
    }
    @PostMapping("updatePassword")
    public R updatePassword(@RequestBody User user) {
        return new R(userService.updatePassword(user));
    }
}