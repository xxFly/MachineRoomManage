<%--
  Created by IntelliJ IDEA.
  User: Fecinly
  Date: 2019/4/16
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>register</title>
</head>
<body>
<h1 align="center">注册</h1>
<div align="center">
    <form action="${path}/user/doRegister" method="post">
    <label>账号:</label><input type="text" name="user_id" placeholder="(必填，无法更改)"><br><br>
    <label>昵称:</label><input type="text" name="user_name" placeholder="(必填)"><br><br>
    <label>密码:</label><input type="text" name="user_password" placeholder="(必填，至少8位字母和数字的组合)"><br><br>
    <label>邮箱:</label><input type="text" name="user_email" placeholder="(必填)"><br><br>
    <label>电话:</label><input type="text" name="user_phone" placeholder=""><br><br>
    <label>个性签名:</label><input type="text" name="user_signature" placeholder=""><br><br>
    <label>备注:</label><input type="text" name="user_remark" placeholder=""><br><br><br>
    <button type="submit" >注册</button>
    </form>
</div>
</body>
</html>
