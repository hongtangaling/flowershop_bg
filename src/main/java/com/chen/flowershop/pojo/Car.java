package com.chen.flowershop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Car {
    @TableId(type = IdType.NONE)
    private String cid;

    private String fid;
    private String total;
    private String cname;
    private String pic;
    private String num;
    private String uid;
}
