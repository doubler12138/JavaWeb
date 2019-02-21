<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/22
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP包含与转发</title>
</head>
<body>
<%@ include file="header.jsp"%>
We're sorry.... you need to log in again.<br>
<form action="index.jsp" method="get">
    Name:<input name="userName" type="text">
    <input name="Submit" type="submit">
</form>
<jsp:include page="footer.jsp">
    <jsp:param name="subTitle" value="footer.jsp"/>
</jsp:include>
</body>
</html>
