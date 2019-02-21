<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/20
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>EL隐式对象</title>
  </head>
  <body>
  Request param name is : ${param.name} <br>
  Request param empID is : ${param.empID} <br>
  Request param food is : ${param.food} <br>
  First food request param: ${paramValues.food[0]}<br>
  Second food request param: ${paramValues.food[1]}<br><br>

  Method is: ${pageContext.request.method}
  </body>
</html>
