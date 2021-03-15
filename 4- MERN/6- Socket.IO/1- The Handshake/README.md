<div class="module_description active_lesson_with_video ">
									
<h1 class="text-center">The Handshake</h1>
<p>To practice making the socket connection, follow the steps below to create a fresh MERN project and set up the socket connection between the client and the server. Once the connection is complete, and both your Node server and React server are running, you can ask other members of your cohort to connect to your server using your computer's ip address. To get ahold of your IP address:</p>
<p><strong>WINDOWS</strong> - open command prompt and type:</p>
<pre class="">ipconfig</pre>
<p>You should then get results showing some IP addresses. If you are connected to the internet using a wifi connection, choose the IP address listed under your WIFI adapter. If you are connected using a hard wire cable, choose the ip address listed under WIRED.&nbsp;</p>
<p><br></p>
<p><strong>MAC</strong> - open system settings and navigate to the Network Preferences window. There you will find your IP address.</p>
<p><br></p>
<p>Once you have your IP, have a cohort mate type your IP address and the port into his or her browser's address bar. For example:</p>
<pre class="">192.168.1.89:3000</pre>
<p>Opening up the browser's developer tools, he or she should see the message from the server in the console tab.</p><p>For every person that connects to your IP address, you will see a new log in your Node terminal.</p>
        
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
															<p>Create a fresh, new MERN project</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">
																												<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SERVER - install socket.io and express</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">
																												<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SERVER - In your server.js file setup your express server and socket.io</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">
																												<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SERVER - Inside the io.("connection", socket =&gt; {}) function, add a console.log("Nice to meet you. (shake hand)")</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">
																												<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>SERVER - After the console.log(), create a socket.emit() event and pass in a simple string welcome message</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">
														
<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>CLIENT - Install socket.io-client</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>CLIENT - create a Chat.jsx component (we will continue using this assignment through the next assignment)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>CLIENT - create a listener for the welcome event and console log the data</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5361767">
												<input type="hidden" name="chapter_module_id" value="48254">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
