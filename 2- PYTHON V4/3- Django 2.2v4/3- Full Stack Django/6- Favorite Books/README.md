<div class="module_description active_lesson_with_video ">
									<h1>Assignment: Favorite Books</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice one-to-many and many-to-many relationships</li>
</ul>
<hr>
<p>Say we wanted to create a website where users can upload their favorite books and other users on the website can indicate whether that book is also one of their favorites. For the database diagram, we come up with the following, realizing that there can be more than one relationship between two tables:</p>
<p class="text-center"><img style="width: 50%;" src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/favorite_books_ERD.PNG"></p>
<p>Let's review the two distinct relationships between the users and books tables.</p>
<ul>
    <li>One is a one-to-many relationship because a user can <em>upload</em> many books, and a book can be <em>uploaded by</em> one user. In our database, the uploaded_by_id field (in the books table)&nbsp;stores this relationship.&nbsp;</li>
    <li>The second relationship is a many-to-many relationship, where&nbsp;a given user can <em>like</em> many books, and a given book can be <em>liked by</em> many users. This relationship is stored in the third table. (In the diagram, this is the likes table.)</li>
</ul>
<p>If we retrieve a book from the database and want the associated user(s), how do we distinguish between these two different relationships? We may want the user who uploaded the book, or the users who like this book. Wouldn't it be nice if each class had some attributes like this:</p>
<pre data-language="Python" class="rainbow"><span class="keyword from-rainbow">class</span> <span class="function call from-rainbow">User</span>(models.Model):
&nbsp;&nbsp;&nbsp;&nbsp;first_name <span class="keyword operator from-rainbow">=</span> models.<span class="function call from-rainbow">CharField</span>(max_length<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">255</span>)
&nbsp;&nbsp;&nbsp;&nbsp;last_name <span class="keyword operator from-rainbow">=</span> models.<span class="function call from-rainbow">CharField</span>(max_length<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">255</span>)
&nbsp;&nbsp;<span class="comment from-rainbow">#&nbsp;liked_books = a list of books a given user likes</span>
&nbsp;&nbsp;<span class="comment from-rainbow">#&nbsp;books_uploaded = a list of books uploaded by a given user</span>
    
<span class="keyword from-rainbow">class</span> <span class="function call from-rainbow">Book</span>(models.Model):
&nbsp;&nbsp;&nbsp;&nbsp;title <span class="keyword operator from-rainbow">=</span> models.<span class="function call from-rainbow">CharField</span>(max_length<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">255</span>)
&nbsp;&nbsp;<span class="comment from-rainbow">#&nbsp;uploaded_by = user who uploaded a given book</span>
&nbsp;&nbsp;<span class="comment from-rainbow">#&nbsp;users_who_like = a list of users who like a given book</span>
</pre>
<p>This is exactly what related_name provides!</p>
<p class="text-center"><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/related_nameMM.PNG" style="width: 518px; height: 249px;" width="518" height="249"></p>
<p>According to this,</p>
<ul>
    <li>To get the user who uploaded a book: Book.objects.first().uploaded_by</li>
    <li>To get the list of books uploaded by a user: User.objects.first().books_uploaded.all()</li>
    <li>To get the list of users who like a book: Book.objects.first().users_who_like.all()</li>
    <li>To get the list of books a user likes: User.objects.first().liked_books.all()</li>
</ul>
<p>Create an application that performs the following:</p>
<p style="text-align: center;"><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Favorite_Books_%28Django%29.png"></p>

</div>

<div class="todo_content">
										<ul class="todo_item_parent">
											<form action="/tracks/submit_todo" method="post" id="form_to_do_items">		
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="0">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_0" checked="checked" class="todo_check">														
														<label for="todo_item_0" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create the User and Book models with all appropriate relationships</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Incorporate a validated login/registration page</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>On the main page, allow the user to add a new book, with validations. Added books should automatically be favorited by the logged in user.</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have a list of all the books on the main page displaying the title and the user who uploaded the book</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>When the title is clicked, display a page with the book's information, including a list of all users who have favorited that book</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>If the logged in user has favorited the book, they should be able to "un-favorite" the book</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>If the logged in user has not yet favorited the book, there should be a link to add this book to their favorites</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>If the logged in user is the uploader of the book, allow them to edit (same validations apply) or delete the book</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: On the main page, if the logged in user has not favorited the book, there should be a link so the user can add it to their favorites. Otherwise, display a message indicating the book has already been favorited.</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="9">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_9" checked="checked" class="todo_check">														
														<label for="todo_item_9" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Add a user page that allows the user to view a list of all their favorite books</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5132128">
												<input type="hidden" name="chapter_module_id" value="45796">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
