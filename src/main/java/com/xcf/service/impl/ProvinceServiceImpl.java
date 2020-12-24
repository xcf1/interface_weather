package com.xcf.service.impl;

import com.xcf.dao.ProvinceDao;
import com.xcf.entity.Province;
import com.xcf.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    private  ProvinceDao provinceDao;

    @Override
    public List<Province> findAllProvince1() {
        return provinceDao.selectAllProvince1();
    }
}
