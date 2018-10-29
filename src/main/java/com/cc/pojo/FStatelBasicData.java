package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_statel_basic_data 
 * @Description: TODO(类说明：航班状态基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FStatelBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//code
	private String name; 	//name
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FStatelBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	code
	 * @param name	name
	 */ 
	public FStatelBasicData(Integer id,String code,String name){
		this.id=id;
		this.code=code;
		this.name=name;
	}
	/**
	 * @Title:setId 
	 * @Description: TODO(设置Id	id)
	 * @param id
	 */ 
	public void setId(Integer id){
		this.id=id;
	}
	/**
	 * @Title:setId 
	 * @Description: TODO(得到Id	id)
	 * @return Integer
	 */ 
	public Integer getId(){
		return id;
	}
	/**
	 * @Title:setCode 
	 * @Description: TODO(设置Code	code)
	 * @param code
	 */ 
	public void setCode(String code){
		this.code=code;
	}
	/**
	 * @Title:setCode 
	 * @Description: TODO(得到Code	code)
	 * @return String
	 */ 
	public String getCode(){
		return code;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(设置Name	name)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	name)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FStatelBasicData[id=" + id + ",code=" + code + ",name=" + name + "]";
	}
}

