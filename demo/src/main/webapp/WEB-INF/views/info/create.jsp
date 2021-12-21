<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new info</title>
    <style>
        .message{
            color: green;
        }
    </style>
</head>
<%@ page isELIgnored="false" %>
<body>
    <h1>Create new Product</h1>
    <a href="/infos">Back to info list</a>
    <p>
      <c:if test="${message != null}">
          <span class="message">${message}</span>
      </c:if>
    </p>
    <form:form action="new" method="post" modelAttribute="info">
        <fieldset>
            <legend>Product information</legend>
            <table>
                <tr>
                    <td><form:label path="name">ten:</form:label></td>
                    <td><form:input path="name"/> </td>
                </tr>
                <tr>
                    <td><form:label path="address">diachi:</form:label></td>
                    <td><form:input path="address"/> </td>
                </tr>
                <tr>
                    <td><form:label path="phone">sdt:</form:label></td>
                    <td><form:input path="phone"/> </td>
                </tr>
                <tr>
                    <td></td>
                    <td><form:button>Create info</form:button> </td>
                </tr>
            </table>
        </fieldset>
    </form:form>
</body>
</html>
