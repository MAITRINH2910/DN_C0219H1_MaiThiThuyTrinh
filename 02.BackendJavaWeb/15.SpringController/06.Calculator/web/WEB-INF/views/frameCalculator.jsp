<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/30/2019
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculator" method="post">

    <input type="text" name="firstNumber">
    <select name="cal">
        <option value="addition">Addition(+)</option>
        <option value="subtraction">Subtraction(-)</option>
        <option value="multiplication">Multiplication(*)</option>
        <option value="division">Division(/)</option>

    </select>
    <input type="text" name="secondNumber">
    <input type="submit" value="Result">
   <h3> Result: ${result} </h3>
</form>
</body>
</html>
