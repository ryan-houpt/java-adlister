<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ryanhoupt
  Date: 12/10/18
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:forEach items="${ads}" var="ad">
        <h1>${ad.title}</h1>
        <p>${ad.description}</p>
    </c:forEach>

</body>
</html>
