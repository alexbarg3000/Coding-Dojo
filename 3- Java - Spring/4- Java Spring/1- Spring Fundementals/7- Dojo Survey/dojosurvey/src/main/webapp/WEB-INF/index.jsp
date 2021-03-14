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
<div class="container" style="margin-top:30px">
    <div class="row">
        <div class="col-sm-5 main">
            <form action="/result" method="POST">
                <div class="form-group padding">
                    <label for="name">Your Name:</label>
                    <input type="text" class="form-control" placeholder="Name here" name="name">
                </div>

                <div class="form-group">
                    <label for="location">Dojo Location:  <select name="location"></label>
                    <option value="San Jose">San Jose</option>
                    <option value="Berkley">Berkley</option>
                    <option value="Austin">Austin</option>
                    <option value="Washington">Washington</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="language">Favorite Language:  <select name="language"></label>
                    <option value="Python">Python</option>
                    <option value="Java">Java</option>
                    <option value="C#">C#</option>
                    <option value="Ruby">Ruby</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="comment">Comment (optional)</label>
                </div>
                <div class="form-group">
                    <textarea name="comment" rows="5" cols="40" placeholder="We appreciate your comments"></textarea>
                </div>
                <button class="btn btn-primary" type="submit">Button</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
