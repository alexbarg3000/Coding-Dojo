<%--
  Created by IntelliJ IDEA.
  User: Alexsander
  Date: 1/10/2021
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

    <div id="container">
        <div id="top">
            <a href="/languages"><h1 class="shift">Dashboard</h1></a>
        </div>
        <h1 class="gap"><c:out value="${language.name}"/></h1>
        <h1 class="gap"><c:out value="${language.creator}"/></h1>
        <h1 class="gap"><c:out value="${language.currentVersion}"/></h1>
        <a href="/languages/edit/<c:out value="${language.id}"/>"><h1 class="gap">Edit</h1></a>
        <a href="/languages/delete/<c:out value="${language.id}"/>"><h1 class="gap">Delete</h1></a>
    </div>


</div>
</body>
</html>
