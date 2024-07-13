package com.shixun.mall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liang
 * @version 1.0
 * @description: 对应数据表t_user的实体类
 * @date 2024/6/16 18:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    private Integer uid;
    private String username;
    private String password;
    private String salt; //用于加密密码
    private String phone;
    private String email;
    private Integer gender;//'性别:0-女，1-男',
    private String avatar;
    private Integer isDelete;
}

