<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dedo
  Date: 1/23/2021
  Time: 5:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <style>
        #regForm {
            background-color: #ffffff;
            margin: 100px auto;
            font-family: Raleway;
            padding: 40px;
            width: 70%;
            min-width: 300px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
    <a class="nav-link" href="#">Home</a>
    <a class="nav-link" href="#">Requests</a>
    <a class="nav-link" href="/logout">Log Out</a>
</nav>
<div class="tab">
<form:form id="regForm" action="/createCategory" modelAttribute="cat" >

<form:label path="title" >Add Category</form:label>
<form:input path="title"/>
    <button type="submit" class="btn btn-primary">Add Category</button>
    </form:form>


    <form:form id="regForm" action="/createSubCategory" modelAttribute="sub" >
    <form:label path="subtitle" >Add Sub Category</form:label>
    <form:input path="subtitle"/>
    <button type="submit" class="btn btn-primary">Add Sub Category</button>
</form:form>
</div>
</body>
</html>
