package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_airline_company 
 * @Description: TODO(类说明：航空公司表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FAirlineCompany implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String airlineCompany; 	//航空公司
	private String addTime; 	//添加时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FAirlineCompany(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param airlineCompany	航空公司
	 * @param addTime	添加时间
	 */ 
	public FAirlineCompany(Integer id,String airlineCompany,String addTime){
		this.id=id;
		this.airlineCompany=airlineCompany;
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
	 * @Title:setAirlineCompany 
	 * @Description: TODO(设置AirlineCompany	航空公司)
	 * @param airlineCompany
	 */ 
	public void setAirlineCompany(String airlineCompany){
		this.airlineCompany=airlineCompany;
	}
	/**
	 * @Title:setAirlineCompany 
	 * @Description: TODO(得到AirlineCompany	航空公司)
	 * @return String
	 */ 
	public String getAirlineCompany(){
		return airlineCompany;
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
		return "FAirlineCompany[id=" + id + ",airlineCompany=" + airlineCompany + ",addTime=" + addTime + "]";
	}
}

