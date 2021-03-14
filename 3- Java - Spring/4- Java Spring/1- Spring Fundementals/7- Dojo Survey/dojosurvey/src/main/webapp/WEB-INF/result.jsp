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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
<div>
    <div class="container">
        <div class=wrapper>
            <div class="row">
                <div class="col-sm-5 main">
                    <h3>Submitted Info</h3>
                    <br>
                    <table class="table table-hover">
                        <tbody>
                        <tr>
                            <div>
                                <td><b>Name:</b>
                                    <c:out value="${name}" />
                                </td>
                            </div>
                        </tr>
                        <tr>
                            <div>
                                <td><b>Dojo Location:</b>
                                    <c:out value="${location}" />
                                </td>
                            </div>
                        </tr>
                        <tr>
                            <div>
                                <td><b>Favorite Language:</b>
                                    <c:out value="${language}" />
                                </td>
                            </div>
                        </tr>
                        <tr>
                            <div>
                                <td><b>Comment:</b>
                                    <c:out value="${comment}" />
                                </td>
                            </div>
                        </tr>
                        </tbody>
                    </table>
                    <a class="btn btn-primary button-margin" href="/">Go Back</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
