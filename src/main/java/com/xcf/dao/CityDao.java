package com.xcf.dao;

import com.xcf.entity.City;

import java.util.List;

public interface CityDao {

    List<City> selectAllCity1(int provinceid);
}
