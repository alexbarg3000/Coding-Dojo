<%--
  Created by IntelliJ IDEA.
  User: Alexsander
  Date: 1/7/2021
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Current Visit Count</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
<div class="container">

    <center>
        <h1>You have visited <a href="/">http://localhost:8080/</a> <c:out value="${count}"/> times.</h1>
        <a href="/"><h1>Take another visit?</h1></a>
        <a href="/double"><h1>This works twice as fast!</h1></a>
        <a href="/reset"><button>RESET COUNT</button></a>
    </center>


</div>
</body>
</html>
