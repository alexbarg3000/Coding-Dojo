<div class="module_description active_lesson_with_video ">
									<h1>Assignment: Users with Bank Accounts</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice writing classes with associations</li>
</ul>
<hr>
<p>Update your existing User class to have an association with the BankAccount class. You should not have to change anything in the BankAccount class. The method signatures of the User class (the first line of the method with the <code>def</code> keyword) should also remain the same.</p>
<p>For example, our User class currently has a method like this:</p>
<pre data-language="python" class="rainbow"><span class="keyword from-rainbow">class</span> User:
    <span class="comment from-rainbow"># other methods</span>
    <span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">make_deposit</span>(<span class="variable self from-rainbow">self</span>, amount):
    	<span class="variable self from-rainbow">self</span>.account_balance <span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">=</span> amount	<span class="comment from-rainbow"># hmmm...the User class doesn't have an account_balance attribute anymore</span>
</pre>
<p>But our User class no longer has a <code>self.account_balance</code> attribute. Instead, we have replaced this with an <em>instance</em> of a BankAccount by the name of <code>self.account</code>. That means our make_deposit (and other methods referencing self.account_balance) need to be updated! That's the goal of this assignment.</p>
<p>Remember in our User methods, we can now access the BankAccount class through our <code>self.account</code> attribute, like so:</p>
<pre data-language="Python" class="rainbow"><span class="keyword from-rainbow">class</span> User:
    <span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">example_method</span>(<span class="variable self from-rainbow">self</span>):
        <span class="variable self from-rainbow">self</span>.account.<span class="function call from-rainbow">deposit</span>(<span class="constant numeric from-rainbow">100</span>)		<span class="comment from-rainbow"># we can call the BankAccount instance's methods</span>
    	<span class="support function python from-rainbow">print</span>(<span class="variable self from-rainbow">self</span>.account.balance)		<span class="comment from-rainbow"># or access its attributes</span>
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
															<p>Update the User class __init__ method</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Update the User class make_deposit method</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">
																												<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Update the User class make_withdrawal method</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Update the User class display_user_balance method</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SENSEI BONUS: Allow a user to have multiple accounts; update methods so the user has to specify which account they are withdrawing or depositing to</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5066922">
												<input type="hidden" name="chapter_module_id" value="42539">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
