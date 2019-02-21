<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/28
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>JSTL-forEach标记</title>
  </head>
  <body>
  <table>
      <c:forEach var="listElement" items="${movies}" varStatus="m1">
          movies${m1.count}:<br/>
          <c:forEach var="movie" items="${listElement}" varStatus="m2">
              <tr>
                  <td>Count:${m2.count}</td>
                  <td>${movie}</td>
              </tr>
          </c:forEach>
      </c:forEach>
  </table>
  </body>
</html>
