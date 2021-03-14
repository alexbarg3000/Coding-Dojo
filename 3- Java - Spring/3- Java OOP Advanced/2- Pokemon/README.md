<div class="module_description active_lesson_with_video ">
									
            
            
            
            
            
<h1>Pokemon Assignment</h1>
<p>In this assignment, we will create a Pokedex to tell us information about Pokemon characters.</p>
<h3 id="topics">Objectives:</h3>
<ul><li><p>Practice static variables and methods.</p></li><li><p>Define abstract classes.</p></li><li><p>Define interfaces.</p></li><li><p>Implement classes that use abstract classes and interfaces.</p></li></ul>
<h3 id="tasks">Tasks:</h3>
<ul><li><p>Create a Pokemon class with:</p><ul><li><p><code>name</code>, <code>health</code>, and <code>type</code> member variables.</p></li><li><p><code>void attackPokemon(Pokemon pokemon)</code>: This method lowers the attacked Pokemon's health by 10<br></p></li><li><p>a <code>count</code> static variable that keeps the number of Pokemon created in the program.</p></li><li><p>getters and setters for each member variable.</p></li><li><p>a constructor class to set the instance's name, health, and type on creation</p></li></ul><h5 id="pokemon.java">Pokemon.java</h5><pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">Pokemon</span> {
    <span class="comment from-rainbow">// your code here</span>
}
</pre>
</li><li><p>Create an interface for the following methods:</p><ul><li><p><code>Pokemon createPokemon(String name, int health, String type)</code>: This method creates and returns <code>Pokemon</code>.</p></li><li><p><code>String pokemonInfo(Pokemon pokemon)</code>: This method returns a <code>String</code> with the name, health, and type of the pokemon.</p></li><li><p><code>void listPokemon()</code>: List all the pokemon names that you have in your pokedex.</p></li></ul><h5 id="pokemoninterface.java">PokemonInterface.java</h5><pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">interface</span> <span class="entity class from-rainbow">PokemonInterface</span> {
    <span class="comment from-rainbow">// your code here</span>
}
</pre>
</li><li><p>Create an abstract class that only implements <code>createPokemon</code> and <code>pokemonInfo(Pokemon pokemon)</code> from the PokemonInterface.</p><h5 id="abstractpokemon.java">AbstractPokemon.java</h5><pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">abstract</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">AbstractPokemon</span> <span class="keyword from-rainbow">implements</span> <span class="entity class from-rainbow">PokemonInterface</span> {
    <span class="comment from-rainbow">// your code here</span>
}
</pre>
</li><li><p>Create a Pokedex class that extends the abstract class above and implements <code>listPokemon()</code>. Your Pokedex class needs an attribute called <code>myPokemons</code> where you store all the pokemons created.<br></p><h5 id="pokedex.java">Pokedex.java</h5><pre data-language="java" class="rainbow"><span class="keyword from-rainbow">public</span> <span class="keyword from-rainbow">class</span> <span class="entity class from-rainbow">Pokedex</span> <span class="keyword from-rainbow">extends</span> <span class="entity class from-rainbow">AbstractPokemon</span> {
    <span class="comment from-rainbow">// your code here</span>
}
</pre>
</li><li><p>Create a test file where you instantiate pokemon, attack pokemon, and list pokemon from a pokedex.</p></li></ul>
        
        
        
        
        
</div>
