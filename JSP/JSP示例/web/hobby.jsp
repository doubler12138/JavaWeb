<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/16
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Hobby</title>
</head>
<body>
The friends who share your hobby of
<%= request.getParameter("hobby")%>
are:<br/>
<% ArrayList al = (ArrayList)request.getAttribute("names"); %>
<% Iterator it = al.iterator(); %>
<% while(it.hasNext()){ %>
    <%=it.next()%>
    <br/>
<% } %>
</body>
</html>
