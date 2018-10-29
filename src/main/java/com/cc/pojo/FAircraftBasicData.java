package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_aircraft_basic_data 
 * @Description: TODO(类说明：飞机信息基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FAircraftBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String no; 	//机号
	private String model; 	//机型
	private String company; 	//所属航空公司
	private String attribute; 	//航空公司属性 国内或国外
	private String twoCode; 	//航空公司二字码
	private double wingspan; 	//翼展
	private double length; 	//长度
	private double height; 	//高度
	private Integer maxSeat; 	//实际最大座位数
	private double cargo; 	//载货量
	private double takeoffWeight; 	//最大起飞重量
	private double maxRange; 	//最大航程
	private double maxFuel; 	//最大燃油容量
	private String runway; 	//跑道要求
	private String aircraftType; 	//飞机类型
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FAircraftBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param no	机号
	 * @param model	机型
	 * @param company	所属航空公司
	 * @param attribute	航空公司属性 国内或国外
	 * @param twoCode	航空公司二字码
	 * @param wingspan	翼展
	 * @param length	长度
	 * @param height	高度
	 * @param maxSeat	实际最大座位数
	 * @param cargo	载货量
	 * @param takeoffWeight	最大起飞重量
	 * @param maxRange	最大航程
	 * @param maxFuel	最大燃油容量
	 * @param runway	跑道要求
	 * @param aircraftType	飞机类型
	 */ 
	public FAircraftBasicData(Integer id,String code,String no,String model,String company,String attribute,String twoCode,double wingspan,double length,double height,Integer maxSeat,double cargo,double takeoffWeight,double maxRange,double maxFuel,String runway,String aircraftType){
		this.id=id;
		this.code=code;
		this.no=no;
		this.model=model;
		this.company=company;
		this.attribute=attribute;
		this.twoCode=twoCode;
		this.wingspan=wingspan;
		this.length=length;
		this.height=height;
		this.maxSeat=maxSeat;
		this.cargo=cargo;
		this.takeoffWeight=takeoffWeight;
		this.maxRange=maxRange;
		this.maxFuel=maxFuel;
		this.runway=runway;
		this.aircraftType=aircraftType;
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
	 * @Title:setNo 
	 * @Description: TODO(设置No	机号)
	 * @param no
	 */ 
	public void setNo(String no){
		this.no=no;
	}
	/**
	 * @Title:setNo 
	 * @Description: TODO(得到No	机号)
	 * @return String
	 */ 
	public String getNo(){
		return no;
	}
	/**
	 * @Title:setModel 
	 * @Description: TODO(设置Model	机型)
	 * @param model
	 */ 
	public void setModel(String model){
		this.model=model;
	}
	/**
	 * @Title:setModel 
	 * @Description: TODO(得到Model	机型)
	 * @return String
	 */ 
	public String getModel(){
		return model;
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
	 * @Title:setTwoCode 
	 * @Description: TODO(设置TwoCode	航空公司二字码)
	 * @param twoCode
	 */ 
	public void setTwoCode(String twoCode){
		this.twoCode=twoCode;
	}
	/**
	 * @Title:setTwoCode 
	 * @Description: TODO(得到TwoCode	航空公司二字码)
	 * @return String
	 */ 
	public String getTwoCode(){
		return twoCode;
	}
	/**
	 * @Title:setWingspan 
	 * @Description: TODO(设置Wingspan	翼展)
	 * @param wingspan
	 */ 
	public void setWingspan(double wingspan){
		this.wingspan=wingspan;
	}
	/**
	 * @Title:setWingspan 
	 * @Description: TODO(得到Wingspan	翼展)
	 * @return double
	 */ 
	public double getWingspan(){
		return wingspan;
	}
	/**
	 * @Title:setLength 
	 * @Description: TODO(设置Length	长度)
	 * @param length
	 */ 
	public void setLength(double length){
		this.length=length;
	}
	/**
	 * @Title:setLength 
	 * @Description: TODO(得到Length	长度)
	 * @return double
	 */ 
	public double getLength(){
		return length;
	}
	/**
	 * @Title:setHeight 
	 * @Description: TODO(设置Height	高度)
	 * @param height
	 */ 
	public void setHeight(double height){
		this.height=height;
	}
	/**
	 * @Title:setHeight 
	 * @Description: TODO(得到Height	高度)
	 * @return double
	 */ 
	public double getHeight(){
		return height;
	}
	/**
	 * @Title:setMaxSeat 
	 * @Description: TODO(设置MaxSeat	实际最大座位数)
	 * @param maxSeat
	 */ 
	public void setMaxSeat(Integer maxSeat){
		this.maxSeat=maxSeat;
	}
	/**
	 * @Title:setMaxSeat 
	 * @Description: TODO(得到MaxSeat	实际最大座位数)
	 * @return Integer
	 */ 
	public Integer getMaxSeat(){
		return maxSeat;
	}
	/**
	 * @Title:setCargo 
	 * @Description: TODO(设置Cargo	载货量)
	 * @param cargo
	 */ 
	public void setCargo(double cargo){
		this.cargo=cargo;
	}
	/**
	 * @Title:setCargo 
	 * @Description: TODO(得到Cargo	载货量)
	 * @return double
	 */ 
	public double getCargo(){
		return cargo;
	}
	/**
	 * @Title:setTakeoffWeight 
	 * @Description: TODO(设置TakeoffWeight	最大起飞重量)
	 * @param takeoffWeight
	 */ 
	public void setTakeoffWeight(double takeoffWeight){
		this.takeoffWeight=takeoffWeight;
	}
	/**
	 * @Title:setTakeoffWeight 
	 * @Description: TODO(得到TakeoffWeight	最大起飞重量)
	 * @return double
	 */ 
	public double getTakeoffWeight(){
		return takeoffWeight;
	}
	/**
	 * @Title:setMaxRange 
	 * @Description: TODO(设置MaxRange	最大航程)
	 * @param maxRange
	 */ 
	public void setMaxRange(double maxRange){
		this.maxRange=maxRange;
	}
	/**
	 * @Title:setMaxRange 
	 * @Description: TODO(得到MaxRange	最大航程)
	 * @return double
	 */ 
	public double getMaxRange(){
		return maxRange;
	}
	/**
	 * @Title:setMaxFuel 
	 * @Description: TODO(设置MaxFuel	最大燃油容量)
	 * @param maxFuel
	 */ 
	public void setMaxFuel(double maxFuel){
		this.maxFuel=maxFuel;
	}
	/**
	 * @Title:setMaxFuel 
	 * @Description: TODO(得到MaxFuel	最大燃油容量)
	 * @return double
	 */ 
	public double getMaxFuel(){
		return maxFuel;
	}
	/**
	 * @Title:setRunway 
	 * @Description: TODO(设置Runway	跑道要求)
	 * @param runway
	 */ 
	public void setRunway(String runway){
		this.runway=runway;
	}
	/**
	 * @Title:setRunway 
	 * @Description: TODO(得到Runway	跑道要求)
	 * @return String
	 */ 
	public String getRunway(){
		return runway;
	}
	/**
	 * @Title:setAircraftType 
	 * @Description: TODO(设置AircraftType	飞机类型)
	 * @param aircraftType
	 */ 
	public void setAircraftType(String aircraftType){
		this.aircraftType=aircraftType;
	}
	/**
	 * @Title:setAircraftType 
	 * @Description: TODO(得到AircraftType	飞机类型)
	 * @return String
	 */ 
	public String getAircraftType(){
		return aircraftType;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FAircraftBasicData[id=" + id + ",code=" + code + ",no=" + no + ","+
		"model=" + model + ",company=" + company + ",attribute=" + attribute + ","+
		"twoCode=" + twoCode + ",wingspan=" + wingspan + ",length=" + length + ","+
		"height=" + height + ",maxSeat=" + maxSeat + ",cargo=" + cargo + ","+
		"takeoffWeight=" + takeoffWeight + ",maxRange=" + maxRange + ",maxFuel=" + maxFuel + ","+
		"runway=" + runway + ",aircraftType=" + aircraftType + "]";
	}
}

