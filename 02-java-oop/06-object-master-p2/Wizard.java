public class Wizard extends Human {
    // Wizard: Set default health to 50
    // Wizard: Set default intelligence to 8
    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
        this.strength = 3;
        this.stealth = 3;
    }

    // Wizard: Add a method heal(Human) that heals the other human by the wizard's
    // intelligence

    public void heal(Human player1) {
        player1.health += this.intelligence;
        System.out.println(player1 +" was healed by Wizard, and " + player1 + " health +3.");
        System.out.println(player1 + "remaining health is: " + player1.health);
    }

    // Wizard: Add a method fireball(Human) that decreases the other human's health
    // by the wizard's intelligence * 3

    public void fireball(Human player1){
        player1.health -= this.intelligence*3;
        //ask question to TA: why System print out "player1" is not the player namne
        //ask quesiton to TA: how to print out the object name in this class?
        System.out.println(player1.toString() +" was attached by Wizard, and " + player1 + " health -9.");
        System.out.println(player1 + "remaining health is: " + player1.health);
    }
}
