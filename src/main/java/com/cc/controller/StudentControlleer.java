package com.cc.controller;

import com.alibaba.fastjson.JSON;
import com.cc.pojo.T_Student;
import com.cc.redis.RedisCache;
import com.cc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentControlleer {

    @Resource
    private RedisCache redisCache;

    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    public String addStudent(T_Student student){
        studentService.addStudent(student);
        return "/getStudentAll";
    }

    @RequestMapping("/getStudentAll")
    public String getStudent(){
        //方法名当键
        String key="com.cc.dao.StudentDao.getStudentAll";
        //得到值
        String data=redisCache.getDataFromRedis(key);
        //如果等于空在取值并放入redis缓存
        if(data==null){
            List<T_Student> studentAll = studentService.getStudentAll();
            String value=JSON.toJSONString(studentAll);
            redisCache.setDataToRedis(key,value);
        }else{
            data=redisCache.getDataFromRedis(key);
            System.out.println(data);
            List<T_Student> li=JSON.parseArray(data,T_Student.class);
        }
        return "/studentAll.jsp";
    }

    @RequestMapping("/login")
    public String login(T_Student student){

        return null;
    }

}
