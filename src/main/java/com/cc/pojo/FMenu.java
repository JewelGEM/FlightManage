package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_menu 
 * @Description: TODO(类说明：权限目录表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FMenu implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String name; 	//栏目名称
	private String url; 	//栏目路径
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FMenu(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param name	栏目名称
	 * @param url	栏目路径
	 */ 
	public FMenu(Integer id,String name,String url){
		this.id=id;
		this.name=name;
		this.url=url;
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
	 * @Description: TODO(设置Name	栏目名称)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	栏目名称)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setUrl 
	 * @Description: TODO(设置Url	栏目路径)
	 * @param url
	 */ 
	public void setUrl(String url){
		this.url=url;
	}
	/**
	 * @Title:setUrl 
	 * @Description: TODO(得到Url	栏目路径)
	 * @return String
	 */ 
	public String getUrl(){
		return url;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FMenu[id=" + id + ",name=" + name + ",url=" + url + "]";
	}
}

