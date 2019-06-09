<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/31/2019
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products List</title>
</head>
<body>
<h1> Products</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="2">
    <tr>
        <td><b>Name Product</b></td>
        <td><b>Price Product</b></td>
        <td><b>Description</b></td>
        <td><b>Producer</b></td>
        <td><b>Edit</b></td>
        <td><b>Delete</b></td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var = "product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getNameProduct()}</a></td>
            <td>${product.getPriceProduct()}</td>
            <td>${product.getNote()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="/products?action=update&id=${product.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
