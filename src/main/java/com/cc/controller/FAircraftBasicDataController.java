package com.cc.controller;

import com.alibaba.fastjson.JSONArray;
import com.cc.pojo.FAircompanytBasicData;
import com.cc.pojo.FAircraftBasicData;
import com.cc.pojo.FFlightRecord;
import com.cc.service.FAircraftBasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FAircraftBasicDataController {

    @Autowired
    private FAircraftBasicDataService fAircraftBasicDataService;

    /**
     * 查询所有航班
     * @return
     */
    @RequestMapping("/getAllFAircraftBasicData.action")
    public String getAllFAircraftBasicData(HttpServletResponse resp){
        List<FAircraftBasicData> allFAircraftBasicDataList = fAircraftBasicDataService.getAllFAircraftBasicData();
        String allFAircraftBasicDataListJson = JSONArray.toJSONString(allFAircraftBasicDataList);
        try {
            PrintWriter out = resp.getWriter();
            out.write(allFAircraftBasicDataListJson);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据id查询航班
     */
    @RequestMapping("/getFAircraftBasicDataById.action")
    public String getFAircraftBasicDataById(HttpServletRequest req, HttpServletResponse resp){
        int id = Integer.parseInt(req.getParameter("id"));
        FAircraftBasicData fAircraftBasicData = fAircraftBasicDataService.getFAircraftBasicDataById(id);
        String fAircraftBasicDataJson = JSONArray.toJSONString(fAircraftBasicData);
        try {
            PrintWriter out = resp.getWriter();
            out.write(fAircraftBasicDataJson);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据id修改航班动态信息
     */
    @RequestMapping("/updateFFlightRecordById.action")
    public String updateFFlightRecordById(HttpServletRequest req){
        Integer id = Integer.parseInt(req.getParameter("id"));
        Integer adultNum = Integer.parseInt(req.getParameter("adultNum"));
        Integer childNum = Integer.parseInt(req.getParameter("childNum"));
        Integer babyNum = Integer.parseInt(req.getParameter("babyNum"));
        Integer luggageNum = Integer.parseInt(req.getParameter("luggageNum"));
        double cargoWeight = Double.parseDouble(req.getParameter("cargoWeight"));
        String seat = req.getParameter("seat"); 	//机位
        String gate = req.getParameter("gate"); 	//登机口
        String luggageTurntable = req.getParameter("luggageTurntable"); 	//行李转盘
        String airportStart = req.getParameter("airportStart");
        String airportEndSpare = req.getParameter("airportEndSpare");
        Integer relationId = Integer.parseInt(req.getParameter("relationId")); 	//关联航班ID
        String  terminal = req.getParameter("terminal");
        String  flightAgent = req.getParameter("flightAgent");
        String delayRemark = req.getParameter("delayRemark");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",id);
        map.put("adultNum",adultNum);
        map.put("childNum",childNum);
        map.put("babyNum",babyNum);
        map.put("luggageNum",luggageNum);
        map.put("cargoWeight",cargoWeight);
        map.put("seat",seat);
        map.put("gate",gate);
        map.put("luggageTurntable",luggageTurntable);
        map.put("airportStart",airportStart);
        map.put("airportEndSpare",airportEndSpare);
        map.put("relationId",relationId);
        map.put("terminal",terminal);
        map.put("flightAgent",flightAgent);
        map.put("delayRemark",delayRemark);
        int i = fAircraftBasicDataService.updateFFlightRecordById(map);
        return null;
    }

    /**
     * 根据id修改航班动态信息2
     */
    @RequestMapping("/updateFAircraftBasicDataById.action")
    public String updateFAircraftBasicDataById(HttpServletRequest req){
        Integer id = Integer.parseInt(req.getParameter("id"));
        String state = req.getParameter("state");
        String isinit = req.getParameter("isinit");
        System.out.println(id);
        System.out.println(state);
        System.out.println(isinit);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",id);
        map.put("state",state);
        map.put("isinit",isinit);
        int i = fAircraftBasicDataService.updateFAircraftBasicDataById(map);
        System.out.println(i);
        return null;
    }

    /**
     * 根据条件查询航班
     */
    @RequestMapping("/getSomeFAircraftBasicDataBySelect.action")
    public String getSomeFAircraftBasicDataBySelect(HttpServletRequest req,HttpServletResponse resp){
        String flightNo = req.getParameter("flightNo");
        String no = req.getParameter("no");
        String doDate = req.getParameter("doDate");
        String isinit = req.getParameter("isinit");
        String aircraftPort = req.getParameter("aircraftPort");
        String airlineCompany = req.getParameter("airlineCompany");
        String nature = req.getParameter("nature");
        String state = req.getParameter("state");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("flightNo",flightNo);
        map.put("no",no);
        map.put("doDate",doDate);
        map.put("isinit",isinit);
        map.put("aircraftPort",aircraftPort);
        map.put("airlineCompany",airlineCompany);
        map.put("nature",nature);
        map.put("state",state);
        List<FAircraftBasicData> someFAircraftBasicDataBySelectList = fAircraftBasicDataService.getSomeFAircraftBasicDataBySelect(map);
        String someFAircraftBasicDataBySelectListJSON = JSONArray.toJSONString(someFAircraftBasicDataBySelectList);
        System.out.println(someFAircraftBasicDataBySelectListJSON);
        try {
            PrintWriter out = resp.getWriter();
            out.write(someFAircraftBasicDataBySelectListJSON);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
