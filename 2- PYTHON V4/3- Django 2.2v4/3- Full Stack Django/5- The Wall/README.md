<div class="module_description active_lesson_with_video ">
									
            
<h1>Assignment: The Wall</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice connecting a Django application to a database</li>
    <li>Integrate the login app with another app</li>
    <li>Practice one-to-many relationships</li>
    <li>Practice validating user input and using flash messages</li>
</ul>
<hr>
<p>Create a wall page (think Facebook news feed) where users will be able to post messages and see the messages posted by other users. Follow the below wireframe.</p>
<p>This app will be integrated with our login app. After successfully logging in or registering, a user should be redirected to <code>localhost:8000/wall</code>, where the wall is displayed.</p>
<p>Download the <a href="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/flask_wall.png" target="_blank">handout</a> for the wireframe/ERD:</p>
<figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/flask_wall.png"></figure>
<p>Once you get the messages functionality working, allow users to post comments for any message. Comments should be in a separate database table from messages.</p>

<h2>Helpful Tip</h2>
<p>In Jinja, say that you made available a variable called 'messages' where 'messages' contained all the messages in the Wall.&nbsp; For some reason, the following code would not work:</p>
<pre class="rainbow" data-language="python">{% <span class="keyword from-rainbow">for</span> comment <span class="keyword from-rainbow">in</span> message.comments.<span class="support function python from-rainbow">all</span>() %}
   <span class="keyword operator from-rainbow">&lt;</span>p<span class="keyword operator from-rainbow">&gt;</span>{{comment.comment}}<span class="keyword operator from-rainbow">&lt;</span>/p<span class="keyword operator from-rainbow">&gt;</span>
{% endfor %}
</pre>
<p>This however does work.</p>
<pre class="rainbow" data-language="python">{% <span class="keyword from-rainbow">for</span> comment <span class="keyword from-rainbow">in</span> message.comments.all %}&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment from-rainbow"># no parentheses!</span>
   <span class="keyword operator from-rainbow">&lt;</span>p<span class="keyword operator from-rainbow">&gt;</span>{{comment.comment}}<span class="keyword operator from-rainbow">&lt;</span>/p<span class="keyword operator from-rainbow">&gt;</span>
{% endfor %}
</pre>
<p></p>
<h3>
Extra Credit I (optional but highly recommended)&nbsp;</h3>
<p>Allow the user to delete his/her own messages.</p>
<h3>Extra Credit II (optional but highly recommended)</h3>
<p>Allow the user to delete his/her own message but only if the message was made in the last 30 minutes.</p>
<p> <br> <br> </p>
        
        
        
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
															<p>Create a new Django project and bring in your login app (or recreate it) and create a new wall app</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Set up the necessary models</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Allow users to post messages</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Display all messages on the main page</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Allow users to comment on each message</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">
																												<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Display all comments per message</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Allow users to delete only their own messages</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Allow the user to delete their own messages only if the message was written within the last 30 minutes</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Use AJAX for adding comments, deleting messages, and deleting comments</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5132126">
												<input type="hidden" name="chapter_module_id" value="42945">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
