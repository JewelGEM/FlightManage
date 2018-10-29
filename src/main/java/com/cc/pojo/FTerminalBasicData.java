package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_terminal_basic_data 
 * @Description: TODO(类说明：航站楼基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FTerminalBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String name; 	//航站楼名称
	private String attribute; 	//航站楼属性
	private String company; 	//所属航空公司
	private Integer states; 	//状态
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FTerminalBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param name	航站楼名称
	 * @param attribute	航站楼属性
	 * @param company	所属航空公司
	 * @param states	状态
	 */ 
	public FTerminalBasicData(Integer id,String code,String name,String attribute,String company,Integer states){
		this.id=id;
		this.code=code;
		this.name=name;
		this.attribute=attribute;
		this.company=company;
		this.states=states;
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
	 * @Description: TODO(设置Code	记录号)
	 * @param code
	 */ 
	public void setCode(String code){
		this.code=code;
	}
	/**
	 * @Title:setCode 
	 * @Description: TODO(得到Code	记录号)
	 * @return String
	 */ 
	public String getCode(){
		return code;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(设置Name	航站楼名称)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	航站楼名称)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(设置Attribute	航站楼属性)
	 * @param attribute
	 */ 
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(得到Attribute	航站楼属性)
	 * @return String
	 */ 
	public String getAttribute(){
		return attribute;
	}
	/**
	 * @Title:setCompany 
	 * @Description: TODO(设置Company	所属航空公司)
	 * @param company
	 */ 
	public void setCompany(String company){
		this.company=company;
	}
	/**
	 * @Title:setCompany 
	 * @Description: TODO(得到Company	所属航空公司)
	 * @return String
	 */ 
	public String getCompany(){
		return company;
	}
	/**
	 * @Title:setStates 
	 * @Description: TODO(设置States	状态)
	 * @param states
	 */ 
	public void setStates(Integer states){
		this.states=states;
	}
	/**
	 * @Title:setStates 
	 * @Description: TODO(得到States	状态)
	 * @return Integer
	 */ 
	public Integer getStates(){
		return states;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FTerminalBasicData[id=" + id + ",code=" + code + ",name=" + name + ","+
		"attribute=" + attribute + ",company=" + company + ",states=" + states + "]";
	}
}

