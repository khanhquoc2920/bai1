<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>details</title>
</head>
<%@ page isELIgnored="false" %>
<body>
    <h1>Info details</h1>
    <a href="/infos">Back to info list</a>
    <table>
        <tr>
            <td>Ten</td>
            <td>${info.getName()}</td>
        </tr>
        <tr>
            <td>dia chi: </td>
            <td>${info.getAddress()}</td>
        </tr>
        <tr>
            <td>sdt: </td>
            <td>${info.getPhone()}</td>
        </tr>
    </table>
</body>
</html>
