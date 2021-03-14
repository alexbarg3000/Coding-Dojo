<div class="module_description active_lesson_with_video ">
									
<h1>Assignment: HTML Table</h1>
<h2>Objectives:</h2>
<ul>
    <li>Get comfortable passing information from the route to the template</li>
    <li>Get very comfortable iterating through a list of dictionaries to generate a html output.</li>
</ul>
<hr>
<p>Getting comfortable with iterating through a list of dictionaries is very important for all web development! Records returned from a database will almost always be in this format.</p>
<p>Create the following list of dictionaries and have it available for your route.</p>
<pre class="rainbow" data-language="python">users <span class="keyword operator from-rainbow">=</span> [
   {'first_name' : <span class="string from-rainbow">'Michael'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Choi'</span>},
   {'first_name' : <span class="string from-rainbow">'John'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Supsupin'</span>},
   {'first_name' : <span class="string from-rainbow">'Mark'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Guillen'</span>},
   {'first_name' : <span class="string from-rainbow">'KB'</span>, <span class="string from-rainbow">'last_name'</span> : <span class="string from-rainbow">'Tonel'</span>}
]
</pre>
<p>Pass users to your template and have your template output an HTML table like this:</p>
<table id="table80033">
<tbody>
<tr>
 <td>
  <strong>First Name</strong>
 </td>
 <td>
  <strong>Last Name</strong>
 </td>
 <td>
  <strong>Full Name</strong>
 </td>
</tr>
<tr>
 <td>Michael</td>
 <td>Choi</td>
 <td>Michael Choi</td>
</tr>
<tr>
 <td>John</td>
 <td>Supsupin</td>
 <td>John Supsupin</td>
</tr>
<tr>
 <td>Mark</td>
 <td>Guillen</td>
 <td>Mark Guillen</td>
</tr>
</tbody>
</table>
<p>As you need to get into the habit of making your assignment look nice, we challenge you to use either <a href="https://getbootstrap.com/" target="_blank">Bootstrap</a> or <a href="https://foundation.zurb.com/" target="_blank">Foundation</a>. If you haven't dabbled with these frameworks, start by learning just enough to do this assignment (creating a nice looking table).</p>
        
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
															<p>Start a new Flask project</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create a route in which the data above is declared and then sent to the template engine to be rendered</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Create the template that displays the data in a table</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Use a framework to format the table</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5071034">
												<input type="hidden" name="chapter_module_id" value="42700">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
