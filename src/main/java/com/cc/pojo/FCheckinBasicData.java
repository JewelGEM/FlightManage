package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_checkin_basic_data 
 * @Description: TODO(类说明：值机柜台基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FCheckinBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String name; 	//name
	private String number; 	//值机柜台编号
	private String company; 	//所属航空公司
	private String region; 	//对应区域
	private String terminal; 	//所属航站楼
	private String attribute; 	//值机柜台属性
	private Integer states; 	//状态 1开启 0关闭
	private String type; 	//类别
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FCheckinBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param name	name
	 * @param number	值机柜台编号
	 * @param company	所属航空公司
	 * @param region	对应区域
	 * @param terminal	所属航站楼
	 * @param attribute	值机柜台属性
	 * @param states	状态 1开启 0关闭
	 * @param type	类别
	 */ 
	public FCheckinBasicData(Integer id,String code,String name,String number,String company,String region,String terminal,String attribute,Integer states,String type){
		this.id=id;
		this.code=code;
		this.name=name;
		this.number=number;
		this.company=company;
		this.region=region;
		this.terminal=terminal;
		this.attribute=attribute;
		this.states=states;
		this.type=type;
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
	 * @Title:setNumber 
	 * @Description: TODO(设置Number	值机柜台编号)
	 * @param number
	 */ 
	public void setNumber(String number){
		this.number=number;
	}
	/**
	 * @Title:setNumber 
	 * @Description: TODO(得到Number	值机柜台编号)
	 * @return String
	 */ 
	public String getNumber(){
		return number;
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
	 * @Title:setRegion 
	 * @Description: TODO(设置Region	对应区域)
	 * @param region
	 */ 
	public void setRegion(String region){
		this.region=region;
	}
	/**
	 * @Title:setRegion 
	 * @Description: TODO(得到Region	对应区域)
	 * @return String
	 */ 
	public String getRegion(){
		return region;
	}
	/**
	 * @Title:setTerminal 
	 * @Description: TODO(设置Terminal	所属航站楼)
	 * @param terminal
	 */ 
	public void setTerminal(String terminal){
		this.terminal=terminal;
	}
	/**
	 * @Title:setTerminal 
	 * @Description: TODO(得到Terminal	所属航站楼)
	 * @return String
	 */ 
	public String getTerminal(){
		return terminal;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(设置Attribute	值机柜台属性)
	 * @param attribute
	 */ 
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(得到Attribute	值机柜台属性)
	 * @return String
	 */ 
	public String getAttribute(){
		return attribute;
	}
	/**
	 * @Title:setStates 
	 * @Description: TODO(设置States	状态 1开启 0关闭)
	 * @param states
	 */ 
	public void setStates(Integer states){
		this.states=states;
	}
	/**
	 * @Title:setStates 
	 * @Description: TODO(得到States	状态 1开启 0关闭)
	 * @return Integer
	 */ 
	public Integer getStates(){
		return states;
	}
	/**
	 * @Title:setType 
	 * @Description: TODO(设置Type	类别)
	 * @param type
	 */ 
	public void setType(String type){
		this.type=type;
	}
	/**
	 * @Title:setType 
	 * @Description: TODO(得到Type	类别)
	 * @return String
	 */ 
	public String getType(){
		return type;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FCheckinBasicData[id=" + id + ",code=" + code + ",name=" + name + ","+
		"number=" + number + ",company=" + company + ",region=" + region + ","+
		"terminal=" + terminal + ",attribute=" + attribute + ",states=" + states + ","+
		"type=" + type + "]";
	}
}

