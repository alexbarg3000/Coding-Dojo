<div class="module_description active_lesson_with_video ">
									
            
<h1>Assignment: Semi-Restful TV Shows</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice ORM queries from the controller</li>
    <li>Practice RESTful routing</li>
    <li>Practice rendering query results to templates</li>
    <li>Practice using form input to create table data</li>
</ul>
<hr>
<p>Now that we've got a basic understanding of the flow between models, views, and templates, let's make sure we know how to implement all 4 CRUD commands!</p>
<p>Remember that restful routing is simply a guideline of generally accepted routing naming conventions so other consumers of our routes can easily navigate our application and anticipate what the response will be for any given route. Since many web applications perform CRUD operations, you can imagine how confusing this could get if everyone followed different conventions for creating routing and method names for these operations.</p>
<p>Restful routing also gives us a chance to practice being methodical in our approach to building an application. For each step of CRUD, we start with the HTML, then build the routes to show that page. We can then build out the routes that will process any form submissions.</p>
<p>Ultimately, it's up to you (or maybe your boss) whether you also follow these rules/conventions, but we strongly encourage you to get familiar with the following rules for RESTful routing, as you may be making requests to, or someday creating your own, API.</p>
<p>Create a new Django project following the specifications provided in this wireframe:</p>
<p><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/crud_tvshows_django.png"></p>
        
        
</div>

<div class="todo_content">
										<ul class="todo_item_parent">
											<form action="/tracks/submit_todo" method="post" id="form_to_do_items">		
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="0">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_0" class="todo_check">														
														<label for="todo_item_0" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Complete each of the following routes:</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>/shows/new- GET - method should return a template containing the form for adding a new TV show</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>/shows/create - POST - method should add the show to the database, then redirect to /shows/&lt;id&gt;</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>/shows/&lt;id&gt; - GET - method should return a template that displays the specific show's information</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>/shows - GET - method should return a template that displays all the shows in a table</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>/shows/&lt;id&gt;/edit - GET - method should return a template that displays a form for editing the TV show with the id specified in the url</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>/shows/&lt;id&gt;/update - POST - method should update the specific show in the database, then redirect to /shows/&lt;id&gt;</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>/shows/&lt;id&gt;/destroy - POST - method should delete the show with the specified id from the database, then redirect to /shows</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have your root route redirect to /shows</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5121483">
												<input type="hidden" name="chapter_module_id" value="42937">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
