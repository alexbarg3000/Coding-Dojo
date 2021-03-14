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
    <link rel="stylesheet" href="../../../resources/static/css/style.css">
</head>
<body>
<div class="container">

    <div id="container">
        <h1><c:out value="${dojo.name}"/> Ninjas</h1>
        <table class="table table-striped table-dark table-hover ">
            <thead>
            <tr>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Age</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${dojo.ninjas}" var="ninja">
                <tr>
                    <td><c:out value="${ninja.firstName}"/></td>
                    <td><c:out value="${ninja.lastName}"/></td>
                    <td><c:out value="${ninja.age}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </div>


</div>
</body>
</html>
