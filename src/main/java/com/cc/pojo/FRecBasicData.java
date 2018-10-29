package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_rec_basic_data 
 * @Description: TODO(类说明：廊桥基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FRecBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String number; 	//廊桥编号
	private String seat; 	//对应机位
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FRecBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param number	廊桥编号
	 * @param seat	对应机位
	 */ 
	public FRecBasicData(Integer id,String code,String number,String seat){
		this.id=id;
		this.code=code;
		this.number=number;
		this.seat=seat;
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
	 * @Description: TODO(设置Number	廊桥编号)
	 * @param number
	 */ 
	public void setNumber(String number){
		this.number=number;
	}
	/**
	 * @Title:setNumber 
	 * @Description: TODO(得到Number	廊桥编号)
	 * @return String
	 */ 
	public String getNumber(){
		return number;
	}
	/**
	 * @Title:setSeat 
	 * @Description: TODO(设置Seat	对应机位)
	 * @param seat
	 */ 
	public void setSeat(String seat){
		this.seat=seat;
	}
	/**
	 * @Title:setSeat 
	 * @Description: TODO(得到Seat	对应机位)
	 * @return String
	 */ 
	public String getSeat(){
		return seat;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FRecBasicData[id=" + id + ",code=" + code + ",number=" + number + ","+
		"seat=" + seat + "]";
	}
}

