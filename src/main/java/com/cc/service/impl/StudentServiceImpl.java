package com.cc.service.impl;

import com.cc.dao.StudentDao;
import com.cc.service.StudentService;
import com.cc.pojo.T_Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentServiceImpl")
@Scope("prototype")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao sd;

    @Override
    public void addStudent(T_Student student) {
        sd.addStudent(student);
    }

    @Override
    public List<T_Student> getStudentAll() {
        return sd.getStudentAll();
    }

}
