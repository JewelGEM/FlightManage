<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="assets/css/ace.min.css"/>
    <link rel="stylesheet" href="assets/css/font-awesome.min.css"/>

    <!--  <link rel="stylesheet" href="font/css/font-awesome.min.css" />-->

    <script type="text/javascript">
        window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
    </script>
    <script type="text/javascript">
        if ("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");

    </script>
    <script src="assets/layer/layer.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/H-ui.js"></script>
    <script type="text/javascript">
        init();
        function init(){
            $.ajax({
                url: '/getAllFAircraftBasicData.action',
                dataType: 'json',
                success: function (data) {
                    var context = "<tbody id='initForm'>";
                    for (var i = 0; i < data.length; i++) {
                        //ID
                        var id = data[i].id;
                        //机号
                        var no = data[i].no;
                        //机型
                        var model = data[i].model;
                        //航空公司二字码
                        var twoCode = data[i].twoCode;
                        //fFlightRecord对象中的值
                        //航班号
                        var flightNo = data[i].fFlightRecord.flightNo;
                        //机号
                        var no = data[i].fFlightRecord.no;
                        //航班性质
                        var nature = data[i].fFlightRecord.nature;
                        //任务性质
                        var task = data[i].fFlightRecord.task;
                        //起飞机场
                        var airportStart = data[i].fFlightRecord.airportStart;
                        //降落机场
                        var airportEnd = data[i].fFlightRecord.airportEnd;
                        //计划起飞
                        var planTakeTime = data[i].fFlightRecord.planTakeTime;
                        //计划落地
                        var planLandTime = data[i].fFlightRecord.planLandTime;
                        //进/出港
                        var aircraftPort = data[i].fFlightRecord.aircraftPort;
                        //航班状态
                        var statea = data[i].state;

                        //拼接
                        context = context + '<tr>\n' +
                            '<td><label>\n' +
                            '<input type="checkbox" class="ace">\n' +
                            '<span class="lbl"></span></label></td>\n' +
                            '<td>' + twoCode + '</td>\n' +
                            '<td> ' + flightNo + '</td>\n' +
                            '<td>' + task + '</td>\n' +
                            '<td>' + aircraftPort + '</td>\n' +
                            '<td>' + no + '</td>\n' +
                            '<td class="text-l">' + model + '</td>\n' +
                            '<td>' + nature + '</td>\n' +
                            '<td>' + airportStart + '</td>\n' +
                            '<td>' + planTakeTime + '</td>\n' +
                            '<td>' + planLandTime + '</td>\n' +
                            '<td>' + airportEnd + '</td>\n';
                            if (statea=='正常' || statea=='备降' || statea=='返航'){
                                context = context + '<td class="td-status"><span class="label label-success radius">' + statea + '</span></td>\n';
                            }else{
                                context = context + '<td class="td-status"><span class="label label-defaunt radius">' + statea + '</span></td>\n';
                            }
                            context = context + '<td class="td-manage"><a title="编辑" onclick="member_edit(' + id + ')" href="javascript:;" ' +
                            'class="btn btn-xs btn-info"><i class="icon-edit bigger-120"></i></a>\n' +
                            '</td>\n' +
                            '</tr>';
                    }
                    context = context + "</tbody>";
                    $('#sample-table').append(context);
                }
            });
        }
    </script>
    <title>航班动态信息</title>
</head>
<style>
    .add_menber li {
        width: 33%;
    }

    .add_menber li .label_name, .member_content li .label_name {
        width: 100px !important;
    }
</style>
<body>
<div class="page-content clearfix">
    <div id="Member_Ratings">
        <div class="d_Confirm_Order_style">

            <form id="search_form" action="">
                <div class="search_style">
                    <ul class="search_content clearfix">
                        <li>
                            <label class="l_f">航班号：</label>
                            <input name="" type="text" id="selectFlightNo" class="text_add" placeholder="输入航班号"
                                   style=" width:190px"/>
                        </li>
                        <li>
                            <label class="l_f">机号：</label>
                            <input name="" type="text" id="selectNo" class="text_add" placeholder="输入机号"
                                   style=" width:190px"/>
                        </li>
                        <li>
                            <label class="l_f">时间：</label>
                            <input class="inline laydate-icon" type="Date" id="selectDoDate" style=" margin-left:10px;">
                        </li>
                        <li>
                            <button type="button" class="btn_search" onclick="search_flight()"><i
                                    class="icon-search"></i>查询
                            </button>
                        </li>
                    </ul>
                </div>
                <div class="search_style">
                    <ul class="search_content clearfix">
                        <li>
                            <label class="l_f">所有航班：</label>
                            <select id="selectIsinit" name="" style=" width:110px">
                                <option value="所有">---所有---</option>
                                <option value="始发航班">始发航班--</option>
                                <option value="非始发航班">非始发航班--</option>
                            </select>
                        </li>
                        <li>
                            <label class="l_f">进出港：</label>
                            <select id="selectAircraftPort" name="" style=" width:110px">
                                <option value="所有">---所有---</option>
                                <option value="进港">进港</option>
                                <option value="出港">出港</option>
                            </select>
                        </li>
                        <li>
                            <label class="l_f">航空公司：</label>
                            <select id="selectAirlineCompany" name="" style=" width:110px">
                                <option value="航空公司">---航空公司---</option>
                                <option value="东航">东航</option>
                                <option value="南航">南航</option>
                                <option value="江西南昌航空公司">江西南昌航空公司</option>
                            </select>
                        </li>
                        <li>
                            <label class="l_f">国内/外航班：</label>
                            <select id="selectnNature" name="" style=" width:110px">
                                <option value="所有">---所有---</option>
                                <option value="国内航班">国内航班</option>
                                <option value="国外航班">国外航班</option>
                            </select>
                        </li>
                        <li>
                            <label class="l_f">航班状态：</label>
                            <select id="selectState" name="" style=" width:110px">
                                <option value="所有">---所有---</option>
                                <option value="延误">延误</option>
                                <option value="正常">正常</option>
                                <option value="取消">取消</option>
                                <option value="备降">备降</option>
                                <option value="返航">返航</option>
                            </select>
                        </li>
                    </ul>
                </div>
            </form>
            <!---->

            <div class="table_menu_list">
                <table class="table table-striped table-bordered table-hover" id="sample-table">
                    <thead>
                    <tr>
                        <th><label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span></label></th>
                        <th>航空公司二字码</th>
                        <th>航班</th>
                        <th>任务性质</th>
                        <th>进出港</th>
                        <th>机号</th>
                        <th>机型</th>
                        <th>航班性质</th>
                        <th>起飞机场</th>
                        <th>计划起飞时间</th>
                        <th>计划落地时间</th>
                        <th>降落机场</th>
                        <th>航班状态</th>
                        <th width="100">操作</th>
                    </tr>
                    </thead>
                </table>
                <div style=" float:right; margin-right:20px;">
                    <nav aria-label="Page navigation">
                        <ul class="pagination">
                            <li><a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a></li>
                            <li class="active"><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</div>
<!--修改图层-->
<form id="add_menber_form">
    <div class="add_menber" id="add_menber_style" style="display:none; width:900px !important;">
        <ul class=" page-content">
            <li>
                <label class="label_name">成人数量：</label>
                <span class="add_name">
      <input value="" id="adultNum" name="成人数量" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">儿童数量：</label>
                <span class="add_name">
      <input name="儿童数量" id="childNum" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">婴儿数量：</label>
                <span class="add_name">
      <input name="婴儿数量" id="babyNum" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">计划起飞时间：</label>
                <span class="add_name">
      <input name="计划起飞时间" id="planTakeTime" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">实际起飞时间：</label>
                <span class="add_name">
      <input name="实际起飞时间" id="realTakeTime" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">行李件数：</label>
                <span class="add_name">
      <input name="行李件数" id="luggageNum" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">货邮重量：</label>
                <span class="add_name">
      <input name="货邮重量" id="cargoWeight" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">撒轮挡时间：</label>
                <span class="add_name">
      <input name="撤轮挡时间" id="removeTime" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">计划落地时间：</label>
                <span class="add_name">
      <input name="计划落地时间" id="planLandTime" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">航班号：</label>
                <span class="add_name">
      <input name="航班号" id="flightNo2" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">机位：</label>
                <span class="add_name">
      <input name="机位" id="seat2" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">实际落地时间：</label>
                <span class="add_name">
      <input name="实际落地时间" id="realLandTime" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">挡轮挡时间：</label>
                <span class="add_name">
      <input name="挡轮挡时间" id="blockTime" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">执行日期：</label>
                <span class="add_name">
      <input name="执行日期" id="doDate" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">登机口：</label>
                <span class="add_name">
      <input name="登机口" id="gate" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">二字码：</label>
                <span class="add_name">
      <input name="航空公司二字码" id="twoCode2" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">行李转盘：</label>
                <span class="add_name">
      <input name="行李转盘" id="luggageTurntable" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">航空公司：</label>
                <span class="add_name">
      <input name="航空公司" id="airlineCompany" type="text" class="text_add" readonly="readonly" value="江西南昌航空公司  "/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">起飞机场：</label>
                <span class="add_name">
      <input name="起飞机场" id="airportStart" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">机号：</label>
                <span class="add_name">
      <input name="机号" id="no2" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">机型：</label>
                <span class="add_name">
      <input name="机型" id="model2" type="text" class="text_add" readonly="readonly"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">备降机场：</label>
                <span class="add_name">
      <input name="备降机场" id="airportEndSpare" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">关联航班ID：</label>
                <span class="add_name">
      <input name="关联航班ID" id="relationId" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">航站楼：</label>
                <span class="add_name">
      <input name="航站楼" id="terminal" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">航班代理：</label>
                <span class="add_name">
      <input name="航班代理" id="flightAgent" type="text" class="text_add"/>
      </span>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">是否始发航班：</label>
                <select id="isinit" name="" style=" width:156px; margin-left:10px;">
                    <option value="始发航班">始发航班</option>
                    <option value="非始发航班">非始发航班</option>
                </select>
                <div class="prompt r_f"></div>
                <input type="text" id="isinit2" style="display: none">
            </li>
            <li>
                <label class="label_name">航班状态：</label>
                <select id="state" name="" style=" width:156px; margin-left:10px;">
                    <option value="延误">延误</option>
                    <option value="正常">正常</option>
                    <option value="取消">取消</option>
                    <option value="备降">备降</option>
                    <option value="返航">返航</option>
                </select>
                <div class="prompt r_f"></div>
                <input type="text" id="state2" style="display: none">
            </li>
            <li>
                <label class="label_name">国内/外航班：</label>
                <select id="nature" name="" style=" width:156px ; margin-left:10px;">
                    <option value="国内航班">国内航班</option>
                    <option value="国外航班">国外航班</option>
                </select>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">不正常原因：</label>
                <select id="delayRemark" name="" style=" width:156px; margin-left:10px;">
                    <option value="无">无</option>
                    <option value="天气">天气</option>
                    <option value="飞机">飞机</option>
                    <option value="乘客">乘客</option>
                </select>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">进/出港：</label>
                <select id="aircraftPort" name="" style=" width:156px; margin-left:10px;">
                    <option value="进港">进港</option>
                    <option value="出港">出港</option>
                </select>
                <div class="prompt r_f"></div>
            </li>
            <li>
                <label class="label_name">任务性质：</label>
                <select id="task" name="" style=" width:156px; margin-left:10px;">
                    <option value="退航">退航</option>
                    <option value="正班">正班</option>
                    <option value="补班">补班</option>
                    <option value="专机">专机</option>
                    <option value="转场">转场</option>
                    <option value="训练">训练</option>
                </select>
                <div class="prompt r_f"></div>
            </li>
        </ul>
    </div>
</form>
</body>
</html>
<script>
    /*查询*/
    function search_flight() {
        var flightNo = $('#selectFlightNo').val();
        var no = $('#selectNo').val();
        var doDate = $('#selectDoDate').val();
        var isinit = $('#selectIsinit').val();
        var aircraftPort = $('#selectAircraftPort').val();
        var airlineCompany = $('#selectAirlineCompany').val();
        var nature = $('#selectnNature').val();
        var state = $('#selectState').val();
        $.ajax({
            url: '/getSomeFAircraftBasicDataBySelect.action',
            data: {
                'flightNo' : flightNo,
                'no' : no,
                'doDate' : doDate,
                'isinit' : isinit,
                'aircraftPort' : aircraftPort,
                'airlineCompany' : airlineCompany,
                'nature' : nature,
                'state' :state
            },
            success: function (d) {
                var data = JSON.parse(d);
                $('#initForm').remove();
                var context = "<tbody id='initForm'>";
                for (var i = 0; i < data.length; i++) {
                    //ID
                    var id = data[i].id;
                    //机号
                    var no = data[i].no;
                    //机型
                    var model = data[i].model;
                    //航空公司二字码
                    var twoCode = data[i].twoCode;
                    //fFlightRecord对象中的值
                    //航班号
                    var flightNo = data[i].fFlightRecord.flightNo;
                    //机号
                    var no = data[i].fFlightRecord.no;
                    //航班性质
                    var nature = data[i].fFlightRecord.nature;
                    //任务性质
                    var task = data[i].fFlightRecord.task;
                    //起飞机场
                    var airportStart = data[i].fFlightRecord.airportStart;
                    //降落机场
                    var airportEnd = data[i].fFlightRecord.airportEnd;
                    //计划起飞
                    var planTakeTime = data[i].fFlightRecord.planTakeTime;
                    //计划落地
                    var planLandTime = data[i].fFlightRecord.planLandTime;
                    //进/出港
                    var aircraftPort = data[i].fFlightRecord.aircraftPort;
                    //航班状态
                    var statea = data[i].state;

                    //拼接
                    context = context + '<tr>\n' +
                        '<td><label>\n' +
                        '<input type="checkbox" class="ace">\n' +
                        '<span class="lbl"></span></label></td>\n' +
                        '<td>' + twoCode + '</td>\n' +
                        '<td> ' + flightNo + '</td>\n' +
                        '<td>' + task + '</td>\n' +
                        '<td>' + aircraftPort + '</td>\n' +
                        '<td>' + no + '</td>\n' +
                        '<td class="text-l">' + model + '</td>\n' +
                        '<td>' + nature + '</td>\n' +
                        '<td>' + airportStart + '</td>\n' +
                        '<td>' + planTakeTime + '</td>\n' +
                        '<td>' + planLandTime + '</td>\n' +
                        '<td>' + airportEnd + '</td>\n';
                    if (statea == '正常' || statea == '备降' || statea == '返航') {
                        context = context + '<td class="td-status"><span class="label label-success radius">' + statea + '</span></td>\n';
                    } else {
                        context = context + '<td class="td-status"><span class="label label-defaunt radius">' + statea + '</span></td>\n';
                    }
                    context = context + '<td class="td-manage"><a title="编辑" onclick="member_edit(' + id + ')" href="javascript:;" ' +
                        'class="btn btn-xs btn-info"><i class="icon-edit bigger-120"></i></a>\n' +
                        '</td>\n' +
                        '</tr>';
                }
                context = context + "</tbody>";
                $('#sample-table').append(context);
            }
        });
    }

    /*-编辑*/
    function member_edit(id) {
        $.ajax({
            url: '/getFAircraftBasicDataById.action',
            jsonType: 'json',
            data: {
                'id': id
            },
            success: function (data) {
                var fAircraftBasicData = JSON.parse(data);
                //机型
                var model = fAircraftBasicData.model;
                $('#model2').val(model);
                //二字码
                var twoCode = fAircraftBasicData.twoCode;
                $('#twoCode2').val(twoCode);
                //fFlightRecord对象中的值
                //航班执行日期
                var doDate = fAircraftBasicData.fFlightRecord.doDate;
                $('#doDate').val(doDate);
                //航班号
                var flightNo = fAircraftBasicData.fFlightRecord.flightNo;
                $('#flightNo2').val(flightNo);
                //机号
                var no = fAircraftBasicData.fFlightRecord.no;
                $('#no2').val(no);
                //登机口
                var gate = fAircraftBasicData.fFlightRecord.gate;
                $('#gate').val(gate);
                //行李转盘
                var luggageTurntable = fAircraftBasicData.fFlightRecord.luggageTurntable;
                $('#luggageTurntable').val(luggageTurntable);
                //关联航班ID
                var relationId = fAircraftBasicData.fFlightRecord.relationId;
                $('#relationId').val(relationId);
                //航空公司ID
                var relationId = fAircraftBasicData.fFlightRecord.relationId;
                $('#relationId').val(relationId);
                //航空公司
                var airlineCompany = fAircraftBasicData.fFlightRecord.airlineCompany;
                $('#airlineCompany').val(airlineCompany);
                //航班代理
                var flightAgent = fAircraftBasicData.fFlightRecord.flightAgent;
                $('#flightAgent').val(flightAgent);
                //起飞机场
                var airportStart = fAircraftBasicData.fFlightRecord.airportStart;
                $('#airportStart').val(airportStart);
                //降落机场
                var airportEnd = fAircraftBasicData.fFlightRecord.airportEnd;
                $('#airportEnd').val(airportEnd);
                //备降机场
                var airportEndSpare = fAircraftBasicData.fFlightRecord.airportEndSpare;
                $('#airportEndSpare').val(airportEndSpare);
                //成人数量
                var adultNum = fAircraftBasicData.fFlightRecord.adultNum;
                $('#adultNum').val(adultNum);
                //儿童数量
                var childNum = fAircraftBasicData.fFlightRecord.childNum;
                $('#childNum').val(childNum);
                //婴儿数量
                var babyNum = fAircraftBasicData.fFlightRecord.babyNum;
                $('#babyNum').val(babyNum);
                //货邮数量
                var luggageNum = fAircraftBasicData.fFlightRecord.luggageNum;
                $('#luggageNum').val(luggageNum);
                //货邮重量
                var cargoWeight = fAircraftBasicData.fFlightRecord.cargoWeight;
                $('#cargoWeight').val(cargoWeight);
                //计划起飞
                var planTake = fAircraftBasicData.fFlightRecord.planTakeTime;
                var planTakeTime = planTake.substring(0, 16);
                $('#planTakeTime').val(planTakeTime);
                //计划落地
                var Landtime = fAircraftBasicData.fFlightRecord.planLandTime;
                var planLandTime = Landtime.substring(0, 16);
                $('#planLandTime').val(planLandTime);
                //实际起飞
                var realTake = fAircraftBasicData.fFlightRecord.realTakeTime;
                var realTakeTime = realTake.substring(0, 16);
                $('#realTakeTime').val(realTakeTime);
                //实际落地时间
                var realtime = fAircraftBasicData.fFlightRecord.realLandTime;
                var realLandTime = realtime.substring(0, 16);
                $('#realLandTime').val(realLandTime);
                //挡轮挡时间
                var block = fAircraftBasicData.fFlightRecord.blockTime;
                var blockTime = block.substring(0, 16);
                $('#blockTime').val(blockTime);
                //撤轮挡时间
                var remove = fAircraftBasicData.fFlightRecord.removeTime;
                var removeTime = remove.substring(0, 16);
                $('#removeTime').val(removeTime);
                //航站楼
                var terminal = fAircraftBasicData.fFlightRecord.terminal;
                $('#terminal').val(terminal);
                //机位
                var seat = fAircraftBasicData.fFlightRecord.seat;
                $('#seat2').val(seat);

                //是否始发航班
                var isinits = fAircraftBasicData.isinit;
                $('#isinit2').val(isinits);

                //航班状态
                var state = fAircraftBasicData.state;
                $('#state2').val(state);

                //航班性质
                var nature = fAircraftBasicData.fFlightRecord.nature;
                //不正常原因
                var delayRemark = fAircraftBasicData.fFlightRecord.delayRemark;
                //进/出港
                var aircraftPort = fAircraftBasicData.fFlightRecord.aircraftPort;
                //任务性质
                var task = fAircraftBasicData.fFlightRecord.task;


                //是否始发航班
                var isinintobj = document.getElementById("isinit");
                if (isinintobj) {//对象不为空
                    for (var i = 0; i < isinintobj.length; i++) {
                        if (isinintobj[i].value == isinits) {
                            isinintobj.options[i].selected = true;
                            break;
                        }
                    }
                }

                //航班状态(航班延误原因)
                var stateobj = document.getElementById("state");
                for (var i = 0; i < stateobj.length; i++) {
                    if (stateobj[i].value == state) {
                        stateobj.options[i].selected = true;
                        break;
                    }
                }

                //国内/外航班
                var natureobj = document.getElementById("nature");
                for (var i = 0; i < natureobj.length; i++) {
                    if (natureobj[i].value == nature) {
                        natureobj.options[i].selected = true;
                        break;
                    }
                }

                //不正常原因
                var delayRemarkobj = document.getElementById("delayRemark");
                for (var i = 0; i < delayRemarkobj.length; i++) {
                    if (delayRemarkobj[i].value == delayRemark) {
                        delayRemarkobj.options[i].selected = true;
                        break;
                    }
                }

                //进/出港
                var aircraftPortboj = document.getElementById("aircraftPort");
                for (var i = 0; i < aircraftPortboj.length; i++) {
                    if (aircraftPortboj[i].value == aircraftPort) {
                        aircraftPortboj.options[i].selected = true;
                        break;
                    }
                }

                //任务性质
                var taskobj = document.getElementById("task");
                for (var i = 0; i < taskobj.length; i++) {
                    if (taskobj[i].value == task) {
                        taskobj.options[i].selected = true;
                        break;
                    }
                }

                //禁止选择
                //国内/外航班
                $('#nature').attr("disabled", "disabled").css("background-color", "#EEEEEE;");
                //进出港
                $('#aircraftPort').attr("disabled", "disabled").css("background-color", "#EEEEEE;");
                //任务性质
                $('#task').attr("disabled", "disabled").css("background-color", "#EEEEEE;");

            }
        });
        layer.open({
            type: 1,
            title: '修改航班动态信息',
            maxmin: true,
            shadeClose: false, //点击遮罩关闭层
            area: ['920px', ''],
            content: $('#add_menber_style'),
            btn: ['提交', '取消'],
            yes: function (index, layero) {
                var num = 0;
                var str = "";
                $(".add_menber input[type$='text']").each(function (n) {
                    if ($(this).val() == "") {

                        layer.alert(str += "" + $(this).attr("name") + "不能为空！\r\n", {
                            title: '提示框',
                            icon: 0,
                        });
                        num++;
                        return false;
                    }
                });
                if (num > 0) {
                    alert("aa");
                    return false;
                }
                else {
                    var adultNum2 = $('#adultNum').val();
                    var childNum2 = $('#childNum').val();
                    var babyNum2 = $('#babyNum').val();
                    var luggageNum2 = $('#luggageNum').val();
                    var cargoWeight2 = $('#cargoWeight').val();
                    var seat2 = $('#seat2').val();
                    var gate2 = $('#gate').val();
                    var luggageTurntable2 = $('#luggageTurntable').val();
                    var airportStart2 = $('#airportStart').val();
                    var airportEndSpare2 = $('#airportEndSpare').val();
                    var relationId2 = $('#relationId').val();
                    var terminal2 = $('#terminal').val();
                    var flightAgent2 = $('#flightAgent').val();
                    var delayRemark2 = $('#delayRemark').val();
                    $.ajax({
                        url: '/updateFFlightRecordById.action',
                        dataType: 'json',
                        data: {
                            'id': id,
                            'adultNum': adultNum2,
                            'childNum': childNum2,
                            'babyNum': babyNum2,
                            'luggageNum': luggageNum2,
                            'cargoWeight': cargoWeight2,
                            'seat': seat2,
                            'gate': gate2,
                            'luggageTurntable': luggageTurntable2,
                            'airportStart': airportStart2,
                            'airportEndSpare': airportEndSpare2,
                            'relationId': relationId2,
                            'terminal': terminal2,
                            'flightAgent': flightAgent2,
                            'delayRemark': delayRemark2
                        },
                        success: function (data) {

                        }
                    });

                    //改变后
                    var isinit3 = $('#isinit').val();
                    var state3 = $('#state').val();
                    //改变前
                    var state2 = $('#state2').val();
                    var isinit2 = $('#isinit2').val();
                    if (state2 != state3 || isinit2 != isinit3) {
                        $.ajax({
                            url: '/updateFAircraftBasicDataById.action',
                            dataType: 'json',
                            data: {
                                'id': id,
                                'state': state3,
                                'isinit': isinit3
                            },
                            success: function (data) {

                            }
                        });
                    }
                    $('#initForm').remove();
                    init();
                    layer.alert('编辑成功！', {
                        title: '提示框',
                        icon: 1,
                    });
                    layer.close(index);
                }
            }
        });
    }


    /*-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }


</script>