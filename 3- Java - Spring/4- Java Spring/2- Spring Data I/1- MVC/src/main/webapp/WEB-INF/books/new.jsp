<%--
  Created by IntelliJ IDEA.
  User: Alexsander
  Date: 1/10/2021
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">

    <h1>New Book</h1>
    <form:form action="/books" method="post" modelAttribute="book">
        <p>
            <form:label path="title">Title</form:label>
            <form:errors path="title"/>
            <form:input path="title"/>
        </p>
        <p>
            <form:label path="description">Description</form:label>
            <form:errors path="description"/>
            <form:textarea path="description"/>
        </p>
        <p>
            <form:label path="language">Language</form:label>
            <form:errors path="language"/>
            <form:input path="language"/>
        </p>
        <p>
            <form:label path="numberOfPages">Pages</form:label>
            <form:errors path="numberOfPages"/>
            <form:input type="number" path="numberOfPages"/>
        </p>
        <input type="submit" value="Submit"/>
    </form:form>


</div>
</body>
</html>
