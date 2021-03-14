<div class="module_description active_lesson_with_video ">
									
            
<h1 id="pythagorean-theorem">Pythagorean Theorem</h1>
<p>In this assignment, you will create a Java program to implement the Pythagorean Theorem.</p>
<p><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/pythagorean.png" alt="pythagorean"></p>
<p>To complete this assignment, you will need the <code>Math</code> class from the <code>java.lang</code> package. This package provides fundamentals classes to the Java programming language such as <code>Object</code>, <code>Boolean</code>, <code>String</code>, <code>Integer</code>, <code>Math</code>, etc. Therefore, the <code>java.lang</code> package is automatically imported and ready to use in every Java program.</p>
<h3 id="objectives">Objectives:</h3>
<p>● Learn how to import a class into your project.</p>
<p>● Practice object instantiation.</p>
<p>● Practice method invocation.</p>
<p>● Use the <code>java.lang</code> package.</p>
<h3 id="tasks">Tasks:</h3>
<p>● Create a Pythagorean class in <strong>javaFun</strong>.</p>
<h5 id="javafunpythagorean.java">javaFun/Pythagorean.java</h5>
<pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">Pythagorean</span> {
    <span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">double</span> calculateHypotenuse(<span class="keyword from-rainbow">int</span> legA, <span class="keyword from-rainbow">int</span> legB) {
        <span class="comment from-rainbow">// the hypotenuse is the side across from the right angle. </span>
        <span class="comment from-rainbow">// calculate the value of c given legA and legB</span>
    }
}
</pre>
<p>● Use a method from the Math class to calculate the hypotenuse of a right triangle given the values of the two legs. HINT: Use the static <code>sqrt</code> method. Static means that the method belongs to the class instead of the object. Here is some sample code:</p>
<pre data-language="java" class="rainbow"><span class="keyword from-rainbow">double</span> four <span class="operator from-rainbow">=</span> <span class="integer from-rainbow">4</span>.<span class="integer from-rainbow">0</span>;
<span class="comment from-rainbow">// calling the sqrt static method of the Math class</span>
<span class="keyword from-rainbow">double</span> squareRoot <span class="operator from-rainbow">=</span> <span class="entity class from-rainbow">Math</span>.sqrt(four); <span class="comment from-rainbow">// 2.0</span>
</pre>
<p>● Create a PythagoreanTest file that will instantiate a new Pythagorean object and call the <code>calculateHypotenuse</code> method.</p>
<h3 id="useful-links">Useful Links</h3>
<p>● <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html" target="_blank">java.lang</a></p>
<p> <br></p>
        
</div>
