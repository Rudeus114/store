package com.shixun.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shixun.mall.entity.Cart;
import com.shixun.mall.service.ICartService;
import com.shixun.mall.service.exception.InsertException;
import com.shixun.mall.utils.JsonResult;
import com.shixun.mall.vo.CartVo;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author liang
 * @version 1.0
 * @description: 处理购物车相关请求的控制器
 * @date 2022/7/17 0:52
 */
@RestController
@RequestMapping("/cart")
public class CartController extends BaseController{
    @Autowired
    private ICartService cartService;

    /**
     * Description : 处理添加购物车的请求
     * @date 2022/7/19
     * @param cart cart实体类
     * @param session 项目启动时自动生成的session对象
     * @return com.shixun.mall.utils.JsonResult<java.lang.Void>
     **/
    @PostMapping("/addCart")
    public JsonResult<Void> addCart(Cart cart, HttpSession session){
        //从session中区域uid和用户名
        Integer uid = getUserIdFromSession(session);
        String username = getUsernameFromSession(session);
        cart.setUid(uid);
        Date date = new Date();
        int result = cartService.addCart(cart, username, date, username, date);

        if (result == 0){
            throw  new InsertException("服务器或数据库异常，加入购物车失败");
        }

        return new JsonResult<>(OK);
    }

    /**
     * Description : 处理查询用户购物车信息的请求
     * @date 2022/7/17
     * @param session 项目启动时自动生成的session对象
     * @return com.shixun.mall.utils.JsonResult<java.util.List<com.shixun.mall.entity.Cart>>
     **/
    @GetMapping("/showCarts")
    public JsonResult<List<CartVo>> showCarts(HttpSession session){
        Integer uid = getUserIdFromSession(session);
        List<CartVo> carts = cartService.queryCartByUid(uid);

        return new JsonResult<>(OK,carts);
    }

    /**
     * Description : 处理更新购物车数量信息的请求
     * @date 2022/7/18
     * @param num 更新的数量
     * @param cid cart的cid信息
     * @param session 项目启动时自动生成的session对象
     * @return com.shixun.mall.utils.JsonResult<java.lang.Void>
     **/
    @PostMapping("/updateCart")
    public JsonResult<Void> updateCateByCid(Integer num,Integer cid,HttpSession session){
        String modifiedUser = getUsernameFromSession(session);
        Date modifiedTime = new Date();
        cartService.updateCartNumByCid(num,modifiedUser,modifiedTime,cid);
        return new JsonResult<>(OK);
    }

    /**
     * Description : 处理cids数组的内容查询cart信息的请求
     * @date 2022/7/18
     * @param cids 查询的cids数组
     * @return com.shixun.mall.utils.JsonResult<java.util.List<com.shixun.mall.entity.Cart>>
     **/
    @GetMapping("/queryCids")
    public JsonResult<List<CartVo>> queryCids(Integer[] cids){
        List<CartVo> list = cartService.queryCartByCids(cids);
        System.out.println(list.toString());
        if (list.size() == 0){
            return new JsonResult<>(9001);
        }
        return new JsonResult<>(OK,list);
    }

    /**
     * Description : 处理根据cids内的指定cid删除cart的请求
     * @date 2022/7/19
     * @param cids 存储要被删除的cart的cid
     * @return com.shixun.mall.utils.JsonResult<java.lang.Void>
     **/
    @PostMapping("/deleteCart")
    public JsonResult<Void> deleteCartByCid(Integer[] cids){
        //遍历执行删除操作
        for (Integer cid: cids) {
            cartService.deleteCartByCid(cid);
        }

        return new JsonResult<>(OK);
    }

}
