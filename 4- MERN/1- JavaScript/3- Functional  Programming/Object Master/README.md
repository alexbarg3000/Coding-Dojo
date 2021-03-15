<div class="module_description active_lesson_with_video ">
									
            
<h1 class="text-center">Object Master (Optional)</h1>
<p><br></p>
<p>Lets use our new <code>map</code> and <code>filter</code> superpowers to get some data from this immutable pokémon array.</p>
<p><br></p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">const</span> pokémon <span class="keyword operator from-rainbow">=</span> <span class="keyword from-rainbow">Object</span>.<span class="function call from-rainbow">freeze</span>([
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">1</span>,   <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Bulbasaur"</span>,  <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"poison"</span>, <span class="string from-rainbow">"grass"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">5</span>,   <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Charmeleon"</span>, <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"fire"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">9</span>,   <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Blastoise"</span>,  <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"water"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">12</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Butterfree"</span>, <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"bug"</span>, <span class="string from-rainbow">"flying"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">16</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Pidgey"</span>,     <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"normal"</span>, <span class="string from-rainbow">"flying"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">23</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Ekans"</span>,      <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"poison"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">24</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Arbok"</span>,      <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"poison"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">25</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Pikachu"</span>,    <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"electric"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">37</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Vulpix"</span>,     <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"fire"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">52</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Meowth"</span>,     <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"normal"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">63</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Abra"</span>,       <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"psychic"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">67</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Machamp"</span>,    <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"fighting"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">72</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Tentacool"</span>,  <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"water"</span>, <span class="string from-rainbow">"poison"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">74</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Geodude"</span>,    <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"rock"</span>, <span class="string from-rainbow">"ground"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">87</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Dewgong"</span>,    <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"water"</span>, <span class="string from-rainbow">"ice"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">98</span>,  <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Krabby"</span>,     <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"water"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">115</span>, <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Kangaskhan"</span>, <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"normal"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">122</span>, <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Mr. Mime"</span>,   <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"psychic"</span>] },
    { <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">133</span>, <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Eevee"</span>,      <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"normal"</span>] },
    { <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">144</span>, <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Articuno"</span>,   <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"ice"</span>, <span class="string from-rainbow">"flying"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">145</span>, <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Zapdos"</span>,     <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"electric"</span>, <span class="string from-rainbow">"flying"</span>] },
&nbsp;&nbsp;&nbsp;&nbsp;{ <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">146</span>, <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Moltres"</span>,    <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"fire"</span>, <span class="string from-rainbow">"flying"</span>] },
    { <span class="string from-rainbow">"id"</span>: <span class="constant numeric from-rainbow">148</span>, <span class="string from-rainbow">"name"</span>: <span class="string from-rainbow">"Dragonair"</span>,  <span class="string from-rainbow">"types"</span>: [<span class="string from-rainbow">"dragon"</span>] }
]);</pre>
<p><br></p>
<p>For example we could create a list of pokémon that have names that start with the letter "B" by using the following code.</p>
<p><br></p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">const</span> bListPkmn <span class="keyword operator from-rainbow">=</span> pokémon.<span class="function call from-rainbow">filter</span>( p <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">&gt;</span> p.name[<span class="constant numeric from-rainbow">0</span>] <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">=</span> <span class="string from-rainbow">"B"</span> );</pre>
<p><br></p>
<p>Or if we wanted to return an array of just the ids, we could use something like this.</p>
<p><br></p>
<pre data-language="javascript" class="rainbow"><span class="keyword from-rainbow">const</span> pkmnIds <span class="keyword operator from-rainbow">=</span> pokémon.<span class="function call from-rainbow">map</span>( p <span class="keyword operator from-rainbow">=</span><span class="keyword operator from-rainbow">&gt;</span> p.id )
</pre>
<p><br></p>
<hr>
<p><br></p>
<h3>Using the above&nbsp;pokémon&nbsp;array, find the following:</h3>
        
        
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
															<p>an array of pokémon objects where the id is evenly divisible by 3</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="1">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_1" checked="checked" class="todo_check">														
														<label for="todo_item_1" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>an array of pokémon objects that are "fire" type</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="2">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_2" checked="checked" class="todo_check">														
														<label for="todo_item_2" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>an array of pokémon objects that have more than one type</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="3">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_3" checked="checked" class="todo_check">														
														<label for="todo_item_3" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>an array with just the names of the pokémon</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="4">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_4" checked="checked" class="todo_check">														
														<label for="todo_item_4" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>an array with just the names of pokémon with an id greater than 99 </p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="5">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_5" checked="checked" class="todo_check">														
														<label for="todo_item_5" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>an array with just the names of the pokémon whose only type is poison</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="6">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_6" class="todo_check">														
														<label for="todo_item_6" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>an array containing just the first type of all the pokémon whose second type is "flying"</p>	
														</label>	
													</li>
													<li>
														<input type="hidden" name="module_to_do_item_id[]" value="7">	
														<input type="hidden" name="is_completed[]" value="0" class="todo_status">	
														<input type="checkbox" id="todo_item_7" class="todo_check">														
														<label for="todo_item_7" class="todo_list_item">
															<div class="item_checkbox checked"></div>
															<p>a count of the number of pokémon that are "normal" type</p>	
														</label>	
													</li>									
												<input type="hidden" name="id" id="task_todo_id" value="5303971">
												<input type="hidden" name="chapter_module_id" value="50209">
												<input type="hidden" name="track_id" value="130">
												<input type="hidden" name="authenticity_token" value="sLO65z81Un8ogC/FYv7u6xcsFvuzeOSgTThZDbHAsxY=">
											</form>
										</ul>
									</div>
