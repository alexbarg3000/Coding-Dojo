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
    <h2>Title:  <c:out value="${song.title}"/></h2>
    <h2>Artist:  <c:out value="${song.artist}"/></h2>
    <h2>Rating (1-10):  <c:out value="${song.rating}"/></h2>
    <a href="/delete/<c:out value="${song.id}"/>"><h2>Delete</h2></a>


</div>
</body>
</html>
