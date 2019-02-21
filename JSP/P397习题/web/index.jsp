<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/21
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>P397习题</title>
  </head>
  <body>
  1.${num > 3}<br>
  2.${integer le 12}<br>
  3.${requestScope["integer"] ne 4 and 6 le num || false}<br>
  4.${list[0] || list["1"] and true}<br>
  5.${num > integer}<br>
  6.${num == integer-1}<br>
  <jsp:useBean id="myDog" class="foo.Dog">
    <jsp:setProperty name="myDog" property="name" value="${list[1]}" />
  </jsp:useBean>
  7.${myDog.name and true}<br>
  8.${42 div 0}
  </body>
</html>
