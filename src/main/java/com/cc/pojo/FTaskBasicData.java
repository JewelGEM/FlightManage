package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_task_basic_data 
 * @Description: TODO(类说明：航班任务基础数据; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FTaskBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String synopsis; 	//任务简称
	private String name; 	//任务性质
	private String enName; 	//英文名称
	private String taskCode; 	//任务性质代码
	private Integer rank; 	//任务排序
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FTaskBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param synopsis	任务简称
	 * @param name	任务性质
	 * @param enName	英文名称
	 * @param taskCode	任务性质代码
	 * @param rank	任务排序
	 */ 
	public FTaskBasicData(Integer id,String code,String synopsis,String name,String enName,String taskCode,Integer rank){
		this.id=id;
		this.code=code;
		this.synopsis=synopsis;
		this.name=name;
		this.enName=enName;
		this.taskCode=taskCode;
		this.rank=rank;
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
	 * @Title:setSynopsis 
	 * @Description: TODO(设置Synopsis	任务简称)
	 * @param synopsis
	 */ 
	public void setSynopsis(String synopsis){
		this.synopsis=synopsis;
	}
	/**
	 * @Title:setSynopsis 
	 * @Description: TODO(得到Synopsis	任务简称)
	 * @return String
	 */ 
	public String getSynopsis(){
		return synopsis;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(设置Name	任务性质)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	任务性质)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setEnName 
	 * @Description: TODO(设置EnName	英文名称)
	 * @param enName
	 */ 
	public void setEnName(String enName){
		this.enName=enName;
	}
	/**
	 * @Title:setEnName 
	 * @Description: TODO(得到EnName	英文名称)
	 * @return String
	 */ 
	public String getEnName(){
		return enName;
	}
	/**
	 * @Title:setTaskCode 
	 * @Description: TODO(设置TaskCode	任务性质代码)
	 * @param taskCode
	 */ 
	public void setTaskCode(String taskCode){
		this.taskCode=taskCode;
	}
	/**
	 * @Title:setTaskCode 
	 * @Description: TODO(得到TaskCode	任务性质代码)
	 * @return String
	 */ 
	public String getTaskCode(){
		return taskCode;
	}
	/**
	 * @Title:setRank 
	 * @Description: TODO(设置Rank	任务排序)
	 * @param rank
	 */ 
	public void setRank(Integer rank){
		this.rank=rank;
	}
	/**
	 * @Title:setRank 
	 * @Description: TODO(得到Rank	任务排序)
	 * @return Integer
	 */ 
	public Integer getRank(){
		return rank;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FTaskBasicData[id=" + id + ",code=" + code + ",synopsis=" + synopsis + ","+
		"name=" + name + ",enName=" + enName + ",taskCode=" + taskCode + ","+
		"rank=" + rank + "]";
	}
}

