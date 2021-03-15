<div class="module_description active_lesson_with_video ">
									
            
            
<h1 class="text-center">Navbar Context (Optional)</h1>
<p>
Create a React project that has a navbar with a message that says the user's name ("Hi, *some_name_here*!"). 
In the body of the page, have an input where the user can dynamically change the name in the navbar.
You will need to create the following components:
</p>
<ul><li>Form.js: This component should actually hold the input field.</li><li>FormWrapper.js: This component should only wrap the Form Component as its child. This is to illustrate that you can use nested components with context without passing down props.</li><li>Navbar.js:&nbsp;This component should be your navbar which contains the greeting.</li><li>Wrapper.js: This component should wrap the Navbar and the FormWrapper components (and will access useState).</li></ul>
<p>You will also need to create the context object.</p>
<p>Your App.js function should look something like this (note that Navbar and FormWrapper don't take in any props):&nbsp;</p>
<p>
</p>
<pre data-language="javascript" class="rainbow"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">App</span>() {
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">return</span> (
&nbsp;&nbsp;&nbsp;&nbsp;    <span class="keyword operator from-rainbow">&lt;</span>Wrapper<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>Navbar/<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>FormWrapper/<span class="keyword operator from-rainbow">&gt;</span>
    &nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>/Wrapper<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;);
}    </pre>
<figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/NavBar_Context_Assignment.png"></figure><p><br></p>
        
        
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
															<p>Create the Form Component</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create the FormWrapper Component</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create your Navbar Component</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create the Wrapper Component</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create the context object</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5321985">
												<input type="hidden" name="chapter_module_id" value="45693">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
