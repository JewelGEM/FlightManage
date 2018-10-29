<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html"/>
<meta http-equiv="Pragma" content="no-cache"> 
<meta http-equiv="Cache-Control" content="no-cache"> 
<meta http-equiv="Expires" content="0"> 
<title>后台管理</title>
<link href="login.css" rel="stylesheet" type="text/css" />

<script src="Flight/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#login").click(function(){
	    // window.location.href="Flight/index.jsp";

		$.ajax({
			type:'post',
			url:'/login.action',
			data:$("#user").serialize(),
			success:function(data){
				alert("回来了");
			}
		 })
	})
	
	
	
	
	
})
</script>


</head>

<body>  
<div class="login_box">
       
      <div class="login">
          <div class="login_logo"><a href="javascript:void(0)"><img src="Flight/images/login_logo.png" /></a></div>
          <div class="login_name">
               <p>登录后台</p>
          </div>
          <form method="post" id="user">
              <input name="ma_name" id="ma_name" type="text"  placeholder="用户名" >
              <span id="password_text"  onclick="this.style.display='none';document.getElementById('password').style.display='block';document.getElementById('password').focus().select();" >密码</span>
<input name="ma_pwd" type="password" id="password" style="display:none;" onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};"/>
           <input id="login" value="登录" style="width:100%;" type="button">
          </form>
      </div>
</div>
<div style="text-align:center;">
</div>
</body>
</html>
