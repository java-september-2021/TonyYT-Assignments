public abstract class AbstractPokemon implements PokemonInterface {
    // Create an abstract class that only implements createPokemon and
    // pokemonInfo(Pokemon pokemon) from the PokemonInterface.
    public Pokemon createPokemon(String name, int health, String type) {
        this.name = name;
        this.health = 100;
        this.type = type;
        howManyPokemen +=1;
        myPokemons.add(this);
    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.health -= 10;
    }
}
