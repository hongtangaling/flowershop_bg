package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chen.flowershop.pojo.Car;
import com.chen.flowershop.pojo.User;

import java.util.List;

public interface UserService {
    Boolean addUser(User user);

    Boolean delUser(String uid);

    Boolean updateUser(User user);

    List<User> selectUserByName(String account);

    List<User> selectUserById(String uid);

    List<User> selectAllUser();

    IPage<User> getPage(int currentPage, int pageSize);

    List<User> login(User user);

    Boolean updatePassword(User user);
}
