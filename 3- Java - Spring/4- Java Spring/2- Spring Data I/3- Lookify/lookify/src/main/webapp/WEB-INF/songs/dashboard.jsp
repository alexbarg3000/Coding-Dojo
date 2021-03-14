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
    <div class="top">
        <a href="/songs/new"><h2 class="left">Add New</h2></a>
        <a href="/search/topten"><h2 class="left">Top Songs</h2></a>
        <div class="formright">
            <form action="/search" method="post">
                <input class="form" type="submit" value="Search Artists">
                <input class="form" type="search" name="artist" placeholder="Artist">
            </form>
        </div>
    </div>
    <table class="table table-striped table-hover table-bordered tblbrd blkbrd">
        <thead>
        <tr>
            <th scope="col">Title</th>
            <th scope="col">Rating</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${songs}" var="song">
            <tr>
                <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
                <td><c:out value="${song.rating}"/></td>
                <td><a href="/delete/<c:out value="${song.id}"/>">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>
</body>
</html>
