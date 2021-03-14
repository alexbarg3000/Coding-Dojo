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
    <title>dashboard</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
<div class="container">

    <center>
        <h2 id="error"><c:out value="${error}"/></h2>
        <h1> What is the code?</h1>
        <br>
        <br>
        <br>
        <form action="/code" method="post">
            <input id="field" type="text" name="code">
            <input id="btn" type="submit" value="Try Code">
        </form>
    </center>


</div>
</body>
</html>
