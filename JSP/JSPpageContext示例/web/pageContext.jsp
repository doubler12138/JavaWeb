<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/16
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test for JSP pageContext</title>
</head>
<body>
<% pageContext.setAttribute("application",request.getParameter("application"),PageContext.APPLICATION_SCOPE);
   pageContext.setAttribute("session",request.getParameter("session"),PageContext.SESSION_SCOPE);
   pageContext.setAttribute("request",request.getParameter("request"),PageContext.REQUEST_SCOPE);
   pageContext.setAttribute("page",request.getParameter("page"),PageContext.PAGE_SCOPE);
%>
<p>收到的属性</p>
application:<%= application.getAttribute("application")%>
<br/>
session:<%= session.getAttribute("session")%>
<br/>
request:<%= request.getAttribute("request")%>
<br/>
page:<%= pageContext.getAttribute("page")%>
</body>
</html>
