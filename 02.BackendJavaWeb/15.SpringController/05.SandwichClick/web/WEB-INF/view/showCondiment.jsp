<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/30/2019
  Time: 7:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Condiments</title>
</head>
<body>
    <!--<form action="/save" method="post">-->
        <p>There are some condiments you choose: </p>
        <ul> <c:forEach items="${condiment}" var="result" >
            <li>${result}</li>
            </c:forEach>
        </ul>
</body>
</html>
