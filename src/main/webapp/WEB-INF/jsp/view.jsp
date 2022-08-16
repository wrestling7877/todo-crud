<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 16/08/2022
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>
        View
    </title>
</head>
<body>
<c:forEach items="${names}" var="list">
  <p> ${list}</p>
</c:forEach>
</body>
</html>
