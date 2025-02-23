package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.FlowerJu;

import java.util.List;

public interface FlowerJuService {
    Boolean addFlowerJu(FlowerJu flowerJu);

    Boolean delFlowerJu(String fid);

    Boolean updateFlowerJu(FlowerJu flowerJu);

    List<FlowerJu> selectFlowerJuByName(String fname);

    List<FlowerJu> selectFlowerJuById(String fid);

    List<FlowerJu> selectAllFlowerJu();

    IPage<FlowerJu> getPage(int currentPage, int pageSize);
}
