package com.chen.flowershop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.flowershop.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
