<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dedo
  Date: 1/23/2021
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Registration</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<%--    <link rel="stylesheet"  href="../static/css/register.css">--%>
<%--<script src="../static/js/tabs.js"></script>--%>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            background-color: #f1f1f1;
        }

        #regForm {
            background-color: #ffffff;
            margin: 100px auto;
            font-family: Raleway;
            padding: 40px;
            width: 70%;
            min-width: 300px;
        }

        h1 {
            text-align: center;
        }

        input {
            padding: 10px;
            width: 100%;
            font-size: 17px;
            font-family: Raleway;
            border: 1px solid #aaaaaa;
        }

        /* Mark input boxes that gets an error on validation: */
        input.invalid {
            background-color: #a2cfff;
        }

        /* Hide all steps by default: */
        .tab {
            display: none;
        }

        button {
            background-color: #0071eb;
            color: #ffffff;
            border: none;
            padding: 10px 20px;
            font-size: 17px;
            font-family: Raleway;
            cursor: pointer;
        }

        button:hover {
            opacity: 0.8;
        }

        #prevBtn {
            background-color: #bbbbbb;
        }

        /* Make circles that indicate the steps of the form: */
        .step {
            height: 15px;
            width: 15px;
            margin: 0 2px;
            background-color: #bbbbbb;
            border: none;
            border-radius: 50%;
            display: inline-block;
            opacity: 0.5;
        }

        .step.active {
            opacity: 1;
        }

        /* Mark the steps that are finished and valid: */
        .step.finish {
            background-color: #007bff;
        }
    </style>

</head>
<body>

<form:form id="regForm" action="/registration" modelAttribute="user" method="post" enctype="multipart/form-data">
    <h1>Register:</h1>
    <div class="tab">Name:
        <form:input   path="email" placeholder="E-mail..." oninput="this.className = ''"/>
        <form:errors path="email"/>
        <form:password  path="password" placeholder="Password..." oninput="this.className = ''"/>
            <form:errors path="password"/>

        <form:password path="confirm" placeholder="confirm password..." oninput="this.className = ''"/>
            <form:errors path="confirm"/>
    </div>
    <div class="tab" style="display: none;">User Info:
        <p><form:input  path="first_name" placeholder="Owner First Name..." oninput="this.className = ''"/>
            <form:errors path="first_name"/>
        </p>
        <p><form:input path="last_name" placeholder="Owner Last Name..." oninput="this.className = ''"/>
            <form:errors path="last_name"/>
        </p>

    </div>
<div class="tab">Business Info:
    <p><form:input path="business_name" placeholder="Business Title..." oninput="this.className = ''"/>
        <form:errors path="business_name"/>
    </p>
    <p><form:input path="business_email" placeholder="Business E-mail..." oninput="this.className = ''"/>
        <form:errors path="business_email"/>
    </p>
    <p><form:input path="phones" placeholder="Business Phone No." oninput="this.className = ''" />
        <form:errors path="phones"/>
    </p>
    <p>
        <form:textarea path="description" oninput="this.className = ''"/>
    </p>
    <p>
        <form:label path="photos">Business picture</form:label>
        <input type="file" name="image" accept="image/png, image/jpeg,image/jpg" />
    </p>

</div>
    <div class="tab">Location Info:
        <p><form:input  path="address.building" placeholder="Apartment..." oninput="this.className = ''"/>
            <form:errors path="address.building"/>
        </p>
        <p><form:input path="address.street" placeholder="Street..." oninput="this.className = ''"/>
            <form:errors path="address.street"/>
        </p>
        <p>
            <form:select cssClass="form-control" path="address.city.name" oninput="this.className = ''">
                <c:forEach items="${ AllCities }" var="ci">
                    <form:option value="${ ci }">${ ci } </form:option>
                </c:forEach>
            </form:select>
        </p>
    </div>
    <div class="tab">Choose domain:
       <p>
        <form:select cssClass="form-control" path="category" oninput="this.className = ''">
            <c:forEach items="${ allCategories }" var="ca">
                <form:option value="${ ca.id }">${ ca.title } </form:option>
            </c:forEach>
        </form:select>
       </p>
    <p>
        <form:select cssClass="form-control" path="subcategory" oninput="this.className = ''">
            <c:forEach items="${ AllSubs }" var="sub">
                <form:option value="${ sub.id}">${ sub.subtitle} </form:option>
            </c:forEach>
        </form:select>
    </p>
    </div>
    <div class="overflow:auto;">
        <div style="float:right;">
            <button type="button" id="prevBtn" onclick="nextPrev(-1)">Previous</button>
            <button type="button" id="nextBtn" onclick="nextPrev(1)">Next</button>
        </div>
    </div>
    <div style="text-align:center;margin-top:40px;">
        <span class="step"></span>
        <span class="step"></span>
        <span class="step"></span>
        <span class="step"></span>
        <span class="step"></span>
    </div>

</form:form>
<script>
    var currentTab = 0; // Current tab is set to be the first tab (0)
    showTab(currentTab); // Display the current tab

    function showTab(n) {
        // This function will display the specified tab of the form...
        var x = document.getElementsByClassName("tab");
        x[n].style.display = "block";
        //... and fix the Previous/Next buttons:
        if (n === 0) {
            document.getElementById("prevBtn").style.display = "none";
        } else {
            document.getElementById("prevBtn").style.display = "inline";
        }
        if (n === (x.length - 1)) {
            document.getElementById("nextBtn").innerHTML = "Submit";
        } else {
            document.getElementById("nextBtn").innerHTML = "Next";
        }
        //... and run a function that will display the correct step indicator:
        fixStepIndicator(n)
    }

    function nextPrev(n) {
        // This function will figure out which tab to display
        let x = document.getElementsByClassName("tab");
        // Exit the function if any field in the current tab is invalid:
        if (n === 1 && !validateForm()) return false;
        // Hide the current tab:
        x[currentTab].style.display = "none";
        // Increase or decrease the current tab by 1:
        currentTab = currentTab + n;
        // if you have reached the end of the form...
        if (currentTab >= x.length) {
            // ... the form gets submitted:
            document.getElementById("regForm").submit();
            return false;
        }
        // Otherwise, display the correct tab:
        showTab(currentTab);
    }

    function validateForm() {
        // This function deals with validation of the form fields
        let x, y, i, valid = true;
        x = document.getElementsByClassName("tab");
        y = x[currentTab].getElementsByTagName("input");
        // A loop that checks every input field in the current tab:
        for (i = 0; i < y.length; i++) {
            // If a field is empty...
            if (y[i].value === "") {
                // add an "invalid" class to the field:
                y[i].className += " invalid";
                // and set the current valid status to false
                valid = false;
            }
        }
        // If the valid status is true, mark the step as finished and valid:
        if (valid) {
            document.getElementsByClassName("step")[currentTab].className += " finish";
        }
        return valid; // return the valid status
    }

    function fixStepIndicator(n) {
        // This function removes the "active" class of all steps...
        let i, x = document.getElementsByClassName("step");
        for (i = 0; i < x.length; i++) {
            x[i].className = x[i].className.replace(" active", "");
        }
        //... and adds the "active" class on the current step:
        x[n].className += " active";
    }
</script>
</body>
</html>
