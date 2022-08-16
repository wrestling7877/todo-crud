<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 16/08/2022
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Add new to do</title>
</head>
<body>

<form method="post" action="/todo/save">
    <table >
        <tr>
            <td>Description : </td>
            <td> <input name="description"  /></td>
        </tr>

        <tr>
            <td>Start Time:</td>
            <td><input type="datetime-local" name="startTime" /></td>
        </tr>

        <tr>
            <td>End Time:</td>
            <td><input type="datetime-local" name="endTime" /></td>
        </tr>

        <tr>
            <td> </td>
            <td><input type="submit" value="Save" /></td>
        </tr>
    </table>
</form>

</body>
</html>
