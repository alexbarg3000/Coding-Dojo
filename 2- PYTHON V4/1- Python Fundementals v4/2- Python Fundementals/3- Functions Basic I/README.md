<div class="module_description active_lesson_with_video ">
									
            
            
<h1>Assignment: Functions Basic I</h1>
<h2>Objectives:</h2>
<ul>
    <li>Avoid common mistakes of using functions</li>
    <li>Really understand how to use T-diagram to correctly predict and debug codes</li>
</ul>
<hr>
<h2>Intro </h2>
<p>For each of the following code snippets, first predict the output (what you will see printed to the terminal). Once you've made a prediction, run the code snippet to see if you are correct!</p>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#1</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">5</span>
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>())
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#2</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">5</span>
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>()<span class="keyword operator from-rainbow">+</span><span class="function call from-rainbow">a</span>())
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#3</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">5</span>
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">10</span>
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>())
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#4</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">5</span>
    <span class="support function python from-rainbow">print</span>(<span class="constant numeric from-rainbow">10</span>)
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>())<span class="keyword operator from-rainbow">&lt;</span>div id<span class="keyword operator from-rainbow">=</span><span class="string from-rainbow">"copy-toolbar-container"</span> style<span class="keyword operator from-rainbow">=</span><span class="string from-rainbow">"cursor: pointer; position: absolute; top: 5px; right: 5px; padding: 0px 3px; background: rgba(224, 224, 224, 0.2); box-shadow: rgba(0, 0, 0, 0.2) 0px 2px 0px 0px; color: rgb(187, 187, 187); border-radius: 0.5em; font-size: 0.8em;"</span><span class="keyword operator from-rainbow">&gt;</span><span class="keyword operator from-rainbow">&lt;</span>span id<span class="keyword operator from-rainbow">=</span><span class="string from-rainbow">"copy-toolbar"</span><span class="keyword operator from-rainbow">&gt;</span>copy<span class="keyword operator from-rainbow">&lt;</span>/span<span class="keyword operator from-rainbow">&gt;</span><span class="keyword operator from-rainbow">&lt;</span>/div<span class="keyword operator from-rainbow">&gt;</span></pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#5</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    <span class="support function python from-rainbow">print</span>(<span class="constant numeric from-rainbow">5</span>)
x <span class="keyword operator from-rainbow">=</span> <span class="function call from-rainbow">a</span>()
<span class="support function python from-rainbow">print</span>(x)
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#6</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>(b,c):
    <span class="support function python from-rainbow">print</span>(b<span class="keyword operator from-rainbow">+</span>c)
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">1</span>,<span class="constant numeric from-rainbow">2</span>) <span class="keyword operator from-rainbow">+</span> <span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">2</span>,<span class="constant numeric from-rainbow">3</span>))
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#7</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>(b,c):
    <span class="keyword from-rainbow">return</span> <span class="support function python from-rainbow">str</span>(b)<span class="keyword operator from-rainbow">+</span><span class="support function python from-rainbow">str</span>(c)
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">2</span>,<span class="constant numeric from-rainbow">5</span>))
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#8</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    b <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">100</span>
    <span class="support function python from-rainbow">print</span>(b)
    <span class="keyword from-rainbow">if</span> b <span class="keyword operator from-rainbow">&lt;</span> <span class="constant numeric from-rainbow">10</span>:
        <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">5</span>
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">else</span>:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">10</span>
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">7</span>
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>())
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#9</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>(b,c):
    <span class="keyword from-rainbow">if</span> b<span class="keyword operator from-rainbow">&lt;</span>c:
        <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">7</span>
    <span class="keyword from-rainbow">else</span>:
        <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">14</span>
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">3</span>
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">2</span>,<span class="constant numeric from-rainbow">3</span>))
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">5</span>,<span class="constant numeric from-rainbow">3</span>))
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">2</span>,<span class="constant numeric from-rainbow">3</span>) <span class="keyword operator from-rainbow">+</span> <span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">5</span>,<span class="constant numeric from-rainbow">3</span>))
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#10</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>(b,c):
    <span class="keyword from-rainbow">return</span> b<span class="keyword operator from-rainbow">+</span>c
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">10</span>
<span class="support function python from-rainbow">print</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">3</span>,<span class="constant numeric from-rainbow">5</span>))
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#11</span>
b <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">500</span>
<span class="support function python from-rainbow">print</span>(b)
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    b <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">300</span>
    <span class="support function python from-rainbow">print</span>(b)
<span class="support function python from-rainbow">print</span>(b)
<span class="function call from-rainbow">a</span>()
<span class="support function python from-rainbow">print</span>(b)
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#12</span>
b <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">500</span>
<span class="support function python from-rainbow">print</span>(b)
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    b <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">300</span>
    <span class="support function python from-rainbow">print</span>(b)
    <span class="keyword from-rainbow">return</span> b
<span class="support function python from-rainbow">print</span>(b)
<span class="function call from-rainbow">a</span>()
<span class="support function python from-rainbow">print</span>(b)
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#13</span>
b <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">500</span>
<span class="support function python from-rainbow">print</span>(b)
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    b <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">300</span>
    <span class="support function python from-rainbow">print</span>(b)
    <span class="keyword from-rainbow">return</span> b
<span class="support function python from-rainbow">print</span>(b)
b<span class="keyword operator from-rainbow">=</span><span class="function call from-rainbow">a</span>()
<span class="support function python from-rainbow">print</span>(b)
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#14</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    <span class="support function python from-rainbow">print</span>(<span class="constant numeric from-rainbow">1</span>)
    <span class="function call from-rainbow">b</span>()
    <span class="support function python from-rainbow">print</span>(<span class="constant numeric from-rainbow">2</span>)
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">b</span>():
    <span class="support function python from-rainbow">print</span>(<span class="constant numeric from-rainbow">3</span>)
<span class="function call from-rainbow">a</span>()
</pre>
<pre class="rainbow" data-language="python"><span class="comment from-rainbow">#15</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">a</span>():
    <span class="support function python from-rainbow">print</span>(<span class="constant numeric from-rainbow">1</span>)
    x <span class="keyword operator from-rainbow">=</span> <span class="function call from-rainbow">b</span>()
    <span class="support function python from-rainbow">print</span>(x)
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">10</span>
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">b</span>():
    <span class="support function python from-rainbow">print</span>(<span class="constant numeric from-rainbow">3</span>)
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">5</span>
y <span class="keyword operator from-rainbow">=</span> <span class="function call from-rainbow">a</span>()
<span class="support function python from-rainbow">print</span>(y)
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
															<p>Create a text file, or copy the code snippets into a Python file</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Predict the output for each of the 15 snippets, checking and comparing your predictions after each snippet</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Submit the text file or Python file with your predictions</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5046931">
												<input type="hidden" name="chapter_module_id" value="42514">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
