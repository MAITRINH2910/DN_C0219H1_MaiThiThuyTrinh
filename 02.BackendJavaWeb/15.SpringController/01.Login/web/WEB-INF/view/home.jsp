<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/29/2019
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<%--@elvariable id="login" type=""--%>
<form action="/login" method="post">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td>Account: <input type="text" name="account"></td>

            </tr>
            <tr>
                <td>Password: <input type="text" name="password"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="login"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>