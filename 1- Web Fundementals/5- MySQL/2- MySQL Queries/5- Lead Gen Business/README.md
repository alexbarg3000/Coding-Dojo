<div class="module_description active_lesson_with_video ">
									
            
            
<p> <br> <br> <br> <br></p>
<h1>Assignment: Lead Gen Business</h1>
<h2>Objectives:</h2>
<ol><li>Practice SQL queries</li></ol>
<hr>
<p>Complete the below SQL queries using the lead-gen-business-new database and the below wireframe.</p>
<p><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Lead_Gen_Biz_ERD.png"></p>
<h3>Note</h3>
<p>
 If you're ahead, we strongly encourage that you work on this assignment as this would really help you understand how GROUP BY works and how powerful MySQL can be. If you have already spent more than 2 full days studying ERD and MySQL, just skip this assignment and come back later when you're done with the bootcamp.&nbsp;</p>
<p>
 If you already have a database called
 <strong><em> lead-gen-business</em></strong>, go ahead and drop that database and recreate by importing the&nbsp;<a href="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3569/handouts/chapter3569_5435_lead-gen-business-new.sql" target="_blank">lead-gen-business-new.sql</a> file. The database that is created will be different than the one in the <strong><em>morepractice.sql</em></strong> file that we used during the videos.</p>
<p>Hint:&nbsp;Here is an example of a query that selects data between a date range<br></p>
<pre class="rainbow" data-language="java"><span class="constant from-rainbow">SELECT</span> <span class="entity class from-rainbow">Date</span>,<span class="entity class from-rainbow">TotalAllowance</span> <span class="constant from-rainbow">FROM</span> <span class="entity class from-rainbow">Calculation</span> <span class="constant from-rainbow">WHERE</span> <span class="entity class from-rainbow">EmployeeId</span><span class="operator from-rainbow">=</span><span class="integer from-rainbow">1</span> <span class="constant from-rainbow">AND</span> <span class="entity class from-rainbow">Date</span> <span class="operator from-rainbow">&gt;</span><span class="operator from-rainbow">=</span> '<span class="integer from-rainbow">2011</span><span class="operator from-rainbow">/</span><span class="integer from-rainbow">02</span><span class="operator from-rainbow">/</span><span class="integer from-rainbow">25</span>' <span class="constant from-rainbow">AND</span> <span class="entity class from-rainbow">Date</span> <span class="operator from-rainbow">&lt;</span> '<span class="integer from-rainbow">2011</span><span class="operator from-rainbow">/</span><span class="integer from-rainbow">02</span><span class="operator from-rainbow">/</span><span class="integer from-rainbow">28</span>'</pre>
<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>
<h3>
 Queries</h3>
<p>1. What query would you run to get the total revenue for March of 2012?</p>
<p>2. What query would you run to get total revenue collected from the client with an id of 2?</p>
<p>3. What query would you run to get all the sites that client with an id of 10 owns?</p>
<p>4. What query would you run to get total # of sites created per month per year for the client with an id of 1? What about for client with an id of 20?</p>
<p>5. What query would you run to get the total # of leads&nbsp;generated for each of the sites between January 1, 2011&nbsp;to February 15, 2011?</p>
<p>6. What query would you run to get a list of client names and the total # of leads we've generated for each of our clients between January 1, 2011 to December 31, 2011?</p>
<p>7. What query would you run to get a list of client names and the total # of leads we've generated for each client each month between months 1 - 6 of Year 2011?</p>
<p>8. What query would you run to get a list of client names and the total # of leads we've generated for each of our clients' sites between January 1, 2011 to December 31, 2011? Order this query by client id. &nbsp;Come up with a <strong><em>second</em></strong> query that shows all the clients, the site name(s), and the total number of leads generated from each site for all time.</p>
<p>9. Write a single query that retrieves total revenue collected from each client for&nbsp;each month of the year. Order it by client id.&nbsp; First try this with integer month, second with month name.&nbsp; A SELECT subquery will be needed for the second challenge.&nbsp; Look at&nbsp;<a href="https://www.mysqltutorial.org/mysql-subquery/" target="_blank">this</a> for a hint.</p>
<p>10. Write a single query that retrieves all the sites that each client owns. Group the results so that all of the sites for each client are displayed in a single field. It will become clearer when you&nbsp;add a new&nbsp;field called 'sites' that has all the sites that the client owns. (HINT: use GROUP_CONCAT)</p>
<p>
 Note: You may download this PDF file displaying the expected results from the questions above -&nbsp;<a href="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/mysql_lead_gen_expected_output.pdf" data-file="" target="_blank">Expected Result (Leads)</a>&nbsp;<a href="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3569/handouts/chapter3569_5440_MySQL-Optional-Leads-Expected-Result.pdf" target="_blank"></a></p>
<p> <br> </p>
<p> <br> <br> <br> </p>
        
        
        
</div>
