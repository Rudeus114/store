package com.shixun.mall.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liang
 * @version 1.0
 * @description: 多表查询结果集映射的值对象
 * @date 2024重试/7/18 1:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartVo{
    private Integer cid;
    private Integer pid;
    private Integer uid;
    private Long price;
    private Integer num;
    private String title;
    private String image;
    private String realPrice;
}
