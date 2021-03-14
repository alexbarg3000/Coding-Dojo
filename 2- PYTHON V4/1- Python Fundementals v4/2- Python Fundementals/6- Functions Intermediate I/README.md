<div class="module_description active_lesson_with_video ">
									
            
<h1>Assignment: Functions Intermediate I</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice using default parameter values</li>
    <li>Practice passing in named arguments</li>
    <li>Become familiar with Python's random module</li>
</ul>
<hr>
<p>With this concept of default parameters in mind, the goal of this assignment is to write a single function, randInt() that takes up to 2 arguments.</p>
<ul>
    <li>If no arguments are provided, the function should return a random integer between 0 and 100.</li>
    <li>If only a max number is provided, the function should return a random integer between 0 and the max number.</li>
    <li>If only a min number is provided, the function should return a random integer between the min number and 100</li>
    <li>If both a min and max number are provided, the function should return a random integer between those 2 values.</li>
</ul>
<p>Here are a couple of important notes about using random.random() and rounding. (Create this function without using random.randInt() -- we are trying to build that method ourselves for this assignment!)</p>
<ul>
    <li><code>random.random()</code> returns a random floating number between 0.000 and 1.000</li>
    <li><code>random.random() * 50</code> returns a random floating number between 0.000 and 50.000</li>
    <li><code>random.random() * 25 + 10</code> returns a random floating number between 10.000 and 35.000</li>
    <li><code>round(num)</code> returns the rounded integer value of num</li>
</ul>
<p>Here's a little bit of code to get you started, with some test cases and expected outputs. Test each function call one at a time and a few times each to make sure you're getting the correct range.</p>
<pre data-language="Python" class="rainbow"><span class="keyword from-rainbow">import</span> random
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">randInt</span>(min<span class="keyword operator from-rainbow">=</span>   , max<span class="keyword operator from-rainbow">=</span>   ):
    num <span class="keyword operator from-rainbow">=</span> random.<span class="function call from-rainbow">random</span>()
    <span class="keyword from-rainbow">return</span> num
<span class="comment from-rainbow">#print(randInt()) 		&nbsp;&nbsp;&nbsp;&nbsp;# should print a random integer between 0 to 100</span>
<span class="comment from-rainbow">#print(randInt(max=50)) 	&nbsp;&nbsp;&nbsp;&nbsp;# should print a random integer between 0 to 50</span>
<span class="comment from-rainbow">#print(randInt(min=50)) 	&nbsp;&nbsp;&nbsp;&nbsp;# should print a random integer between 50 to 100</span>
<span class="comment from-rainbow">#print(randInt(min=50, max=500))    # should print a random integer between 50 and 500</span>
</pre>
        
        
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
															<p>Complete the randInt function</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>BONUS: account for any edge cases (eg. min &gt; max, max &lt; 0)</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5049291">
												<input type="hidden" name="chapter_module_id" value="42518">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
