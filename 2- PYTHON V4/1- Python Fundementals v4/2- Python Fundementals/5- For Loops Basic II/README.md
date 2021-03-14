<div class="module_description active_lesson_with_video ">
									
            
            
            
<h1>Assignment: For Loop Basic II</h1>
<h2>Objectives:</h2>
<ul>
    <li>Get comfortable writing functions only using basic building blocks of Python (i.e. using your own skills rather than relying on built-ins)</li>
    <li>Get comfortable using for loops, functions, lists, and other data types</li>
</ul>
<hr>
<ol>
    <li><strong>Biggie Size</strong> - Given a list, write a function that changes all positive numbers in the list to "big".</li>
    	<ul><li>Example: biggie_size([-1, 3, 5, -5]) returns that same list, but whose values are now [-1, "big", "big", -5]</li></ul>
    <li><strong>Count Positives</strong> - Given a list of numbers, create a function to replace the last value with the number of positive values. (Note that zero is not considered to be a positive number).</li>
    	<ul>
            <li>Example: count_positives([-1,1,1,1]) changes the original list to [-1,1,1,3] and returns it</li>
            <li>Example: count_positives([1,6,-4,-2,-7,-2]) changes the list to [1,6,-4,-2,-7,2] and returns it</li>
    	</ul>
    <li><strong>Sum Total</strong> - Create a function that takes a list and returns the sum of all the values in the list.</li>
    	<ul>
            <li>Example: sum_total([1,2,3,4]) should return 10</li>
            <li>Example: sum_total([6,3,-2]) should return 7</li>
    	</ul>
    <li><strong>Average</strong> - Create a function that takes a list and returns the average of all the values.x</li>
    	<ul>
            <li>Example: average([1,2,3,4]) should return 2.5</li>
    	</ul>
    <li><strong>Length</strong> - Create a function that takes a list and returns the length of the list.</li>
    	<ul>
            <li>Example: length([37,2,1,-9]) should return 4</li>
            <li>Example: length([]) should return 0</li>
    	</ul>
    <li><strong>Minimum</strong> - Create a function that takes a list of numbers and returns the minimum value in the list. If the list is empty, have the function return False.</li>
    	<ul>
            <li>Example: minimum([37,2,1,-9]) should return -9</li>
            <li>Example: minimum([]) should return False</li>
    	</ul>
    <li><strong>Maximum</strong> - Create a function that takes a list and returns the maximum value in the list. If the list is empty, have the function return False.</li>
    	<ul>
            <li>Example: maximum([37,2,1,-9]) should return 37</li>
            <li>Example: maximum([]) should return False</li>
    	</ul>
    <li><strong>Ultimate Analysis</strong> - Create a function that takes a list and returns a dictionary that has the sumTotal, average, minimum, maximum and length of the list.</li>
    	<ul>
            <li>Example: ultimate_analysis([37,2,1,-9]) should return {'sumTotal': 31, 'average': 7.75, 'minimum': -9, 'maximum': 37, 'length': 4 }</li>
    	</ul>
    <li><strong>Reverse List</strong> - Create a function that takes a list and return that list with values reversed. Do this without creating a second list. (This challenge is known to appear during basic technical interviews.)</li>
    	<ul>
            <li>Example: reverse_list([37,2,1,-9]) should return [-9,1,2,37]</li>
    	</ul>
</ol>
        
        
        
        
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
															<p>Biggie Size</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Count Positives</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Sum Total</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Average</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Length</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Minimum</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Maximum</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Ultimate Analysis</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Reverse List</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5048241">
												<input type="hidden" name="chapter_module_id" value="42516">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
