package com.chen.flowershop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class TagChange {
    @TableId(type = IdType.AUTO)
    private Integer cgid;

    private String uid;
    private String tag;
    private String infor;
}
