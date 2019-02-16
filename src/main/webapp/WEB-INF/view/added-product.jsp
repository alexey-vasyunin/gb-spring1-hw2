<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
    <title>The product was added</title>
</head>
<body>
    <div>ID: ${product.id}</div>
    <div>Product Name: ${product.title}</div>
    <div>Price: ${product.price}</div>
    <br>
    <a class="menu" href="${pageContext.request.contextPath}/products/add">Add new one</a>
    <a class="menu" href="${pageContext.request.contextPath}/products/">See all</a>
</body>
</html>