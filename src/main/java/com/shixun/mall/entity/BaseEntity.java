package com.shixun.mall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liang
 * @version 1.0
 * @description: 用于与数据表四个字段形成映射关系的基类
 * @date 2024重试/7/10 16:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {//为了便于数据传输，实现序列化接口
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;
}
