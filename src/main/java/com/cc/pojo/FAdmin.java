package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_admin 
 * @Description: TODO(类说明：用户表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FAdmin implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//编号
	private String username; 	//用户账号
	private String password; 	//用户密码
	private String name; 	//名称
	private byte sex; 	//0保密1男2女
	private byte age; 	//年龄
	private String post; 	//职务
	private String qq; 	//QQ
	private String tel; 	//联系电话
	private String email; 	//邮箱
	private String other; 	//其它联系方式
	private Integer roleId; 	//角色ID
	private byte state; 	//账号状态1正常0停用
	private String addTime; 	//添加时间
	private String loginTime; 	//login_time
	private String remark; 	//备注
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FAdmin(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	编号
	 * @param username	用户账号
	 * @param password	用户密码
	 * @param name	名称
	 * @param sex	0保密1男2女
	 * @param age	年龄
	 * @param post	职务
	 * @param qq	QQ
	 * @param tel	联系电话
	 * @param email	邮箱
	 * @param other	其它联系方式
	 * @param roleId	角色ID
	 * @param state	账号状态1正常0停用
	 * @param addTime	添加时间
	 * @param loginTime	login_time
	 * @param remark	备注
	 */ 
	public FAdmin(Integer id,String code,String username,String password,String name,byte sex,byte age,String post,String qq,String tel,String email,String other,Integer roleId,byte state,String addTime,String loginTime,String remark){
		this.id=id;
		this.code=code;
		this.username=username;
		this.password=password;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.post=post;
		this.qq=qq;
		this.tel=tel;
		this.email=email;
		this.other=other;
		this.roleId=roleId;
		this.state=state;
		this.addTime=addTime;
		this.loginTime=loginTime;
		this.remark=remark;
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
	 * @Description: TODO(设置Code	编号)
	 * @param code
	 */ 
	public void setCode(String code){
		this.code=code;
	}
	/**
	 * @Title:setCode 
	 * @Description: TODO(得到Code	编号)
	 * @return String
	 */ 
	public String getCode(){
		return code;
	}
	/**
	 * @Title:setUsername 
	 * @Description: TODO(设置Username	用户账号)
	 * @param username
	 */ 
	public void setUsername(String username){
		this.username=username;
	}
	/**
	 * @Title:setUsername 
	 * @Description: TODO(得到Username	用户账号)
	 * @return String
	 */ 
	public String getUsername(){
		return username;
	}
	/**
	 * @Title:setPassword 
	 * @Description: TODO(设置Password	用户密码)
	 * @param password
	 */ 
	public void setPassword(String password){
		this.password=password;
	}
	/**
	 * @Title:setPassword 
	 * @Description: TODO(得到Password	用户密码)
	 * @return String
	 */ 
	public String getPassword(){
		return password;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(设置Name	名称)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	名称)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setSex 
	 * @Description: TODO(设置Sex	0保密1男2女)
	 * @param sex
	 */ 
	public void setSex(byte sex){
		this.sex=sex;
	}
	/**
	 * @Title:setSex 
	 * @Description: TODO(得到Sex	0保密1男2女)
	 * @return byte
	 */ 
	public byte getSex(){
		return sex;
	}
	/**
	 * @Title:setAge 
	 * @Description: TODO(设置Age	年龄)
	 * @param age
	 */ 
	public void setAge(byte age){
		this.age=age;
	}
	/**
	 * @Title:setAge 
	 * @Description: TODO(得到Age	年龄)
	 * @return byte
	 */ 
	public byte getAge(){
		return age;
	}
	/**
	 * @Title:setPost 
	 * @Description: TODO(设置Post	职务)
	 * @param post
	 */ 
	public void setPost(String post){
		this.post=post;
	}
	/**
	 * @Title:setPost 
	 * @Description: TODO(得到Post	职务)
	 * @return String
	 */ 
	public String getPost(){
		return post;
	}
	/**
	 * @Title:setQq 
	 * @Description: TODO(设置Qq	QQ)
	 * @param qq
	 */ 
	public void setQq(String qq){
		this.qq=qq;
	}
	/**
	 * @Title:setQq 
	 * @Description: TODO(得到Qq	QQ)
	 * @return String
	 */ 
	public String getQq(){
		return qq;
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
	 * @Title:setEmail 
	 * @Description: TODO(设置Email	邮箱)
	 * @param email
	 */ 
	public void setEmail(String email){
		this.email=email;
	}
	/**
	 * @Title:setEmail 
	 * @Description: TODO(得到Email	邮箱)
	 * @return String
	 */ 
	public String getEmail(){
		return email;
	}
	/**
	 * @Title:setOther 
	 * @Description: TODO(设置Other	其它联系方式)
	 * @param other
	 */ 
	public void setOther(String other){
		this.other=other;
	}
	/**
	 * @Title:setOther 
	 * @Description: TODO(得到Other	其它联系方式)
	 * @return String
	 */ 
	public String getOther(){
		return other;
	}
	/**
	 * @Title:setRoleId 
	 * @Description: TODO(设置RoleId	角色ID)
	 * @param roleId
	 */ 
	public void setRoleId(Integer roleId){
		this.roleId=roleId;
	}
	/**
	 * @Title:setRoleId 
	 * @Description: TODO(得到RoleId	角色ID)
	 * @return Integer
	 */ 
	public Integer getRoleId(){
		return roleId;
	}
	/**
	 * @Title:setState 
	 * @Description: TODO(设置State	账号状态1正常0停用)
	 * @param state
	 */ 
	public void setState(byte state){
		this.state=state;
	}
	/**
	 * @Title:setState 
	 * @Description: TODO(得到State	账号状态1正常0停用)
	 * @return byte
	 */ 
	public byte getState(){
		return state;
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
	 * @Title:setLoginTime 
	 * @Description: TODO(设置LoginTime	login_time)
	 * @param loginTime
	 */ 
	public void setLoginTime(String loginTime){
		this.loginTime=loginTime;
	}
	/**
	 * @Title:setLoginTime 
	 * @Description: TODO(得到LoginTime	login_time)
	 * @return String
	 */ 
	public String getLoginTime(){
		return loginTime;
	}
	/**
	 * @Title:setRemark 
	 * @Description: TODO(设置Remark	备注)
	 * @param remark
	 */ 
	public void setRemark(String remark){
		this.remark=remark;
	}
	/**
	 * @Title:setRemark 
	 * @Description: TODO(得到Remark	备注)
	 * @return String
	 */ 
	public String getRemark(){
		return remark;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FAdmin[id=" + id + ",code=" + code + ",username=" + username + ","+
		"password=" + password + ",name=" + name + ",sex=" + sex + ","+
		"age=" + age + ",post=" + post + ",qq=" + qq + ","+
		"tel=" + tel + ",email=" + email + ",other=" + other + ","+
		"roleId=" + roleId + ",state=" + state + ",addTime=" + addTime + ","+
		"loginTime=" + loginTime + ",remark=" + remark + "]";
	}
}

