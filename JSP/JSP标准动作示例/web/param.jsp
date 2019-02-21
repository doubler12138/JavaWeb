<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/19
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="person1"  class="foo.Employee">
    <jsp:setProperty name="person1" property="name" param="userName" />
    <jsp:setProperty name="person1" property="empID" />
</jsp:useBean>
Name:<jsp:getProperty name="person1" property="name" />
ID:<jsp:getProperty name="person1" property="empID"/>
<jsp:useBean id="person2" type="foo.Employee" class="foo.Employee">
    <jsp:setProperty name="person2" property="*" />
</jsp:useBean>
<br/>
Name:<jsp:getProperty name="person2" property="name"/>
ID:<jsp:getProperty name="person2" property="empID"/>
</body>
</html>
