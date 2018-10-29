package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_seat_basic_data 
 * @Description: TODO(类说明：机位基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FSeatBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String number; 	//停机位编号
	private String model; 	//可停靠机型
	private String attribute; 	//机位属性
	private Integer lengt; 	//机位长
	private Integer breadth; 	//机位宽
	private Integer type; 	//机位类型
	private Integer states; 	//机位状态 1启用 2关闭
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FSeatBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param number	停机位编号
	 * @param model	可停靠机型
	 * @param attribute	机位属性
	 * @param lengt	机位长
	 * @param breadth	机位宽
	 * @param type	机位类型
	 * @param states	机位状态 1启用 2关闭
	 */ 
	public FSeatBasicData(Integer id,String code,String number,String model,String attribute,Integer lengt,Integer breadth,Integer type,Integer states){
		this.id=id;
		this.code=code;
		this.number=number;
		this.model=model;
		this.attribute=attribute;
		this.lengt=lengt;
		this.breadth=breadth;
		this.type=type;
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
	 * @Title:setNumber 
	 * @Description: TODO(设置Number	停机位编号)
	 * @param number
	 */ 
	public void setNumber(String number){
		this.number=number;
	}
	/**
	 * @Title:setNumber 
	 * @Description: TODO(得到Number	停机位编号)
	 * @return String
	 */ 
	public String getNumber(){
		return number;
	}
	/**
	 * @Title:setModel 
	 * @Description: TODO(设置Model	可停靠机型)
	 * @param model
	 */ 
	public void setModel(String model){
		this.model=model;
	}
	/**
	 * @Title:setModel 
	 * @Description: TODO(得到Model	可停靠机型)
	 * @return String
	 */ 
	public String getModel(){
		return model;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(设置Attribute	机位属性)
	 * @param attribute
	 */ 
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(得到Attribute	机位属性)
	 * @return String
	 */ 
	public String getAttribute(){
		return attribute;
	}
	/**
	 * @Title:setLengt 
	 * @Description: TODO(设置Lengt	机位长)
	 * @param lengt
	 */ 
	public void setLengt(Integer lengt){
		this.lengt=lengt;
	}
	/**
	 * @Title:setLengt 
	 * @Description: TODO(得到Lengt	机位长)
	 * @return Integer
	 */ 
	public Integer getLengt(){
		return lengt;
	}
	/**
	 * @Title:setBreadth 
	 * @Description: TODO(设置Breadth	机位宽)
	 * @param breadth
	 */ 
	public void setBreadth(Integer breadth){
		this.breadth=breadth;
	}
	/**
	 * @Title:setBreadth 
	 * @Description: TODO(得到Breadth	机位宽)
	 * @return Integer
	 */ 
	public Integer getBreadth(){
		return breadth;
	}
	/**
	 * @Title:setType 
	 * @Description: TODO(设置Type	机位类型)
	 * @param type
	 */ 
	public void setType(Integer type){
		this.type=type;
	}
	/**
	 * @Title:setType 
	 * @Description: TODO(得到Type	机位类型)
	 * @return Integer
	 */ 
	public Integer getType(){
		return type;
	}
	/**
	 * @Title:setStates 
	 * @Description: TODO(设置States	机位状态 1启用 2关闭)
	 * @param states
	 */ 
	public void setStates(Integer states){
		this.states=states;
	}
	/**
	 * @Title:setStates 
	 * @Description: TODO(得到States	机位状态 1启用 2关闭)
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
		return "FSeatBasicData[id=" + id + ",code=" + code + ",number=" + number + ","+
		"model=" + model + ",attribute=" + attribute + ",lengt=" + lengt + ","+
		"breadth=" + breadth + ",type=" + type + ",states=" + states + "]";
	}
}

