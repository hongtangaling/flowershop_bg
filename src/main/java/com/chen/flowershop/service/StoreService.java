package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.Store;

import java.util.List;

public interface StoreService {
    Boolean addStore(Store store);

    Boolean delStore(String sid);

    Boolean updateStore(Store store);

    List<Store> selectStoreByName(String name);

    List<Store> selectStoreByPid(String pid);

    List<Store> selectAllStore();

    IPage<Store> getPage(int currentPage, int pageSize);


}
