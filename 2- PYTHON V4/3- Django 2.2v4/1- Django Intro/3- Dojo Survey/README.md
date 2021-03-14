<div class="module_description active_lesson_with_video ">
									
<h1>Assignment: Dojo Survey</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice creating a server with Django from scratch</li>
    <li>Practice adding routes to a Django app</li>
    <li>Practice having the client send data to the server with a form</li>
    <li>Practice having the server render a template using data provided by the client</li>
</ul>
<hr>
<p>Build a new Django application that accepts a form submission and presents the submitted data on a results page.</p>
<p>The goal is to help you get familiar with sending POST requests through a form and displaying that information. Consider the below example as a guide.</p>
<p>
<img src="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_2982/handouts/chapter2982_3795_survey-form.png"></p>
<p>
When you build this, please make sure that your program meets the following criteria:</p>
<ul><li>http://localhost:8000 - have this display a nice looking HTML form.&nbsp; The form should be submitted to '/result'</li><li>http://localhost:8000/result - have this display an HTML page with the information that was submitted by POST</li></ul>
<p><strong>Don't forget that any inputs we want to be able to access from the form submission need to have a name!</strong></p>
<p>It's always a good idea to print request.POST to see if the form is delivering all the information you need in your routing method.</p>
        
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
															<p>Create a new Django application</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the root route ("/") show a page with the form</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the "/result" route display the information from the form on a new HTML page</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Use a CSS framework to style your form</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Include a set of radio buttons on your form</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Include a set of checkboxes on your form</p>	
														</label>	
													</li>
																					<input type="hidden" name="id" id="task_todo_id" value="5103540">
												<input type="hidden" name="chapter_module_id" value="50911">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
