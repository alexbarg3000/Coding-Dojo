public abstract class AbstractPokemon implements PokemonInterface{
    public abstract Pokemon createPokemon (String name, int health, String type);
    public abstract String pokemonInfo(Pokemon pokemon);

    public abstract void attackPokemon(Pokemon pokemon);
}
