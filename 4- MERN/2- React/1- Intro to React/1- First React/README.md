<div class="module_description active_lesson_with_video ">
									
            
            
            
<h1 class="text-center">First React</h1>
<p>Let's start jumping right into React.
Since React is just a Javascript library, we can plug it right into our html.
First, go to a folder that you want to start creating your React project.
Next, within that folder, create an index.html file.
Then, copy the following code into your index.html file:</p>
<pre data-language="html" class="rainbow"><span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">html</span></span> <span class="support attribute from-rainbow">lang</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">"</span><span class="string value from-rainbow">en</span><span class="string quote from-rainbow">"</span><span class="support tag close from-rainbow">&gt;</span>
    <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">head</span></span><span class="support tag close from-rainbow">&gt;</span>
        <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">meta</span></span> <span class="support attribute from-rainbow">charset</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">"</span><span class="string value from-rainbow">UTF-8</span><span class="string quote from-rainbow">"</span><span class="support tag close from-rainbow">&gt;</span>
        <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">title</span></span><span class="support tag close from-rainbow">&gt;</span>Hello React<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">title</span></span><span class="support tag close from-rainbow">&gt;</span>
    <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">head</span></span><span class="support tag close from-rainbow">&gt;</span>
    <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">body</span></span><span class="support tag close from-rainbow">&gt;</span>
        <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">div</span></span> <span class="support attribute from-rainbow">id</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">"</span><span class="string value from-rainbow">root</span><span class="string quote from-rainbow">"</span><span class="support tag close from-rainbow">&gt;</span>
            <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">h1</span></span><span class="support tag close from-rainbow">&gt;</span>First React page rendering...<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">h1</span></span><span class="support tag close from-rainbow">&gt;</span>
        <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">div</span></span><span class="support tag close from-rainbow">&gt;</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;  <span class="source js embedded from-rainbow"><span class="support tag script from-rainbow">&lt;</span><span class="entity tag script from-rainbow">script</span> <span class="entity tag script from-rainbow">crossorigin</span>=<span class="string from-rainbow">""</span> <span class="entity tag script from-rainbow">src</span>=<span class="string from-rainbow active_pre">"https://unpkg.com/react@16/umd/react.development.js"</span><span class="support tag script from-rainbow">&gt;</span><span class="support tag script from-rainbow">&lt;/</span><span class="entity tag script from-rainbow">script</span><span class="support tag script from-rainbow">&gt;</span></span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="source js embedded from-rainbow"><span class="support tag script from-rainbow">&lt;</span><span class="entity tag script from-rainbow">script</span> <span class="entity tag script from-rainbow">crossorigin</span>=<span class="string from-rainbow">""</span> <span class="entity tag script from-rainbow">src</span>=<span class="string from-rainbow active_pre">"https://unpkg.com/react-dom@16/umd/react-dom.development.js"</span><span class="support tag script from-rainbow">&gt;</span><span class="support tag script from-rainbow">&lt;/</span><span class="entity tag script from-rainbow">script</span><span class="support tag script from-rainbow">&gt;</span></span> 
    <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">body</span></span><span class="support tag close from-rainbow">&gt;</span>
<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">html</span></span><span class="support tag close from-rainbow">&gt;</span>
</pre>
<p>If you open index.html in your browser, you should see an h1 tag that says "First React page rendering...".
Also, we have included two scripts that we will need for React.
We have not set up React in our index.html yet (other than including the external Javascript), so you will be waiting for the rest of time if you want to wait for React to render.
Next, let's actually add some custom React scripts to our file.
We have already told our user that our React page is rendering, so let's actually render it.
After the last external React script, create another script tag to contain our code.
We will add the following:</p>
<pre data-language="html" class="rainbow"><span class="source js embedded from-rainbow"><span class="support tag script from-rainbow">&lt;</span><span class="entity tag script from-rainbow">script</span><span class="support tag script from-rainbow">&gt;</span>
    <span class="keyword from-rainbow">const</span> App <span class="keyword operator from-rainbow">=</span> React.<span class="function call from-rainbow">createElement</span>(<span class="string from-rainbow">"h1"</span>, {}, <span class="string from-rainbow">"Our First React page has rendered"</span>);
    ReactDOM.<span class="function call from-rainbow">render</span>(App, <span class="support from-rainbow">document</span>.<span class="support method from-rainbow">getElementById</span>(<span class="string from-rainbow">"root"</span>));
<span class="support tag script from-rainbow">&lt;/</span><span class="entity tag script from-rainbow">script</span><span class="support tag script from-rainbow">&gt;</span></span>
</pre>
<p>What did we do here?
We created a new method (using arrow notation) that returns a new React Element.
Note that there are three different arguments provided to the <code>React.createElement</code> method.
First, we have a string that contains <code>h1</code>.
This tells React which element we want to create, in this case it is an <code>h1</code> html element.
Next, we have empty curly braces where we will pass props.
We do not need to worry about this for the time being, but we will learn more about them later.&nbsp;</p>
<p>Lastly, we send in the children.
This is what we want to create within our <code>h1</code> tag.
This could be a list of many different children, but for now we are just sending in a string.</p>
<p>After we define the <code>App</code> method, we call <code>ReactDOM.render</code>.
We are telling React to display our App component within the element that has an id of <code>root</code>.</p>
<p>We have just written our first React project.
If you open your index.html, you should briefly see "First React page rendering..." before seeing "Our First React page has rendered".
Our browser will first show the html we have written.&nbsp;</p>
<p>Then, after the React scripts load, our browser executes the script that will call the method <code>ReactDOM.render</code>.
This method will overwrite what we originally had in the div with id <code>root</code> with an <code>h1</code> that contains "Our First React page has rendered".
If you continue to refresh your page, you can see it quickly change.
Congratulations!
You have created your first React project.</p>
<p><strong>IMPORTANT: Do not include the node_modules folder in your zip upload! The easiest way to do this is to highlight all the other files and folders in your project folder and compress them.</strong><br> </p>
        
        
        
        
        
</div>
