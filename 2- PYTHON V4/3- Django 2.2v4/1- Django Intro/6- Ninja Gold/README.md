<div class="module_description active_lesson_with_video ">
									<h1>Assignment: Ninja Gold</h1>
<ul>
    <li>Practice passing data to a template</li>
    <li>Practice using forms</li>
    <li>Practice using Django session</li>
</ul>
<hr>
<p>Recreate the Ninja Gold game, but this time with Django.</p>
<p>As a reminder, you're going to create a mini-game that helps a ninja make some money! When you start the game, your ninja should have 0 gold. The ninja can go to different places (farm, cave, house, casino) and earn different amounts of gold. In the case of a casino, your ninja can earn or lose up to 50 gold. Your job is to create a web app that allows this ninja to earn gold and to display past activities of this ninja.</p>
<h3>Guidelines</h3>
<ul>
    <li>Refer to the wireframe below.</li> <li>Have the four forms appear when the user goes to http://localhost:8000</li>
    <li>Use a hidden input tag in each form to pass the relevant location to the server</li>
    <li>Have <code>/process_money</code> determine how much gold the user should have</li>
    <li>For now, save the activity log in session</li>
</ul>
<p>
 <img src="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3832/handouts/chapter3832_6611_ninja-gold-ci.png" alt="alt text" title="Ninja Gold"></p>
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
															<p>Create a new project/app</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the root route render the main Ninja Gold page</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the "/process_money" POST route increase/decrease the user's gold by an appropriate amount and redirect to the root route</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Refactor your code so the location is being passed in the URL rather than via a form</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Have the user specify the win conditions before starting, and then implement them in the game (# of moves, goal for gold)</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5108497">
												<input type="hidden" name="chapter_module_id" value="45786">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
