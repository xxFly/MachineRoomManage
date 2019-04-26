<%--
  Created by IntelliJ IDEA.
  User: Fecinly
  Date: 2019/4/12
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${path}/user/doLogin" method="post">
    <div>账号：<input type="text" name="user_id" placeholder="账号"></div>
    <div>密码：<input type="text" name="user_password" placeholder="密码"></div>
    <div><button type="submit" id="login">登录</button></div>
</form>
</body>
</html>
<%--<script type="text/javascript">--%>

<%--    $(document).ready(function() {--%>

<%--        $("#login").click(function() {--%>

<%--            var json = {--%>
<%--                "userID" : $("#userID").val(),--%>
<%--                "userPassword" : $("#userPassword").val(),--%>

<%--            };--%>

<%--            $.ajax({--%>
<%--                url : '/user/login',--%>
<%--                type : "POST",--%>
<%--                data : JSON.stringify(json), //转JSON字符串--%>
<%--                dataType : 'json',--%>
<%--                contentType : 'application/json;charset=utf-8',--%>
<%--                success : function(info) {--%>
<%--                    if(data.result){--%>
<%--                        alert("成功");--%>
<%--                        console.log("=========="+data)--%>
<%--                        return;--%>
<%--                    }else{--%>
<%--                        alert("失败");--%>
<%--                        console.log("=========="+data)--%>
<%--                        return;--%>
<%--                    }--%>
<%--                },--%>
<%--                error : function(info) {--%>
<%--                    //messages--%>
<%--                    // alert(JSON.stringify(info));--%>
<%--                    alert("error");--%>
<%--                }--%>
<%--            });--%>
<%--        });--%>
<%--    });--%>

<%--</script>--%>