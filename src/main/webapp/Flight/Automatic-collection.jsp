<%--
  Created by IntelliJ IDEA.
  User: ME CC
  Date: 2018/10/26
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="assets/css/ace.min.css"/>
    <link rel="stylesheet" href="assets/css/font-awesome.min.css"/>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/H-ui.js"></script>
    <script type="text/javascript" src="js/H-ui.admin.js"></script>
    <script src="assets/layer/layer.js" type="text/javascript"></script>
    <title>航班动态信息</title>
</head>
<script type="text/javascript">
    $.ajax({
        url: '/getAllCollection.action',
        dataType: 'json',
        success: function (data) {
            var context = "<tbody id='a'>";
            for (var i = 0; i < data.length; i++) {
                //ID
                var id = data[i].id;
                //name
                var name = data[i].name;
                //url
                var url = data[i].url;
                //updateTime
                var time = data[i].updateTime;
                var updateTime = time.substring(0, 16);
                //state
                var state = data[i].state;

                //拼接数据
                context = context + "<tr id=" + id + "><td><label><input type='checkbox' class='ace'><span class='lbl'></span></label></td><td>" + id + "</td><td>" + name + "</td><td>" + url + "</td><td>" + updateTime + "</td>";
                if (state == 1) {
                    context = context + "<td class='td-status'><span class='label label-success radius'>自动</span></td><td class='td-manage'><a href='javascript:;' title='停用' class='btn btn-xs btn-success' onClick='member_stop(this," + id + ")'>";
                } else {
                    context = context + "<td class='td-status'><span class='label label-defaunt radius'>已停用</span></td><td class='td-manage'><a style='text-decoration:none' class='btn btn-xs ' href='javascript:;' title='启用' onclick='member_start(this," + id + ")'>";
                }
                context = context + "<i class='icon-ok bigger-120'></i></a><a title='删除' href='javascript:;' class='btn btn-xs btn-warning' onclick='member_del(this," + id + ")'><i class='icon-trash  bigger-120'></i></a></td></tr>";
            }
            context = context + "</tbody>";
            //将获得的值放入表单
            $('#sample-table').append(context);
        }
    });
</script>

<body>
<div class="page-content clearfix">
    <div id="Member_Ratings">
        <div class="d_Confirm_Order_style">

            <div class="table_menu_list" style="margin-top:20px;">
                <table class="table table-striped table-bordered table-hover" id="sample-table">
                    <thead>
                    <tr>
                        <th><label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span></label></th>
                        <th>ID</th>
                        <th>接口名称hhhhhhh</th>
                        <th>接口地址</th>
                        <th>更新时间</th>
                        <th>采集状态</th>
                        <th width="140">操作</th>
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

</body>
</html>
<script>
    /*-删除*/
    function member_del(obj, id) {
        delConllection(id);
        layer.confirm('确认要删除吗？', function (index) {
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }

    /*-停用*/
    function member_stop(obj, id) {
        layer.confirm('确认要停用吗？', function (index) {
            updateCollectionState(id, 2);
            $(obj).parents("tr").find(".td-manage").prepend("<a style='text-decoration:none' class='btn btn-xs ' href='javascript:;' title='启用' onclick='member_start(this," + id + ")'><i class='icon-ok bigger-120'></i></a>");
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
            $(obj).remove();
            layer.msg('已停用!', {icon: 5, time: 1000});
        });
    }

    /*-启用*/
    function member_start(obj, id) {
        layer.confirm('确认要启用吗？', function (index) {
            updateCollectionState(id, 1);
            $(obj).parents("tr").find(".td-manage").prepend("<a style='text-decoration:none' class='btn btn-xs btn-success' href='javascript:;' title='停用' onClick='member_stop(this," + id + ")'><i class='icon-ok bigger-120'></i></a>");
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">自动</span>');
            $(obj).remove();
            layer.msg('已启用!', {icon: 6, time: 1000});
        });
    }

    /*根据id修改接口状态*/
    function updateCollectionState(id, state) {
        $.ajax({
            url: '/updateCollectionState.action',
            dataType: 'json',
            data: {
                'id': id,
                'state': state
            },
            success: function (data) {

            }
        });
    }

    /*根据ID删除接口对象*/
    function delConllection(id) {
        $.ajax({
            url: '/delConllection.action',
            dataType: 'json',
            data: {
                'id': id
            },
            success: function (data) {

            }
        });
    }
</script>