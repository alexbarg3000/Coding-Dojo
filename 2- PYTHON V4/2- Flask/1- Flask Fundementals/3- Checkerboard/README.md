<div class="module_description active_lesson_with_video ">
									
            
<h1>Assignment: Checkerboard</h1>
<h2>Objectives:</h2>
<ul>
    <li>Continue to learn how to pass information from the url to the route</li>
    <li>Practice linking static files to templates</li>
    <li>Get comfortable passing information from the route to the template</li>
    <li>Understand how to use for loop properly in the template</li>
    <li>Recognize the value of creating a html/css first and then adding logic/code</li>
</ul>
<hr>
<p>Now let's practice linking static files to our template. For this project, we'll render a template that displays a checkerboard:</p>
<p><img src="http://mathworld.wolfram.com/images/eps-gif/Checkerboard_1000.gif"></p>
<p>Your program should have the following output</p><ol><li>http://localhost:5000 - should display 8 by 8 checkerboard</li><li>http://localhost:5000/4 - should display 8 by 4 checkerboard</li><li>http://localhost:5000/(x)/(y) - should display x by y checkerboard.&nbsp; For example, http://localhost:5000/10/10 should display 10 by 10 checkerboard.&nbsp; Before you pass x or y to Jinja, please remember to convert it to integer first (so that you can use x or y in a for loop)</li></ol>
<p><strong>HINT: Remember that values from urls come in as strings by default. If you want to use the value in a loop, you should convert it to an integer before passing it to Jinja.</strong></p>
       
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
															<p>Create a new Flask project</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the root route render a template with a checkerboard on it</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the css in a separate stylesheet and link this to the template</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have another route accept a single parameter (i.e. "/&lt;x&gt;") and render a checkerboard with x many rows, with alternating colors</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Have another route accept 2 parameters (i.e. "/&lt;x&gt;/&lt;y&gt;") and render a checkerboard with x rows and y columns, with alternating colors</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Have another route accept 4 parameters (i.e. "/&lt;x&gt;/&lt;y&gt;/&lt;color1&gt;/&lt;color2&gt;") and render a checkerboard with x rows and y columns, with alternating colors, color1 and color2</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5071031">
												<input type="hidden" name="chapter_module_id" value="42698">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
