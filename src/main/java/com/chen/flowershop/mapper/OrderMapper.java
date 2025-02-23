package com.chen.flowershop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.flowershop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
