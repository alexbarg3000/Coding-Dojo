<div class="module_description active_lesson_with_video ">
									
<h1 id="lists-of-exceptions">Lists of Exceptions</h1>
<p>Your new PM knows you don't know Java too well. She wants you to familiarize yourself with generics and exceptions and figure out exactly how they work. First, she wants you to make an <code>ArrayList</code> with both numbers and strings in it.</p>
<pre data-language="java" class="rainbow"><span class="entity class from-rainbow">ArrayList</span><span class="operator from-rainbow">&lt;</span><span class="entity class from-rainbow">Object</span><span class="operator from-rainbow">&gt;</span> myList <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> ArrayList&lt;Object&gt;();
myList.add(<span class="string from-rainbow">"13"</span>);
myList.add(<span class="string from-rainbow">"hello world"</span>);
myList.add(<span class="integer from-rainbow">48</span>);
myList.add(<span class="string from-rainbow active_pre">"Goodbye World"</span>);
</pre>
<p>You will loop through the list and try assigning each item to an int variable. To do this, you will also need to cast your list item as an <code>Integer</code>; you can do this like this:</p>
<pre data-language="java" class="rainbow">for(<span class="keyword from-rainbow">int</span> i <span class="operator from-rainbow">=</span> <span class="integer from-rainbow">0</span>; i <span class="operator from-rainbow">&lt;</span> myList.size(); i<span class="operator from-rainbow">++</span>) {
    <span class="entity class from-rainbow">Integer</span> castedValue <span class="operator from-rainbow">=</span> (<span class="entity class from-rainbow">Integer</span>) myList.get(i);
}
</pre>
<p>After you have set up this code, try running it. It should throw a <code>ClassCastException</code>. Change the program above to utilize exception handling to print out the error messages, the index of the ArrayList where the error occurred, and the value of the object that triggered the error. The program should continue after printing this to the console.</p>
<h3 id="topics">Objectives:</h3>
<p>● Implement exception handling.</p>
<h3 id="tasks">Tasks:</h3>
<p>● Create ArrayList</p>
<p>● Try to cast each element to an <code>Integer</code></p>
<p>● Use try/catch blocks to handle the exceptions</p>

</div>
