public class Samurai extends Human {
    // Samurai: Set a default health of 200
    public static int count  = 0;

    public Samurai() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 200;
        count += 1;
    }

    // Samurai: Add a method deathBlow(Human) that kills the other human, but
    // reduces the Samurai's health by half
    public void deathBlow(Human player1){
        player1.health = 0;
        this.health = this.health/2;
        System.out.println(player1 +" was attach by Samurai, and " + player1 + " is GameOver.");
        System.out.println(player1 + "remaining health is: " + player1.health);
    }

    //Samurai: Add a method meditate() that heals the Samurai for half of their current health.
    public void meditate(){
        this.health = this.health *2;
        System.out.println("Samurai is self-healed, and his health double!.");
        System.out.println("Samurai remaining health is: "+ this.health);
    }

    //Samurai: Add a method howMany() that returns the total current number of Samurai.
    public static int howMany(){
        System.out.println(count);
        return count;
    }

}
