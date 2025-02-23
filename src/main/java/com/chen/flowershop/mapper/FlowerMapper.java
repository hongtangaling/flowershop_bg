package com.chen.flowershop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.flowershop.pojo.Flower;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FlowerMapper extends BaseMapper<Flower> {
}
