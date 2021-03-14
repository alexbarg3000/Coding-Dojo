<div class="module_description active_lesson_with_video ">
									
            
<h1 class="text-center">Predict Destructuring</h1>
<p>For the following five blocks of code, predict the output.
If a line of code will throw an error, state the error.</p>
<p>Problem 1</p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">const</span> cars <span class="keyword operator from-rainbow">=</span> [<span class="string from-rainbow">'Tesla'</span>, <span class="string from-rainbow">'Mercedes'</span>, <span class="string from-rainbow">'Honda'</span>]
<span class="keyword from-rainbow">const</span> [ randomCar ] <span class="keyword operator from-rainbow">=</span> cars
<span class="keyword from-rainbow">const</span> [ ,otherRandomCar ] <span class="keyword operator from-rainbow">=</span> cars
<span class="comment from-rainbow">//Predict the output</span>
console.<span class="support method from-rainbow">log</span>(randomCar)
console.<span class="support method from-rainbow">log</span>(otherRandomCar)
</pre>
<p>Problem 2</p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">const</span> employee <span class="keyword operator from-rainbow">=</span> {
    name: <span class="string from-rainbow">'Elon'</span>,
    age: <span class="constant numeric from-rainbow">47</span>,
    company: <span class="string from-rainbow">'Tesla'</span>
}
<span class="keyword from-rainbow">const</span> { name: otherName } <span class="keyword operator from-rainbow">=</span> employee;
<span class="comment from-rainbow">//Predict the output</span>
console.<span class="support method from-rainbow">log</span>(name);
console.<span class="support method from-rainbow">log</span>(otherName);
</pre>
<p>Problem 3</p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">const</span> person <span class="keyword operator from-rainbow">=</span> {
    name: <span class="string from-rainbow">'Phil Smith'</span>,
    age: <span class="constant numeric from-rainbow">47</span>,
    height: <span class="string from-rainbow">'6 feet'</span>
}
<span class="keyword from-rainbow">const</span> password <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'12345'</span>;
<span class="keyword from-rainbow">const</span> { password: hashedPassword } <span class="keyword operator from-rainbow">=</span> person;  
<span class="comment from-rainbow">//Predict the output</span>
console.<span class="support method from-rainbow">log</span>(password);
console.<span class="support method from-rainbow">log</span>(hashedPassword);
</pre>
<p>Problem 4</p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">const</span> numbers <span class="keyword operator from-rainbow">=</span> [<span class="constant numeric from-rainbow">8</span>, <span class="constant numeric from-rainbow">2</span>, <span class="constant numeric from-rainbow">3</span>, <span class="constant numeric from-rainbow">5</span>, <span class="constant numeric from-rainbow">6</span>, <span class="constant numeric from-rainbow">1</span>, <span class="constant numeric from-rainbow">67</span>, <span class="constant numeric from-rainbow">12</span>, <span class="constant numeric from-rainbow">2</span>];
<span class="keyword from-rainbow">const</span> [,first] <span class="keyword operator from-rainbow">=</span> numbers;
<span class="keyword from-rainbow">const</span> [,,,second] <span class="keyword operator from-rainbow">=</span> numbers;
<span class="keyword from-rainbow">const</span> [,,,,,,,,third] <span class="keyword operator from-rainbow">=</span> numbers;
<span class="comment from-rainbow">//Predict the output</span>
console.<span class="support method from-rainbow">log</span>(first <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span> second);
console.<span class="support method from-rainbow">log</span>(first <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span> third);
</pre>
<p>Problem 5</p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">const</span> lastTest <span class="keyword operator from-rainbow">=</span> {
    key: <span class="string from-rainbow">'value'</span>,
    secondKey: [<span class="constant numeric from-rainbow">1</span>, <span class="constant numeric from-rainbow">5</span>, <span class="constant numeric from-rainbow">1</span>, <span class="constant numeric from-rainbow">8</span>, <span class="constant numeric from-rainbow">3</span>, <span class="constant numeric from-rainbow">3</span>]
}
<span class="keyword from-rainbow">const</span> { key } <span class="keyword operator from-rainbow">=</span> lastTest;
<span class="keyword from-rainbow">const</span> { secondKey } <span class="keyword operator from-rainbow">=</span> lastTest;
<span class="keyword from-rainbow">const</span> [ ,willThisWork] <span class="keyword operator from-rainbow">=</span> secondKey;
<span class="comment from-rainbow">//Predict the output</span>
console.<span class="support method from-rainbow">log</span>(key);
console.<span class="support method from-rainbow">log</span>(secondKey);
console.<span class="support method from-rainbow">log</span>(secondKey[<span class="constant numeric from-rainbow">0</span>]);
console.<span class="support method from-rainbow">log</span>(willThisWork);
</pre>
<p></p>
        
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
															<p>Predict the Output for Problem 1</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Predict the Output for Problem 2</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Predict the Output for Problem 3</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Predict the Output for Problem 4</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Predict the Output for Problem 5</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5296391">
												<input type="hidden" name="chapter_module_id" value="45710">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
