package com.cc.pojo;

import javax.xml.crypto.Data;
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
	private String updateTime;  //更新日期
	private int state;  //当前状态
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

	public FCollection(Integer id, String name, String url, String updateTime, int state) {
		this.id = id;
		this.name = name;
		Url = url;
		this.updateTime = updateTime;
		this.state = state;
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

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */
	@Override
	public String toString() {
		return "FCollection{" +
				"id=" + id +
				", name='" + name + '\'' +
				", Url='" + Url + '\'' +
				", updateTime='" + updateTime + '\'' +
				", state=" + state +
				'}';
	}
}

