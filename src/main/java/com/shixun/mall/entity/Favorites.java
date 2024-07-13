package com.shixun.mall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liang
 * @version 1.0
 * @description: 对应数据表t_favorites的实体类
 * @date 2024/7/21 20:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Favorites {
    private Integer fid;
    private Integer uid;
    private Integer pid;
    private String image;
    private Long price;
    private String title;
    private String sellPoint;
    private Integer status;
}
