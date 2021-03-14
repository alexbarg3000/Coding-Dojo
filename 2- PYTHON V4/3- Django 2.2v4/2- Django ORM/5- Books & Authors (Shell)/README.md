<div class="module_description active_lesson_with_video ">
									
            
<h1>Assignment: Books/Authors (Shell)</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice using the Django Shell to run ORM commands to manipulate our database</li>
    <li>Practice many-to-many relationships</li>
</ul>
<hr>
<p>Create a new project called <em>books_authors_proj</em> and an app called <em>books_authors_app</em>. Use the following diagram as a guide for designing your models:</p>
<p class="text-center"><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/books_authors_ERD.PNG" style="width: 305px; height: 273px;" width="305" height="273"></p>
        
        
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
															<p>Create the Book class model</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create the Author class model</p>	
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
															<p>Query: Create 5 books with the following names: C Sharp, Java, Python, PHP, Ruby</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Create 5 different authors: Jane Austen, Emily Dickinson, Fyodor Dostoevsky, William Shakespeare, Lau Tzu</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Add a new text field in the authors table called 'notes'.</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create and run the migration files to update the table in your database.</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Change the name of the C Sharp book to C#</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="9">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_9" checked="checked" class="todo_check">														
														<label for="todo_item_9" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Change the first name of the 4th author to Bill</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="10">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_10" checked="checked" class="todo_check">														
														<label for="todo_item_10" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Assign the first author to the first 2 books</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="11">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_11" checked="checked" class="todo_check">														
														<label for="todo_item_11" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Assign the second author to the first 3 books</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="12">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_12" checked="checked" class="todo_check">														
														<label for="todo_item_12" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Assign the third author to the first 4 books</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="13">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_13" checked="checked" class="todo_check">														
														<label for="todo_item_13" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Assign the fourth author to the first 5 books (or in other words, all the books)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="14">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_14" checked="checked" class="todo_check">														
														<label for="todo_item_14" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Retrieve all the authors for the 3rd book</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="15">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_15" checked="checked" class="todo_check">														
														<label for="todo_item_15" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Remove the first author of the 3rd book</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="16">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_16" checked="checked" class="todo_check">														
														<label for="todo_item_16" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Add the 5th author as one of the authors of the 2nd book</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="17">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_17" checked="checked" class="todo_check">														
														<label for="todo_item_17" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Find all the books that the 3rd author is part of</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="18">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_18" checked="checked" class="todo_check">														
														<label for="todo_item_18" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Query: Find all the authors that contributed to the 5th book</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="19">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_19" checked="checked" class="todo_check">														
														<label for="todo_item_19" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Submit your .txt file that contains all the queries you ran in the shell</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5123113">
												<input type="hidden" name="chapter_module_id" value="42928">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
