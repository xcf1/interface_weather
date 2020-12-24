package com.xcf.service.impl;

import com.xcf.dao.CityDao;
import com.xcf.entity.City;
import com.xcf.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityDao cityDao;


    @Override
    public List<City> selectAllCity1(int provinceid) {
        return cityDao.selectAllCity1(provinceid);
    }
}
