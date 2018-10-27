package com.cc.dao;

import com.cc.pojo.T_Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentDao {


    public void addStudent(T_Student student);

    public List<T_Student> getStudentAll();

//    public T_Student

}
