<div class="module_description active_lesson_with_video ">
									
            
<h1>Predict the Output</h1>
<p>Practice using a T-diagram to go through the following code snippets and predict the output.&nbsp; Once you're done run your code and see if your prediction was correct.&nbsp; Create a .js file with the code snippets and your predicted output and upload it once you're done.</p>
<p><strong>Predict 1:</strong></p>
<pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">greeting</span>(){
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">return</span> <span class="string from-rainbow">"Hello"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(<span class="string from-rainbow">"World"</span>);
}
<span class="keyword from-rainbow">var</span> word <span class="keyword operator from-rainbow">=</span> <span class="function call from-rainbow">greeting</span>();
console.<span class="support method from-rainbow">log</span>(word);</pre>
<p><br></p>
<p><strong>Predict 2:&nbsp;</strong></p>
<pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">add</span>(num1, num2){
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(<span class="string from-rainbow">"Summing Numbers!"</span>);
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(<span class="string from-rainbow">"num1 is: "</span> <span class="keyword operator from-rainbow">+</span> num1);
    console.<span class="support method from-rainbow">log</span>(<span class="string from-rainbow">"num2 is: "</span> <span class="keyword operator from-rainbow">+</span> num2);
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">var</span> sum <span class="keyword operator from-rainbow">=</span> num1 <span class="keyword operator from-rainbow">+</span> num2;
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">return</span> sum;
}
<span class="keyword from-rainbow">var</span> result1 <span class="keyword operator from-rainbow">=</span> <span class="function call from-rainbow">add</span>(<span class="constant numeric from-rainbow">3</span>,<span class="constant numeric from-rainbow">5</span>);
<span class="keyword from-rainbow">var</span> result2 <span class="keyword operator from-rainbow">=</span> <span class="function call from-rainbow">add</span>(<span class="constant numeric from-rainbow">4</span>,<span class="constant numeric from-rainbow">7</span>);
console.<span class="support method from-rainbow">log</span>(result1);
console.<span class="support method from-rainbow">log</span>(result2);</pre>
<p></p>
<p><strong>Predict 3:&nbsp;</strong></p>
<pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">highFive</span>(num){
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">0</span>; i<span class="keyword operator from-rainbow">&lt;</span>num; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">if</span>(i <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">5</span>){
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(<span class="string from-rainbow">"High Five!"</span>);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">else</span>{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(i);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;}
}</pre>
        
</div>
