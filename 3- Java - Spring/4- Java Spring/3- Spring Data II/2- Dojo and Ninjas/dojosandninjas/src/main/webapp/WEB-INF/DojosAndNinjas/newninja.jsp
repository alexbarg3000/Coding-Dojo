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
        <div id="leftpanel">
            <h1>New Ninja</h1>
            <form:form action="/addninja" method="post" modelAttribute="ninjaObject">
                <h2>
                    <form:label cssClass="label left" path="dojo">Dojo:</form:label>
                    <form:select cssClass="box" path="dojo">
                        <c:forEach items="${dojos}" var="d">
                            <form:option value="${d}"><c:out value="${d.name}"/></form:option>
                        </c:forEach>
                    </form:select>
                </h2>
                <h2>
                    <form:label cssClass="label left" path="firstName">First Name:</form:label>
                    <form:input cssClass="box" path="firstName"/>
                </h2>
                <h2>
                    <form:label cssClass="label left" path="lastName">Last Name:</form:label>
                    <form:input cssClass="box" path="lastName"/>
                </h2>
                <h2>
                    <form:label cssClass="label left" path="age">Age:</form:label>
                    <form:input cssClass="box" path="age"/>
                </h2>
                <input id="btn" type="submit" value="Create"/>
            </form:form>
        </div>
        <div id="rightpanel">
            <form:errors cssClass="red" path="ninjaObject.*"/>
        </div>
    </div>


</div>
</body>
</html>
