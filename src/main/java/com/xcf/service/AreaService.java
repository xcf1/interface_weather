package com.xcf.service;

import com.xcf.entity.Area;

import java.util.List;

public interface AreaService {

    List<Area> selectAllArea1(int provinceid,int cityid);
}
