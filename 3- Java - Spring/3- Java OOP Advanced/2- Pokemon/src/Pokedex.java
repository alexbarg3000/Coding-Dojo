import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
    private static ArrayList<Pokemon> listOfPokemon = new ArrayList<Pokemon>();

    public Pokemon createPokemon (String name, int health, String type){
        Pokemon pokemon = new Pokemon(name, health, type);
        listOfPokemon.add(pokemon);
        return pokemon;
    }

    public String pokemonInfo(Pokemon pokemon){
        String info =
                pokemon.getName() + "'s health is " + pokemon.getHealth() + ", and pokemon's type is " + pokemon.getType();
        return info;
    }

    @Override
    public void attackPokemon(Pokemon pokemon) {

    }

    public void listPokemon(){
        System.out.println(listOfPokemon);
    }
}
