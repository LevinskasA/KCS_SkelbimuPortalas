<%--
  Created by IntelliJ IDEA.
  User: Askew
  Date: 3/9/2017
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Adverts Results</title>
</head>
<body>
    <c:choose>
        <c:when test="${not empty adverts}">
            Not empty
        </c:when>
        <c:otherwise>
            <code>"adverts" is empty</code>
        </c:otherwise>
    </c:choose>
</body>
</html>
