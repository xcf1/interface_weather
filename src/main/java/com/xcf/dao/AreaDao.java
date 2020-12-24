package com.xcf.dao;

import com.xcf.entity.Area;

import java.util.List;

public interface AreaDao {


    List<Area> selectAllArea1(int provinceid,int cityid);
}
