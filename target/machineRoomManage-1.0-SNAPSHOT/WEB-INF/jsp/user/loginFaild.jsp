<%--
  Created by IntelliJ IDEA.
  User: Fecinly
  Date: 2019/4/12
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>登录失败</title>
</head>
<body>
登陆失败啦，账号错误请重试<a href="${path }/user/login">登陆</a>
</body>
</html>
