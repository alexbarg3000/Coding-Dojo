<div class="module_description active_lesson_with_video ">
									<h1>Assignment: Playground</h1>
<h2>Objectives:</h2>
<ul>
    <li>Get comfortable passing information from the route to the template</li>
    <li>Understand how to display information passed from the route in the template file</li>
    <li>Get comfortable using for loops in the template file</li>
    <li>Get comfortable using if statements in the template file</li>
</ul>
<hr>
<h2>Internal Styling</h2>
<p><em>Just for this assignment</em>, use an internal stylesheet or inline CSS (<a href="https://www.w3schools.com/css/css_howto.asp" target="_blank">review here</a>).</p>
<h2>Level 1</h2>
<p style="width: 49%; display: inline-block; vertical-align: top;">When a user visits <strong>http://localhost:5000/play</strong>, have it render three beautiful looking blue boxes. Please use a template to render this.</p>
<p style="width: 49%; display: inline-block; vertical-align: top;"><img style="width:400px;" src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/playground1.png"></p>
<h2>Level 2</h2>
<p style="width: 49%; display: inline-block; vertical-align: top;">When a user visits <strong>localhost:5000/play/(x)</strong>, have it display the beautiful looking blue boxes x times. For example, localhost:5000/play/7 should display these blue boxes 7 times. Calling localhost:5000/play/35 would display these blue boxes 35 times. Please remember that x originally is a string, and if you want to use it as an integer, you must first convert it to integer using int(). For example int("7") returns 7.</p>
<p style="width: 49%; display: inline-block; vertical-align: top;"><img style="width: 400px;" src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/playground2.png"></p>
<h2>Level 3</h2>
<p style="width: 49%; display: inline-block; vertical-align: top;">When a user visits <strong>localhost:5000/play/(x)/(color)</strong>, have it display beautiful looking boxes x times, but this time where the boxes appear in (color). For example, localhost:5000/play/5/green would display 5 beautiful green boxes. Calling localhost:5000/play/35/red would display 35 beautiful red boxes.</p>
<figure style="width: 49%; display: inline-block; vertical-align: top;">   
    <img style="width:400px;" src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/playground3.png">
</figure>

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
															<p>Have the /play route render a template with 3 blue boxes</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the /play/&lt;x&gt; route render a template with x number of blue boxes</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the /play/&lt;x&gt;/&lt;color&gt; route render a template with x number of boxes the color of the provided value</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="1" class="todo_status">	
														<input type="checkbox" id="todo_item_4" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Use only one template for the whole project</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5070472">
												<input type="hidden" name="chapter_module_id" value="42696">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
