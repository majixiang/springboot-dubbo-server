package com.dingxianginc.springboot.dubbo.impl;



import com.alibaba.dubbo.config.annotation.Service;
import com.dingxianginc.springboot.domain.City;
import com.dingxianginc.springboot.dubbo.CityService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author: jixiang.ma@dingxing-inc.com
 * @Date: 2018/7/18 20:37
 * @Copyright: 2018 dingxiang-inc.com Inc. All rights reserved
 **/
//@Component("cityService")
@Service
public class CityServiceImpl implements CityService {
    @Override
    public City findCityByName(String cityName) {
        City c = new City();
        c.setName("南京");
        c.setDesc("真热");
        return c;
    }
}
