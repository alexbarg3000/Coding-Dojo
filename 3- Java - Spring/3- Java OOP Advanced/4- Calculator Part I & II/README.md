<div class="module_description active_lesson_with_video ">
									
<h1 id="calculator-part-i">Calculator Part I</h1>
<p>A client of yours requires a basic calculator for their application. They need a way to run a series of operations and save the result. They only need adding and subtracting functionality right now. They need the method <code>performOperation</code> and <code>getResults</code>&nbsp;to be the methods that run all the operations and return the end result respectively.</p>
<p>● <code>setOperandOne(10.5)</code></p>
<p>● <code>setOperation("+")</code></p>
<p>● <code>setOperandTwo(5.2)</code></p>
<p>● <code>performOperation()</code></p>
<p>● <code>getResults()</code></p>
<p>where the result would be <code>15.7</code>.</p>
<h3 id="topics">Objectives:</h3>
<p>● Practice classes and objects.</p>
<p>● Implement a calculator in java.<br></p>
<h3 id="tasks">Tasks:</h3>
<p>● Create the <code>Calculator</code> bean that will allow for the user to set operands and operations, then perform them and get the results.</p>
<p>● Have logic for adding and subtracting.</p>

</div>
<br>
<br>
<br>
<div class="module_description active_lesson_with_video ">
									
            
<h1 id="calculator-part-ii-optional">Calculator Part II</h1>
<p>The client has requested a change in spec: they need the calculator to process multiple values, as well as have some more complex abilities. They need the possibility for you to add several numbers in a row: this requires a change in our interface as we can't be sure how many total operands the client will be using. Now they expect this to work:</p>
<p>● <code>performOperation(10.5)</code></p>
<p>● <code>performOperation("+")</code></p>
<p>● <code>performOperation(5.2)</code></p>
<p>● <code>performOperation("*")</code></p>
<p>● <code>performOperation(10)</code></p>
<p>● <code>performOperation("=")</code></p>
<p>● <code>getResults()</code></p>
<p>where the result would be <code>62.5</code>. They want to be able to do this for an arbitrary number of numbers, as well as add in the capability to multiply and divide. You can assume that all inputs will be valid. Notice that the calculator must correctly perform the order of operations.</p>
<h3 id="topics">Objectives:</h3>
<p>● Practice classes and objects.</p>
<p>● Implement a calculator in java.</p>
<h3 id="tasks">Tasks:</h3>
<p>● Create the <code>Calculator</code> bean that will allow for the user to set operands and operations, then perform them and get the results.</p>
<p>● Have logic for adding, subtracting, dividing, and multiplication.</p>
<h3 id="notes">Notes:</h3>
<p>● You may want to use helper boolean properties to indicate if an operation or operand has been set or used yet.</p>
        
</div>

