package com.chen.flowershop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(type = IdType.NONE)
    private String uid;

    private String tel;
    private String account;
    private String password;
    private String tag;
    private String pic;
}
