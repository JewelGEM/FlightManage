package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_channel_basic_data 
 * @Description: TODO(类说明：安检通道数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FChannelBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String number; 	//安检通道编号
	private String attribute; 	//安检通道属性
	private String region; 	//对应区域
	private Integer states; 	//安检口状态 1开启  2关闭
	private String terminal; 	//所属航站楼
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FChannelBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param number	安检通道编号
	 * @param attribute	安检通道属性
	 * @param region	对应区域
	 * @param states	安检口状态 1开启  2关闭
	 * @param terminal	所属航站楼
	 */ 
	public FChannelBasicData(Integer id,String code,String number,String attribute,String region,Integer states,String terminal){
		this.id=id;
		this.code=code;
		this.number=number;
		this.attribute=attribute;
		this.region=region;
		this.states=states;
		this.terminal=terminal;
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
	 * @Title:setNumber 
	 * @Description: TODO(设置Number	安检通道编号)
	 * @param number
	 */ 
	public void setNumber(String number){
		this.number=number;
	}
	/**
	 * @Title:setNumber 
	 * @Description: TODO(得到Number	安检通道编号)
	 * @return String
	 */ 
	public String getNumber(){
		return number;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(设置Attribute	安检通道属性)
	 * @param attribute
	 */ 
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(得到Attribute	安检通道属性)
	 * @return String
	 */ 
	public String getAttribute(){
		return attribute;
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
	 * @Title:setStates 
	 * @Description: TODO(设置States	安检口状态 1开启  2关闭)
	 * @param states
	 */ 
	public void setStates(Integer states){
		this.states=states;
	}
	/**
	 * @Title:setStates 
	 * @Description: TODO(得到States	安检口状态 1开启  2关闭)
	 * @return Integer
	 */ 
	public Integer getStates(){
		return states;
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
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FChannelBasicData[id=" + id + ",code=" + code + ",number=" + number + ","+
		"attribute=" + attribute + ",region=" + region + ",states=" + states + ","+
		"terminal=" + terminal + "]";
	}
}

