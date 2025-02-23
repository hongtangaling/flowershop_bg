package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.Flower;

import java.util.List;

public interface FlowerService {
    Boolean addFlower(Flower flower);

    Boolean delFlower(String fid);

    Boolean delFlowerByStore(String sid);

    Boolean updateFlower(Flower flower);

    List<Flower> selectFlowerByName(String fname);

    List<Flower> selectFlowerById(String fid);

    List<Flower> selectFlowerByKinds(String kinds);

    List<Flower> selectAllFlower();

    IPage<Flower> getPage(int currentPage, int pageSize);
}
