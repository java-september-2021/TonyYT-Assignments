public interface PokemonInterface {
    //Pokemon createPokemon(String name, int health, String type): This method creates and returns Pokemon.
    public Pokemon createPokemon (String name, int health, String type);

    //String pokemonInfo(Pokemon pokemon): This method returns a String with the name, health, and type of the pokemon.
    public String pokemonInfo(Pokemon pokemon);

    //void listPokemon(): List all the pokemon names that you have in your pokedex.
    public void listPokemon();
}
