<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
    <title>Product details</title>
</head>
<body>
<div>Product name: ${product.title}</div>
<div>Product ID: ${product.id}</div>
<div>Price: ${product.price}</div>
<br>
<a class="menu" href="${pageContext.request.contextPath}/products/add">Add new one</a>
<a class="menu" href="${pageContext.request.contextPath}/products/">See all</a>
</body>
</html>