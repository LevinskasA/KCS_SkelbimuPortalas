<%--
  Created by IntelliJ IDEA.
  User: Askew
  Date: 3/10/2017
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>advertDetailed</title>
</head>
<body>
    <c:choose>
        <c:when test="${not empty advert}">
            <table>
                <tr>
                    <td>Aprašymas: </td>
                    <td>${advert.description}</td>
                </tr>
                <tr>
                    <td>Kaina: </td>
                    <td style="font-size: 20px">${advert.price}</td>
                </tr>
                <tr>
                    <td>Miestas: </td>
                    <td>${advert.city}</td>
                </tr>
                <tr>
                    <td>Įkelta: </td>
                    <td>${advert.insertTime}</td>
                </tr>
                <tr>
                    <td>Galioja iki:</td>
                    <td>${advert.activeUntil}</td>
                </tr>
                <tr>
                    <td>El. paštas: </td>
                    <td>${advert.email}</td>
                </tr>
                <tr>
                    <td>Telefonas: </td>
                    <td>${advert.phone}</td>
                </tr>

            </table>
        </c:when>

    </c:choose>
</body>
</html>
