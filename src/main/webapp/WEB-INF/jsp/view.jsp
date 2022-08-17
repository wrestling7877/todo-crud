
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/08/2022
  Time: 05:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<%@include file="navbar.jsp"%>
<table>
    <tr>

        <th>Description</th>
        <th>Start date</th>
        <td>End date</td>
        <td>Edite</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${todoList}" var="list">
        <tr>
            <td>${list.getDescription()}</td>
            <td>${list.getStartdate()}</td>
            <td>${list.getEnddate()}</td>
            <td><a href="/todo/update-form?id=${list.getId()}">Edit</a></td>
            <td><a href="/todo/delete?id=${list.getId()}">Delete</a></td>


        </tr>
    </c:forEach>

</table>



</body>
</html>
