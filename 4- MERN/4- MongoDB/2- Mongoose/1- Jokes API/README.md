<div class="module_description active_lesson_with_video ">
									
            
            
            
            
<h1 class="text-center">Jokes API</h1><p>To solidify what we've read about mongoose commands and express, lets create a new express project from scratch called "Jokes."</p><figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/JokeAPI_%282%29.png"></figure><figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Screenshot_from_2020-01-09_13-19-59.png"></figure><figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Screenshot_from_2020-01-09_13-13-59.png"></figure><figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Screenshot_from_2020-01-09_13-09-27.png"></figure><figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Screenshot_from_2020-01-09_13-06-32.png"></figure><p><br></p>
        
        
        
        
        
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
															<p>Create a project folder named "Jokes"</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>within "Jokes" create a modularized folder structure (server ==&gt; controllers, routes, models, config, server.js)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>initialize a package json file using npm</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>install express and mongoose</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>create a mongoose.config.js file and setup your mongoose.connect function</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>create a jokes.model.js, jokes.controller.js, and a jokes.routes.js in the applicable folders</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>in the jokes.model file create and JokeSchema and export the mongoose.model("joke", JokeSchema)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>in the jokes.controller import your model from the models file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Export a function to get all jokes</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="9">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_9" checked="checked" class="todo_check">														
														<label for="todo_item_9" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Export a function to get a single joke</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="10">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_10" checked="checked" class="todo_check">														
														<label for="todo_item_10" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Export a function to create a joke</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="11">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_11" checked="checked" class="todo_check">														
														<label for="todo_item_11" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Export a function to update a joke</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="12">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_12" checked="checked" class="todo_check">														
														<label for="todo_item_12" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Export a function to delete a joke</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="13">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_13" checked="checked" class="todo_check">														
														<label for="todo_item_13" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>in the jokes.routes file: import * from your controller file and add an express route for every route listed in the wireframe</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="14">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_14" checked="checked" class="todo_check">														
														<label for="todo_item_14" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>In your server.js file: setup express, import your joke routes, and run your server</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="15">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_15" checked="checked" class="todo_check">														
														<label for="todo_item_15" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Use Postman to create new jokes and use the browser to view them</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="16">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_16" checked="checked" class="todo_check">														
														<label for="todo_item_16" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Use Postman to perform the POST DELETE and PUT operations and use the browser to GET them</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5340033">
												<input type="hidden" name="chapter_module_id" value="45750">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
