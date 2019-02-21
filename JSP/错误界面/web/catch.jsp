<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/2/1
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>错误界面</title>
</head>
<body>
<c:catch var="myException">
    Inside the catch ....<br/>
    ${ 10 % foo }
    After the catch ....
</c:catch>

<c:if test="${myException != null}">
    There was an exception: ${myException.message}<br/>
</c:if>
</body>
</html>
