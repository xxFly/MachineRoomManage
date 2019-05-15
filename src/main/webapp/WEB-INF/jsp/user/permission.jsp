<%--
  Created by IntelliJ IDEA.
  User: Fecinly
  Date: 2019/5/8
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${path }/user/admin"><h3>admin?</h3></a>
<a href="${path }/user/guest"><h3>guest?</h3></a>
<a href="${path }/machineRoom/queryAllRoomsAndCabinet?user_id=001"><h3>getRooms</h3></a>
<a href="${path }/user/register"><h3>rabbitmqtest</h3></a>
</body>
</html>
