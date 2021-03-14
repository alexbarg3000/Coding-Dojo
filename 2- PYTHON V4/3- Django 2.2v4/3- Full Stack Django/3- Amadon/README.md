<div class="module_description active_lesson_with_video ">
									
            
            
            
            
<h1>Amadon</h1>
<h2>Objectives:</h2>
<ul>
    <li>Practice handling POST data</li>
    <li>Avoid rendering after a POST request</li>
    <li>Be careful about what you put inside <code>&lt;form&gt;</code>tags</li>
</ul>
<hr>
<p>We've decided to start building our own e-commerce site called Amadon.</p>
<p>The goal of this assignment is not to build a full-fledged e-commerce site (i.e. no login, validation, etc.). Rather, we want to point out some important things to consider when building forms:</p>
<ol>
        <li>Why we don't want to render after a POST request (you may recall going over this when we were learning Flask)</li>
        <li>What we should put in our forms versus what should be handled by the server in the backend</li>
    </ol>
<p><img src="https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/amadon2.png"></p>
<h3>IMPORTANT LESSON 1</h3>
<p>Say the customer reloads the checkout page after purchasing an item. How happy would your customer be if they were charged again and received double their original order? Probably not very happy!</p>
<p>A good developer should not have a method handle both the POST data <em>and</em> render HTML. This is a very common mistake made by developers--we should always double-check that we haven't made this mistake ourselves!</p>
<p>Instead have the http POST request sent to one route, have that route handle the POST data, and then <em>redirect</em> to a new GET route which displays the thank you html. This way, even when the user reloads the thank you page, it will not re-process the submitted order.</p>
<h3>IMPORTANT LESSON 2</h3>
<p>Another reason we designed this assignment like this is for you to see how easy it is to manipulate the form. For example, say that the form for ordering a Dojo T-shirt looked like this.</p>
<pre data-language="html" class="rainbow"><span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">form</span></span> <span class="support attribute from-rainbow">action</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">/amadon/buy</span><span class="string quote from-rainbow">'</span> <span class="support attribute from-rainbow">method</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">post</span><span class="string quote from-rainbow">'</span><span class="support tag close from-rainbow">&gt;</span>
  {% csrf_token %}
  <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">select</span></span> <span class="support attribute from-rainbow">name</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">quantity</span><span class="string quote from-rainbow">'</span><span class="support tag close from-rainbow">&gt;</span>
     <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>1<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>
     <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>2<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>
     <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>3<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>
  <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">select</span></span><span class="support tag close from-rainbow">&gt;</span>
  <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">input</span></span> <span class="support attribute from-rainbow">type</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">hidden</span><span class="string quote from-rainbow">'</span> <span class="support attribute from-rainbow">name</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">price</span><span class="string quote from-rainbow">'</span> <span class="support attribute from-rainbow">value</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">19.99</span><span class="string quote from-rainbow">'</span> <span class="support tag close from-rainbow">/&gt;</span>
  <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">button</span></span> <span class="support attribute from-rainbow">type</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">submit</span><span class="string quote from-rainbow">'</span><span class="support tag close from-rainbow">&gt;</span>Buy!<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">button</span></span><span class="support tag close from-rainbow">&gt;</span>
<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">form</span></span><span class="support tag close from-rainbow">&gt;</span></pre>
<p>A somewhat sophisticated user could, for example, use the browser's Inspect Element tool to change the price to '0.01' and order lots of t-shirts for very cheap! A better way to handle this would be to have, for example, <em>product_id</em> as a hidden variable. This way, if they change the product_id using inspect element, they would just get a different item for their order.</p>
<p>In other words, have the form look more like below:</p>
<pre data-language="html" class="rainbow"><span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">form</span></span> <span class="support attribute from-rainbow">action</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">/amadon/buy</span><span class="string quote from-rainbow">'</span> <span class="support attribute from-rainbow">method</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">post</span><span class="string quote from-rainbow">'</span><span class="support tag close from-rainbow">&gt;</span>
  {% csrf_token %}
  <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">select</span></span> <span class="support attribute from-rainbow">name</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">quantity</span><span class="string quote from-rainbow">'</span><span class="support tag close from-rainbow">&gt;</span>
     <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>1<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>
     <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>2<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>
     <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>3<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">option</span></span><span class="support tag close from-rainbow">&gt;</span>
  <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">select</span></span><span class="support tag close from-rainbow">&gt;</span>
  <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">input</span></span> <span class="support attribute from-rainbow">type</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">hidden</span><span class="string quote from-rainbow">'</span> <span class="support attribute from-rainbow">name</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">product_id</span><span class="string quote from-rainbow">'</span> <span class="support attribute from-rainbow">value</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">1015</span><span class="string quote from-rainbow">'</span> <span class="support tag close from-rainbow">/&gt;</span>
  <span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag-name from-rainbow">button</span></span> <span class="support attribute from-rainbow">type</span><span class="support operator from-rainbow">=</span><span class="string quote from-rainbow">'</span><span class="string value from-rainbow">submit</span><span class="string quote from-rainbow">'</span><span class="support tag close from-rainbow">&gt;</span>Buy!<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">button</span></span><span class="support tag close from-rainbow">&gt;</span>
<span class="support tag from-rainbow"><span class="support tag from-rainbow">&lt;</span><span class="support tag special from-rainbow">/</span><span class="support tag-name from-rainbow">form</span></span><span class="support tag close from-rainbow">&gt;</span>
</pre>
<p>Surprisingly, a lot of e-commerce sites are built where you could easily change the price. What if you built a web crawler/scraper to go through lots of e-commerce sites to specifically look for sites where price is part of the shopping cart form? You could reach out to them and tell them about the security flaw in their site. Maybe they'll hire you to make their site more secure? :)</p>
<p>Now it's your turn to go through this exercise and experience these issues for yourself. Follow the steps below to first experience these issues yourself, and then fix them. Follow the checklist below using <a href="https://github.com/TheCodingDojo/amadon" target="_blank">this GitHub repository</a> to get started. These same instructions are also provided in the GitHub repository's README file. In this code, we're not worrying about individual users, so we'll assume that all orders are being submitted by one user in order to calculate totals.</p>
        
        
        
        
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
															<p>Clone the repository and peruse the code</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run makemigrations and migrate to create the necessary database tables</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">
																												<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Seed the database with a few products (i.e. go into the shell and create 3-4 products)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Run the server and make a purchase</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Add some basic styling (use Bootstrap or another CSS framework)</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>On the checkout page, calculate and display the total charge for the most recent order</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" checked="checked" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>On the checkout page, calculate and display the total quantity of all orders combined</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" checked="checked" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>On the checkout page, calculate and display the total amount charged for all orders combined</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="8">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_8" checked="checked" class="todo_check">														
														<label for="todo_item_8" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>After making an order, hit the refresh button while on the checkout page and say yes/confirm. What do you notice?</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="9">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_9" checked="checked" class="todo_check">														
														<label for="todo_item_9" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Fix this issue so that users don't inadvertently make another order by mistake</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="10">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_10" checked="checked" class="todo_check">														
														<label for="todo_item_10" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Go back to the order form and use your browser's inspect element tool. Change the price of an item and then place an order. What do you notice?</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="11">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_11" checked="checked" class="todo_check">														
														<label for="todo_item_11" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>Fix this issue so that users don't get to set the price of their items!</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5121507">
												<input type="hidden" name="chapter_module_id" value="45795">
												<input type="hidden" name="track_id" value="119">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
