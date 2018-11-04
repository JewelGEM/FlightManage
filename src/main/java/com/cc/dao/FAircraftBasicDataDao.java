package com.cc.dao;

import com.cc.pojo.FAircraftBasicData;
import com.cc.pojo.FFlightRecord;

import java.util.List;
import java.util.Map;

public interface FAircraftBasicDataDao {

    /*查询所有航班*/
    public List<FAircraftBasicData> getAllFAircraftBasicData();

    /*根据id查询航班*/
    public FAircraftBasicData getFAircraftBasicDataById(int id);

    /*根据id修改航班动态信息*/
    public int updateFFlightRecordById(Map<String,Object> map);

    /*根据id修改FAircraftBasicData对象*/
    public int updateFAircraftBasicDataById(Map<String,Object> map);

    /*根据条件查询航班*/
    public List<FAircraftBasicData> getSomeFAircraftBasicDataBySelect(Map<String,Object> map);
}
