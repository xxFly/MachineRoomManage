<%--
  Created by IntelliJ IDEA.
  User: Fecinly
  Date: 2019/4/16
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<h1>注册</h1>
<div>
    <form action="/user/doRegister" method="post">
    <label>账号:</label><input type="text" name="user_id" placeholder="(必填，无法更改)">
    <label>昵称:</label><input type="text" name="user_name" placeholder="(必填)">
    <label>密码:</label><input type="text" name="user_password" placeholder="(必填，至少8位字母和数字的组合)">
    <label>邮箱:</label><input type="text" name="user_email" placeholder="(必填)">
    <label>电话:</label><input type="text" name="user_phone" placeholder="">
    <label>个性签名:</label><input type="text" name="user_signature" placeholder="">
    <label>备注:</label><input type="text" name="user_remark" placeholder="">
    <button type="submit" >注册</button>
    </form>
</div>
</body>
</html>
