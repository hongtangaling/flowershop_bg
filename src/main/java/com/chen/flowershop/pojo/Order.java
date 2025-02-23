package com.chen.flowershop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Order {
    @TableId(type = IdType.NONE)
    private String oid;

    private String name;
    private String address;
    private String totle;
    private String ordertime;
    private String statics;
    private String message;
    private String uid;
    private String pid;
    private String fid;
    private String tel;
    private String fname;
}
