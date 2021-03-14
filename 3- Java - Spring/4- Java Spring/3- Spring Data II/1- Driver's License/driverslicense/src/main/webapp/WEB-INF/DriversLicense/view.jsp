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
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
        <div id="leftpanelb">
            <h1><c:out value="${license.person.firstName} ${license.person.lastName}"/></h1>
            <h2>License Number: <c:out value="${license.number}"/></h2>
            <h2>State: <c:out value="${license.state}"/></h2>
            <h2>Expiration Date: <fmt:formatDate pattern ="MM-dd-yyyy" value ="${license.expirationDate}"/></h2>
        </div>
    </div>

</div>
</body>
</html>
