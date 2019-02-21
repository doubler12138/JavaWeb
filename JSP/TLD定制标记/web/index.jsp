<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/2/1
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mine" uri="http://mycompany.com" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>TLD定制标记</title>
  </head>
  <body>
  Adivisor Page<br>
  <c:set var="userName" value="Tom" />
  <mine:advice>
    <jsp:attribute name="user">${userName}</jsp:attribute>
  </mine:advice>
  </body>
</html>
