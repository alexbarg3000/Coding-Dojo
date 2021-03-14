<div class="module_description active_lesson_with_video ">
									
            
 <h1>Assignment: Dojo &amp; Ninjas (Shell)</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice using the Django Shell to run ORM commands to manipulate our database</li>
    <li>Practice one-to-many relationships</li>
</ul>
<hr>
<p>Create a new project called <em>dojo_ninjas_proj</em> and an app called <em>dojo_ninjas_app</em>. For this project, use the following diagram as a guide for creating your models:</p>
<p class="text-center"><img src="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_2240/handouts/chapter2240_1991_dojo-erd.png"></p>
        
        
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
															<p>Create the Dojo class model</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create the Ninja class model</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create and run the migration files to create the tables in your database</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create a .txt file where you'll save each of your queries from below</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the shell and import your models</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Create 3 new dojos</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Delete the 3 dojos you just created</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Create 3 more dojos</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Create 3 ninjas that belong to the first dojo</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="9">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_9" checked="checked" class="todo_check">														
														<label for="todo_item_9" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Create 3 ninjas that belong to the second dojo</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="10">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_10" checked="checked" class="todo_check">														
														<label for="todo_item_10" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Create 3 ninjas that belong to the third dojo</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="11">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_11" checked="checked" class="todo_check">														
														<label for="todo_item_11" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Retrieve all the ninjas from the first dojo</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="12">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_12" checked="checked" class="todo_check">														
														<label for="todo_item_12" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Retrieve all the ninjas from the last dojo</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="13">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_13" checked="checked" class="todo_check">														
														<label for="todo_item_13" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Retrieve the last ninja's dojo</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="14">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_14" checked="checked" class="todo_check">														
														<label for="todo_item_14" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Add a new text field called "desc" to your Dojo class</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="15">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_15" checked="checked" class="todo_check">														
														<label for="todo_item_15" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create and run the migration files to update the table in your database. If needed, provide a default value of "old dojo"</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="16">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_16" checked="checked" class="todo_check">														
														<label for="todo_item_16" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Create a new dojo</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="17">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_17" checked="checked" class="todo_check">														
														<label for="todo_item_17" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Submit your .txt file that contains all the queries you ran in the shell</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5108711">
												<input type="hidden" name="chapter_module_id" value="45790">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
