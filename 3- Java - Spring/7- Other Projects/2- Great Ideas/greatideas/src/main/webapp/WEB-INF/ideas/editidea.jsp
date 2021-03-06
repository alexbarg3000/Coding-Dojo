<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

    <link rel="stylesheet" type="text/css" href="../css/style.css">

    <title>Ideas</title>
</head>

<body>
<div class="container-fluid">
    <br>
    <br>
    <div class="row">
        <div class="col-xl-1 col-lg-1 col-md-1"></div>
        <div class="col-xl-9 col-lg-9 col-md-9">
            <h1>Edit your idea: ${idea.content}</h1>
        </div>
        <div class="col-xl-1 col-lg-1 col-md-1">
            <a class="btn btn-link float-right" href="/ideas">Home</a>
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-xl-1 col-lg-1 col-md-1"></div>
        <form method="POST" action="/ideas/update">
            <div class="col-xl-2 col-lg-2 col-md-2">
                <label >Idea:</label>
            </div>
            <div class="col-xl-7 col-lg-7 col-md-7">
                <input type="text" name="content" value='${idea.content}'/>
                <label style="color: red;">${error}</label>
            </div>
            <input type="hidden" name="ideaid" value="${idea.id}" />
            <input type="hidden" name="creatorid" value="${user.id}" />
            <input class='btn btn-primary' type="submit" value="Update" /><br><br>
            <a class='btn btn-danger' href='/ideas/${idea.id}/delete'>Delete</a>
        </form>

    </div>




    <%--         <div class="row">
                <div class="col-xl-1 col-lg-1 col-md-1"></div>
                <div class="col-xl-9 col-lg-9 col-md-9">
                    <form:form method="POST" action="/ideas/update" modelAttribute="idea">
                        <p>
                            <form:label path="content">Content:</form:label>
                            <form:input type="text" path="content" />
                            <form:errors style="color: red;" path="content" />
                        </p>
                        <input type="hidden" name="creatorid" value="${user.id}" />
                        <input class='btn btn-primary' type="submit" value="Update" />
                    </form:form>
                    <br>
                        <a class='btn btn-danger' href='/ideas/${idea.id}/delete'>Delete</a>
                </div>
            </div>     --%>
</div>
</body>
</html>