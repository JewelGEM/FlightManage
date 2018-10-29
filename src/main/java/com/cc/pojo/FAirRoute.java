package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_air_route 
 * @Description: TODO(类说明：航线数据表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FAirRoute implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String airportStart; 	//起飞机场
	private String airportEnd; 	//降落机场
	private String airportEndSpare; 	//备降机场
	private double mileage; 	//里程
	private String addTime; 	//添加时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FAirRoute(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param airportStart	起飞机场
	 * @param airportEnd	降落机场
	 * @param airportEndSpare	备降机场
	 * @param mileage	里程
	 * @param addTime	添加时间
	 */ 
	public FAirRoute(Integer id,String airportStart,String airportEnd,String airportEndSpare,double mileage,String addTime){
		this.id=id;
		this.airportStart=airportStart;
		this.airportEnd=airportEnd;
		this.airportEndSpare=airportEndSpare;
		this.mileage=mileage;
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
	 * @Title:setAirportStart 
	 * @Description: TODO(设置AirportStart	起飞机场)
	 * @param airportStart
	 */ 
	public void setAirportStart(String airportStart){
		this.airportStart=airportStart;
	}
	/**
	 * @Title:setAirportStart 
	 * @Description: TODO(得到AirportStart	起飞机场)
	 * @return String
	 */ 
	public String getAirportStart(){
		return airportStart;
	}
	/**
	 * @Title:setAirportEnd 
	 * @Description: TODO(设置AirportEnd	降落机场)
	 * @param airportEnd
	 */ 
	public void setAirportEnd(String airportEnd){
		this.airportEnd=airportEnd;
	}
	/**
	 * @Title:setAirportEnd 
	 * @Description: TODO(得到AirportEnd	降落机场)
	 * @return String
	 */ 
	public String getAirportEnd(){
		return airportEnd;
	}
	/**
	 * @Title:setAirportEndSpare 
	 * @Description: TODO(设置AirportEndSpare	备降机场)
	 * @param airportEndSpare
	 */ 
	public void setAirportEndSpare(String airportEndSpare){
		this.airportEndSpare=airportEndSpare;
	}
	/**
	 * @Title:setAirportEndSpare 
	 * @Description: TODO(得到AirportEndSpare	备降机场)
	 * @return String
	 */ 
	public String getAirportEndSpare(){
		return airportEndSpare;
	}
	/**
	 * @Title:setMileage 
	 * @Description: TODO(设置Mileage	里程)
	 * @param mileage
	 */ 
	public void setMileage(double mileage){
		this.mileage=mileage;
	}
	/**
	 * @Title:setMileage 
	 * @Description: TODO(得到Mileage	里程)
	 * @return double
	 */ 
	public double getMileage(){
		return mileage;
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
		return "FAirRoute[id=" + id + ",airportStart=" + airportStart + ",airportEnd=" + airportEnd + ","+
		"airportEndSpare=" + airportEndSpare + ",mileage=" + mileage + ",addTime=" + addTime + "]";
	}
}

