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
    <title>advertsResult</title>
</head>
<body>
    <div> <a href="/login">Login</a> <a href="/register">Register</a> </div>
    <c:choose>
        <c:when test="${not empty adverts}">
            <table>
                <thead>
                    <tr>
                        <th>Aprašymas</th>
                        <th>Miestas</th>
                        <th>Kaina</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${adverts}" var="advert">
                        <tr>
                            <td><a href="/advertDetailed?id=${advert.id}"> ${advert.shortDescription}</a></td>
                            <td>${advert.city}</td>
                            <td>${advert.price}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:when>
        <c:otherwise>
            <code>"adverts" is empty</code>
        </c:otherwise>
    </c:choose>
</body>
</html>
