package com.cc.service;

import com.cc.pojo.T_Student;

import java.util.List;

public interface StudentService {

    public void addStudent(T_Student student);

    public List<T_Student> getStudentAll();

}
