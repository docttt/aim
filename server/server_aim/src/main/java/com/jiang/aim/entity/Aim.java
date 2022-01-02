package com.jiang.aim.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Aim implements Serializable {

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @TableField(value = "userId")
    private String userId;

    @TableField(value = "userName")
    private String userName;

    @TableField(value = "content")
    private String content;

    @TableField(value = "lastModified")
    private long lastModified;
}
