<div class="module_description active_lesson_with_video ">
									
<h1 id="puzzling">Puzzling</h1>
<p>After you passed the first challenge, the company decided they wanted to give you a few puzzles to solve. As they put it: "The first challenge was just to check your familiarity with the language, now we want to see your problem-solving skills."</p>
<p>For this assignment, we are going to introduce two new classes: <code>Collections</code> and <code>Random</code>. We are going to use the former to shuffle and sort a collection, and the latter to get a random output. For example:</p>
<h5 id="codeexample.java">CodeExample.java</h5>
<pre data-language="java" class="rainbow">import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
<span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">CodeExample</span> {
    <span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">static</span> <span class="keyword from-rainbow">void</span> main() {
        <span class="entity class from-rainbow">ArrayList</span><span class="operator from-rainbow">&lt;</span><span class="entity class from-rainbow">Integer</span><span class="operator from-rainbow">&gt;</span> numbers <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> ArrayList&lt;Integer&gt;();
        numbers.add(<span class="integer from-rainbow">5</span>);
        numbers.add(<span class="integer from-rainbow">4</span>);
        numbers.add(<span class="integer from-rainbow">3</span>);
        numbers.add(<span class="integer from-rainbow">2</span>);
        numbers.add(<span class="integer from-rainbow">1</span>);        
        <span class="entity class from-rainbow">Collections</span>.shuffle(numbers);
        <span class="entity class from-rainbow">System</span>.out.println(numbers); <span class="comment from-rainbow">// [1, 5, 2, 4, 3]</span>
        <span class="entity class from-rainbow">Collections</span>.sort(numbers);
        <span class="entity class from-rainbow">System</span>.out.println(numbers); <span class="comment from-rainbow">// [1, 2, 3, 4, 5]</span>                
        <span class="entity class from-rainbow">Random</span> r <span class="operator from-rainbow">=</span> <span class="keyword from-rainbow">new</span> Random();
        <span class="entity class from-rainbow">System</span>.out.println(r.nextInt()); <span class="comment from-rainbow">// without bounds</span>
        <span class="entity class from-rainbow">System</span>.out.println(r.nextInt(<span class="integer from-rainbow">5</span>)); <span class="comment from-rainbow">// with bounds 0 to 5</span>
    }
}</pre>
<h3 id="objectives">Objectives:</h3>
<p>● Implement different algorithms in java.</p>
<p>● Practice <code>Array</code> and <code>ArrayList</code>.</p>
<p>● Practice <code>loops</code>.</p>
<p>● Learn and use the <code>Collections</code> and <code>Random</code> classes.</p>
<h3 id="tasks">Tasks:</h3>
<p>Work on the puzzles below. Make your code as clean as possible. The class name should be <code>PuzzleJava</code>; you will need to create methods for each of the tasks below and test them in the <code>main</code> method.</p>
<p>● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)</p>
<p>● Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.</p>
<p>● Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.</p>
<ul><li>To shuffle a collection, you can use the <code>shuffle</code> method of the <code>Collections</code> class. <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html" target="_blank">Collections Class documentation</a></li></ul>
<p>● Generate and return an array with 10 random numbers between 55-100.</p>
<ul><li>To get a random integer, you can use the <code>nextInt</code> method of the <code>Random</code> class. <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html" target="_blank">Random Class documentation</a></li></ul>
<p>● Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.</p>
<ul><li>To sort a collection, you can use the <code>sort</code> method of the <code>Collections</code> class.</li></ul>
<p>● Create a random string that is 5 characters long.</p>
<p>● Generate an array with 10 random strings that are each 5 characters long</p>
        
</div>
