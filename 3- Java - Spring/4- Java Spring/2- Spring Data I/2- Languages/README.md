<div class="module_description active_lesson_with_video ">
									
            
<h1>Show</h1>
<p>In this assignment, you will continue to build our CRUD web application by implementing the show method. For example, when the user visits '/books/1', you are to respond with a view page that has all the information about a specific book.</p>
<p><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Screen_Shot_2018-05-23_at_7.00.10_PM.png" alt="show-book"></p>
<p>And here is the jsp code:</p>
<h5>src/main/webapp/WEB-INF/books/show.jsp</h5>
<pre>&lt;%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%&gt;    
&lt;h1&gt;&lt;c:out value="${book.title}"/&gt;&lt;/h1&gt;
&lt;p&gt;Description: &lt;c:out value="${book.description}"/&gt;&lt;/p&gt;
&lt;p&gt;Language: &lt;c:out value="${book.language}"/&gt;&lt;/p&gt;
&lt;p&gt;Number of pages: &lt;c:out value="${book.numberOfPages}"/&gt;&lt;/p&gt;
&lt;a href="/books/${book.id}/edit"&gt;Edit Book&lt;/a&gt;
&lt;form action="/books/${book.id}" method="post"&gt;
    &lt;input type="hidden" name="_method" value="delete"&gt;
    &lt;input type="submit" value="Delete"&gt;
&lt;/form&gt;
</pre>
        
        
</div>
