<div class="module_description active_lesson_with_video ">
									
            
            
<h1>Controllers and Views</h1>
<p>The last thing that we have to do is set up our controllers and views. We will give you the code for the jsp files but you will have to implement all the controller methods accordingly.</p>
<h5>registrationPage.jsp</h5>
<pre class="">&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %&gt;
&lt;%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %&gt;    
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
    &lt;meta charset="UTF-8"&gt;
    &lt;title&gt;Registration Page&lt;/title&gt;
&lt;/head&gt;
&lt;body&gt;
    &lt;h1&gt;Register!&lt;/h1&gt;    
    &lt;p&gt;&lt;form:errors path="user.*"/&gt;&lt;/p&gt;    
    &lt;form:form method="POST" action="/registration" modelAttribute="user"&gt;
        &lt;p&gt;
            &lt;form:label path="email"&gt;Email:&lt;/form:label&gt;
            &lt;form:input type="email" path="email"/&gt;
        &lt;/p&gt;
        &lt;p&gt;
            &lt;form:label path="password"&gt;Password:&lt;/form:label&gt;
            &lt;form:password path="password"/&gt;
        &lt;/p&gt;
        &lt;p&gt;
            &lt;form:label path="passwordConfirmation"&gt;Password Confirmation:&lt;/form:label&gt;
            &lt;form:password path="passwordConfirmation"/&gt;
        &lt;/p&gt;
        &lt;input type="submit" value="Register!"/&gt;
    &lt;/form:form&gt;
    
&lt;/body&gt;
&lt;/html&gt;</pre>
<h5>loginPage.jsp</h5>
<pre>&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %&gt;
    
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
    &lt;meta charset="UTF-8"&gt;
    &lt;title&gt;Login Page&lt;/title&gt;
&lt;/head&gt;
&lt;body&gt;
    &lt;h1&gt;Login&lt;/h1&gt;
    &lt;p&gt;&lt;c:out value="${error}" /&gt;&lt;/p&gt;
    &lt;form method="post" action="/login"&gt;
        &lt;p&gt;
            &lt;label for="email"&gt;Email&lt;/label&gt;
            &lt;input type="text" id="email" name="email"/&gt;
        &lt;/p&gt;
        &lt;p&gt;
            &lt;label for="password"&gt;Password&lt;/label&gt;
            &lt;input type="password" id="password" name="password"/&gt;
        &lt;/p&gt;
        &lt;input type="submit" value="Login!"/&gt;
    &lt;/form&gt;    
&lt;/body&gt;
&lt;/html&gt;</pre>
<h5>homePage.jsp</h5>
<pre>&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %&gt;
    
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
	&lt;meta charset="UTF-8"&gt;
	&lt;title&gt;Welcome&lt;/title&gt;
&lt;/head&gt;
&lt;body&gt;
	&lt;h1&gt;Welcome, &lt;c:out value="${user.email}" /&gt;&lt;/h1&gt;
	&lt;a href="/logout"&gt;Logout&lt;/a&gt;
&lt;/body&gt;
&lt;/html&gt;</pre>
<p>Your task is to set up all the methods in the&nbsp;<strong>Users</strong> controller.</p>
<h5>src/main/java/com/codingdojo/authentication/users/Users.java</h5>
<pre class="rainbow" data-language="java">package com.codingdojo.authentication.controllers;
<span class="comment from-rainbow">// imports removed for brevity</span>
<span class="support annotation from-rainbow">@Controller</span>
<span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">Users</span> {
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">private</span> <span class="keyword from-rainbow">final</span> <span class="entity class from-rainbow">UserService</span> userService;
        <span class="keyword from-rainbow">public</span> Users(<span class="entity class from-rainbow">UserService</span> userService) {
        <span class="keyword from-rainbow">this</span>.userService <span class="operator from-rainbow">=</span> userService;
    }    
    <span class="support annotation from-rainbow">@RequestMapping</span>(<span class="string from-rainbow">"/registration"</span>)
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> registerForm(<span class="support annotation from-rainbow">@ModelAttribute</span>(<span class="string from-rainbow">"user"</span>) <span class="entity class from-rainbow">User</span> user) {
        <span class="keyword from-rainbow">return</span> <span class="string from-rainbow">"registrationPage.jsp"</span>;
    }
&nbsp;&nbsp;&nbsp;&nbsp;<span class="support annotation from-rainbow">@RequestMapping</span>(<span class="string from-rainbow">"/login"</span>)
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> login() {
        <span class="keyword from-rainbow">return</span> <span class="string from-rainbow">"loginPage.jsp"</span>;
    }    
    <span class="support annotation from-rainbow">@RequestMapping</span>(value<span class="operator from-rainbow">=</span><span class="string from-rainbow">"/registration"</span>, method<span class="operator from-rainbow">=</span><span class="entity class from-rainbow">RequestMethod</span>.<span class="constant from-rainbow">POST</span>)
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> registerUser(<span class="support annotation from-rainbow">@Valid</span> <span class="support annotation from-rainbow">@ModelAttribute</span>(<span class="string from-rainbow">"user"</span>) <span class="entity class from-rainbow">User</span> user, <span class="entity class from-rainbow">BindingResult</span> result, <span class="entity class from-rainbow">HttpSession</span> session) {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment from-rainbow">// if result has errors, return the registration page (don't worry about validations just now)</span>
        <span class="comment from-rainbow">// else, save the user in the database, save the user id in session, and redirect them to the /home route</span>
    }
        <span class="support annotation from-rainbow">@RequestMapping</span>(value<span class="operator from-rainbow">=</span><span class="string from-rainbow">"/login"</span>, method<span class="operator from-rainbow">=</span><span class="entity class from-rainbow">RequestMethod</span>.<span class="constant from-rainbow">POST</span>)
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> loginUser(<span class="support annotation from-rainbow">@RequestParam</span>(<span class="string from-rainbow">"email"</span>) <span class="entity class from-rainbow">String</span> email, <span class="support annotation from-rainbow">@RequestParam</span>(<span class="string from-rainbow">"password"</span>) <span class="entity class from-rainbow">String</span> password, <span class="entity class from-rainbow">Model</span> model, <span class="entity class from-rainbow">HttpSession</span> session) {
        <span class="comment from-rainbow">// if the user is authenticated, save their user id in session</span>
        <span class="comment from-rainbow">// else, add error messages and return the login page</span>
    }
        <span class="support annotation from-rainbow">@RequestMapping</span>(<span class="string from-rainbow">"/home"</span>)
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> home(<span class="entity class from-rainbow">HttpSession</span> session, <span class="entity class from-rainbow">Model</span> model) {
        <span class="comment from-rainbow">// get user from session, save them in the model and return the home page</span>
    }
    <span class="support annotation from-rainbow">@RequestMapping</span>(<span class="string from-rainbow">"/logout"</span>)
    <span class="keyword from-rainbow">public</span> <span class="entity class from-rainbow">String</span> logout(<span class="entity class from-rainbow">HttpSession</span> session) {
        <span class="comment from-rainbow">// invalidate session</span>
        <span class="comment from-rainbow">// redirect to login page</span>
    }
}</pre>
     
        
</div>
