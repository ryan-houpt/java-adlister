<%--
  Created by IntelliJ IDEA.
  User: ryanhoupt
  Date: 12/11/18
  Time: 9:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
String name = request.getParameter("inputname");
%>

<h1>
    Hello <%=name%>
</h1>


</body>
</html>
