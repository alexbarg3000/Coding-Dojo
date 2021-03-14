<div class="module_description active_lesson_with_video ">
									<h1>Assignment: Time Display</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice setting up a Django project</li>
    <li>Familiarity with passing data to a template</li>
    <li>Practice connecting to static files</li>
</ul>
<hr>
<p>Create a Django project with a single app called time_display. When you go to <code>localhost:8000</code> or <code>localhost:8000/time_display</code>, this should run a method in your controller file (views.py) that renders a template displaying the current date and time.</p>
<p><img src="http://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3832/handouts/chapter3832_6613_time.png" alt="alt text" title="Time"></p>
<p>There are many ways to get the current time in Python. For example, you could have views.py import <code>gmtime, strftime</code> from 'time' and pass the appropriate string to the render method. For example, your views.py might look something like this:</p>
<pre data-language="python" class="rainbow"><span class="keyword from-rainbow">from</span> django.shortcuts <span class="keyword from-rainbow">import</span> render
<span class="keyword from-rainbow">from</span> time <span class="keyword from-rainbow">import</span> gmtime, strftime
    
<span class="storage function from-rainbow">def</span> <span class="entity name function from-rainbow">index</span>(request):
    context <span class="keyword operator from-rainbow">=</span> {
        <span class="string from-rainbow">"time"</span>: <span class="function call from-rainbow">strftime</span>(<span class="string from-rainbow">"%Y-%m-%d %H:%M %p"</span>, <span class="function call from-rainbow">gmtime</span>())
    }
    <span class="keyword from-rainbow">return</span> <span class="function call from-rainbow">render</span>(request,'index.html', context)
</pre>
<p>To learn more about strftime, see&nbsp;<a href="https://docs.python.org/3.6/library/time.html?highlight=time.strftime#time.strftime" target="_blank">https://docs.python.org/3.3/library/time.html?highlight=time.strftime#time.strftime</a></p>
<p>Please also see&nbsp;<a href="https://stackoverflow.com/questions/466345/converting-string-into-datetime" target="_blank" data-saferedirecturl="https://www.google.com/url?hl=en&amp;q=https://stackoverflow.com/questions/466345/converting-string-into-datetime&amp;source=gmail&amp;ust=1500130928321000&amp;usg=AFQjCNFDnLkpMec1qLbFUfscD5cp6oqy7w">https://stackoverflow.com/questions/466345/converting-string-into-datetime</a></p>
<p>Recognize that working with time - <a href="https://docs.djangoproject.com/en/2.2/topics/i18n/timezones/" target="_blank">especially timezones</a> - is among the more frustrating parts of computer programming. Do not spend more than 15 minutes exploring timezones. We will have numerous opportunities to discuss the challenges of timezones. Essentially, we want to store any timestamps in our database in UTC, and eventually use JavaScript to get the time from the user's browser to customize how times are displayed. For now, the easy fix is to set your Django settings to the timezone that works for you and move on. You have more important things to cover at this part of your career as a developer than timezones.</p>
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
															<p>Create a new project with a single app</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Have the root route display the current date and time</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Incorporate your own custom stylesheet</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>NINJA BONUS: Come up with a different way to retrieve the datetime</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5099601">
												<input type="hidden" name="chapter_module_id" value="42903">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
