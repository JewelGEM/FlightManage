package com.cc.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * @author ME CC
 * @ClassName:f_aircraft_basic_data
 * @Description: TODO(类说明 ： 飞机信息基础数据 ; InnoDB free : 10240 kB)
 * @date 2018-10-28 10:54:07
 */
public class FAircraftBasicData implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;    //id
    private String code;    //记录号
    private String no;    //机号
    private String model;    //机型
    private String company;    //所属航空公司
    private String attribute;    //航空公司属性 国内或国外
    private String twoCode;    //航空公司二字码
    private double wingspan;    //翼展
    private double length;    //长度
    private double height;    //高度
    private Integer maxSeat;    //实际最大座位数
    private double cargo;    //载货量
    private double takeoffWeight;    //最大起飞重量
    private double maxRange;    //最大航程
    private double maxFuel;    //最大燃油容量
    private String runway;    //跑道要求
    private String aircraftType;    //飞机类型
    private String isinit;  //是否始发航班
    private String state;   //航班状态

    private FFlightRecord fFlightRecord;

    /**
     * @Description: TODO(无参构造方法)
     */
    public FAircraftBasicData() {
    }

    /**
     * @param id            id
     * @param code          记录号
     * @param no            机号
     * @param model         机型
     * @param company       所属航空公司
     * @param attribute     航空公司属性 国内或国外
     * @param twoCode       航空公司二字码
     * @param wingspan      翼展
     * @param length        长度
     * @param height        高度
     * @param maxSeat       实际最大座位数
     * @param cargo         载货量
     * @param takeoffWeight 最大起飞重量
     * @param maxRange      最大航程
     * @param maxFuel       最大燃油容量
     * @param runway        跑道要求
     * @param aircraftType  飞机类型
     * @param isinit        是否始发航班
     * @param state         //航班状态
     * @Description: TODO(有参构造方法)
     */
    public FAircraftBasicData(Integer id, String code, String no, String model, String company, String attribute, String twoCode, double wingspan, double length, double height, Integer maxSeat, double cargo, double takeoffWeight, double maxRange, double maxFuel, String runway, String aircraftType, String isinit, String state) {
        this.id = id;
        this.code = code;
        this.no = no;
        this.model = model;
        this.company = company;
        this.attribute = attribute;
        this.twoCode = twoCode;
        this.wingspan = wingspan;
        this.length = length;
        this.height = height;
        this.maxSeat = maxSeat;
        this.cargo = cargo;
        this.takeoffWeight = takeoffWeight;
        this.maxRange = maxRange;
        this.maxFuel = maxFuel;
        this.runway = runway;
        this.aircraftType = aircraftType;
        this.isinit = isinit;
        this.state = state;
    }

    /**
     * @param id
     * @param code
     * @param no
     * @param model
     * @param company
     * @param attribute
     * @param twoCode
     * @param wingspan
     * @param length
     * @param height
     * @param maxSeat
     * @param cargo
     * @param takeoffWeight
     * @param maxRange
     * @param maxFuel
     * @param runway
     * @param aircraftType
     * @param isinit
     * @param state
     * @param fFlightRecord
     */
    public FAircraftBasicData(Integer id, String code, String no, String model, String company, String attribute, String twoCode, double wingspan, double length, double height, Integer maxSeat, double cargo, double takeoffWeight, double maxRange, double maxFuel, String runway, String aircraftType, String isinit, String state, FFlightRecord fFlightRecord) {
        this.id = id;
        this.code = code;
        this.no = no;
        this.model = model;
        this.company = company;
        this.attribute = attribute;
        this.twoCode = twoCode;
        this.wingspan = wingspan;
        this.length = length;
        this.height = height;
        this.maxSeat = maxSeat;
        this.cargo = cargo;
        this.takeoffWeight = takeoffWeight;
        this.maxRange = maxRange;
        this.maxFuel = maxFuel;
        this.runway = runway;
        this.aircraftType = aircraftType;
        this.isinit = isinit;
        this.state = state;
        this.fFlightRecord = fFlightRecord;
    }

    /**
     * @param id
     * @Title:setId
     * @Description: TODO(设置Id id)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Integer
     * @Title:setId
     * @Description: TODO(得到Id id)
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param code
     * @Title:setCode
     * @Description: TODO(设置Code 记录号)
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return String
     * @Title:setCode
     * @Description: TODO(得到Code 记录号)
     */
    public String getCode() {
        return code;
    }

    /**
     * @param no
     * @Title:setNo
     * @Description: TODO(设置No 机号)
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return String
     * @Title:setNo
     * @Description: TODO(得到No 机号)
     */
    public String getNo() {
        return no;
    }

    /**
     * @param model
     * @Title:setModel
     * @Description: TODO(设置Model 机型)
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return String
     * @Title:setModel
     * @Description: TODO(得到Model 机型)
     */
    public String getModel() {
        return model;
    }

    /**
     * @param company
     * @Title:setCompany
     * @Description: TODO(设置Company 所属航空公司)
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return String
     * @Title:setCompany
     * @Description: TODO(得到Company 所属航空公司)
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param attribute
     * @Title:setAttribute
     * @Description: TODO(设置Attribute 航空公司属性 国内或国外)
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * @return String
     * @Title:setAttribute
     * @Description: TODO(得到Attribute 航空公司属性 国内或国外)
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * @param twoCode
     * @Title:setTwoCode
     * @Description: TODO(设置TwoCode 航空公司二字码)
     */
    public void setTwoCode(String twoCode) {
        this.twoCode = twoCode;
    }

    /**
     * @return String
     * @Title:setTwoCode
     * @Description: TODO(得到TwoCode 航空公司二字码)
     */
    public String getTwoCode() {
        return twoCode;
    }

    /**
     * @param wingspan
     * @Title:setWingspan
     * @Description: TODO(设置Wingspan 翼展)
     */
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    /**
     * @return double
     * @Title:setWingspan
     * @Description: TODO(得到Wingspan 翼展)
     */
    public double getWingspan() {
        return wingspan;
    }

    /**
     * @param length
     * @Title:setLength
     * @Description: TODO(设置Length 长度)
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return double
     * @Title:setLength
     * @Description: TODO(得到Length 长度)
     */
    public double getLength() {
        return length;
    }

    /**
     * @param height
     * @Title:setHeight
     * @Description: TODO(设置Height 高度)
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return double
     * @Title:setHeight
     * @Description: TODO(得到Height 高度)
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param maxSeat
     * @Title:setMaxSeat
     * @Description: TODO(设置MaxSeat 实际最大座位数)
     */
    public void setMaxSeat(Integer maxSeat) {
        this.maxSeat = maxSeat;
    }

    /**
     * @return Integer
     * @Title:setMaxSeat
     * @Description: TODO(得到MaxSeat 实际最大座位数)
     */
    public Integer getMaxSeat() {
        return maxSeat;
    }

    /**
     * @param cargo
     * @Title:setCargo
     * @Description: TODO(设置Cargo 载货量)
     */
    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    /**
     * @return double
     * @Title:setCargo
     * @Description: TODO(得到Cargo 载货量)
     */
    public double getCargo() {
        return cargo;
    }

    /**
     * @param takeoffWeight
     * @Title:setTakeoffWeight
     * @Description: TODO(设置TakeoffWeight 最大起飞重量)
     */
    public void setTakeoffWeight(double takeoffWeight) {
        this.takeoffWeight = takeoffWeight;
    }

    /**
     * @return double
     * @Title:setTakeoffWeight
     * @Description: TODO(得到TakeoffWeight 最大起飞重量)
     */
    public double getTakeoffWeight() {
        return takeoffWeight;
    }

    /**
     * @param maxRange
     * @Title:setMaxRange
     * @Description: TODO(设置MaxRange 最大航程)
     */
    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    /**
     * @return double
     * @Title:setMaxRange
     * @Description: TODO(得到MaxRange 最大航程)
     */
    public double getMaxRange() {
        return maxRange;
    }

    /**
     * @param maxFuel
     * @Title:setMaxFuel
     * @Description: TODO(设置MaxFuel 最大燃油容量)
     */
    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    /**
     * @return double
     * @Title:setMaxFuel
     * @Description: TODO(得到MaxFuel 最大燃油容量)
     */
    public double getMaxFuel() {
        return maxFuel;
    }

    /**
     * @param runway
     * @Title:setRunway
     * @Description: TODO(设置Runway 跑道要求)
     */
    public void setRunway(String runway) {
        this.runway = runway;
    }

    /**
     * @return String
     * @Title:setRunway
     * @Description: TODO(得到Runway 跑道要求)
     */
    public String getRunway() {
        return runway;
    }

    /**
     * @param aircraftType
     * @Title:setAircraftType
     * @Description: TODO(设置AircraftType 飞机类型)
     */
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    /**
     * @return String
     * @Title:setAircraftType
     * @Description: TODO(得到AircraftType 飞机类型)
     */
    public String getAircraftType() {
        return aircraftType;
    }

    public String getIsinit() {
        return isinit;
    }

    public void setIsinit(String isinit) {
        this.isinit = isinit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public FFlightRecord getfFlightRecord() {
        return fFlightRecord;
    }

    public void setfFlightRecord(FFlightRecord fFlightRecord) {
        this.fFlightRecord = fFlightRecord;
    }

    /**
     * @Title:toString
     * @Description: TODO(toString)
     */
    @Override
    public String toString() {
        return "FAircraftBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", no='" + no + '\'' +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", attribute='" + attribute + '\'' +
                ", twoCode='" + twoCode + '\'' +
                ", wingspan=" + wingspan +
                ", length=" + length +
                ", height=" + height +
                ", maxSeat=" + maxSeat +
                ", cargo=" + cargo +
                ", takeoffWeight=" + takeoffWeight +
                ", maxRange=" + maxRange +
                ", maxFuel=" + maxFuel +
                ", runway='" + runway + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", isinit='" + isinit + '\'' +
                ", state='" + state + '\'' +
                ", fFlightRecord=" + fFlightRecord +
                '}';
    }
}

