<%--
  Created by IntelliJ IDEA.
  User: Askew
  Date: 3/10/2017
  Time: 8:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<c:if test="${not empty error}">
    ${error}
</c:if>
<c:if test="${not empty message}">
    ${message}
</c:if>
    <form action="/login" method="post">
        <div><b>El. paštas:</b> <input type="text" name="email" placeholder="El. paštas"></div>
        <div><b>Slaptažodis:</b> <input type="password" name="password" placeholder="Slaptažodis"></div>

        <div>
            <button type="submit"> Prisijungti </button>
        </div>

        <c:choose>
            <c:when test="${action} = 1">



            </c:when>
            <c:when test="${action} = registration">
                <div><b>Pakartoti slaptažodį:</b> <input type="password" name="passwordRepeat" placeholder="Pakartokite"></div>
                <div>
                    <button type="submit"> Registruotis </button>
                </div>
            </c:when>

        </c:choose>
    </form>
</body>
</html>
