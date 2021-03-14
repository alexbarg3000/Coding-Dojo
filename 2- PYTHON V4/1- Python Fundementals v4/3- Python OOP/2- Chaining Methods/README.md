<div class="module_description active_lesson_with_video ">
									
            
            
            
<h1>Chaining Methods</h1>
<h2>Objectives:</h2>
<ul>
    <li>Understand how to chain methods</li>
</ul>
<hr>
<p>In the last assignment, your code might have looked something like this:</p>
<pre data-language="python" class="rainbow">guido.<span class="function call from-rainbow">make_deposit</span>(<span class="constant numeric from-rainbow">100</span>)
guido.<span class="function call from-rainbow">make_deposit</span>(<span class="constant numeric from-rainbow">200</span>)
guido.<span class="function call from-rainbow">make_deposit</span>(<span class="constant numeric from-rainbow">300</span>)
guido.<span class="function call from-rainbow">make_withdrawal</span>(<span class="constant numeric from-rainbow">50</span>)
guido.<span class="function call from-rainbow">display_user_balance</span>()
</pre>
<p>This takes up a lot of space and we're repeating our call to <em>guido</em> many times. There is a way to call on <em>guido</em> just once and keep attaching new method calls to the end of the previous one, like so:</p>
<pre data-language="python" class="rainbow">guido.<span class="function call from-rainbow">make_deposit</span>(<span class="constant numeric from-rainbow">100</span>).<span class="function call from-rainbow">make_deposit</span>(<span class="constant numeric from-rainbow">200</span>).<span class="function call from-rainbow">make_deposit</span>(<span class="constant numeric from-rainbow">300</span>).<span class="function call from-rainbow">make_withdrawal</span>(<span class="constant numeric from-rainbow">50</span>).<span class="function call from-rainbow">display_user_balance</span>()
</pre>
<p>This is called <strong>chaining</strong>. In order for this to work, each method must return <em>self</em>. By returning self, if we recall how functions work, each method call will now be equal to the instance that called it.</p>
<p>For example if <code>guido.make_deposit(100)</code> returns its own instance (<em>guido</em>), then we can call one of that instance's methods after that call, like <code>guido.make_deposit(100).make_withdrawal(50)</code>.</p>
<pre data-language="python" class="rainbow"><span class="keyword from-rainbow">class</span> User:
    <span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">make_deposit</span>(<span class="variable self from-rainbow">self</span>, amount):
        <span class="comment from-rainbow"># your code goes here...</span>
        <span class="keyword from-rainbow">return</span> <span class="variable self from-rainbow">self</span>
</pre>
<p>The practice of having OOP return its own instance is pretty common and is done in other programming languages, though the variable name in some languages is not <code>self</code>, but instead&nbsp;<code>this</code>.</p>
        
        
        
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
															<p>Update your previous assignment so that each instance's methods are chained</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5063805">
												<input type="hidden" name="chapter_module_id" value="42536">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
