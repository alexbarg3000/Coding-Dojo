<div class="module_description active_lesson_with_video ">
									
            
            
            
            
            
            
<h1>Assignment: Friendships</h1>
<h2>Objectives:</h2>
<ol><li>Practice creating databases</li><li>Practice SQL queries and self joins</li></ol>
<hr>
<p>Download and run the&nbsp;<a href="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/friendships.sql" data-file="" target="_blank">friendships.sql</a>.&nbsp; This will create two new tables: users and friendships.&nbsp;&nbsp;</p>
<p>Using the below ERD as reference, write a SQL query that returns a list of users along with their friends' names.</p>
<p><img src="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3569/handouts/chapter3569_6392_friends.png"></p><p><br></p>
<p>Your results should look like below:</p>
<table>
<tbody>
<tr>
 <td>first_name</td>
 <td>last_name</td>
 <td>friend_first_name</td>
 <td>friend_last_name</td>
</tr>
<tr>
 <td>Amy</td>
 <td>Giver</td>
 <td>Eli</td>
 <td>Byers</td>
</tr>
<tr>
 <td>Amy</td><td>Giver</td>
 <td>Big</td>
 <td>Bird</td>
</tr>
<tr>
 <td>Amy</td>
 <td>Giver</td>
 <td>Kermit</td>
 <td>The Frog</td>
</tr>
<tr>
 <td>Eli</td>
 <td>Byers</td>
 <td>Kermit</td>
 <td>The Frog</td>
</tr>
<tr>
 <td>Eli&nbsp;</td>
 <td>Byers</td>
 <td>Marky</td>
 <td>Mark</td>
</tr>
<tr>
 <td>Marky&nbsp;</td>
 <td>Mark</td>
 <td>Big</td>
 <td>Bird</td></tr></tbody></table>
<p>Your actual query will look something similar to this:</p>
<pre data-language="php" class="rainbow"><span class="constant from-rainbow">SELECT</span> <span class="keyword operator from-rainbow">*</span> <span class="constant from-rainbow">FROM</span> users 
<span class="constant from-rainbow">JOIN</span> friendships <span class="constant from-rainbow">ON</span> <span class="constant from-rainbow">____</span><span class="keyword operator from-rainbow">=</span><span class="constant from-rainbow">____</span> 
<span class="constant from-rainbow">LEFT</span> <span class="constant from-rainbow">JOIN</span> users <span class="keyword from-rainbow">as</span> user2 <span class="constant from-rainbow">ON</span> <span class="constant from-rainbow">____</span> <span class="keyword operator from-rainbow">=</span> <span class="constant from-rainbow">____</span>
</pre>
<p>Take note that we're joining the&nbsp;<strong><em>users</em></strong>&nbsp;table again but we're specifying the second <strong><em>users</em></strong> table <strong>as</strong> user2. &nbsp;You can then reference the second <strong><em>users </em></strong>by calling user2 (e.g. user2.id, user2.first_name, etc). &nbsp;</p>
<p>You can also rename the fields that are displayed on the result by using the <strong>as</strong> keyword, like the below example: &nbsp;&nbsp;</p>
<pre data-language="php" class="rainbow"><span class="constant from-rainbow">SELECT</span> user2<span class="keyword dot from-rainbow">.</span>first_name <span class="keyword from-rainbow">as</span> friend_first_name, user2<span class="keyword dot from-rainbow">.</span>last_name <span class="keyword from-rainbow">as</span> friend_last_name, <span class="keyword dot from-rainbow">.</span><span class="keyword dot from-rainbow">.</span><span class="keyword dot from-rainbow">.</span>  <span class="constant from-rainbow">FROM</span> <span class="keyword dot from-rainbow">.</span><span class="keyword dot from-rainbow">.</span><span class="keyword dot from-rainbow">.</span>
</pre>
<p>Knowing how to do joins can be tricky but is used quite often <em>and will most likely appear again in your belt exam.</em></p>
<h2>Additional Exercise</h2>
<p>Please also write the SQL queries needed to perform the following tasks:</p>
<ol><li>Return all users who are friends with Kermit, make sure their names are displayed in results.</li><li>&nbsp;Return the count of all friendships</li><li>Find out who has the most friends and return the count of their friends.</li><li>Create a new user and make them friends with Eli Byers, Kermit The Frog, and Marky Mark</li><li>Return the friends of Eli in alphabetical order</li><li>Remove Marky Mark from Eli’s friends.</li><li>Return all friendships, displaying just the first and last name of both friends</li></ol>
        
        
        
        
        
        
</div>
