<div class="module_description active_lesson_with_video ">
									<p> <br> <br> </p>
<h1 class="text-center">Assignment: JavaScript Hoisting</h1>
<h2>Objectives:</h2>
<ol><li>Practice reading JavaScript the same way as the interpreter reads it.</li></ol>
<hr>
<p>Rewrite the code the way it would be seen by the interpreter and predict the output. An example is shown here:</p>
<pre data-language="javascript" class="rainbow"><span class="comment from-rainbow">// GIVEN</span>
console.<span class="support method from-rainbow">log</span>(example);
<span class="keyword from-rainbow">var</span> example <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"I'm the example!"</span>;
AFTER HOISTING BY THE INTERPRETER
<span class="comment from-rainbow">// var example;</span>
<span class="comment from-rainbow">// console.log(example); // logs undefined</span>
<span class="comment from-rainbow">// example = "I'm the example!";</span>
</pre>
<h3><p>After you've made your prediction, run the original code to find out if you were right! If your predictions were incorrect, look back at how the code is hoisted by the interpreter.</p>Note</h3>
<div>
<p>Run the same code as above with ES6 syntax and compare your results:</p>
    <pre data-language="javascript" class="rainbow">console.<span class="support method from-rainbow">log</span>(example);
let example <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"I'm the example!"</span>;    </pre>
<p>Even if <code>let</code> and <code>const</code> prevent a lot of the confusing behavior of JavaScript's hoisting, these are ES6 constructs and a huge amount of the&nbsp;world's live JavaScript code is still ES5. Understanding how ES5 hoists <code>var</code> and the rules of scoping are important for every JavaScript developer!</p>
<h3>1</h3>
<pre class="rainbow" data-language="javascript">console.<span class="support method from-rainbow">log</span>(hello);                                   
<span class="keyword from-rainbow">var</span> hello <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'world'</span>;                                 
</pre>
<h3>2</h3><pre class="rainbow active_pre" data-language="javascript"><span class="keyword from-rainbow">var</span> needle <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'haystack'</span>;
<span class="function call from-rainbow">test</span>();
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">test</span>(){
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">var</span> needle <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'magnet'</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(needle);
}
</pre>
<h3>3</h3>
<pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">var</span> brendan <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'super cool'</span>;
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">print</span>(){
&nbsp;&nbsp;&nbsp;&nbsp;brendan <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'only okay'</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(brendan);
}
console.<span class="support method from-rainbow">log</span>(brendan);
</pre>
<h3>4</h3>
<pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">var</span> food <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'chicken'</span>;
console.<span class="support method from-rainbow">log</span>(food);
<span class="function call from-rainbow">eat</span>();
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">eat</span>(){
&nbsp;&nbsp;&nbsp;&nbsp;food <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'half-chicken'</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(food);
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">var</span> food <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">'gone'</span>;
}
</pre>
<h3>5</h3>
<pre class="rainbow" data-language="javascript"><span class="function call from-rainbow">mean</span>();
console.<span class="support method from-rainbow">log</span>(food);
<span class="keyword from-rainbow">var</span> mean <span class="keyword operator from-rainbow">=</span> <span class="keyword from-rainbow">function</span>() {
&nbsp;&nbsp;&nbsp;&nbsp;food <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"chicken"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(food);
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">var</span> food <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"fish"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(food);
}
console.<span class="support method from-rainbow">log</span>(food);
</pre>
<h3>6</h3>
<pre class="rainbow" data-language="javascript">console.<span class="support method from-rainbow">log</span>(genre);
<span class="keyword from-rainbow">var</span> genre <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"disco"</span>;
<span class="function call from-rainbow">rewind</span>();
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow active_pre">rewind</span>() {
&nbsp;&nbsp;&nbsp;&nbsp;genre <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"rock"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(genre);
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">var</span> genre <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"r&amp;b"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(genre);
}
console.<span class="support method from-rainbow">log</span>(genre);
</pre>
<h3>7</h3>
<pre class="rainbow" data-language="javascript">dojo <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"san jose"</span>;
console.<span class="support method from-rainbow">log</span>(dojo);
<span class="function call from-rainbow">learn</span>();
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">learn</span>() {
&nbsp;&nbsp;&nbsp;&nbsp;dojo <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"seattle"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(dojo);
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">var</span> dojo <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"burbank"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(dojo);
}
console.<span class="support method from-rainbow">log</span>(dojo);</pre>
<h2>8 - Bonus ES6: const</h2>
    <pre class="rainbow" data-language="javascript">console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">makeDojo</span>(<span class="string from-rainbow">"Chicago"</span>, <span class="constant numeric from-rainbow">65</span>));
console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">makeDojo</span>(<span class="string from-rainbow">"Berkeley"</span>, <span class="constant numeric from-rainbow">0</span>));
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">makeDojo</span>(name, students){
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">const</span> dojo <span class="keyword operator from-rainbow">=</span> {};
&nbsp;&nbsp;&nbsp;&nbsp;dojo.name <span class="keyword operator from-rainbow">=</span> name;
&nbsp;&nbsp;&nbsp;&nbsp;dojo.students <span class="keyword operator from-rainbow">=</span> students;
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">if</span>(dojo.students <span class="keyword operator from-rainbow">&gt;</span> <span class="constant numeric from-rainbow">50</span>){
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dojo.hiring <span class="keyword operator from-rainbow">=</span> <span class="constant language from-rainbow">true</span>;
&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">else</span> <span class="keyword from-rainbow">if</span>(dojo.students <span class="keyword operator from-rainbow">&lt;</span><span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>){
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dojo <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"closed for now"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">return</span> dojo;
}</pre>
<p></p>
</div>
<p> <br> <br> <br></p>
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
															<p>Rewrite the given code as it is seen by the interpreter</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Predict the outputs</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the original code and compare the outputs to your predictions</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5294688">
												<input type="hidden" name="chapter_module_id" value="45696">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
