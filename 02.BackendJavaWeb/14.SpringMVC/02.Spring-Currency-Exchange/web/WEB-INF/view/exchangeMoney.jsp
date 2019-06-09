<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/28/2019
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exchange Money</title>
</head>
<body>
<h1>Exchange Money</h1>
<form action="/exchange" method="post">
    <table>
        <tr>
            <td><select name="money">
                <option value="usd">USD</option>
                <option value="eur">EUR</option>
                <option value="vnd">VND</option>
            </select></td>
            <td><input type="text" value="0" name="valueMoney"></td>
        </tr>
        <tr>
            <td>RATE: ${rate}</td>
            <td><select name="moneyOutput">
                <option value="usd">USD</option>
                <option value="eur">EUR</option>
                <option value="vnd">VND</option>
            </select></td>
        </tr>

        <td><input type="submit" id="submit" value="Exchange"></td>
        <tr>

            <td>Result: ${result}</td>
        </tr>

    </table></form>
</body>
</html>