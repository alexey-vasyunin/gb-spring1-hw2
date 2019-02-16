<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
    <title>All products</title>
</head>
<body>
<ul>
    <c:forEach var="item" items="${products}">
        <li><a href="${pageContext.request.contextPath}/products/details/${item.id}">${item.title}</a> - ${item.price}</li>
    </c:forEach>
</ul>
<a class="menu" href="${pageContext.request.contextPath}/products/add">Add a new one</a>
</body>
</html>