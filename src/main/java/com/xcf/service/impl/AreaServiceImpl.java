package com.xcf.service.impl;

import com.xcf.dao.AreaDao;
import com.xcf.entity.Area;
import com.xcf.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaDao areaDao;



    @Override
    public List<Area> selectAllArea1(int provinceid, int cityid) {
        return areaDao.selectAllArea1(provinceid, cityid);
    }
}
