package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_passenger 
 * @Description: TODO(类说明：旅客信息表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FPassenger implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id; 	//id
	private String code; 	//记录号
	private Integer relationId; 	//关联ID 团体购票
	private String flightNo; 	//航班号
	private String name; 	//姓名
	private String idNumber; 	//身份证号
	private String tel; 	//电话
	private byte sex; 	//性别
	private String email; 	//邮箱
	private byte isVip; 	//是否贵宾
	private String seat; 	//座位号
	private String cabin; 	//舱位
	private String voyage; 	//航程
	private String checkTime; 	//值机时间
	private String checkCounter; 	//值机柜台
	private String securityTime; 	//安检时间
	private String securityChannel; 	//安检通道
	private String boardingTime; 	//登机时间
	private String peer; 	//同行旅客
	private String recentTakeoffFlight; 	//最后一次起飞航班号
	private Integer recentTakeoffTime; 	//最后一次起飞时间
	private String destination; 	//目的地
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FPassenger(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param relationId	关联ID 团体购票
	 * @param flightNo	航班号
	 * @param name	姓名
	 * @param idNumber	身份证号
	 * @param tel	电话
	 * @param sex	性别
	 * @param email	邮箱
	 * @param isVip	是否贵宾
	 * @param seat	座位号
	 * @param cabin	舱位
	 * @param voyage	航程
	 * @param checkTime	值机时间
	 * @param checkCounter	值机柜台
	 * @param securityTime	安检时间
	 * @param securityChannel	安检通道
	 * @param boardingTime	登机时间
	 * @param peer	同行旅客
	 * @param recentTakeoffFlight	最后一次起飞航班号
	 * @param recentTakeoffTime	最后一次起飞时间
	 * @param destination	目的地
	 */ 
	public FPassenger(String id,String code,Integer relationId,String flightNo,String name,String idNumber,String tel,byte sex,String email,byte isVip,String seat,String cabin,String voyage,String checkTime,String checkCounter,String securityTime,String securityChannel,String boardingTime,String peer,String recentTakeoffFlight,Integer recentTakeoffTime,String destination){
		this.id=id;
		this.code=code;
		this.relationId=relationId;
		this.flightNo=flightNo;
		this.name=name;
		this.idNumber=idNumber;
		this.tel=tel;
		this.sex=sex;
		this.email=email;
		this.isVip=isVip;
		this.seat=seat;
		this.cabin=cabin;
		this.voyage=voyage;
		this.checkTime=checkTime;
		this.checkCounter=checkCounter;
		this.securityTime=securityTime;
		this.securityChannel=securityChannel;
		this.boardingTime=boardingTime;
		this.peer=peer;
		this.recentTakeoffFlight=recentTakeoffFlight;
		this.recentTakeoffTime=recentTakeoffTime;
		this.destination=destination;
	}
	/**
	 * @Title:setId 
	 * @Description: TODO(设置Id	id)
	 * @param id
	 */ 
	public void setId(String id){
		this.id=id;
	}
	/**
	 * @Title:setId 
	 * @Description: TODO(得到Id	id)
	 * @return String
	 */ 
	public String getId(){
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
	 * @Title:setRelationId 
	 * @Description: TODO(设置RelationId	关联ID 团体购票)
	 * @param relationId
	 */ 
	public void setRelationId(Integer relationId){
		this.relationId=relationId;
	}
	/**
	 * @Title:setRelationId 
	 * @Description: TODO(得到RelationId	关联ID 团体购票)
	 * @return Integer
	 */ 
	public Integer getRelationId(){
		return relationId;
	}
	/**
	 * @Title:setFlightNo 
	 * @Description: TODO(设置FlightNo	航班号)
	 * @param flightNo
	 */ 
	public void setFlightNo(String flightNo){
		this.flightNo=flightNo;
	}
	/**
	 * @Title:setFlightNo 
	 * @Description: TODO(得到FlightNo	航班号)
	 * @return String
	 */ 
	public String getFlightNo(){
		return flightNo;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(设置Name	姓名)
	 * @param name
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * @Title:setName 
	 * @Description: TODO(得到Name	姓名)
	 * @return String
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * @Title:setIdNumber 
	 * @Description: TODO(设置IdNumber	身份证号)
	 * @param idNumber
	 */ 
	public void setIdNumber(String idNumber){
		this.idNumber=idNumber;
	}
	/**
	 * @Title:setIdNumber 
	 * @Description: TODO(得到IdNumber	身份证号)
	 * @return String
	 */ 
	public String getIdNumber(){
		return idNumber;
	}
	/**
	 * @Title:setTel 
	 * @Description: TODO(设置Tel	电话)
	 * @param tel
	 */ 
	public void setTel(String tel){
		this.tel=tel;
	}
	/**
	 * @Title:setTel 
	 * @Description: TODO(得到Tel	电话)
	 * @return String
	 */ 
	public String getTel(){
		return tel;
	}
	/**
	 * @Title:setSex 
	 * @Description: TODO(设置Sex	性别)
	 * @param sex
	 */ 
	public void setSex(byte sex){
		this.sex=sex;
	}
	/**
	 * @Title:setSex 
	 * @Description: TODO(得到Sex	性别)
	 * @return byte
	 */ 
	public byte getSex(){
		return sex;
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
	 * @Title:setIsVip 
	 * @Description: TODO(设置IsVip	是否贵宾)
	 * @param isVip
	 */ 
	public void setIsVip(byte isVip){
		this.isVip=isVip;
	}
	/**
	 * @Title:setIsVip 
	 * @Description: TODO(得到IsVip	是否贵宾)
	 * @return byte
	 */ 
	public byte getIsVip(){
		return isVip;
	}
	/**
	 * @Title:setSeat 
	 * @Description: TODO(设置Seat	座位号)
	 * @param seat
	 */ 
	public void setSeat(String seat){
		this.seat=seat;
	}
	/**
	 * @Title:setSeat 
	 * @Description: TODO(得到Seat	座位号)
	 * @return String
	 */ 
	public String getSeat(){
		return seat;
	}
	/**
	 * @Title:setCabin 
	 * @Description: TODO(设置Cabin	舱位)
	 * @param cabin
	 */ 
	public void setCabin(String cabin){
		this.cabin=cabin;
	}
	/**
	 * @Title:setCabin 
	 * @Description: TODO(得到Cabin	舱位)
	 * @return String
	 */ 
	public String getCabin(){
		return cabin;
	}
	/**
	 * @Title:setVoyage 
	 * @Description: TODO(设置Voyage	航程)
	 * @param voyage
	 */ 
	public void setVoyage(String voyage){
		this.voyage=voyage;
	}
	/**
	 * @Title:setVoyage 
	 * @Description: TODO(得到Voyage	航程)
	 * @return String
	 */ 
	public String getVoyage(){
		return voyage;
	}
	/**
	 * @Title:setCheckTime 
	 * @Description: TODO(设置CheckTime	值机时间)
	 * @param checkTime
	 */ 
	public void setCheckTime(String checkTime){
		this.checkTime=checkTime;
	}
	/**
	 * @Title:setCheckTime 
	 * @Description: TODO(得到CheckTime	值机时间)
	 * @return String
	 */ 
	public String getCheckTime(){
		return checkTime;
	}
	/**
	 * @Title:setCheckCounter 
	 * @Description: TODO(设置CheckCounter	值机柜台)
	 * @param checkCounter
	 */ 
	public void setCheckCounter(String checkCounter){
		this.checkCounter=checkCounter;
	}
	/**
	 * @Title:setCheckCounter 
	 * @Description: TODO(得到CheckCounter	值机柜台)
	 * @return String
	 */ 
	public String getCheckCounter(){
		return checkCounter;
	}
	/**
	 * @Title:setSecurityTime 
	 * @Description: TODO(设置SecurityTime	安检时间)
	 * @param securityTime
	 */ 
	public void setSecurityTime(String securityTime){
		this.securityTime=securityTime;
	}
	/**
	 * @Title:setSecurityTime 
	 * @Description: TODO(得到SecurityTime	安检时间)
	 * @return String
	 */ 
	public String getSecurityTime(){
		return securityTime;
	}
	/**
	 * @Title:setSecurityChannel 
	 * @Description: TODO(设置SecurityChannel	安检通道)
	 * @param securityChannel
	 */ 
	public void setSecurityChannel(String securityChannel){
		this.securityChannel=securityChannel;
	}
	/**
	 * @Title:setSecurityChannel 
	 * @Description: TODO(得到SecurityChannel	安检通道)
	 * @return String
	 */ 
	public String getSecurityChannel(){
		return securityChannel;
	}
	/**
	 * @Title:setBoardingTime 
	 * @Description: TODO(设置BoardingTime	登机时间)
	 * @param boardingTime
	 */ 
	public void setBoardingTime(String boardingTime){
		this.boardingTime=boardingTime;
	}
	/**
	 * @Title:setBoardingTime 
	 * @Description: TODO(得到BoardingTime	登机时间)
	 * @return String
	 */ 
	public String getBoardingTime(){
		return boardingTime;
	}
	/**
	 * @Title:setPeer 
	 * @Description: TODO(设置Peer	同行旅客)
	 * @param peer
	 */ 
	public void setPeer(String peer){
		this.peer=peer;
	}
	/**
	 * @Title:setPeer 
	 * @Description: TODO(得到Peer	同行旅客)
	 * @return String
	 */ 
	public String getPeer(){
		return peer;
	}
	/**
	 * @Title:setRecentTakeoffFlight 
	 * @Description: TODO(设置RecentTakeoffFlight	最后一次起飞航班号)
	 * @param recentTakeoffFlight
	 */ 
	public void setRecentTakeoffFlight(String recentTakeoffFlight){
		this.recentTakeoffFlight=recentTakeoffFlight;
	}
	/**
	 * @Title:setRecentTakeoffFlight 
	 * @Description: TODO(得到RecentTakeoffFlight	最后一次起飞航班号)
	 * @return String
	 */ 
	public String getRecentTakeoffFlight(){
		return recentTakeoffFlight;
	}
	/**
	 * @Title:setRecentTakeoffTime 
	 * @Description: TODO(设置RecentTakeoffTime	最后一次起飞时间)
	 * @param recentTakeoffTime
	 */ 
	public void setRecentTakeoffTime(Integer recentTakeoffTime){
		this.recentTakeoffTime=recentTakeoffTime;
	}
	/**
	 * @Title:setRecentTakeoffTime 
	 * @Description: TODO(得到RecentTakeoffTime	最后一次起飞时间)
	 * @return Integer
	 */ 
	public Integer getRecentTakeoffTime(){
		return recentTakeoffTime;
	}
	/**
	 * @Title:setDestination 
	 * @Description: TODO(设置Destination	目的地)
	 * @param destination
	 */ 
	public void setDestination(String destination){
		this.destination=destination;
	}
	/**
	 * @Title:setDestination 
	 * @Description: TODO(得到Destination	目的地)
	 * @return String
	 */ 
	public String getDestination(){
		return destination;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FPassenger[id=" + id + ",code=" + code + ",relationId=" + relationId + ","+
		"flightNo=" + flightNo + ",name=" + name + ",idNumber=" + idNumber + ","+
		"tel=" + tel + ",sex=" + sex + ",email=" + email + ","+
		"isVip=" + isVip + ",seat=" + seat + ",cabin=" + cabin + ","+
		"voyage=" + voyage + ",checkTime=" + checkTime + ",checkCounter=" + checkCounter + ","+
		"securityTime=" + securityTime + ",securityChannel=" + securityChannel + ",boardingTime=" + boardingTime + ","+
		"peer=" + peer + ",recentTakeoffFlight=" + recentTakeoffFlight + ",recentTakeoffTime=" + recentTakeoffTime + ","+
		"destination=" + destination + "]";
	}
}

