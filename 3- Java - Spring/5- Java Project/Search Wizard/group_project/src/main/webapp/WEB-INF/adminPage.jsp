<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 1/23/2021
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="static/adReqPgStyle.css">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <title>Admin Requests</title>
</head>
<body>
<div class="container">
    <div class="row justify-content-between align-items-end my-row">
        <div class="col-8 my-col">view requests</div>
        <div class="col-4 my-col"><a href="/home">Home</a></div>
    </div>
    <div class="row justify-content-between align-items-end my-row">
        <div class="col-4 my-col">
            <h4><c:out value="${user.business_name}";></c:out></h4>
            <h4><c:out value="${user.business_email}";></c:out></h4>
        </div>
        <div class="col-4 my-col">
            <form:select path="categry">
                <c:forEach items="${categories}" var="category">
                    <form:option value="${category.id}"> ${category.title} </form:option>
                </c:forEach>
            </form:select>
            <form:select path="subCategory">
                <c:forEach items="${subCategories}" var="subCategory">
                    <form:option value="${subCategory.id}"> ${subCategory.title} </form:option>
                </c:forEach>
            </form:select>
        </div>
        <div class="col-4 my-col">
            <button type="submit">Approve</button><br>
            <button type="submit">Update</button><br>
            <button type="submit">Delete</button><br>
        </div>
    </div>
</div>
</body>
</html>
