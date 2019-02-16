<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
    <title>Add new product</title>
</head>
<body>
<form:form action="add-new-one" modelAttribute="product" name="addform" method="post">
    <label for="title" class="addform">Название</label>
    <form:input path="title" id="title"/><br>
    <label for="price" class="addform">Цена</label>
    <form:input path="price" id="price"/><br>
    <form:button type="submit">Добавить</form:button>
</form:form>
<br>
<a class="menu" href="${pageContext.request.contextPath}/products/">See all</a>
</body>
</html>