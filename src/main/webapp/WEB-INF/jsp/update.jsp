<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 16.08.2022
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<form method="post" action="/todo/update">

    <table>

        <tr>
            <td><input  hidden name="id" value="${todo.id}" readonly="readonly"/></td>
        </tr>

        <tr>
            <td>Name :</td>
            <td><input name="description" value="${todo.description}"/></td>
        </tr>

        <tr>
            <td>Start date :</td>
            <td><input type="datetime-local" name="startdate" value="${todo.startdate}"/></td>
        </tr>

        <tr>
            <td>End date :</td>
            <td><input  type="datetime-local" name="enddate" value="${todo.enddate}"/></td>

        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>

    </table>
</form>
</body>
</html>