package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_backup 
 * @Description: TODO(类说明：备份日志表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FBackup implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String name; 	//备份名称
	private String addTime; 	//操作时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FBackup(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param name	备份名称
	 * @param addTime	操作时间
	 */ 
	public FBackup(Integer id,String name,String addTime){
		this.id=id;
		this.name=name;
		this.addTime=addTime;
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
	 * @Title:setName 
	 * @Description: TODO(设置Name	备份名称)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	备份名称)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setAddTime 
	 * @Description: TODO(设置AddTime	操作时间)
	 * @param addTime
	 */ 
	public void setAddTime(String addTime){
		this.addTime=addTime;
	}
	/**
	 * @Title:setAddTime 
	 * @Description: TODO(得到AddTime	操作时间)
	 * @return String
	 */ 
	public String getAddTime(){
		return addTime;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FBackup[id=" + id + ",name=" + name + ",addTime=" + addTime + "]";
	}
}

