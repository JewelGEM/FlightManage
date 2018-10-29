package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_airport_basic_data 
 * @Description: TODO(类说明：机场基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FAirportBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String name; 	//机场名称
	private String routeAbb; 	//航线简称
	private String enAbb; 	//英文简称
	private String attribute; 	//航空公司属性 国内或国外
	private String threeCode; 	//机场三字码
	private String fourCode; 	//机场四字码
	private String city; 	//机场所属城市
	private String level; 	//机场等级
	private String address; 	//地址
	private String tel; 	//联系电话
	private String province; 	//省份
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FAirportBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param name	机场名称
	 * @param routeAbb	航线简称
	 * @param enAbb	英文简称
	 * @param attribute	航空公司属性 国内或国外
	 * @param threeCode	机场三字码
	 * @param fourCode	机场四字码
	 * @param city	机场所属城市
	 * @param level	机场等级
	 * @param address	地址
	 * @param tel	联系电话
	 * @param province	省份
	 */ 
	public FAirportBasicData(Integer id,String code,String name,String routeAbb,String enAbb,String attribute,String threeCode,String fourCode,String city,String level,String address,String tel,String province){
		this.id=id;
		this.code=code;
		this.name=name;
		this.routeAbb=routeAbb;
		this.enAbb=enAbb;
		this.attribute=attribute;
		this.threeCode=threeCode;
		this.fourCode=fourCode;
		this.city=city;
		this.level=level;
		this.address=address;
		this.tel=tel;
		this.province=province;
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
	 * @Title:setName 
	 * @Description: TODO(设置Name	机场名称)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	机场名称)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setRouteAbb 
	 * @Description: TODO(设置RouteAbb	航线简称)
	 * @param routeAbb
	 */ 
	public void setRouteAbb(String routeAbb){
		this.routeAbb=routeAbb;
	}
	/**
	 * @Title:setRouteAbb 
	 * @Description: TODO(得到RouteAbb	航线简称)
	 * @return String
	 */ 
	public String getRouteAbb(){
		return routeAbb;
	}
	/**
	 * @Title:setEnAbb 
	 * @Description: TODO(设置EnAbb	英文简称)
	 * @param enAbb
	 */ 
	public void setEnAbb(String enAbb){
		this.enAbb=enAbb;
	}
	/**
	 * @Title:setEnAbb 
	 * @Description: TODO(得到EnAbb	英文简称)
	 * @return String
	 */ 
	public String getEnAbb(){
		return enAbb;
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
	 * @Title:setThreeCode 
	 * @Description: TODO(设置ThreeCode	机场三字码)
	 * @param threeCode
	 */ 
	public void setThreeCode(String threeCode){
		this.threeCode=threeCode;
	}
	/**
	 * @Title:setThreeCode 
	 * @Description: TODO(得到ThreeCode	机场三字码)
	 * @return String
	 */ 
	public String getThreeCode(){
		return threeCode;
	}
	/**
	 * @Title:setFourCode 
	 * @Description: TODO(设置FourCode	机场四字码)
	 * @param fourCode
	 */ 
	public void setFourCode(String fourCode){
		this.fourCode=fourCode;
	}
	/**
	 * @Title:setFourCode 
	 * @Description: TODO(得到FourCode	机场四字码)
	 * @return String
	 */ 
	public String getFourCode(){
		return fourCode;
	}
	/**
	 * @Title:setCity 
	 * @Description: TODO(设置City	机场所属城市)
	 * @param city
	 */ 
	public void setCity(String city){
		this.city=city;
	}
	/**
	 * @Title:setCity 
	 * @Description: TODO(得到City	机场所属城市)
	 * @return String
	 */ 
	public String getCity(){
		return city;
	}
	/**
	 * @Title:setLevel 
	 * @Description: TODO(设置Level	机场等级)
	 * @param level
	 */ 
	public void setLevel(String level){
		this.level=level;
	}
	/**
	 * @Title:setLevel 
	 * @Description: TODO(得到Level	机场等级)
	 * @return String
	 */ 
	public String getLevel(){
		return level;
	}
	/**
	 * @Title:setAddress 
	 * @Description: TODO(设置Address	地址)
	 * @param address
	 */ 
	public void setAddress(String address){
		this.address=address;
	}
	/**
	 * @Title:setAddress 
	 * @Description: TODO(得到Address	地址)
	 * @return String
	 */ 
	public String getAddress(){
		return address;
	}
	/**
	 * @Title:setTel 
	 * @Description: TODO(设置Tel	联系电话)
	 * @param tel
	 */ 
	public void setTel(String tel){
		this.tel=tel;
	}
	/**
	 * @Title:setTel 
	 * @Description: TODO(得到Tel	联系电话)
	 * @return String
	 */ 
	public String getTel(){
		return tel;
	}
	/**
	 * @Title:setProvince 
	 * @Description: TODO(设置Province	省份)
	 * @param province
	 */ 
	public void setProvince(String province){
		this.province=province;
	}
	/**
	 * @Title:setProvince 
	 * @Description: TODO(得到Province	省份)
	 * @return String
	 */ 
	public String getProvince(){
		return province;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FAirportBasicData[id=" + id + ",code=" + code + ",name=" + name + ","+
		"routeAbb=" + routeAbb + ",enAbb=" + enAbb + ",attribute=" + attribute + ","+
		"threeCode=" + threeCode + ",fourCode=" + fourCode + ",city=" + city + ","+
		"level=" + level + ",address=" + address + ",tel=" + tel + ","+
		"province=" + province + "]";
	}
}

