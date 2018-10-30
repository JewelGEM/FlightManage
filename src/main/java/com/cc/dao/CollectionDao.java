package com.cc.dao;

import com.cc.pojo.FCollection;

import java.util.List;

public interface CollectionDao {

    /*查询所有接口*/
    public List<FCollection> getAllCollection();

    /*根据id修改接口状态*/
    public int updateCollectionState(FCollection fCollection);

    /*根据id删除接口*/
    public int delConllection(int id);

}
