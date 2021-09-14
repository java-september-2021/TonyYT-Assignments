public class Ninja extends Human {
    // Ninja: Set default stealth to 10
    public Ninja() {
        this.strength = 3;
        this.stealth = 10;
        this.intelligence = 3;
        this.health = 100;
    }

    // Ninja: Add a method steal(Human) that takes the amount of stealth the ninja
    // has, removes it from the other human's health, and adds it to the ninja's
    public void steal(Human player1){
        player1.health -= this.stealth;
        this.health += this.stealth;
        System.out.println(player1 +" health was steal by Ninja, and " + player1 + " health -" +this.stealth);
        System.out.println(player1 + "remaining health is: " + player1.health);
    }

    // Ninja: Add a method runAway() that decreases their health by 10
    public void runAway(){
        this.health -= 10;
        System.out.println("Ninja was run away, and his health -10");
        System.out.println("Ninja remaining health is: " + this.health);
    }

}
