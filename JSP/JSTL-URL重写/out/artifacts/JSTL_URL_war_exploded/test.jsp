<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/2/1
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL-URL重写</title>
</head>
<body>
<c:url value="/result.jsp?name=${param.name}&pass=${param.pass}" var="inputURL" />
The URL using params is ${inputURL}<br/>
<a href="${inputURL}" >Click here</a>
</body>
</html>
