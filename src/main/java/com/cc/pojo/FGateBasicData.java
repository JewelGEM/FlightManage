package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_gate_basic_data 
 * @Description: TODO(类说明：登机口基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FGateBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String attribute; 	//航空公司属性 国内或国外
	private Integer type; 	//类型 1近 2远 
	private String channel; 	//对应航站楼
	private String name; 	//登机口名称
	private String seat; 	//对应机位
	private Integer states; 	//登机记状态  1正在登记 2未使用
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FGateBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param attribute	航空公司属性 国内或国外
	 * @param type	类型 1近 2远 
	 * @param channel	对应航站楼
	 * @param name	登机口名称
	 * @param seat	对应机位
	 * @param states	登机记状态  1正在登记 2未使用
	 */ 
	public FGateBasicData(Integer id,String code,String attribute,Integer type,String channel,String name,String seat,Integer states){
		this.id=id;
		this.code=code;
		this.attribute=attribute;
		this.type=type;
		this.channel=channel;
		this.name=name;
		this.seat=seat;
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
	 * @Title:setAttribute 
	 * @Description: TODO(设置Attribute	航空公司属性 国内或国外)
	 * @param attribute
	 */ 
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(得到Attribute	航空公司属性 国内或国外)
	 * @return String
	 */ 
	public String getAttribute(){
		return attribute;
	}
	/**
	 * @Title:setType 
	 * @Description: TODO(设置Type	类型 1近 2远 )
	 * @param type
	 */ 
	public void setType(Integer type){
		this.type=type;
	}
	/**
	 * @Title:setType 
	 * @Description: TODO(得到Type	类型 1近 2远 )
	 * @return Integer
	 */ 
	public Integer getType(){
		return type;
	}
	/**
	 * @Title:setChannel 
	 * @Description: TODO(设置Channel	对应航站楼)
	 * @param channel
	 */ 
	public void setChannel(String channel){
		this.channel=channel;
	}
	/**
	 * @Title:setChannel 
	 * @Description: TODO(得到Channel	对应航站楼)
	 * @return String
	 */ 
	public String getChannel(){
		return channel;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(设置Name	登机口名称)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	登机口名称)
	 * @return String
	 */ 
	public String getName(){
		return name;
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
	 * @Title:setStates 
	 * @Description: TODO(设置States	登机记状态  1正在登记 2未使用)
	 * @param states
	 */ 
	public void setStates(Integer states){
		this.states=states;
	}
	/**
	 * @Title:setStates 
	 * @Description: TODO(得到States	登机记状态  1正在登记 2未使用)
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
		return "FGateBasicData[id=" + id + ",code=" + code + ",attribute=" + attribute + ","+
		"type=" + type + ",channel=" + channel + ",name=" + name + ","+
		"seat=" + seat + ",states=" + states + "]";
	}
}

