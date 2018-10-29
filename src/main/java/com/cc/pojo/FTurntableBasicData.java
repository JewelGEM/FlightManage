package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_turntable_basic_data 
 * @Description: TODO(类说明：行李转盘基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FTurntableBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private Integer states; 	//状态
	private String attribute; 	//航空公司属性 国内或国外
	private String company; 	//所属航空公司
	private String number; 	//行李转盘编号
	private String terminal; 	//所属航站楼
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FTurntableBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param states	状态
	 * @param attribute	航空公司属性 国内或国外
	 * @param company	所属航空公司
	 * @param number	行李转盘编号
	 * @param terminal	所属航站楼
	 */ 
	public FTurntableBasicData(Integer id,String code,Integer states,String attribute,String company,String number,String terminal){
		this.id=id;
		this.code=code;
		this.states=states;
		this.attribute=attribute;
		this.company=company;
		this.number=number;
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
	 * @Title:setNumber 
	 * @Description: TODO(设置Number	行李转盘编号)
	 * @param number
	 */ 
	public void setNumber(String number){
		this.number=number;
	}
	/**
	 * @Title:setNumber 
	 * @Description: TODO(得到Number	行李转盘编号)
	 * @return String
	 */ 
	public String getNumber(){
		return number;
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
		return "FTurntableBasicData[id=" + id + ",code=" + code + ",states=" + states + ","+
		"attribute=" + attribute + ",company=" + company + ",number=" + number + ","+
		"terminal=" + terminal + "]";
	}
}

