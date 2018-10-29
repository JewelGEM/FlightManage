package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_admin_role 
 * @Description: TODO(类说明：用户组表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FAdminRole implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String name; 	//名称
	private String menuId; 	//权限控制
	private String addTime; 	//添加时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FAdminRole(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param name	名称
	 * @param menuId	权限控制
	 * @param addTime	添加时间
	 */ 
	public FAdminRole(Integer id,String name,String menuId,String addTime){
		this.id=id;
		this.name=name;
		this.menuId=menuId;
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
	 * @Description: TODO(设置Name	名称)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	名称)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setMenuId 
	 * @Description: TODO(设置MenuId	权限控制)
	 * @param menuId
	 */ 
	public void setMenuId(String menuId){
		this.menuId=menuId;
	}
	/**
	 * @Title:setMenuId 
	 * @Description: TODO(得到MenuId	权限控制)
	 * @return String
	 */ 
	public String getMenuId(){
		return menuId;
	}
	/**
	 * @Title:setAddTime 
	 * @Description: TODO(设置AddTime	添加时间)
	 * @param addTime
	 */ 
	public void setAddTime(String addTime){
		this.addTime=addTime;
	}
	/**
	 * @Title:setAddTime 
	 * @Description: TODO(得到AddTime	添加时间)
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
		return "FAdminRole[id=" + id + ",name=" + name + ",menuId=" + menuId + ","+
		"addTime=" + addTime + "]";
	}
}

