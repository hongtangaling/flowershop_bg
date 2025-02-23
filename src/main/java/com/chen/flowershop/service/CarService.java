package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chen.flowershop.pojo.Car;

import java.util.List;

public interface CarService {
    Boolean addCar(Car car);

    Boolean delCar(String cid);

    Boolean updateCar(Car car);

    List<Car> selectCarByName(String cname);

    List<Car> selectCarByUid(String uid);

    List<Car> selectAllCar();

    IPage<Car> getPage(int currentPage, int pageSize);
}
