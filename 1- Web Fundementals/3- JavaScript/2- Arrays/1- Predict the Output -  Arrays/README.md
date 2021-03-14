<div class="module_description active_lesson_with_video ">
									
            
            
 <h1>Predict the Output: Arrays</h1>
<p>Practice using a T-diagram to go through the following code snippets and predict the output.&nbsp; Once you're done run your code and see if your prediction was correct.&nbsp; Create a .js file with the code snippets and your predicted output and upload it once you're done.</p><p>Predict 1:&nbsp;</p>
<pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">var</span> arr <span class="keyword operator from-rainbow">=</span> [<span class="constant numeric from-rainbow">8</span>,<span class="constant numeric from-rainbow">6</span>,<span class="constant numeric from-rainbow">7</span>,<span class="constant numeric from-rainbow">5</span>,<span class="constant numeric from-rainbow">3</span>,<span class="constant numeric from-rainbow">0</span>,<span class="constant numeric from-rainbow">9</span>]
<span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>; i <span class="keyword operator from-rainbow">&lt;</span> arr.<span class="support property from-rainbow">length</span>; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){    
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(arr[i]);
}</pre>
<p>Predict 2:</p>
<pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">var</span> arr <span class="keyword operator from-rainbow">=</span> [<span class="constant numeric from-rainbow">7</span>,<span class="constant numeric from-rainbow">3</span>,<span class="constant numeric from-rainbow">8</span>,<span class="constant numeric from-rainbow">4</span>,<span class="constant numeric from-rainbow">2</span>,<span class="constant numeric from-rainbow">0</span>,<span class="constant numeric from-rainbow">1</span>];
<span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>; i <span class="keyword operator from-rainbow">&lt;</span> arr.<span class="support property from-rainbow">length</span>; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){ 
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">if</span>(arr[i] % <span class="constant numeric from-rainbow">2</span> <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>){
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(arr[i]);
&nbsp;&nbsp;&nbsp;&nbsp;} 
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">else</span>{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(<span class="string from-rainbow">"That is odd!"</span>);
&nbsp;&nbsp;&nbsp;&nbsp;}
}</pre>
<p>Predict 3:</p>
<pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">var</span> arr <span class="keyword operator from-rainbow">=</span> [<span class="constant numeric from-rainbow">1</span>,<span class="constant numeric from-rainbow">3</span>,<span class="constant numeric from-rainbow">8</span>,<span class="keyword operator from-rainbow">-</span><span class="constant numeric from-rainbow">5</span>,<span class="constant numeric from-rainbow">0</span>,<span class="keyword operator from-rainbow">-</span><span class="constant numeric from-rainbow">2</span>,<span class="constant numeric from-rainbow">4</span>,<span class="keyword operator from-rainbow">-</span><span class="constant numeric from-rainbow">1</span>];
<span class="keyword from-rainbow">var</span> newArr <span class="keyword operator from-rainbow">=</span> [];
<span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>; i<span class="keyword operator from-rainbow">&lt;</span> arr.<span class="support property from-rainbow">length</span>; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">if</span>(arr[i] <span class="keyword operator from-rainbow">&lt;</span> <span class="constant numeric from-rainbow">0</span>){
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;newArr.<span class="support method from-rainbow">push</span>(arr[i]);
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;arr[i] <span class="keyword operator from-rainbow">=</span> arr[i] <span class="keyword operator from-rainbow">*</span> <span class="keyword operator from-rainbow">-</span><span class="constant numeric from-rainbow">1</span>;
&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">else</span> <span class="keyword from-rainbow">if</span>(arr[i] <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">0</span>){
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;arr[i] <span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"Zero"</span>;
&nbsp;&nbsp;&nbsp;&nbsp;}
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">else</span>{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;arr[i] <span class="keyword operator from-rainbow">=</span> arr[i] <span class="keyword operator from-rainbow">*</span> <span class="keyword operator from-rainbow">-</span><span class="constant numeric from-rainbow">1</span>;
&nbsp;&nbsp;&nbsp;&nbsp;}
}
console.<span class="support method from-rainbow">log</span>(arr);
console.<span class="support method from-rainbow">log</span>(newArr);</pre>
        
        
        
</div>
