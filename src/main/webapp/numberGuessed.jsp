<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: ryanhoupt
  Date: 12/11/18
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:choose>
        <c:when test="${randNum == number}">
        <h1>You guessed right!</h1>
        </c:when>
        <c:when test="${randNum > number}">
            <h1>Guess Lower</h1>
        </c:when>
        <c:when test="${randNum < number}">
            <h1>Guess Higher</h1>
        </c:when>
    </c:choose>

</body>
</html>
