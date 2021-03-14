<div class="module_description active_lesson_with_video ">
									
            
            
<h1>Assignment: Understanding Routing</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice building a server with Flask from scratch</li>
    <li>Get comfortable with routes and passing information to the routes</li>
</ul>
<hr>
<p>Create a server file that generates the specified responses for the following url requests:</p>
<ol>
    <li>localhost:5000<strong>/</strong> - have it say "Hello World!"</li>
    <li>localhost:5000<strong>/dojo</strong> - have it say "Dojo!"</li>
    <li>Create one url pattern and function that can handle the following examples:</li>
    	<ul>
        	<li>localhost:5000<strong>/say/flask</strong> - have it say "Hi Flask!"</li>
            <li>localhost:5000<strong>/say/michael</strong> - have it say "Hi Michael!"</li>
            <li>localhost:5000<strong>/say/john</strong> - have it say "Hi John!"</li>
    	</ul>
   	<li>Create one url pattern and function that can handle the following examples (HINT: int() will come in handy! For example int("35") returns 35):</li>
    	<ul>
    		<li>localhost:5000<strong>/repeat/35/hello</strong> - have it say "hello" 35 times</li>
            <li>localhost:5000<strong>/repeat/80/bye</strong> - have it say "bye" 80 times</li>
            <li>localhost:5000<strong>/repeat/99/dogs</strong> - have it say "dogs" 99 times</li>
    	</ul>
</ol>
<p>We hope you are feeling more comfortable with routes now!</p>
        
        
        
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
															<p>Create a root route ("/") that responds with "Hello World!"</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create a route that responds with "Dojo!"</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create a route that responds with "Hi" and whatever name is in the URL after /say/</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create a route that responds with the given word repeated as many times as specified in the URL</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: For the 4th task, ensure the 2nd element in the URL is an integer (hint: http://exploreflask.com/en/latest/views.html#url-converters)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="1" class="todo_status">	
														<input type="checkbox" id="todo_item_5" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Ensure that if the user types in any route other than the ones specified, they receive an error message saying "Sorry! No response. Try again."</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5070142">
												<input type="hidden" name="chapter_module_id" value="42693">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
