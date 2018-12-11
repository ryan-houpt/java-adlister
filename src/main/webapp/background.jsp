<%--
  Created by IntelliJ IDEA.
  User: ryanhoupt
  Date: 12/11/18
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        String color = request.getParameter("color");
    %>

    <style>
        body {background-color: <%=color%>}
    </style>

</head>
<body>

    <h1>The color is <%=color%></h1>

</body>
</html>
