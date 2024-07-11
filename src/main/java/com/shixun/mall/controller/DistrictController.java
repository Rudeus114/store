package com.shixun.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shixun.mall.entity.District;
import com.shixun.mall.service.IDistrictService;
import com.shixun.mall.utils.JsonResult;
import java.util.List;

/**
 * @author liang
 * @version 1.0
 * @description: 处理省市区相关请求的控制器
 * @date 2022/7/13 19:28
 */
@RestController
@RequestMapping("/district")
public class DistrictController extends BaseController{
    @Autowired
    private IDistrictService districtService;


    /**
     * Description : 处理父代号查询省市区的请求
     * @date 2022/7/14
     * @param parent 父代号
     * @return com.shixun.mall.utils.JsonResult<java.util.List<com.shixun.mall.entity.District>>
     **/
    @GetMapping("/parent")
    public JsonResult<List<District>> queryDistrictByParent(String parent){
        //查询数据
        List<District> list = districtService.getSpecifyDistrictByParent(parent);
        //返回数据
        return new JsonResult<>(OK,list);
    }

    /**
     * Description : 处理查询省市区名称的请求
     * @date 2022/7/14
     * @param code 省市区的code
     * @return com.shixun.mall.utils.JsonResult<java.lang.String>
     **/
    @GetMapping
    public String queryDistrictNameByCode(String code){
        return districtService.getNameByCode(code);
    }
}
