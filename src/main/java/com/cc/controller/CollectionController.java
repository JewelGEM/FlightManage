package com.cc.controller;

import com.alibaba.fastjson.JSONArray;
import com.cc.pojo.FCollection;
import com.cc.service.FCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class CollectionController {

    @Autowired
    private FCollectionService fCollectionService;

    /**
     * 查询所有接口
     */
    @RequestMapping("/getAllCollection.action")
    public String getAllCollection(HttpServletResponse resp) {
        List<FCollection> fCollectionList = fCollectionService.getAllCollection();
        String fCollectionListJson = JSONArray.toJSONString(fCollectionList);
        try {
            PrintWriter out = resp.getWriter();
            out.write(fCollectionListJson);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据id修改接口状态
     */
    @RequestMapping("/updateCollectionState.action")
    public String updateCollectionState(HttpServletRequest req) {
        String ID = req.getParameter("id");
        int id = Integer.parseInt(ID);
        String STATE = req.getParameter("state");
        int state = Integer.parseInt(STATE);
        FCollection fCollection = new FCollection();
        fCollection.setId(id);
        fCollection.setState(state);
        int i = fCollectionService.updateCollectionState(fCollection);
        return null;
    }

    /**
     * 根据id删除接口对象
     */
    @RequestMapping("/delConllection.action")
    public String delConllection(HttpServletRequest req) {
        String ID = req.getParameter("id");
        int id = Integer.parseInt(ID);
        int i = fCollectionService.delConllection(id);
        System.out.println(i);
        return null;
    }

}
