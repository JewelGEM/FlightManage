package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_collection 
 * @Description: TODO(类说明： )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FCollection implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String name; 	//API名称
	private String Url; 	//Url
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FCollection(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param name	API名称
	 * @param Url	Url
	 */ 
	public FCollection(Integer id,String name,String Url){
		this.id=id;
		this.name=name;
		this.Url=Url;
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
	 * @Title:setName 
	 * @Description: TODO(设置Name	API名称)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	API名称)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setUrl 
	 * @Description: TODO(设置Url	Url)
	 * @param Url
	 */ 
	public void setUrl(String Url){
		this.Url=Url;
	}
	/**
	 * @Title:setUrl 
	 * @Description: TODO(得到Url	Url)
	 * @return String
	 */ 
	public String getUrl(){
		return Url;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FCollection[id=" + id + ",name=" + name + ",Url=" + Url + "]";
	}
}

