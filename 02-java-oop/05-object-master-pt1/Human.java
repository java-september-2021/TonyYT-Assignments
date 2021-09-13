public class Human {
    public int strength;
    public int stealth;
    public int intelligence;
    public int health;

    // constructor
    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    // Add the attack(Human) method that reduces the health of the attacked human by
    // the strength of the current human.
    public void attack(Human player) {
        player.health -= 3;
    }

    public void displayStatus() {
        System.out.println("the current Health is: " + health);
    }
}
