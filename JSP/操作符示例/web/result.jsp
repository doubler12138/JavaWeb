<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/23
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作符示例</title>
</head>
<body>
${person.name}'s dog ${person.dog.name}'s toys are: ${person.dog.toys[0].name},${person.dog.toys[1].name} and a ${person.dog.toys[2]["name"]}
</body>
</html>
