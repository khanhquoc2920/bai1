<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listing </title>
</head>
<%@ page isELIgnored="false" %>
<body>
    <h1>Info</h1>
    <p><a href="/new">Add new info</a></p>
    <p>There are ${infos.size()} info in this list.</p>
    <table border="1">
        <tr>
            <td>Id</td>
            <td>Ten</td>
            <td>Dia chi</td>
            <td>Sdt</td>
        </tr>
        <c:forEach var="info" items="${infos}">
            <tr>
                <td>${info.getId()}</td>
                <td><a href="view?id=${info.getId()}"> ${info.getName()}</a></td>
                <td>${info.getAddress()}</td>
                <td>${info.getPhone()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
