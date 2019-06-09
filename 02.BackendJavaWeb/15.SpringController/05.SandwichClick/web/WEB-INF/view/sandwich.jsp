<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/29/2019
  Time: 6:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
    <form action = "/save" method = "post">
        <h1>Sanwich Condiments</h1>
        <input type="checkbox" name="condiment" value ="" hidden checked>
        <input type ="checkbox" name="condiment" value="Lettuce">Lettuce
        <input type ="checkbox" name="condiment" value="Tomato">Tomato
        <input type ="checkbox" name="condiment" value="Mustard">Mustard
        <input type ="checkbox" name="condiment" value="Sprouts">Sprouts <br/>

        <hr>
        <input type="submit" value ="Save">
    </form>
</body>
</html>
