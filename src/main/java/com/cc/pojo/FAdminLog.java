package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_admin_log 
 * @Description: TODO(类说明：用户日志表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FAdminLog implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String username; 	//用户账号
	private String name; 	//名称
	private Integer roleId; 	//角色ID
	private String cotent; 	//日志信息
	private byte type; 	//日志类型
	private String addTime; 	//添加时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FAdminLog(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param username	用户账号
	 * @param name	名称
	 * @param roleId	角色ID
	 * @param cotent	日志信息
	 * @param type	日志类型
	 * @param addTime	添加时间
	 */ 
	public FAdminLog(Integer id,String username,String name,Integer roleId,String cotent,byte type,String addTime){
		this.id=id;
		this.username=username;
		this.name=name;
		this.roleId=roleId;
		this.cotent=cotent;
		this.type=type;
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
	 * @Title:setUsername 
	 * @Description: TODO(设置Username	用户账号)
	 * @param username
	 */ 
	public void setUsername(String username){
		this.username=username;
	}
	/**
	 * @Title:setUsername 
	 * @Description: TODO(得到Username	用户账号)
	 * @return String
	 */ 
	public String getUsername(){
		return username;
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
	 * @Title:setRoleId 
	 * @Description: TODO(设置RoleId	角色ID)
	 * @param roleId
	 */ 
	public void setRoleId(Integer roleId){
		this.roleId=roleId;
	}
	/**
	 * @Title:setRoleId 
	 * @Description: TODO(得到RoleId	角色ID)
	 * @return Integer
	 */ 
	public Integer getRoleId(){
		return roleId;
	}
	/**
	 * @Title:setCotent 
	 * @Description: TODO(设置Cotent	日志信息)
	 * @param cotent
	 */ 
	public void setCotent(String cotent){
		this.cotent=cotent;
	}
	/**
	 * @Title:setCotent 
	 * @Description: TODO(得到Cotent	日志信息)
	 * @return String
	 */ 
	public String getCotent(){
		return cotent;
	}
	/**
	 * @Title:setType 
	 * @Description: TODO(设置Type	日志类型)
	 * @param type
	 */ 
	public void setType(byte type){
		this.type=type;
	}
	/**
	 * @Title:setType 
	 * @Description: TODO(得到Type	日志类型)
	 * @return byte
	 */ 
	public byte getType(){
		return type;
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
		return "FAdminLog[id=" + id + ",username=" + username + ",name=" + name + ","+
		"roleId=" + roleId + ",cotent=" + cotent + ",type=" + type + ","+
		"addTime=" + addTime + "]";
	}
}

