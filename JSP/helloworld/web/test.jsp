<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/24
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    String x = request.getParameter("num");
    int y = Integer.parseInt(x);
    int z = y*y;
    out.println(z);
%>
</body>
</html>
