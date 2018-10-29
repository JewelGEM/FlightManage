package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_runway_basic_data 
 * @Description: TODO(类说明：跑道基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FRunwayBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String number; 	//跑道编号
	private double length; 	//跑道长度
	private String direction; 	//跑道方向
	private String attribute; 	//跑道属性
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FRunwayBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param number	跑道编号
	 * @param length	跑道长度
	 * @param direction	跑道方向
	 * @param attribute	跑道属性
	 */ 
	public FRunwayBasicData(Integer id,String code,String number,double length,String direction,String attribute){
		this.id=id;
		this.code=code;
		this.number=number;
		this.length=length;
		this.direction=direction;
		this.attribute=attribute;
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
	 * @Description: TODO(设置Number	跑道编号)
	 * @param number
	 */ 
	public void setNumber(String number){
		this.number=number;
	}
	/**
	 * @Title:setNumber 
	 * @Description: TODO(得到Number	跑道编号)
	 * @return String
	 */ 
	public String getNumber(){
		return number;
	}
	/**
	 * @Title:setLength 
	 * @Description: TODO(设置Length	跑道长度)
	 * @param length
	 */ 
	public void setLength(double length){
		this.length=length;
	}
	/**
	 * @Title:setLength 
	 * @Description: TODO(得到Length	跑道长度)
	 * @return double
	 */ 
	public double getLength(){
		return length;
	}
	/**
	 * @Title:setDirection 
	 * @Description: TODO(设置Direction	跑道方向)
	 * @param direction
	 */ 
	public void setDirection(String direction){
		this.direction=direction;
	}
	/**
	 * @Title:setDirection 
	 * @Description: TODO(得到Direction	跑道方向)
	 * @return String
	 */ 
	public String getDirection(){
		return direction;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(设置Attribute	跑道属性)
	 * @param attribute
	 */ 
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(得到Attribute	跑道属性)
	 * @return String
	 */ 
	public String getAttribute(){
		return attribute;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FRunwayBasicData[id=" + id + ",code=" + code + ",number=" + number + ","+
		"length=" + length + ",direction=" + direction + ",attribute=" + attribute + "]";
	}
}

