package com.chen.flowershop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.flowershop.pojo.Car;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarMapper extends BaseMapper<Car> {
}
