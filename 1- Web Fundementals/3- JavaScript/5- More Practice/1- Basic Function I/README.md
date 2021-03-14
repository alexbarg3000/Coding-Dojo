<div class="module_description active_lesson_with_video ">
									
            
            
            
            
 <h1>Basic Function I</h1>
<h2>Objectives</h2>
<ol><li>Understand how a computer executes each line of code</li><li>Get comfortable with how a function works and how its return statement works</li><li>Identify some common mistakes students make and learn how to avoid them</li></ol>
<hr>
<p>Predict the output of the following code snippets.&nbsp; Please do NOT run any of this code directly, but first predict the output using the T-diagram.&nbsp; If you're not used to using the T-diagram to run through the code yet, please get comfortable now.&nbsp; This will help you down the line.&nbsp; Once you've predicted the output for all of the codes, then run the code one by one and compare the two.</p><p>Please turn in a text file that includes your prediction for each problem and the actual output. At the top of the file, indicate how many out of 15 you predicted correctly.</p>
<pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(){
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">35</span>;
}
console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">a</span>())
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(){
    <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">4</span>;
}
console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">a</span>()<span class="keyword operator from-rainbow">+</span><span class="function call from-rainbow">a</span>());
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(b){
    <span class="keyword from-rainbow">return</span> b;
}
console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">2</span>)<span class="keyword operator from-rainbow">+</span><span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">4</span>));
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(b){
&nbsp;&nbsp;&nbsp;&nbsp;console.<span class="support method from-rainbow">log</span>(b);
    <span class="keyword from-rainbow">return</span> b<span class="keyword operator from-rainbow">*</span><span class="constant numeric from-rainbow">3</span>;
}
console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">3</span>));
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(b){
   <span class="keyword from-rainbow">return</span> b<span class="keyword operator from-rainbow">*</span><span class="constant numeric from-rainbow">4</span>;
   console.<span class="support method from-rainbow">log</span>(b);
}
console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">10</span>));
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(b){
    <span class="keyword from-rainbow">if</span>(b<span class="keyword operator from-rainbow">&lt;</span><span class="constant numeric from-rainbow">10</span>) {
        <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">2</span>;
    }
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword from-rainbow">else</span>     {
        <span class="keyword from-rainbow">return</span> <span class="constant numeric from-rainbow">4</span>;
    }
    console.<span class="support method from-rainbow">log</span>(b);
}
console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">15</span>));
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(b,c){
    <span class="keyword from-rainbow">return</span> b<span class="keyword operator from-rainbow">*</span>c;
}
console.<span class="support method from-rainbow">log</span>(<span class="constant numeric from-rainbow">10</span>,<span class="constant numeric from-rainbow">3</span>);
console.<span class="support method from-rainbow">log</span>( <span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">3</span>,<span class="constant numeric from-rainbow">10</span>) );
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(b){
    <span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">0</span>; i<span class="keyword operator from-rainbow">&lt;</span><span class="constant numeric from-rainbow">10</span>; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){
        console.<span class="support method from-rainbow">log</span>(i);
    }
    <span class="keyword from-rainbow">return</span> i;
}
console.<span class="support method from-rainbow">log</span>(<span class="constant numeric from-rainbow">3</span>);
console.<span class="support method from-rainbow">log</span>(<span class="constant numeric from-rainbow">4</span>);
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(){
    <span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">0</span>; i<span class="keyword operator from-rainbow">&lt;</span><span class="constant numeric from-rainbow">10</span>; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){
        i <span class="keyword operator from-rainbow">=</span> i <span class="keyword operator from-rainbow">+</span><span class="constant numeric from-rainbow">2</span>;
        console.<span class="support method from-rainbow">log</span>(i);
    }
}
<span class="function call from-rainbow">a</span>();
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(b,c){
    <span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i<span class="keyword operator from-rainbow">=</span>b; i<span class="keyword operator from-rainbow">&lt;</span>c; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>) {
       console.<span class="support method from-rainbow">log</span>(i);
   }
   <span class="keyword from-rainbow">return</span> b<span class="keyword operator from-rainbow">*</span>c;
}
<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">0</span>,<span class="constant numeric from-rainbow">10</span>);
console.<span class="support method from-rainbow">log</span>(<span class="function call from-rainbow">a</span>(<span class="constant numeric from-rainbow">0</span>,<span class="constant numeric from-rainbow">10</span>));
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(){
    <span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">0</span>; i<span class="keyword operator from-rainbow">&lt;</span><span class="constant numeric from-rainbow">10</span>; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){
       <span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> j<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">0</span>; j<span class="keyword operator from-rainbow">&lt;</span><span class="constant numeric from-rainbow">10</span>; j<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){
           console.<span class="support method from-rainbow">log</span>(j);
       }
       console.<span class="support method from-rainbow">log</span>(i);
    }
}
</pre> <pre class="rainbow" data-language="javascript"><span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(){
    <span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> i<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">0</span>; i<span class="keyword operator from-rainbow">&lt;</span><span class="constant numeric from-rainbow">10</span>; i<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){
        <span class="keyword from-rainbow">for</span>(<span class="keyword from-rainbow">var</span> j<span class="keyword operator from-rainbow">=</span><span class="constant numeric from-rainbow">0</span>; j<span class="keyword operator from-rainbow">&lt;</span><span class="constant numeric from-rainbow">10</span>; j<span class="keyword operator from-rainbow">+</span><span class="keyword operator from-rainbow">+</span>){
            console.<span class="support method from-rainbow">log</span>(i,j);
        }
        console.<span class="support method from-rainbow">log</span>(j,i);
    }
}
</pre> <pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">var</span> z <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">10</span>;
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(){
    <span class="keyword from-rainbow">var</span> z <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">15</span>;
    console.<span class="support method from-rainbow">log</span>(z);
}
console.<span class="support method from-rainbow">log</span>(z);
</pre> <pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">var</span> z <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">10</span>;
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(){
    <span class="keyword from-rainbow">var</span> z <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">15</span>;
    console.<span class="support method from-rainbow">log</span>(z);
}
<span class="function call from-rainbow">a</span>();
console.<span class="support method from-rainbow">log</span>(z);</pre> <pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">var</span> z <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">10</span>;
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">a</span>(){
    <span class="keyword from-rainbow">var</span> z <span class="keyword operator from-rainbow">=</span> <span class="constant numeric from-rainbow">15</span>;
    console.<span class="support method from-rainbow">log</span>(z);
    <span class="keyword from-rainbow">return</span> z;
}
z <span class="keyword operator from-rainbow">=</span> <span class="function call from-rainbow">a</span>();
console.<span class="support method from-rainbow">log</span>(z);</pre><p></p>
        
        
        
        
        
</div>
