package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_flight_record 
 * @Description: TODO(类说明：航班动态表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FFlightRecord implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private Integer code; 	//记录号
	private String doDate; 	//航班执行日期
	private String airCode; 	//航空公司代码
	private String flightNo; 	//航班号
	private String no; 	//机号
	private String nature; 	//航班性
	private String task; 	//任务性质
	private String attribute; 	//属性
	private String seat; 	//机位
	private String gate; 	//登机口
	private String luggageTurntable; 	//行李转盘
	private Integer relationId; 	//关联航班ID
	private Integer airlineId; 	//航空公司ID
	private String airlineCompany; 	//航空公司
	private String flightMission; 	//航班任务
	private String flightAgent; 	//航班代理
	private String airportStart; 	//起飞机场
	private String airportEnd; 	//降落机场
	private String airportEndSpare; 	//备降机场
	private Integer adultNum; 	//成人数量
	private Integer childNum; 	//儿童数量
	private Integer babyNum; 	//婴儿数量
	private Integer luggageNum; 	//货邮数量
	private double cargoWeight; 	//货邮重量
	private String planTakeTime; 	//计划起飞
	private String planLandTime; 	//计划落地
	private String realTakeTime; 	//实际起飞
	private String realLandTime; 	//实际落地时间
	private String blockTime; 	//挡轮挡时间
	private String removeTime; 	//撤轮挡时间
	private String delayRemark; 	//航班延误原因
	private Integer delayTime; 	//航班延误时长
	private String terminal; 	//航站楼
	private String doorOpenTime; 	//开舱门时间
	private String doorCloseTime; 	//关舱门时间
	private String cargodoorOpenTime; 	//开货舱门时间
	private String cargodoorCloseTime; 	//关货舱门时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FFlightRecord(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param code	记录号
	 * @param doDate	航班执行日期
	 * @param airCode	航空公司代码
	 * @param flightNo	航班号
	 * @param no	机号
	 * @param nature	航班性
	 * @param task	任务性质
	 * @param attribute	属性
	 * @param seat	机位
	 * @param gate	登机口
	 * @param luggageTurntable	行李转盘
	 * @param relationId	关联航班ID
	 * @param airlineId	航空公司ID
	 * @param airlineCompany	航空公司
	 * @param flightMission	航班任务
	 * @param flightAgent	航班代理
	 * @param airportStart	起飞机场
	 * @param airportEnd	降落机场
	 * @param airportEndSpare	备降机场
	 * @param adultNum	成人数量
	 * @param childNum	儿童数量
	 * @param babyNum	婴儿数量
	 * @param luggageNum	货邮数量
	 * @param cargoWeight	货邮重量
	 * @param planTakeTime	计划起飞
	 * @param planLandTime	计划落地
	 * @param realTakeTime	实际起飞
	 * @param realLandTime	实际落地时间
	 * @param blockTime	挡轮挡时间
	 * @param removeTime	撤轮挡时间
	 * @param delayRemark	航班延误原因
	 * @param delayTime	航班延误时长
	 * @param terminal	航站楼
	 * @param doorOpenTime	开舱门时间
	 * @param doorCloseTime	关舱门时间
	 * @param cargodoorOpenTime	开货舱门时间
	 * @param cargodoorCloseTime	关货舱门时间
	 */ 
	public FFlightRecord(Integer id,Integer code,String doDate,String airCode,String flightNo,String no,String nature,String task,String attribute,String seat,String gate,String luggageTurntable,Integer relationId,Integer airlineId,String airlineCompany,String flightMission,String flightAgent,String airportStart,String airportEnd,String airportEndSpare,Integer adultNum,Integer childNum,Integer babyNum,Integer luggageNum,double cargoWeight,String planTakeTime,String planLandTime,String realTakeTime,String realLandTime,String blockTime,String removeTime,String delayRemark,Integer delayTime,String terminal,String doorOpenTime,String doorCloseTime,String cargodoorOpenTime,String cargodoorCloseTime){
		this.id=id;
		this.code=code;
		this.doDate=doDate;
		this.airCode=airCode;
		this.flightNo=flightNo;
		this.no=no;
		this.nature=nature;
		this.task=task;
		this.attribute=attribute;
		this.seat=seat;
		this.gate=gate;
		this.luggageTurntable=luggageTurntable;
		this.relationId=relationId;
		this.airlineId=airlineId;
		this.airlineCompany=airlineCompany;
		this.flightMission=flightMission;
		this.flightAgent=flightAgent;
		this.airportStart=airportStart;
		this.airportEnd=airportEnd;
		this.airportEndSpare=airportEndSpare;
		this.adultNum=adultNum;
		this.childNum=childNum;
		this.babyNum=babyNum;
		this.luggageNum=luggageNum;
		this.cargoWeight=cargoWeight;
		this.planTakeTime=planTakeTime;
		this.planLandTime=planLandTime;
		this.realTakeTime=realTakeTime;
		this.realLandTime=realLandTime;
		this.blockTime=blockTime;
		this.removeTime=removeTime;
		this.delayRemark=delayRemark;
		this.delayTime=delayTime;
		this.terminal=terminal;
		this.doorOpenTime=doorOpenTime;
		this.doorCloseTime=doorCloseTime;
		this.cargodoorOpenTime=cargodoorOpenTime;
		this.cargodoorCloseTime=cargodoorCloseTime;
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
	public void setCode(Integer code){
		this.code=code;
	}
	/**
	 * @Title:setCode 
	 * @Description: TODO(得到Code	记录号)
	 * @return Integer
	 */ 
	public Integer getCode(){
		return code;
	}
	/**
	 * @Title:setDoDate 
	 * @Description: TODO(设置DoDate	航班执行日期)
	 * @param doDate
	 */ 
	public void setDoDate(String doDate){
		this.doDate=doDate;
	}
	/**
	 * @Title:setDoDate 
	 * @Description: TODO(得到DoDate	航班执行日期)
	 * @return String
	 */ 
	public String getDoDate(){
		return doDate;
	}
	/**
	 * @Title:setAirCode 
	 * @Description: TODO(设置AirCode	航空公司代码)
	 * @param airCode
	 */ 
	public void setAirCode(String airCode){
		this.airCode=airCode;
	}
	/**
	 * @Title:setAirCode 
	 * @Description: TODO(得到AirCode	航空公司代码)
	 * @return String
	 */ 
	public String getAirCode(){
		return airCode;
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
	 * @Title:setNature 
	 * @Description: TODO(设置Nature	航班性)
	 * @param nature
	 */ 
	public void setNature(String nature){
		this.nature=nature;
	}
	/**
	 * @Title:setNature 
	 * @Description: TODO(得到Nature	航班性)
	 * @return String
	 */ 
	public String getNature(){
		return nature;
	}
	/**
	 * @Title:setTask 
	 * @Description: TODO(设置Task	任务性质)
	 * @param task
	 */ 
	public void setTask(String task){
		this.task=task;
	}
	/**
	 * @Title:setTask 
	 * @Description: TODO(得到Task	任务性质)
	 * @return String
	 */ 
	public String getTask(){
		return task;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(设置Attribute	属性)
	 * @param attribute
	 */ 
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	/**
	 * @Title:setAttribute 
	 * @Description: TODO(得到Attribute	属性)
	 * @return String
	 */ 
	public String getAttribute(){
		return attribute;
	}
	/**
	 * @Title:setSeat 
	 * @Description: TODO(设置Seat	机位)
	 * @param seat
	 */ 
	public void setSeat(String seat){
		this.seat=seat;
	}
	/**
	 * @Title:setSeat 
	 * @Description: TODO(得到Seat	机位)
	 * @return String
	 */ 
	public String getSeat(){
		return seat;
	}
	/**
	 * @Title:setGate 
	 * @Description: TODO(设置Gate	登机口)
	 * @param gate
	 */ 
	public void setGate(String gate){
		this.gate=gate;
	}
	/**
	 * @Title:setGate 
	 * @Description: TODO(得到Gate	登机口)
	 * @return String
	 */ 
	public String getGate(){
		return gate;
	}
	/**
	 * @Title:setLuggageTurntable 
	 * @Description: TODO(设置LuggageTurntable	行李转盘)
	 * @param luggageTurntable
	 */ 
	public void setLuggageTurntable(String luggageTurntable){
		this.luggageTurntable=luggageTurntable;
	}
	/**
	 * @Title:setLuggageTurntable 
	 * @Description: TODO(得到LuggageTurntable	行李转盘)
	 * @return String
	 */ 
	public String getLuggageTurntable(){
		return luggageTurntable;
	}
	/**
	 * @Title:setRelationId 
	 * @Description: TODO(设置RelationId	关联航班ID)
	 * @param relationId
	 */ 
	public void setRelationId(Integer relationId){
		this.relationId=relationId;
	}
	/**
	 * @Title:setRelationId 
	 * @Description: TODO(得到RelationId	关联航班ID)
	 * @return Integer
	 */ 
	public Integer getRelationId(){
		return relationId;
	}
	/**
	 * @Title:setAirlineId 
	 * @Description: TODO(设置AirlineId	航空公司ID)
	 * @param airlineId
	 */ 
	public void setAirlineId(Integer airlineId){
		this.airlineId=airlineId;
	}
	/**
	 * @Title:setAirlineId 
	 * @Description: TODO(得到AirlineId	航空公司ID)
	 * @return Integer
	 */ 
	public Integer getAirlineId(){
		return airlineId;
	}
	/**
	 * @Title:setAirlineCompany 
	 * @Description: TODO(设置AirlineCompany	航空公司)
	 * @param airlineCompany
	 */ 
	public void setAirlineCompany(String airlineCompany){
		this.airlineCompany=airlineCompany;
	}
	/**
	 * @Title:setAirlineCompany 
	 * @Description: TODO(得到AirlineCompany	航空公司)
	 * @return String
	 */ 
	public String getAirlineCompany(){
		return airlineCompany;
	}
	/**
	 * @Title:setFlightMission 
	 * @Description: TODO(设置FlightMission	航班任务)
	 * @param flightMission
	 */ 
	public void setFlightMission(String flightMission){
		this.flightMission=flightMission;
	}
	/**
	 * @Title:setFlightMission 
	 * @Description: TODO(得到FlightMission	航班任务)
	 * @return String
	 */ 
	public String getFlightMission(){
		return flightMission;
	}
	/**
	 * @Title:setFlightAgent 
	 * @Description: TODO(设置FlightAgent	航班代理)
	 * @param flightAgent
	 */ 
	public void setFlightAgent(String flightAgent){
		this.flightAgent=flightAgent;
	}
	/**
	 * @Title:setFlightAgent 
	 * @Description: TODO(得到FlightAgent	航班代理)
	 * @return String
	 */ 
	public String getFlightAgent(){
		return flightAgent;
	}
	/**
	 * @Title:setAirportStart 
	 * @Description: TODO(设置AirportStart	起飞机场)
	 * @param airportStart
	 */ 
	public void setAirportStart(String airportStart){
		this.airportStart=airportStart;
	}
	/**
	 * @Title:setAirportStart 
	 * @Description: TODO(得到AirportStart	起飞机场)
	 * @return String
	 */ 
	public String getAirportStart(){
		return airportStart;
	}
	/**
	 * @Title:setAirportEnd 
	 * @Description: TODO(设置AirportEnd	降落机场)
	 * @param airportEnd
	 */ 
	public void setAirportEnd(String airportEnd){
		this.airportEnd=airportEnd;
	}
	/**
	 * @Title:setAirportEnd 
	 * @Description: TODO(得到AirportEnd	降落机场)
	 * @return String
	 */ 
	public String getAirportEnd(){
		return airportEnd;
	}
	/**
	 * @Title:setAirportEndSpare 
	 * @Description: TODO(设置AirportEndSpare	备降机场)
	 * @param airportEndSpare
	 */ 
	public void setAirportEndSpare(String airportEndSpare){
		this.airportEndSpare=airportEndSpare;
	}
	/**
	 * @Title:setAirportEndSpare 
	 * @Description: TODO(得到AirportEndSpare	备降机场)
	 * @return String
	 */ 
	public String getAirportEndSpare(){
		return airportEndSpare;
	}
	/**
	 * @Title:setAdultNum 
	 * @Description: TODO(设置AdultNum	成人数量)
	 * @param adultNum
	 */ 
	public void setAdultNum(Integer adultNum){
		this.adultNum=adultNum;
	}
	/**
	 * @Title:setAdultNum 
	 * @Description: TODO(得到AdultNum	成人数量)
	 * @return Integer
	 */ 
	public Integer getAdultNum(){
		return adultNum;
	}
	/**
	 * @Title:setChildNum 
	 * @Description: TODO(设置ChildNum	儿童数量)
	 * @param childNum
	 */ 
	public void setChildNum(Integer childNum){
		this.childNum=childNum;
	}
	/**
	 * @Title:setChildNum 
	 * @Description: TODO(得到ChildNum	儿童数量)
	 * @return Integer
	 */ 
	public Integer getChildNum(){
		return childNum;
	}
	/**
	 * @Title:setBabyNum 
	 * @Description: TODO(设置BabyNum	婴儿数量)
	 * @param babyNum
	 */ 
	public void setBabyNum(Integer babyNum){
		this.babyNum=babyNum;
	}
	/**
	 * @Title:setBabyNum 
	 * @Description: TODO(得到BabyNum	婴儿数量)
	 * @return Integer
	 */ 
	public Integer getBabyNum(){
		return babyNum;
	}
	/**
	 * @Title:setLuggageNum 
	 * @Description: TODO(设置LuggageNum	货邮数量)
	 * @param luggageNum
	 */ 
	public void setLuggageNum(Integer luggageNum){
		this.luggageNum=luggageNum;
	}
	/**
	 * @Title:setLuggageNum 
	 * @Description: TODO(得到LuggageNum	货邮数量)
	 * @return Integer
	 */ 
	public Integer getLuggageNum(){
		return luggageNum;
	}
	/**
	 * @Title:setCargoWeight 
	 * @Description: TODO(设置CargoWeight	货邮重量)
	 * @param cargoWeight
	 */ 
	public void setCargoWeight(double cargoWeight){
		this.cargoWeight=cargoWeight;
	}
	/**
	 * @Title:setCargoWeight 
	 * @Description: TODO(得到CargoWeight	货邮重量)
	 * @return double
	 */ 
	public double getCargoWeight(){
		return cargoWeight;
	}
	/**
	 * @Title:setPlanTakeTime 
	 * @Description: TODO(设置PlanTakeTime	计划起飞)
	 * @param planTakeTime
	 */ 
	public void setPlanTakeTime(String planTakeTime){
		this.planTakeTime=planTakeTime;
	}
	/**
	 * @Title:setPlanTakeTime 
	 * @Description: TODO(得到PlanTakeTime	计划起飞)
	 * @return String
	 */ 
	public String getPlanTakeTime(){
		return planTakeTime;
	}
	/**
	 * @Title:setPlanLandTime 
	 * @Description: TODO(设置PlanLandTime	计划落地)
	 * @param planLandTime
	 */ 
	public void setPlanLandTime(String planLandTime){
		this.planLandTime=planLandTime;
	}
	/**
	 * @Title:setPlanLandTime 
	 * @Description: TODO(得到PlanLandTime	计划落地)
	 * @return String
	 */ 
	public String getPlanLandTime(){
		return planLandTime;
	}
	/**
	 * @Title:setRealTakeTime 
	 * @Description: TODO(设置RealTakeTime	实际起飞)
	 * @param realTakeTime
	 */ 
	public void setRealTakeTime(String realTakeTime){
		this.realTakeTime=realTakeTime;
	}
	/**
	 * @Title:setRealTakeTime 
	 * @Description: TODO(得到RealTakeTime	实际起飞)
	 * @return String
	 */ 
	public String getRealTakeTime(){
		return realTakeTime;
	}
	/**
	 * @Title:setRealLandTime 
	 * @Description: TODO(设置RealLandTime	实际落地时间)
	 * @param realLandTime
	 */ 
	public void setRealLandTime(String realLandTime){
		this.realLandTime=realLandTime;
	}
	/**
	 * @Title:setRealLandTime 
	 * @Description: TODO(得到RealLandTime	实际落地时间)
	 * @return String
	 */ 
	public String getRealLandTime(){
		return realLandTime;
	}
	/**
	 * @Title:setBlockTime 
	 * @Description: TODO(设置BlockTime	挡轮挡时间)
	 * @param blockTime
	 */ 
	public void setBlockTime(String blockTime){
		this.blockTime=blockTime;
	}
	/**
	 * @Title:setBlockTime 
	 * @Description: TODO(得到BlockTime	挡轮挡时间)
	 * @return String
	 */ 
	public String getBlockTime(){
		return blockTime;
	}
	/**
	 * @Title:setRemoveTime 
	 * @Description: TODO(设置RemoveTime	撤轮挡时间)
	 * @param removeTime
	 */ 
	public void setRemoveTime(String removeTime){
		this.removeTime=removeTime;
	}
	/**
	 * @Title:setRemoveTime 
	 * @Description: TODO(得到RemoveTime	撤轮挡时间)
	 * @return String
	 */ 
	public String getRemoveTime(){
		return removeTime;
	}
	/**
	 * @Title:setDelayRemark 
	 * @Description: TODO(设置DelayRemark	航班延误原因)
	 * @param delayRemark
	 */ 
	public void setDelayRemark(String delayRemark){
		this.delayRemark=delayRemark;
	}
	/**
	 * @Title:setDelayRemark 
	 * @Description: TODO(得到DelayRemark	航班延误原因)
	 * @return String
	 */ 
	public String getDelayRemark(){
		return delayRemark;
	}
	/**
	 * @Title:setDelayTime 
	 * @Description: TODO(设置DelayTime	航班延误时长)
	 * @param delayTime
	 */ 
	public void setDelayTime(Integer delayTime){
		this.delayTime=delayTime;
	}
	/**
	 * @Title:setDelayTime 
	 * @Description: TODO(得到DelayTime	航班延误时长)
	 * @return Integer
	 */ 
	public Integer getDelayTime(){
		return delayTime;
	}
	/**
	 * @Title:setTerminal 
	 * @Description: TODO(设置Terminal	航站楼)
	 * @param terminal
	 */ 
	public void setTerminal(String terminal){
		this.terminal=terminal;
	}
	/**
	 * @Title:setTerminal 
	 * @Description: TODO(得到Terminal	航站楼)
	 * @return String
	 */ 
	public String getTerminal(){
		return terminal;
	}
	/**
	 * @Title:setDoorOpenTime 
	 * @Description: TODO(设置DoorOpenTime	开舱门时间)
	 * @param doorOpenTime
	 */ 
	public void setDoorOpenTime(String doorOpenTime){
		this.doorOpenTime=doorOpenTime;
	}
	/**
	 * @Title:setDoorOpenTime 
	 * @Description: TODO(得到DoorOpenTime	开舱门时间)
	 * @return String
	 */ 
	public String getDoorOpenTime(){
		return doorOpenTime;
	}
	/**
	 * @Title:setDoorCloseTime 
	 * @Description: TODO(设置DoorCloseTime	关舱门时间)
	 * @param doorCloseTime
	 */ 
	public void setDoorCloseTime(String doorCloseTime){
		this.doorCloseTime=doorCloseTime;
	}
	/**
	 * @Title:setDoorCloseTime 
	 * @Description: TODO(得到DoorCloseTime	关舱门时间)
	 * @return String
	 */ 
	public String getDoorCloseTime(){
		return doorCloseTime;
	}
	/**
	 * @Title:setCargodoorOpenTime 
	 * @Description: TODO(设置CargodoorOpenTime	开货舱门时间)
	 * @param cargodoorOpenTime
	 */ 
	public void setCargodoorOpenTime(String cargodoorOpenTime){
		this.cargodoorOpenTime=cargodoorOpenTime;
	}
	/**
	 * @Title:setCargodoorOpenTime 
	 * @Description: TODO(得到CargodoorOpenTime	开货舱门时间)
	 * @return String
	 */ 
	public String getCargodoorOpenTime(){
		return cargodoorOpenTime;
	}
	/**
	 * @Title:setCargodoorCloseTime 
	 * @Description: TODO(设置CargodoorCloseTime	关货舱门时间)
	 * @param cargodoorCloseTime
	 */ 
	public void setCargodoorCloseTime(String cargodoorCloseTime){
		this.cargodoorCloseTime=cargodoorCloseTime;
	}
	/**
	 * @Title:setCargodoorCloseTime 
	 * @Description: TODO(得到CargodoorCloseTime	关货舱门时间)
	 * @return String
	 */ 
	public String getCargodoorCloseTime(){
		return cargodoorCloseTime;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "FFlightRecord[id=" + id + ",code=" + code + ",doDate=" + doDate + ","+
		"airCode=" + airCode + ",flightNo=" + flightNo + ",no=" + no + ","+
		"nature=" + nature + ",task=" + task + ",attribute=" + attribute + ","+
		"seat=" + seat + ",gate=" + gate + ",luggageTurntable=" + luggageTurntable + ","+
		"relationId=" + relationId + ",airlineId=" + airlineId + ",airlineCompany=" + airlineCompany + ","+
		"flightMission=" + flightMission + ",flightAgent=" + flightAgent + ",airportStart=" + airportStart + ","+
		"airportEnd=" + airportEnd + ",airportEndSpare=" + airportEndSpare + ",adultNum=" + adultNum + ","+
		"childNum=" + childNum + ",babyNum=" + babyNum + ",luggageNum=" + luggageNum + ","+
		"cargoWeight=" + cargoWeight + ",planTakeTime=" + planTakeTime + ",planLandTime=" + planLandTime + ","+
		"realTakeTime=" + realTakeTime + ",realLandTime=" + realLandTime + ",blockTime=" + blockTime + ","+
		"removeTime=" + removeTime + ",delayRemark=" + delayRemark + ",delayTime=" + delayTime + ","+
		"terminal=" + terminal + ",doorOpenTime=" + doorOpenTime + ",doorCloseTime=" + doorCloseTime + ","+
		"cargodoorOpenTime=" + cargodoorOpenTime + ",cargodoorCloseTime=" + cargodoorCloseTime + "]";
	}
}

