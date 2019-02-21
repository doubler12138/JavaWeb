<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/22
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JSP包含与转发</title>
  </head>
  <body>
  <%@include file="header.jsp"%>
  Welcome to our page<br>
  <% if (request.getParameter("userName") == null) { %>
    <jsp:forward page="handlelt.jsp" />
  <% } %>
  Hello ${param.userName}<br>
  <jsp:include page="footer.jsp">
    <jsp:param name="subTitle" value="footer.jsp" />
  </jsp:include>
  </body>
</html>
