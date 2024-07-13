package com.shixun.mall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liang
 * @version 1.0
 * @description: 对应数据表t_dict_district的实体类
 * @date 2024重试/7/14 13:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
    private Integer id;
    private String parent;
    private String code;
    private String name;

}
