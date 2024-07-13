package com.shixun.mall.service;

import com.github.pagehelper.PageInfo;
import com.shixun.mall.entity.Product;

import java.util.List;

/**
 * @author liang
 * @version 1.0
 * @description: 处理商品业务层接口
 * @date 2024重试/7/16 15:01
 */
public interface IProductService {

    //查询热销商品的前五项的抽象方法
    List<Product> queryPriorityProduct();

    //查询最新商品的前五项的抽象方法
    List<Product> queryTheNewProduct();

    //查询指定id商品的抽象方法
    Product queryProductById(Integer id);

    //根据名称进行模糊查询的抽象方法
    PageInfo<Product>  queryProductByTitle(Integer pageNum, Integer pageSize,String title);

}
