<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dedo
  Date: 1/23/2021
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<form:form action="/login" modelAttribute="user" >
    <h1>Login:</h1>
    <div class="tab">
        <form:input path="email" placeholder="E-mail..." />
            <%--        <form:errors path="email"/>--%>
        <form:password  path="password" placeholder="Password..."/>
            <%--            <form:errors path="password"/>--%>
                <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form:form>


</body>
</html>
