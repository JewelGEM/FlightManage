package com.cc.service.impl;

import com.cc.dao.FAircraftBasicDataDao;
import com.cc.pojo.FAircraftBasicData;
import com.cc.pojo.FFlightRecord;
import com.cc.service.FAircraftBasicDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("FAircraftBasicDataServiceImpl")
public class FAircraftBasicDataServiceImpl implements FAircraftBasicDataService {

    @Resource
    private FAircraftBasicDataDao fAircraftBasicDataDao;

    @Override
    public List<FAircraftBasicData> getAllFAircraftBasicData() {
        return fAircraftBasicDataDao.getAllFAircraftBasicData();
    }

    @Override
    public FAircraftBasicData getFAircraftBasicDataById(int id) {
        return fAircraftBasicDataDao.getFAircraftBasicDataById(id);
    }

    @Override
    public int updateFFlightRecordById(Map<String,Object> map) {
        return fAircraftBasicDataDao.updateFFlightRecordById(map);
    }

    @Override
    public int updateFAircraftBasicDataById(Map<String,Object> map) {
        return fAircraftBasicDataDao.updateFAircraftBasicDataById(map);
    }

    @Override
    public List<FAircraftBasicData> getSomeFAircraftBasicDataBySelect(Map<String, Object> map) {
        return fAircraftBasicDataDao.getSomeFAircraftBasicDataBySelect(map);
    }
}
