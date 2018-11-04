package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_aircompanyt_basic_data
 * @Description: TODO(类说明：航空公司基础数据; InnoDB free: 10240 kB )
 * @author ME CC
 * @date 2018-10-28 10:54:07
 */
public class FAircompanytBasicData implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String code; 	//记录号
	private String enAbb; 	//英文简称
	private String name; 	//航空公司名称
	private String branchName; 	//分公司名称
	private String twoCode; 	//航空公司二字码
	private String threeCode; 	//航空公司三字码
	private String attribute; 	//航空公司属性 国内或国外
	private String tel; 	//联系电话
	private String linkman; 	//联系人
	private String linkmanPost; 	//联系人职务
	private Integer firstTime; 	//首飞时间
	private String email; 	//邮箱
	/**
	 * @Description: TODO(无参构造方法)
	 */
	public FAircompanytBasicData(){
	}
	/**
	 * @Description: TODO(有参构造方法)
	 * @param id	id
	 * @param code	记录号
	 * @param enAbb	英文简称
	 * @param name	航空公司名称
	 * @param branchName	分公司名称
	 * @param twoCode	航空公司二字码
	 * @param threeCode	航空公司三字码
	 * @param attribute	航空公司属性 国内或国外
	 * @param tel	联系电话
	 * @param linkman	联系人
	 * @param linkmanPost	联系人职务
	 * @param firstTime	首飞时间
	 * @param email	邮箱
	 */
	public FAircompanytBasicData(Integer id,String code,String enAbb,String name,String branchName,String twoCode,String threeCode,String attribute,String tel,String linkman,String linkmanPost,Integer firstTime,String email){
		this.id=id;
		this.code=code;
		this.enAbb=enAbb;
		this.name=name;
		this.branchName=branchName;
		this.twoCode=twoCode;
		this.threeCode=threeCode;
		this.attribute=attribute;
		this.tel=tel;
		this.linkman=linkman;
		this.linkmanPost=linkmanPost;
		this.firstTime=firstTime;
		this.email=email;
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
	 * @Title:setName
	 * @Description: TODO(设置Name	航空公司名称)
	 * @param name
	 */
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName
	 * @Description: TODO(得到Name	航空公司名称)
	 * @return String
	 */
	public String getName(){
		return name;
	}
	/**
	 * @Title:setBranchName
	 * @Description: TODO(设置BranchName	分公司名称)
	 * @param branchName
	 */
	public void setBranchName(String branchName){
		this.branchName=branchName;
	}
	/**
	 * @Title:setBranchName
	 * @Description: TODO(得到BranchName	分公司名称)
	 * @return String
	 */
	public String getBranchName(){
		return branchName;
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
	 * @Title:setThreeCode
	 * @Description: TODO(设置ThreeCode	航空公司三字码)
	 * @param threeCode
	 */
	public void setThreeCode(String threeCode){
		this.threeCode=threeCode;
	}
	/**
	 * @Title:setThreeCode
	 * @Description: TODO(得到ThreeCode	航空公司三字码)
	 * @return String
	 */
	public String getThreeCode(){
		return threeCode;
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
	 * @Title:setLinkman
	 * @Description: TODO(设置Linkman	联系人)
	 * @param linkman
	 */
	public void setLinkman(String linkman){
		this.linkman=linkman;
	}
	/**
	 * @Title:setLinkman
	 * @Description: TODO(得到Linkman	联系人)
	 * @return String
	 */
	public String getLinkman(){
		return linkman;
	}
	/**
	 * @Title:setLinkmanPost
	 * @Description: TODO(设置LinkmanPost	联系人职务)
	 * @param linkmanPost
	 */
	public void setLinkmanPost(String linkmanPost){
		this.linkmanPost=linkmanPost;
	}
	/**
	 * @Title:setLinkmanPost
	 * @Description: TODO(得到LinkmanPost	联系人职务)
	 * @return String
	 */
	public String getLinkmanPost(){
		return linkmanPost;
	}
	/**
	 * @Title:setFirstTime
	 * @Description: TODO(设置FirstTime	首飞时间)
	 * @param firstTime
	 */
	public void setFirstTime(Integer firstTime){
		this.firstTime=firstTime;
	}
	/**
	 * @Title:setFirstTime
	 * @Description: TODO(得到FirstTime	首飞时间)
	 * @return Integer
	 */
	public Integer getFirstTime(){
		return firstTime;
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
	 * @Title:toString
	 * @Description: TODO(toString)
	 */
	public String toString() {
		return "FAircompanytBasicData[id=" + id + ",code=" + code + ",enAbb=" + enAbb + ","+
		"name=" + name + ",branchName=" + branchName + ",twoCode=" + twoCode + ","+
		"threeCode=" + threeCode + ",attribute=" + attribute + ",tel=" + tel + ","+
		"linkman=" + linkman + ",linkmanPost=" + linkmanPost + ",firstTime=" + firstTime + ","+
		"email=" + email + "]";
	}
}

