package com.shixun.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shixun.mall.entity.District;
import com.shixun.mall.mapper.DistrictMapper;
import com.shixun.mall.service.IDistrictService;

import java.util.List;

/**
 * @author liang
 * @version 1.0
 * @description: 处理省市区业务层接口的实现类
 * @date 2024/7/14 15:29
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class IDistrictServiceImpl implements IDistrictService {
    @Autowired
    private DistrictMapper districtMapper;

    /**
     * Description : 根据父代号查询省市区信息
     * @date 2024/7/14
     * @param parent 父代号
     * @return java.util.List<com.shixun.mall.entity.District>
     **/
    @Override
    public List<District> getSpecifyDistrictByParent(String parent) {
        List<District> districts = districtMapper.queryDistrictByParent(parent);

        //过滤无效字段数据，提高传输效率
        for (District ad: districts) {
            ad.setId(null);
            ad.setParent(null);
        }

        //返回数据
        return districts;
    }

    /**
     * Description : 根据code查询省市区名字
     * @date 2024/7/14
     * @param code 省市区的code
     * @return java.lang.String
     **/
    @Override
    public String getNameByCode(String code) {
        return districtMapper.queryDistrictByCode(code);
    }
}
