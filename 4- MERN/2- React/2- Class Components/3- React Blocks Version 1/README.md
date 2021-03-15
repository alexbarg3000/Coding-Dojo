<div class="module_description active_lesson_with_video ">
									
            
<p></p>
<h1>Plotting Our React Blocks (Optional)</h1>
<p></p>
<p>Using what we've learned about styles, let's recreate the famous "Plotting your Blocks" assignment from Web Fundamentals this time using React Components.</p>
<p><br></p>
<figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/reactive-blocks-1.png" style="width: 895px; height: 515px;" width="895" height="515"></figure>
<p></p>
<p>We can consider writing something like this where <code>Header</code>, <code>Navigation</code>, <code>Main</code>, <code>SubContents</code>, and <code>Advertisement</code> are all components we will need to import into the <code>App.js</code>&nbsp;and the <code>Main</code> component can display <code>{props.children}</code>.</p>
<p><br></p>
<pre class="rainbow" data-language="javascript"><span class="keyword from-rainbow">import</span> React from <span class="string from-rainbow">'react'</span>;
<span class="keyword from-rainbow">import</span> <span class="string from-rainbow">'./App.css'</span>;
<span class="keyword from-rainbow">import</span> Header from <span class="string from-rainbow">'./Components/Header'</span>;
<span class="keyword from-rainbow">import</span> Navigation from <span class="string from-rainbow">'./Components/Navigation'</span>;
<span class="keyword from-rainbow">import</span> Main from <span class="string from-rainbow">'./Components/Main'</span>;
<span class="keyword from-rainbow">import</span> SubContents from <span class="string from-rainbow">'./Components/SubContents'</span>;
<span class="keyword from-rainbow">import</span> Advertisement from <span class="string from-rainbow">'./Components/Advertisement'</span>;
 
                
<span class="storage function from-rainbow">function</span> <span class="entity name function from-rainbow">App</span>() {
  <span class="keyword from-rainbow">return</span> (
    <span class="keyword operator from-rainbow">&lt;</span>div className<span class="keyword operator from-rainbow">=</span><span class="string from-rainbow">"app"</span><span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>Header /<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>Navigation /<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>Main<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>SubContents /<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>SubContents /<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>SubContents /<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>Advertisement /<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>/Main<span class="keyword operator from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword operator from-rainbow">&lt;</span>/div<span class="keyword operator from-rainbow">&gt;</span>
  );
}
                
export default App;
</pre>
        
        
        
</div>
