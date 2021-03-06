<%--
  Created by IntelliJ IDEA.
  User: Alexsander
  Date: 1/10/2021
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

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
    <div class="top1">
        <a href="/dashboard"><h2 class="right">Dashboard</h2></a>
    </div>
    <form:form action="/process" method="post" modelAttribute="addNew">
        <h2>
            <form:label cssClass="label left" path="title">Title:</form:label>
            <form:input cssClass="box" path="title"/>
            <form:errors cssClass="red" path="title"/>

        </h2>
        <h2>
            <form:label cssClass="label left" path="artist">Artist:</form:label>
            <form:input cssClass="box" path="artist"/>
            <form:errors cssClass="red" path="artist"/>
        </h2>
        <h2>
            <form:label cssClass="label left" path="rating">Rating:</form:label>
            <form:select cssClass="box" path="rating">
                <form:option value="1">1</form:option>
                <form:option value="2">2</form:option>
                <form:option value="3">3</form:option>
                <form:option value="4">4</form:option>
                <form:option value="5">5</form:option>
                <form:option value="6">6</form:option>
                <form:option value="7">7</form:option>
                <form:option value="8">8</form:option>
                <form:option value="9">9</form:option>
                <form:option value="10">10</form:option>
            </form:select>
            <form:errors cssClass="red" path="rating"/>
        </h2>
        <input id="btn" type="submit" value="Add Song"/>
    </form:form>


</div>
</body>
</html>
