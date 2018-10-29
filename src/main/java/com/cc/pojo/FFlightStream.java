package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName:f_flight_stream 
 * @Description: TODO(类说明：航班进出港流水表; InnoDB free: 10240 kB )
 * @author ME CC 
 * @date 2018-10-28 10:54:07
 */ 
public class FFlightStream implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; 	//id
	private String flightNo; 	//航班号
	private Integer airlineId; 	//航空公司ID
	private String airlineCompany; 	//航空公司
	private String planTakeTime; 	//计划起飞
	private String planLandTime; 	//计划落地
	private String realTakeTime; 	//实际起飞
	private String realLandTime; 	//实际落地时间
	private String blockTime; 	//挡轮挡时间
	private String removeTime; 	//撤轮挡时间
	private String park; 	//停机位
	private String bridgesTime; 	//靠廊桥时间
	private String removeBridgesTime; 	//撤廊桥时间
	private String delayRemark; 	//航班延误原因
	private Integer delayTime; 	//航班延误时长
	private String abnormalRemark; 	//航班放行不正常原因
	private String terminal; 	//航站楼
	private String gate; 	//登机口
	private String luggageTurntable; 	//行李转盘
	private String doorOpenTime; 	//开舱门时间
	private String doorCloseTime; 	//关舱门时间
	private String cargodoorOpenTime; 	//开货舱门时间
	private String cargodoorCloseTime; 	//关货舱门时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public FFlightStream(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param id	id
	 * @param flightNo	航班号
	 * @param airlineId	航空公司ID
	 * @param airlineCompany	航空公司
	 * @param planTakeTime	计划起飞
	 * @param planLandTime	计划落地
	 * @param realTakeTime	实际起飞
	 * @param realLandTime	实际落地时间
	 * @param blockTime	挡轮挡时间
	 * @param removeTime	撤轮挡时间
	 * @param park	停机位
	 * @param bridgesTime	靠廊桥时间
	 * @param removeBridgesTime	撤廊桥时间
	 * @param delayRemark	航班延误原因
	 * @param delayTime	航班延误时长
	 * @param abnormalRemark	航班放行不正常原因
	 * @param terminal	航站楼
	 * @param gate	登机口
	 * @param luggageTurntable	行李转盘
	 * @param doorOpenTime	开舱门时间
	 * @param doorCloseTime	关舱门时间
	 * @param cargodoorOpenTime	开货舱门时间
	 * @param cargodoorCloseTime	关货舱门时间
	 */ 
	public FFlightStream(Integer id,String flightNo,Integer airlineId,String airlineCompany,String planTakeTime,String planLandTime,String realTakeTime,String realLandTime,String blockTime,String removeTime,String park,String bridgesTime,String removeBridgesTime,String delayRemark,Integer delayTime,String abnormalRemark,String terminal,String gate,String luggageTurntable,String doorOpenTime,String doorCloseTime,String cargodoorOpenTime,String cargodoorCloseTime){
		this.id=id;
		this.flightNo=flightNo;
		this.airlineId=airlineId;
		this.airlineCompany=airlineCompany;
		this.planTakeTime=planTakeTime;
		this.planLandTime=planLandTime;
		this.realTakeTime=realTakeTime;
		this.realLandTime=realLandTime;
		this.blockTime=blockTime;
		this.removeTime=removeTime;
		this.park=park;
		this.bridgesTime=bridgesTime;
		this.removeBridgesTime=removeBridgesTime;
		this.delayRemark=delayRemark;
		this.delayTime=delayTime;
		this.abnormalRemark=abnormalRemark;
		this.terminal=terminal;
		this.gate=gate;
		this.luggageTurntable=luggageTurntable;
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
	 * @Title:setPark 
	 * @Description: TODO(设置Park	停机位)
	 * @param park
	 */ 
	public void setPark(String park){
		this.park=park;
	}
	/**
	 * @Title:setPark 
	 * @Description: TODO(得到Park	停机位)
	 * @return String
	 */ 
	public String getPark(){
		return park;
	}
	/**
	 * @Title:setBridgesTime 
	 * @Description: TODO(设置BridgesTime	靠廊桥时间)
	 * @param bridgesTime
	 */ 
	public void setBridgesTime(String bridgesTime){
		this.bridgesTime=bridgesTime;
	}
	/**
	 * @Title:setBridgesTime 
	 * @Description: TODO(得到BridgesTime	靠廊桥时间)
	 * @return String
	 */ 
	public String getBridgesTime(){
		return bridgesTime;
	}
	/**
	 * @Title:setRemoveBridgesTime 
	 * @Description: TODO(设置RemoveBridgesTime	撤廊桥时间)
	 * @param removeBridgesTime
	 */ 
	public void setRemoveBridgesTime(String removeBridgesTime){
		this.removeBridgesTime=removeBridgesTime;
	}
	/**
	 * @Title:setRemoveBridgesTime 
	 * @Description: TODO(得到RemoveBridgesTime	撤廊桥时间)
	 * @return String
	 */ 
	public String getRemoveBridgesTime(){
		return removeBridgesTime;
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
	 * @Title:setAbnormalRemark 
	 * @Description: TODO(设置AbnormalRemark	航班放行不正常原因)
	 * @param abnormalRemark
	 */ 
	public void setAbnormalRemark(String abnormalRemark){
		this.abnormalRemark=abnormalRemark;
	}
	/**
	 * @Title:setAbnormalRemark 
	 * @Description: TODO(得到AbnormalRemark	航班放行不正常原因)
	 * @return String
	 */ 
	public String getAbnormalRemark(){
		return abnormalRemark;
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
		return "FFlightStream[id=" + id + ",flightNo=" + flightNo + ",airlineId=" + airlineId + ","+
		"airlineCompany=" + airlineCompany + ",planTakeTime=" + planTakeTime + ",planLandTime=" + planLandTime + ","+
		"realTakeTime=" + realTakeTime + ",realLandTime=" + realLandTime + ",blockTime=" + blockTime + ","+
		"removeTime=" + removeTime + ",park=" + park + ",bridgesTime=" + bridgesTime + ","+
		"removeBridgesTime=" + removeBridgesTime + ",delayRemark=" + delayRemark + ",delayTime=" + delayTime + ","+
		"abnormalRemark=" + abnormalRemark + ",terminal=" + terminal + ",gate=" + gate + ","+
		"luggageTurntable=" + luggageTurntable + ",doorOpenTime=" + doorOpenTime + ",doorCloseTime=" + doorCloseTime + ","+
		"cargodoorOpenTime=" + cargodoorOpenTime + ",cargodoorCloseTime=" + cargodoorCloseTime + "]";
	}
}

