<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/21
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dog's Name</title>
</head>
<body>
<!-- 不用标准动作（使用脚本） -->
Dog's Name is : <%=((foo.Person) request.getAttribute("person")).getDog().getName()%>
<br/>
<!-- 使用标准动作（不适用脚本） -->
<jsp:useBean id="person" class="foo.Person" scope="request"/>
Dog's Name is : <jsp:getProperty name="person" property="dog" />
<br/>
<!--使用EL表达式-->
Dog's Name is :${person.dog.name}
<br/>
<!-- EL表达式[]符号测试 -->
Music is : ${musicList}
<br/>
Music is : ${musicList[1]}
</body>
</html>
