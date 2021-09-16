import java.util.ArrayLis;

;public class Pokemon {
    public String name;
    public int health;
    public String type;
    //a count static variable that keeps the number of Pokemon created in the program.
    static int howManyPokemen;
    ArrayList<Pokemon> myPokemons = new ArrayLis<Pokemon>();

    //a constructor class to set the instance's name, health, and type on creation
    public Pokemon(String name, String type){
        this.name = name;
        this.health = 100;
        this.type = type;
        howManyPokemen +=1;
        myPokemons.add(this);
    }

    // void attackPokemon(Pokemon pokemon): This method lowers the attacked
    // Pokemon's health by 10
    public void attackPokemon (Pokemon pokemon){
        pokemon.health -= 10;
    }

    //getters and setters for each member variable.
    public void getInfor(){
        System.out.println(this.name);
        System.out.println(this.health);
        System.out.println(this.type);
        System.out.println(howManyPokemen);
    }

    public void setinfor(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
    }



}
