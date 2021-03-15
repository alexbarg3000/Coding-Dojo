<div class="module_description active_lesson_with_video ">
									<h1 class="text-center">Faker API</h1>
<p>To solidify the concepts of making our own api, we are going to create an api that generates a random user on a GET request. We will be using Postman to make our GET requests.</p>
<p><br></p>
<p>In this assignment, we will be using 2 javascript libraries to create a simple API that generates a User and/or Company depending on the route:</p>
<ul><li>Express (Server)</li><li>Faker (Fake data generator)</li></ul>
<p><br></p>
<p>Go ahead and follow the checklist below using the 2 classes below:</p>
<ul><li>User class<ul><li>_id</li></ul><ul><li>firstName</li></ul><ul><li>lastName</li></ul><ul><li>phoneNumber</li></ul><ul><li>email</li></ul><ul><li>password</li></ul></li><li>Company class<ul><li>_id</li><li>name</li><li>address<ul><li>street</li><li>city</li><li>state</li><li>zipCode</li><li>country</li></ul></li></ul></li></ul>
<p><br></p>
<h2>Faker</h2>
<p>The faker library has a ton of methods we can use to populate specific fields with randomly generated data. Look through the faker <a href="https://github.com/marak/Faker.js/" target="_blank">documentation</a> and search through the methods to choose the ones that you would use to populate each field.</p>
<p><strong>Here is an example of how we can use faker</strong></p>
<figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/faker_example.png" style="width: 622px; height: 368px;" width="622" height="368"></figure>
<p><br></p>
<p> <br> </p>
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
															<p>Create a new project folder "Faker_API" and with your terminal, navigate into your new folder</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create a package.json file using the "npm init -y" command in your terminal</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>install express and faker</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create a server.js file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>In your server.js file, Import express and faker</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create 2 classes: User, Company with the same attributes as listed above</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create an api route "/api/users/new" that returns a new user</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create an api route "/api/companies/new" that returns a new company</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create an api route "/api/user/company" that returns both a new user and a new company</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="9">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_9" checked="checked" class="todo_check">														
														<label for="todo_item_9" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run your server.js file using nodemon</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="10">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_10" checked="checked" class="todo_check">														
														<label for="todo_item_10" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Using Postman, test your new GET routes</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5334416">
												<input type="hidden" name="chapter_module_id" value="46604">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
