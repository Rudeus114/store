package com.shixun.mall.mapper;

import com.shixun.mall.entity.Product;

import java.util.List;

/**
 * @author liang
 * @version 1.0
 * @description: 实体类Product对应的mapper接口
 * @date 2024重试/7/16 1:11
 */
public interface ProductMapper {

    /**
     * Description : 查询优先权前五的商品进行展示
     * @date 2024重试/7/16
     * @return java.util.List<com.shixun.mall.entity.Product>
     **/
    List<Product> queryPriorityProduct();

    /**
     * Description : 查询最新上架的商品进行展示
     * @date 2024重试/7/16
     * @return java.util.List<com.shixun.mall.entity.Product>
     **/
    List<Product> queryTheNewProduct();

    /**
     * Description : 根据指定商品id进行商品查询
     * @date 2024重试/7/16
     * @param id 商品id
     * @return com.shixun.mall.entity.Product
     **/
    Product queryProductById(Integer id);

    /**
     * Description : 根据指定的名称关键字进行模糊查询
     * @date 2024重试/7/22
     * @param title 要查询的商品名称关键字
     * @return java.util.List<com.shixun.mall.entity.Product>
     **/
    List<Product> queryProductByTitle(String title);
}
