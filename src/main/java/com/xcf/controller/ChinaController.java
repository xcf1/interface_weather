package com.xcf.controller;

import com.xcf.entity.Area;
import com.xcf.entity.City;
import com.xcf.entity.Province;
import com.xcf.service.AreaService;
import com.xcf.service.CityService;
import com.xcf.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class ChinaController {

    @Resource
    private ProvinceService provinceService;
    @Resource
    private CityService cityService;
    @Resource
    private AreaService areaService;

    @RequestMapping("/china")
    @ResponseBody
    public List<Province> SelectAllProvince(){
        List<Province> provinceList=provinceService.findAllProvince1();
        return provinceList;
    }

    //    @RequestMapping("/china/{province_id}")
    @RequestMapping("/china/{provinceid}")
    @ResponseBody
    public List<City> SelectAllCity(@PathVariable("provinceid")Integer provinceid){
        List<City> cityList=cityService.selectAllCity1(provinceid);
        return cityList;
    }

    //    @RequestMapping("/china/{province_id}/{city_id}")
    @RequestMapping("/china/{provinceid}/{cityid}")
    @ResponseBody
    public List<Area> SelectAllArea(@PathVariable("provinceid")Integer province_id,@PathVariable("cityid")Integer city_id){
        List<Area> areaList=areaService.selectAllArea1(province_id, city_id);
        return areaList;
    }
}