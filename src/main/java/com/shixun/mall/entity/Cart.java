package com.shixun.mall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author liang
 * @version 1.0
 * @description: 对应数据表t_cart的实体类
 * @date 2024重试/7/16 19:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart extends BaseEntity {
    private Integer cid;
    private Integer uid;
    private Integer pid  ;
    private Long price;
    private Integer num;
}
