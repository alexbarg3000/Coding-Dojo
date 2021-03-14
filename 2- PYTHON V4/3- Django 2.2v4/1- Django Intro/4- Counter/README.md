<div class="module_description active_lesson_with_video ">
									
 <h1>Assignment: Counter</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice using session to store data about a particular client's history with the app</li>
    <li>Be able to check whether a session exists</li>
    <li>Be able to initialize a session</li>
    <li>Be able to modify a session</li>
</ul>
<hr>
<p>Build a Django application that counts the number of times the root route ('/') has been viewed.&nbsp;</p>
<p>This assignment is to test your understanding of session.</p>
<p>
 <img src="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_2982/handouts/chapter2982_3823_Screen-Shot-2015-08-18-at-2.34.59-PM.png" style="width: 379px;"></p>
<p>As part of this assignment, please start with the following features first:</p>
<ul>
    <li><strong>localhost:8000</strong> - have the template render the number of times the client has visited this site</li>
    <li><strong>localhost:8000/destroy_session</strong> - Clear the session. Once cleared, redirect to the root.</li>
</ul>
<h4>Some Helpful Tips</h4>
<p>We can't increment something that doesn't exist! Here's how to check if a key exists in session yet:</p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">if</span> <span class="string from-rainbow">'key_name'</span> in request.session:
    <span class="keyword from-rainbow">print</span>(<span class="string from-rainbow">'key exists!'</span>)
<span class="keyword from-rainbow">else</span>:
    <span class="keyword from-rainbow">print</span>(<span class="string from-rainbow">"key 'key_name' does NOT exist"</span>)
</pre>
<p>If we want to get rid of what is currently stored in session:</p>
<pre data-language="python" class="rainbow"><span class="keyword from-rainbow">del</span> request.session[<span class="string from-rainbow">'key_name'</span>]	<span class="comment from-rainbow"># clears a specific key</span></pre>
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
															<p>Create a new Django project called counter</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the root route render a template that displays the number of times the client has visited this site. Refresh the page several times to ensure the counter is working.</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Add a "/destroy_session" route that clears the session and redirects to the root route. Test it.</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Add a Reset button that uses the "/destroy_session" route</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Add a +2 button underneath the counter and a new route that will increment the counter by 2</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Add a form that allows the user to specify the increment of the counter and have the counter increment accordingly</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Adjust your code to display both how many times the user has actually visited the page, as well as the value of the counter, given the above functionality</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5103542">
												<input type="hidden" name="chapter_module_id" value="50612">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
