<div class="module_description active_lesson_with_video ">
									<h1>Assignment: Hello World</h1>
<h2>Objectives</h2>
<ul><li>Practice the different ways to concatenate and print strings</li>
    <li>Practice running a Python file</li></ul>
<hr>
<p>It's time to start creating Python files! As a rite of passage, our first program needs to be Hello World :). Let’s practice string concatenation. Copy the code below, replacing each of the <code>your code here</code>&nbsp;placeholders with the appropriate values. Hopefully it's not too patronizing that every other task below is running the file--this is just a friendly reminder to get into the habit of testing your code regularly!</p>
<pre data-language="Python" class="rainbow"><span class="comment from-rainbow"># 1. TASK: print "Hello World"</span>
<span class="support function python from-rainbow">print</span>( your code here )
<span class="comment from-rainbow"># 2. print "Hello Noelle!" with the name in a variable</span>
name <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"Noelle"</span>
<span class="support function python from-rainbow">print</span>( your code here )	<span class="comment from-rainbow"># with a comma</span>
<span class="support function python from-rainbow">print</span>( your code here )	<span class="comment from-rainbow"># with a +</span>
<span class="comment from-rainbow"># 3. print "Hello 42!" with the number in a variable</span>
name <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">42</span>
<span class="support function python from-rainbow">print</span>( your code here )	<span class="comment from-rainbow"># with a comma</span>
<span class="support function python from-rainbow">print</span>( your code here )	<span class="comment from-rainbow"># with a +	-- this one should give us an error!</span>
<span class="comment from-rainbow"># 4. print "I love to eat sushi and pizza." with the foods in variables</span>
fave_food1 <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"sushi"</span>
fave_food2 <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"pizza"</span>
<span class="support function python from-rainbow">print</span>( your code here ) <span class="comment from-rainbow"># with .format()</span>
<span class="support function python from-rainbow">print</span>( your code here ) <span class="comment from-rainbow"># with an f string</span>
</pre>

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
															<p>Create a new Python file called hello_world.py</p>	
														</label>	
													</li>
													<li>

<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">
														
<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Write the code to print a literal string saying "Hello World" (#1)</p>	
														</label>	
													</li>
													<li>

<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">
														
<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the file</p>	
														</label>	
													</li>
													<li>

<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Store your name in a variable, and then use it to print the string “Hello {{your name}}!” using a comma in the print function (#2a)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">
																												<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">												
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Store your name in a variable, and then use it to print the string “Hello {{your name}}!” using a + in the print function (#2b)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Store your favorite number in a variable, and then use it to print the string “Hello {{num}}!” using a comma in the print function (#3a)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="9">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_9" checked="checked" class="todo_check">														
														<label for="todo_item_9" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Store your favorite number in a variable, and then use it to print the string “Hello {{num}}!” using a + in the print function (#3b)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="10">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_10" checked="checked" class="todo_check">														
														<label for="todo_item_10" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="11">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_11" checked="checked" class="todo_check">														
														<label for="todo_item_11" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Figure out how to resolve the error from above, without changing the + sign to a comma</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="12">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_12" checked="checked" class="todo_check">														
														<label for="todo_item_12" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Store 2 of your favorite foods in variables, and then use them to print the string “I love to eat {{food_one}} and {{food_two}}.” with the format method (#4a)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="13">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_13" checked="checked" class="todo_check">														
														<label for="todo_item_13" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="14">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_14" checked="checked" class="todo_check">														
														<label for="todo_item_14" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Store 2 of your favorite foods in variables, and then use them to print the string “I love to eat {{food_one}} and {{food_two}}.” with f-strings (#4b)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="15">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_15" checked="checked" class="todo_check">														
														<label for="todo_item_15" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="16">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_16" checked="checked" class="todo_check">														
														<label for="todo_item_16" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Spend a few minutes playing around with other string methods to see what’s out there!</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5039750">
												<input type="hidden" name="chapter_module_id" value="42507">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
