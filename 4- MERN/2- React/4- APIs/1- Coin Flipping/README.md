<div class="module_description active_lesson_with_video ">
									<h1>Coin Flipping</h1>
<p></p>
<p>Let's say we have a function that simulates flipping a coin...</p>
<p><br></p>
<pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">tossCoin</span>() {
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">return</span> Math.<span class="function call from-rainbow">random</span>() <span class="keyword operator from-rainbow">&gt;</span> <span class="constant numeric from-rainbow">0.5</span> ? <span class="string from-rainbow">"heads"</span> : <span class="string from-rainbow">"tails"</span>;
}</pre>
<p><br></p>
<p>And we want to use it in a function that sees how long it will take to have a coin land on "heads" five times in a row.</p>
<p><br></p>
<pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">fiveHeadsSync</span>() {
&nbsp;&nbsp;&nbsp;&nbsp;let headsCount <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>;
&nbsp;&nbsp;&nbsp;&nbsp;let attempts <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>;
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">while</span>(headsCount <span class="keyword operator from-rainbow">&lt;</span> <span class="constant numeric from-rainbow">5</span>) {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;attempts<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;let result <span class="keyword operator from-rainbow">=</span> <span class="function call from-rainbow">tossCoin</span>();
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(`${result} was flipped`);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">if</span>(result <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"heads"</span>)&nbsp;{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;headsCount<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;} <span class="keyword from-rainbow">else</span> {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;headsCount <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">return</span> `It took ${attempts} tries to flip five <span class="string from-rainbow">"heads"</span>`;
}
console.<span class="support method from-rainbow">log</span>( <span class="function call from-rainbow">fiveHeadsSync</span>() );
console.<span class="support method from-rainbow">log</span>( <span class="string from-rainbow">"This is run after the fiveHeadsSync function completes"</span> );</pre>
<p><br></p>
<p>This will take an indeterminate amount of time. If we run the synchronous function above, it will prevent any code that comes after from running while this is taking place.</p>
<p><br></p>
<p>Your mission is to rewrite the above function using Promises. Make sure your <code>fiveHeads</code>&nbsp;function will call the resolve function when the coin has flipped "heads" five times in a row.</p>
<p><br></p>
<pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">fiveHeads</span>() {
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">return</span> <span class="keyword from-rainbow">new</span> <span class="entity function from-rainbow">Promise( </span>(resolve, reject) <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">&gt;</span> {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment from-rainbow">// your code here!</span>
&nbsp;&nbsp;&nbsp;&nbsp;});
}
<span class="function call from-rainbow">fiveHeads</span>()
&nbsp;&nbsp;&nbsp;&nbsp;.<span class="keyword from-rainbow">then</span>( res <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">&gt;</span> console.<span class="support method from-rainbow">log</span>(res) )
&nbsp;&nbsp;&nbsp;&nbsp;.<span class="keyword from-rainbow">catch</span>( err <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">&gt;</span> console.<span class="support method from-rainbow">log</span>(err) );
console.<span class="support method from-rainbow">log</span>( <span class="string from-rainbow">"When does this run now?"</span> );</pre>
<p> <br> </p>
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
															<p>Complete the fiveHeads function so that it will resolve() when "heads" has been flipped five times</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Make the fiveHeads function reject() when the coin has been flipped more than 100 times</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5322446">
												<input type="hidden" name="chapter_module_id" value="48591">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
