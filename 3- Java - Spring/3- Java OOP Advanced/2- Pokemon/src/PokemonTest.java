public class PokemonTest {

    public static void main(String[] args) {
        Pokemon p = new Pokemon("dave",14,"stupid");
        Pokedex x = new Pokedex();
        System.out.println(x.pokemonInfo(p));
        x.attackPokemon(p);
        System.out.println(x.pokemonInfo(p));
        Pokemon q = x.createPokemon("suzy q",  50, "crazy");
        System.out.println(x.pokemonInfo(q));
    }
}
