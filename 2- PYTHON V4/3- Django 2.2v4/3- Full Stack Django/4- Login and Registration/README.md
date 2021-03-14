<div class="module_description active_lesson_with_video ">
									
            
<h1>Assignment: Login and Registration</h1>
<h2>Objectives:</h2>
<ul>
    <li>Build a login and registration page with validations</li>
    <li>Practice Flash messages</li>
    <li>Practice session</li>
</ul>
<hr>
<p>It's time to build Login and Registration again, this time using Django.</p>
<p>We’ve learned how to integrate models, validations, and controllers to our projects. Our next goal is to create a fully functional login and registration app! This will combine your knowledge of MVC patterns, validations, and password encryption.</p>
<p>Registration should adhere to the following guidelines:</p>
<ul>
	<li>First Name - required; at least 2 characters; letters only</li>
	<li>Last Name - required; at least 2 characters; letters only</li>
	<li>Email - required; valid format</li>
	<li>Password - required; at least 8 characters; matches password confirmation</li>
</ul>
<p><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/LoginReg_Django.png" alt="login_reg" title="login"></p>
<h4>Something to Consider</h4>
<p><strong>User.objects.get(email = email)</strong></p>
<p>If there is not a matching email for a .get(), Django throws an error (try and except could come in handy), otherwise it returns the User object associated with the matching user. e.g. Userobject.</p>
<p><strong>User.objects.filter(email = email)</strong></p>
<p>Filter, on the other hand, returns a list, so if there is no user that matches, it returns an empty list. If there is a single matching user the list will contain a single User object: e.g. [Userobject].</p>
        
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
															<p>Create a new Django project with a login app</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the root route render a page where users can register or log in</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Complete the registration method, including showing errors if the input is invalid</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Complete the login method, including showing errors if the input is invalid</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Upon successful registration or login, redirect to a success page, displaying the user's name and a message as shown above</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the logout link clear the session and redirect to the login/reg page</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Don't allow a user who is not logged in to reach the /success route (i.e. by making a GET request in the address bar)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Add a birthday field and validate that the user's birthday is in the past</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Validate that the email provided for registration is unique</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="9">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_9" checked="checked" class="todo_check">														
														<label for="todo_item_9" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Add a birthday field and validate that the user is at least 13 years old (COPPA compliant!)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="10">	
														<input type="hidden" name="is_completed[]" value="1" class="todo_status">	
														<input type="checkbox" id="todo_item_10" class="todo_check">														
														<label for="todo_item_10" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Validate the email uniqueness with AJAX</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="11">	
														<input type="hidden" name="is_completed[]" value="1" class="todo_status">	
														<input type="checkbox" id="todo_item_11" class="todo_check">														
														<label for="todo_item_11" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Use JavaScript to perform client-side validations</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="12">	
														<input type="hidden" name="is_completed[]" value="1" class="todo_status">	
														<input type="checkbox" id="todo_item_12" class="todo_check">														
														<label for="todo_item_12" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: In addition to server side validations, use JavaScript to perform client-side validations on required fields. Don't allow the form to be submitted unless fields are valid.</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5121518">
												<input type="hidden" name="chapter_module_id" value="42943">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
