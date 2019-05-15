<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    机房管理系统
                </h1>
            </div>
        </div>
    </div>
</div>
<br><br>
<div>
    <form action="${path}/user/doLogin" method="post">
        <div>账号：<input type="text" name="user_id" placeholder="账号"></div>
        <div>密码：<input type="password" name="user_password" placeholder="密码"></div>
        <div><button type="submit" id="login">登录</button></div>
    </form>
<%--    <a href="${path }/paper/allPaper">点击进入管理页面</a>--%>
<%--    <a href="${path}/user/login">去登陆</a>--%>
<%--    <div><a href="${path }/easyuiJSP/main.jsp"><h3>main</h3></a></div>--%>
<%--    <a href="${path }/machineRoom/queryAllRoomsAndCabinet?user_id=001"><h3>getRooms</h3></a>--%>
<%--    <a href="${path }/user/login"><h3>login</h3></a>--%>
<%--    <a href="${path }/user/register"><h3>register</h3></a>--%>
<%--    <a href="${path }/rabbit/main"><h3>rabbitMain</h3></a>--%>
<%--    <a href="${path }/rabbit/doValid"><h3>rabbitDo</h3></a>--%>

</div>
</body>
</html>