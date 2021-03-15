<div class="module_description active_lesson_with_video ">
									
<h1 class="text-center">Classic Chat App</h1>
<p>Building off of the previous assignment, your task is to create a fully functional chat application. Have your cohort mates help test your application throughout your development process.</p>
<p><strong>There is ONE unspoken, not found on the internet, hard to fix, not straightforward bug when building your chat app.</strong></p>
<p>On the client, when you are setting state inside of an event listener, you will need to set state in a very, very specific way. Below is what you need to know. When you call your "setter" function, instead of passing it the new value, you need to pass it a callback function that will compute the new value based on the existing value. See the diagram below for an example.</p>
<p><br></p>
<figure rel="width: 621px; height: 326px;" style="text-align: center;"><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/setting_state_in_listener.png" style="width: 621px; height: 326px;" width="621" height="326"></figure>
<font color="#3e4e5a" face="Gotham-Rounded-Medium"><p><br></p>Feel free to design your Chat App as you would like it, but for an example see the wireframe below.<br></font><br><div><font color="#3e4e5a" face="Gotham-Rounded-Bold"><span></span></font><figure><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/chat.png"></figure><p><br></p>
<hr>
<h3>Resources</h3>
<ul><li><a href="https://socket.io/docs/" target="_blank">socket.io docs</a></li><li><a href="https://reactjs.org/docs/hooks-reference.html#functional-updates" target="_blank">Functional Updates</a></li></ul><p></p></div>
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
															<p>Build a fully functional chat application</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Bonus: Keep the chat messages scrolled to the bottom by default</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="1" class="todo_status">	
														<input type="checkbox" id="todo_item_2" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Ninja Bonus: Add different chat rooms that users can join</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Sensei Bonus: Display chat messages from before a user has joined the chat when they join</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5361769">
												<input type="hidden" name="chapter_module_id" value="48256">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
