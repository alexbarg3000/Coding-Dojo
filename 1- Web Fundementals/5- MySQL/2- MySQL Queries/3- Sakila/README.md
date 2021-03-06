<div class="module_description active_lesson_with_video ">
									<p> <br></p><h1>Assignment: Sakila</h1>
<h2>Objectives:</h2>
<ol><li>Practice SQL queries</li></ol>
<hr>
<p>Using the Sakila database, complete the below queries.</p>
<p>You can get the&nbsp;<strong><em>Sakila</em></strong> database and ERD here (<a href="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/sakila-data.sql" target="_blank">sakila-data.sql</a> and&nbsp;<a href="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3569/handouts/chapter3569_5431_sakila-db-model.png" target="_blank">sakila-db-model.png</a>), please use these for reference.</p>
<h3>Note</h3>
<p>Earlier in this section, we recommended for students&nbsp;name their tables all lower case and have a primary key called <em>'id'</em> in each table. These are the&nbsp;rules we follow, however&nbsp;not all developers follow these rules. The SQL file you'll be working with does NOT follow the rules we discussed, including naming the fields lower case. We still want you to follow the rules we taught, but use this as an opportunity to get comfortable with other SQL files that do not completely follow the rules of normalization.</p>
<h3>Queries</h3>
<p>1. What query would you run to get all the customers inside city_id = 312? Your query should return customer first name, last name, email, and address.</p>
<p>2.&nbsp;What query would you run to get all comedy films? Your query should return film title, description, release year, rating, special features, and genre (category).</p>
<p>3. What query would you run to get all the films joined by actor_id=5? Your query should return the actor id, actor name, film title, description, and release year.</p>
<p>4. What query would you run to get all the customers in store_id = 1 and inside these cities (1, 42, 312 and 459)? Your query should return customer first name, last name, email, and address.</p>
<p>5. What query would you run to get all the films with a "rating = G" and "special feature = behind the scenes", joined by actor_id = 15? Your query should return the film title, description, release year, rating, and special feature. <em>Hint: You may use LIKE function in getting the 'behind the scenes' part.</em></p>
<p>6. What query would you run to get all the actors that joined in the film_id = 369? Your query should return the film_id, title, actor_id, and actor_name.</p>
<p>7. What query would you run to get all drama films with a rental rate of 2.99? Your query should return film title, description, release year, rating, special features, and genre (category).</p>
<p>8. What query would you run to get all the action films which are joined by SANDRA KILMER? Your query should return film title, description, release year, rating, special features, genre (category), and actor's first name and last name.</p>
<p>Note: You may download this PDF file displaying the expected results from the questions above -&nbsp;<a href="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/mysql_sakila_expected_output.pdf" data-file="" target="_blank">Expected Result (Sakila)</a>&nbsp;<a style="display:none;" href="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3569/handouts/chapter3569_5439_MySQL-Intermediate-Sakila-Expected-Result.pdf" target="_blank"><strong>Expected Result (Sakila)</strong></a></p>
								</div>
