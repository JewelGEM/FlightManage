package com.cc.pojo;

public class T_Student {

    private Integer sid;
    private String sname;
    private String sex;
    private Integer age;
    private T_Class c;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public T_Class getC() {
        return c;
    }

    public void setC(T_Class c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "T_Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
