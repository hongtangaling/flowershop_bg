package com.chen.flowershop.controller;

import com.chen.flowershop.config.R;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/car")
public class CarController {
    @Autowired
    private CarService carService;

    //查询所有
    @GetMapping("carList")
    public R carList() {
        return new R(true, carService.selectAllCar());
    }

    //根据名字查询
    @GetMapping("find/{cname}")
    public R findByName(@PathVariable String cname) {
        return new R(true, carService.selectCarByName(cname));
    }

    //根据uid查询
        @GetMapping("findByUid/{uid}")
    public R findByUid(@PathVariable String uid) {
        return new R(true, carService.selectCarByUid(uid));
    }

    //根据id删除
    @DeleteMapping("del/{cid}")
    public R delCar(@PathVariable String cid) {
        return new R(carService.delCar(cid));
    }

    //更新数据
    @PutMapping("update")
    public R updateCar(@RequestBody Car car) {
        return new R(carService.updateCar(car));
    }

    //增加数据
    @PostMapping("add")
    public R addCar(@RequestBody Car car) {
        car.setCid(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,6));
        return new R(carService.addCar(car));
    }

    @GetMapping("{curr}/{size}")                //分页
    public R getPage(@PathVariable int curr, @PathVariable int size) {
        return new R(true, carService.getPage(curr, size));
    }
}
