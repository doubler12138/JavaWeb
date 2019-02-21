<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/18
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test for JSP</title>
</head>
<body>
<jsp:useBean id="employee1" class="foo.Employee" scope="request" />
Employee1's Name: <jsp:getProperty name="employee1" property="name" />
<br/>
<jsp:setProperty name="employee1" property="empID" value="10086" />
Employee1's EmpID: <jsp:getProperty name="employee1" property="empID" />
<br/>
<jsp:useBean id="employee2" type="foo.Person" class="foo.Employee" scope="request" >
    <jsp:setProperty name="employee2" property="name" value="Bob"/>
</jsp:useBean>
Employee2's Name: <jsp:getProperty name="employee2" property="name" />
<br/>
<jsp:useBean id="employee3" type="foo.Person" scope="request" />
<jsp:setProperty name="employee3" property="name" value="Tom" />
Employee3's Name: <jsp:getProperty name="employee3" property="name" />
</body>
</html>
