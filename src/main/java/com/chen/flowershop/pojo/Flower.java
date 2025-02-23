package com.chen.flowershop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Flower {
    @TableId(type = IdType.NONE)
    private String fid;

    private String materials;
    private String flowerlang;
    private String pack;
    private String sell;
    private String describes;
    private String pic;
    private String fname;
    private String pid;
    private String sid;
    private String kinds;
}
