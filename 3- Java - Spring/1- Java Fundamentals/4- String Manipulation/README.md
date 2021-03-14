<div class="module_description active_lesson_with_video ">
									<h1 id="string-manipulation">String Manipulation</h1>
<p>You've been asked to implement a series of string manipulation methods. To do these, you will need to utilize built in string methods. Use the <code>StringManipulator</code> and <code>StringManipulatorTesting</code> classes. Below are the method signatures and a short description of the method to be implemented.</p>
<h3 id="objectives">Objectives:</h3>
<p>● Practice <code>method signatures</code> by implementing the tasks below.</p>
<p>● Implement some of the most used string methods.</p>
<h3 id="tasks">Tasks:</h3>
<p>Create a <code>StringManipulator</code> class that implements the following methods:</p>
<p>● <code>String trimAndConcat(String, String)</code>: Trim both input strings and then concatenate them. Return the new string. Feel free to use the <code>trim</code> method of the <code>String</code> class.</p>
<pre data-language="java" class="rainbow"><span class="entity class from-rainbow">StringManipulator</span> manipulator <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> StringManipulator();
<span class="entity class from-rainbow">String</span> str <span class="operator from-rainbow">=</span> manipulator.trimAndConcat(<span class="string from-rainbow">"    Hello     "</span>,<span class="string from-rainbow">"     World    "</span>);
<span class="entity class from-rainbow">System</span>.out.println(str); <span class="comment from-rainbow">// HelloWorld </span>
</pre>
<p>● <code>Integer getIndexOrNull(String, char)</code>: Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the <code>indexOf</code> method of the <code>String</code> class.</p>
<pre data-language="java" class="rainbow"><span class="entity class from-rainbow">StringManipulator</span> manipulator <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> StringManipulator();
<span class="keyword from-rainbow">char</span> letter <span class="operator from-rainbow">=</span> <span class="char from-rainbow">'o'</span>;
<span class="entity class from-rainbow">Integer</span> a <span class="operator from-rainbow">=</span> manipulator.getIndexOrNull(<span class="string from-rainbow">"Coding"</span>, letter);
<span class="entity class from-rainbow">Integer</span> b <span class="operator from-rainbow">=</span> manipulator.getIndexOrNull(<span class="string from-rainbow">"Hello World"</span>, letter);
<span class="entity class from-rainbow">Integer</span> c <span class="operator from-rainbow">=</span> manipulator.getIndexOrNull(<span class="string from-rainbow">"Hi"</span>, letter);
<span class="entity class from-rainbow">System</span>.out.println(a); <span class="comment from-rainbow">// 1</span>
<span class="entity class from-rainbow">System</span>.out.println(b); <span class="comment from-rainbow">// 4</span>
<span class="entity class from-rainbow">System</span>.out.println(c); <span class="comment from-rainbow active_pre">// null</span>
</pre>
<p>● <code>Integer getIndexOrNull(String, String)</code>: Get the index of the start of the substring and return either the index or null. Feel free to use the <code>indexOf</code> method of the <code>String</code> class.</p>
<pre data-language="java" class="rainbow active_pre"><span class="entity class from-rainbow">StringManipulator</span> manipulator <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> StringManipulator();
<span class="entity class from-rainbow">String</span> word <span class="operator from-rainbow">=</span> <span class="string from-rainbow">"Hello"</span>;
<span class="entity class from-rainbow">String</span> subString <span class="operator from-rainbow">=</span> <span class="string from-rainbow">"llo"</span>;
<span class="entity class from-rainbow">String</span> notSubString <span class="operator from-rainbow">=</span> <span class="string from-rainbow">"world"</span>;
<span class="entity class from-rainbow">Integer</span> a <span class="operator from-rainbow">=</span> manipulator.getIndexOrNull(word, subString);
<span class="entity class from-rainbow">Integer</span> b <span class="operator from-rainbow">=</span> manipulator.getIndexOrNull(word, notSubString);
<span class="entity class from-rainbow">System</span>.out.println(a); <span class="comment from-rainbow">// 2</span>
<span class="entity class from-rainbow">System</span>.out.println(b); <span class="comment from-rainbow">// null</span>
</pre>
<p>● <code>String concatSubstring(String, int, int, String)</code>: Get a substring using a starting and ending index, and concatenate that with the second string input to our method. Feel free to use the <code>substring</code> method of the <code>String</code> class.</p>
<pre data-language="java" class="rainbow"><span class="entity class from-rainbow">StringManipulator</span> manipulator <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> StringManipulator();
<span class="entity class from-rainbow">String</span> word <span class="operator from-rainbow">=</span> manipulator.concatSubstring(<span class="string from-rainbow">"Hello"</span>, <span class="integer from-rainbow">1</span>, <span class="integer from-rainbow">2</span>, <span class="string from-rainbow">"world"</span>);
<span class="entity class from-rainbow">System</span>.out.println(word); <span class="comment from-rainbow">// eworld</span>
</pre>
<p>Then create a <code>StringManipulatorTest</code> to test all these methods.</p>

</div>
