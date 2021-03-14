<div class="module_description active_lesson_with_video ">
									
            
 <h1>Assignment: BankAccount</h1>
<h2>Objectives</h2>
<ul>
    <li>Practice writing classes</li>
</ul>
<hr>
<p>As we continue thinking about our banking application, we realize that it would be more accurate to assign a balance not to the user directly, but that in the real world, users have <em>accounts</em>, and <em>accounts</em> have balances. This gives us the idea that maybe an account <em>is its own class</em>! But as we stated, it is not completely independent of a class; accounts only exist because users open them.</p>
<p><em>For this assignment, don't worry about putting any user information in the BankAccount class. We'll take care of that in the next lesson!</em></p>
<p>Let's first just get some more practice writing classes by writing a new <em>BankAccount</em> class.</p>
<p>The BankAccount class should have a balance. When a new BankAccount instance is created, if an amount is given, the balance of the account should initially be set to that amount; otherwise, the balance should start at $0. The account should also have an interest rate, saved as a decimal (i.e. 1% would be saved as 0.01), which should be provided upon instantiation. (Hint: when using default values in parameters, the order of parameters matters!)</p>
<p>The class should also have the following methods:</p>
<ul>
    <li><strong>deposit(self, amount)</strong> - increases the account balance by the given amount</li>
    <li><strong>withdraw(self, amount)</strong> - decreases the account balance by the given amount if there are sufficient funds; if there is not enough money, print a message "Insufficient funds: Charging a $5 fee" and deduct $5</li>
    <li><strong>display_account_info(self)</strong> - print to the console: eg. "Balance: $100"</li>
    <li><strong>yield_interest(self)</strong> - increases the account balance by the current balance * the interest rate (as long as the balance is positive)</li>
</ul>
<p>This means we&nbsp;need a class that looks something like this:</p>
<pre data-language="python" class="rainbow"><span class="keyword from-rainbow">class</span> BankAccount:
	<span class="storage function from-rainbow">def</span> <span class="support magic from-rainbow">__init__</span>(<span class="variable self from-rainbow">self</span>, int_rate, balance): <span class="comment from-rainbow"># don't forget to add some default values for these parameters!</span>
		<span class="comment from-rainbow"># your code here! (remember, this is where we specify the attributes for our class)</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment from-rainbow"># don't worry about user info here; we'll involve the User class soon</span>
	<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">deposit</span>(<span class="variable self from-rainbow">self</span>, amount):
		<span class="comment from-rainbow"># your code here</span>
	<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">withdraw</span>(<span class="variable self from-rainbow">self</span>, amount):
		<span class="comment from-rainbow"># your code here</span>
	<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">display_account_info</span>(<span class="variable self from-rainbow">self</span>):
		<span class="comment from-rainbow"># your code here</span>
	<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">yield_interest</span>(<span class="variable self from-rainbow">self</span>):
		<span class="comment from-rainbow"># your code here</span></pre>
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
															<p>Create a BankAccount class with the attributes interest rate and balance</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Add a deposit method to the BankAccount class</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Add a withdraw method to the BankAccount class</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Add a display_account_info method to the BankAccount class</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Add a yield_interest method to the BankAccount class</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create 2 accounts</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="1" class="todo_status">	
														<input type="checkbox" id="todo_item_6" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>To the first account, make 3 deposits and 1 withdrawal, then yield interest and display the account's info all in one line of code (i.e. chaining)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="1" class="todo_status">	
														<input type="checkbox" id="todo_item_7" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>To the second account, make 2 deposits and 4 withdrawals, then yield interest and display the account's info all in one line of code (i.e. chaining)</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5063930">
												<input type="hidden" name="chapter_module_id" value="42537">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
