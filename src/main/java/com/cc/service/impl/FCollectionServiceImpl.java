package com.cc.service.impl;

import com.cc.dao.CollectionDao;
import com.cc.pojo.FCollection;
import com.cc.service.FCollectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("FCollectionServiceImpl")
public class FCollectionServiceImpl implements FCollectionService {

    @Resource
    private CollectionDao collectionDao;

    @Override
    public List<FCollection> getAllCollection() {
        return collectionDao.getAllCollection();
    }

    @Override
    public int updateCollectionState(FCollection fCollection) {
        return collectionDao.updateCollectionState(fCollection);
    }

    @Override
    public int delConllection(int id) {
        return collectionDao.delConllection(id);
    }
}
