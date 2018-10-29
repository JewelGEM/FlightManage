package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_flight_report_year 
 * @Description: TODO(类说明：年度航班信息统计表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FFlightReportYear implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private Integer day; 	//统计标示 哪一天
	private Integer flights; 	//航班架次
	private Integer passengers; 	//旅客数量
	private Integer cargoWeight; 	//货邮行重量
	private byte rtype; 	//统计类型1进港2出港3过站
	private String addTime; 	//统计时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FFlightReportYear(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param day	统计标示 哪一天
	 * @param flights	航班架次
	 * @param passengers	旅客数量
	 * @param cargoWeight	货邮行重量
	 * @param rtype	统计类型1进港2出港3过站
	 * @param addTime	统计时间
	 */ 
	public FFlightReportYear(Integer id,Integer day,Integer flights,Integer passengers,Integer cargoWeight,byte rtype,String addTime){
		this.id=id;
		this.day=day;
		this.flights=flights;
		this.passengers=passengers;
		this.cargoWeight=cargoWeight;
		this.rtype=rtype;
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
	 * @Title:setDay 
	 * @Description: TODO(设置Day	统计标示 哪一天)
	 * @param day
	 */ 
	public void setDay(Integer day){
		this.day=day;
	}
	/**
	 * @Title:setDay 
	 * @Description: TODO(得到Day	统计标示 哪一天)
	 * @return Integer
	 */ 
	public Integer getDay(){
		return day;
	}
	/**
	 * @Title:setFlights 
	 * @Description: TODO(设置Flights	航班架次)
	 * @param flights
	 */ 
	public void setFlights(Integer flights){
		this.flights=flights;
	}
	/**
	 * @Title:setFlights 
	 * @Description: TODO(得到Flights	航班架次)
	 * @return Integer
	 */ 
	public Integer getFlights(){
		return flights;
	}
	/**
	 * @Title:setPassengers 
	 * @Description: TODO(设置Passengers	旅客数量)
	 * @param passengers
	 */ 
	public void setPassengers(Integer passengers){
		this.passengers=passengers;
	}
	/**
	 * @Title:setPassengers 
	 * @Description: TODO(得到Passengers	旅客数量)
	 * @return Integer
	 */ 
	public Integer getPassengers(){
		return passengers;
	}
	/**
	 * @Title:setCargoWeight 
	 * @Description: TODO(设置CargoWeight	货邮行重量)
	 * @param cargoWeight
	 */ 
	public void setCargoWeight(Integer cargoWeight){
		this.cargoWeight=cargoWeight;
	}
	/**
	 * @Title:setCargoWeight 
	 * @Description: TODO(得到CargoWeight	货邮行重量)
	 * @return Integer
	 */ 
	public Integer getCargoWeight(){
		return cargoWeight;
	}
	/**
	 * @Title:setRtype 
	 * @Description: TODO(设置Rtype	统计类型1进港2出港3过站)
	 * @param rtype
	 */ 
	public void setRtype(byte rtype){
		this.rtype=rtype;
	}
	/**
	 * @Title:setRtype 
	 * @Description: TODO(得到Rtype	统计类型1进港2出港3过站)
	 * @return byte
	 */ 
	public byte getRtype(){
		return rtype;
	}
	/**
	 * @Title:setAddTime 
	 * @Description: TODO(设置AddTime	统计时间)
	 * @param addTime
	 */ 
	public void setAddTime(String addTime){
		this.addTime=addTime;
	}
	/**
	 * @Title:setAddTime 
	 * @Description: TODO(得到AddTime	统计时间)
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
		return "FFlightReportYear[id=" + id + ",day=" + day + ",flights=" + flights + ","+
		"passengers=" + passengers + ",cargoWeight=" + cargoWeight + ",rtype=" + rtype + ","+
		"addTime=" + addTime + "]";
	}
}

