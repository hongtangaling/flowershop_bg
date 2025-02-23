package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chen.flowershop.pojo.StoreJu;

import java.util.List;

public interface StoreJuService {
    Boolean addStoreJu(StoreJu storeJu);

    Boolean delStoreJu(String sid);

    Boolean updateStoreJu(StoreJu storeJu);

    List<StoreJu> selectStoreJuByName(String name);

    List<StoreJu> selectStoreJuByUid(String uid);

    List<StoreJu> selectAllStoreJu();

    IPage<StoreJu> getPage(int currentPage, int pageSize);
}
