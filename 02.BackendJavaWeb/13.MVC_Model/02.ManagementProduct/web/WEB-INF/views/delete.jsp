<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/31/2019
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
    <h1> Delete Product</h1>
<p>
    <a href ="/products"> Back to product list</a>
</p>
<form method ="post">
    <h3> Are you sure?</h3>
    <fieldset>
        <legend> Product Information</legend>
        <table>
            <tr>
                <td> Name: </td>
                <td> ${requestScope["product"].getNameProduct()}</td>
            </tr>
            <tr>
                <td> Price: </td>
                <td> ${requestScope["product"].getPriceProduct()}</td>
            </tr>
            <tr>
                <td> Note: </td>
                <td> ${requestScope["product"].getNote()}</td>
            </tr>
            <tr>
                <td> Producer: </td>
                <td> ${requestScope["product"].getProducer()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>

            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
