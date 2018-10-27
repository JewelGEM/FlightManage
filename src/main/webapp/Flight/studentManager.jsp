<%--
  Created by IntelliJ IDEA.
  User: ME CC
  Date: 2018/10/22
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理</title>
</head>

<body>
    <form action="/addStudent" method="post">
       学生姓名: <input type="text" id="sname" name="sname" />
       性别: <input  type="radio" id="sex1"  name="sex" value="男"/>男<input  type="radio" id="sex2"  name="sex" value="女"/>女
        年龄:<input type="text" id="age" name="age" />
        班级id:<input type="text" id="c.cid" name="c.cid"/>
        <input type="submit" value="提交" />
    </form>


</body>
</html>
