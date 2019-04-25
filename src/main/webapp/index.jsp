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
<%--    <a href="${path }/paper/allPaper">点击进入管理页面</a>--%>
<%--    <a href="${path}/user/login">去登陆</a>--%>
    <div><a href="${path }/user/login"><h3>登录</h3></a></div>
    <div><a href="${path }/user/register"><h3>注册</h3></a></div>
    <div><a href="${path }/rabbit/main"><h3>rabbitMain</h3></a></div>
    <div><a href="${path }/rabbit/doValid"><h3>rabbitDo</h3></a></div>
</div>
</body>
</html>