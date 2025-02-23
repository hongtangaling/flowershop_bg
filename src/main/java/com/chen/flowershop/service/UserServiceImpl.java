package com.chen.flowershop.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.flowershop.mapper.OrderMapper;
import com.chen.flowershop.mapper.UserMapper;
import com.chen.flowershop.pojo.Order;
import com.chen.flowershop.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean addUser(User user) {
        return userMapper.insert(user)>0;
    }

    @Override
    public Boolean delUser(String uid) {
        return userMapper.deleteById(uid)>0;
    }

    @Override
    public Boolean updateUser(User user) {
        return userMapper.updateById(user)>0;
    }

    @Override
    public List<User> selectUserByName(String account) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(account!=null,User::getAccount,account);
        return userMapper.selectList(lambdaQueryWrapper);    }

    @Override
    public List<User> selectUserById(String uid) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(uid!=null,User::getUid,uid);
        return userMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectList(null);
    }

    @Override
    public IPage<User> getPage(int currentPage, int pageSize) {
        IPage<User> page = new Page<>(currentPage,pageSize);
        userMapper.selectPage(page,null);
        return page;
    }

    @Override
    public List<User> login(User user) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(user!=null,User::getUid,user.getUid())
                            .eq(User::getPassword,user.getPassword());
        return userMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public Boolean updatePassword(User user) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(user!=null,User::getUid,user.getUid())
                .eq(User::getTel,user.getTel());
        if(userMapper.selectList(lambdaQueryWrapper).size()==1){
            return userMapper.updateById(user)>0;
        }else {
            return false;
        }
    }
}
