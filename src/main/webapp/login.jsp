<%--
  Created by IntelliJ IDEA.
  User: ryanhoupt
  Date: 12/10/18
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>



<%--<c:if test="${param.username.equals(\"admin\")}">--%>
    <%--<c:if test='${param.password.equals("password")}'>--%>
        <%--<jsp:forward page="profile.jsp" />--%>
    <%--</c:if>--%>
<%--</c:if>--%>

<form method="post" action="">

    <p>Enter Username:
        <input type="text" name="username"
               value="<c:out value="${param.username}"/>"/>
    </p>
    <br />
    <p>Enter Password:
        <input type="text" name="password"
               value="<c:out value="${param.password}"/>"/>
    </p>
    <br />
    <input type="submit" value="login">

</form>

</body>
</html>
