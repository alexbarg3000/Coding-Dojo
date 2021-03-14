<%--
  Created by IntelliJ IDEA.
  User: Alexsander
  Date: 1/23/2021
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <style>
    #showmessages {
    width: 500px;
    display: inline-block;
    vertical-align: top;
    padding-top: 20px;
    }
    #messages {
    background-color: rgb(196, 237, 231);
    width: 480px;
    padding: 10px;
    border-style: solid;
    border-width: 2px;
    height: 400px;
    overflow: auto;
    }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-3">
            <img src="/@{${user.photosImagePath}}" class="rounded float-left" alt="...">
            <div class="row">
                <p>Contact Info:</p>
                <div><p>Owner Name: ${user.first_name} ${user.last_name}</p>
                    <p>Phone Number: ${phone.phone_num} </p>
                    <p>Address: ${address.street},  ${address.building}</p>
                    <p>City: ${city.name},</p>
                    <p>Business Email:${user.business_email}</p>
                </div>
            </div>
        </div>
        <div class="col-9">
            <div id = "showmessages">
                <h2>Feedback Wall</h2>
                <div id = "messages">
                    <c:forEach items = "${messages}" var = "m">
                        <p>${m.comment}</p>
                        <p>_________________f______________________________________________</p>
                    </c:forEach>
                </div>
                <br>
                <h6>Add comment:</h6>
                <p><c:out value = "${error}" /></p>
                <form action = "/profile/comment/${user.id}" method = "POST">
                    <textarea rows = "4" cols = "50" name = "comment"></textarea>
                    <br>
                    <input type = "submit" value = "Post Comment">
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>
