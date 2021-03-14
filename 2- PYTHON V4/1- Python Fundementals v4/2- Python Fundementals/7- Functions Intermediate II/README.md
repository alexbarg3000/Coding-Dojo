<div class="module_description active_lesson_with_video ">
									
            
            
<h1>Assignment: Functions Intermediate II</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice writing functions and looping over dictionaries</li>
    <li>Achieve a better understanding of how to traverse through a list of dictionaries or through a dictionary of lists</li>
</ul>
<hr>
<p><strong>Note: Avoid using class keywords like int, str, list, and dict as variable/parameter names.</strong></p>
<ol>    
    <li><strong>Update Values in Dictionaries and Lists</strong></li>
<pre class="rainbow" data-language="python">x <span class="keyword operator from-rainbow">=</span> [ [<span class="constant numeric from-rainbow">5</span>,<span class="constant numeric from-rainbow">2</span>,<span class="constant numeric from-rainbow">3</span>], [<span class="constant numeric from-rainbow">10</span>,<span class="constant numeric from-rainbow">8</span>,<span class="constant numeric from-rainbow">9</span>] ] 
students <span class="keyword operator from-rainbow">=</span> [
     {'first_name':  <span class="string from-rainbow">'Michael'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Jordan'</span>},
     {'first_name' : <span class="string from-rainbow">'John'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Rosales'</span>}
]
sports_directory <span class="keyword operator from-rainbow">=</span> {
    <span class="string from-rainbow">'basketball'</span> : [<span class="string from-rainbow">'Kobe'</span>, <span class="string from-rainbow">'Jordan'</span>, <span class="string from-rainbow">'James'</span>, <span class="string from-rainbow">'Curry'</span>],
    <span class="string from-rainbow">'soccer'</span> : [<span class="string from-rainbow">'Messi'</span>, <span class="string from-rainbow">'Ronaldo'</span>, <span class="string from-rainbow">'Rooney'</span>]
}
z <span class="keyword operator from-rainbow">=</span> [ {'x': <span class="constant numeric from-rainbow">10</span>, <span class="string from-rainbow">'y'</span>: <span class="constant numeric from-rainbow">20</span>} ]
</pre>
        <ol>
            <li>Change the value 10 in x to 15. Once you're done, x should now be [ [5,2,3], [15,8,9] ].</li>
            <li>Change the last_name of the first student from 'Jordan' to 'Bryant'</li>
            <li>In the sports_directory, change 'Messi' to 'Andres'</li>
            <li>Change the value 20 in z to 30</li>
        </ol>
    <p></p>
    <li><strong>Iterate Through a List of Dictionaries</strong></li>
    <p>Create a function <code>iterateDictionary(some_list)</code> that, given a list of dictionaries, the function loops through each dictionary in the list and prints each key and the associated value. For example, given the following list:</p>
<pre class="rainbow" data-language="python">students <span class="keyword operator from-rainbow">=</span> [
         {'first_name':  <span class="string from-rainbow">'Michael'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Jordan'</span>},
         {'first_name' : <span class="string from-rainbow">'John'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Rosales'</span>},
         {'first_name' : <span class="string from-rainbow">'Mark'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Guillen'</span>},
         {'first_name' : <span class="string from-rainbow">'KB'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Tonel'</span>}
    ]
<span class="function call from-rainbow">iterateDictionary</span>(students) 
<span class="comment from-rainbow"># should output: (it's okay if each key-value pair ends up on 2 separate lines;</span>
<span class="comment from-rainbow"># bonus to get them to appear exactly as below!)</span>
first_name <span class="keyword operator from-rainbow">-</span> Michael, last_name <span class="keyword operator from-rainbow">-</span> Jordan
first_name <span class="keyword operator from-rainbow">-</span> John, last_name <span class="keyword operator from-rainbow">-</span> Rosales
first_name <span class="keyword operator from-rainbow">-</span> Mark, last_name <span class="keyword operator from-rainbow">-</span> Guillen
first_name <span class="keyword operator from-rainbow">-</span> KB, last_name <span class="keyword operator from-rainbow">-</span> Tonel</pre>
    <p></p>
    <li><strong>Get Values From a List of Dictionaries</strong></li>
    <p>Create a function <code>iterateDictionary2(key_name, some_list)</code> that, given a list of dictionaries and a key name, the function prints the value stored in that key for each dictionary. For example, iterateDictionary2('first_name', students) should output:</p>
<pre class="rainbow" data-language="python">Michael
John
Mark
KB
</pre>
    <p>And iterateDictionary2('last_name', students) should output:</p>
<pre class="rainbow" data-language="python">Jordan
Rosales
Guillen
Tonel
</pre>
    <p></p>
    <li><strong>Iterate Through a Dictionary with List Values</strong></li>
    <p>Create a function <code>printInfo(some_dict)</code> that given a dictionary whose values are all lists, prints the name of each key along with the size of its list, and then prints the associated values within each key's list. For example:</p>
<pre class="rainbow" data-language="python">dojo <span class="keyword operator from-rainbow">=</span> {
   <span class="string from-rainbow">'locations'</span>: [<span class="string from-rainbow">'San Jose'</span>, <span class="string from-rainbow">'Seattle'</span>, <span class="string from-rainbow">'Dallas'</span>, <span class="string from-rainbow">'Chicago'</span>, <span class="string from-rainbow">'Tulsa'</span>, <span class="string from-rainbow">'DC'</span>, <span class="string from-rainbow">'Burbank'</span>],
   <span class="string from-rainbow">'instructors'</span>: [<span class="string from-rainbow">'Michael'</span>, <span class="string from-rainbow">'Amy'</span>, <span class="string from-rainbow">'Eduardo'</span>, <span class="string from-rainbow">'Josh'</span>, <span class="string from-rainbow">'Graham'</span>, <span class="string from-rainbow">'Patrick'</span>, <span class="string from-rainbow">'Minh'</span>, <span class="string from-rainbow">'Devon'</span>]
}
<span class="function call from-rainbow">printInfo</span>(dojo)
<span class="comment from-rainbow"># output:</span>
<span class="constant numeric from-rainbow">7</span> LOCATIONS
San Jose
Seattle
Dallas
Chicago
Tulsa
DC
Burbank
    
<span class="constant numeric from-rainbow">8</span> INSTRUCTORS
Michael
Amy
Eduardo
Josh
Graham
Patrick
Minh
Devon</pre>
</ol>
        
        
</div>
<div class="todo_content">
										<ul class="todo_item_parent">
											<form action="/tracks/submit_todo" method="post" id="form_to_do_items">		
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="0">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_0" checked="checked" class="todo_check">														
														<label for="todo_item_0" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>1. Update Values in Dictionaries and Lists</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>2. Iterate Through a List of Dictionaries</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>3. Get Values From a List of Dictionaries</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>4. Iterate Through a Dictionary with List Values</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5049460">
												<input type="hidden" name="chapter_module_id" value="42519">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
