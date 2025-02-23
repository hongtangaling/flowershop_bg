package com.chen.flowershop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class StoreJu {
    @TableId(type = IdType.NONE)
    private String sid;

    private String pid;
    private String name;
    private String pic;
}
