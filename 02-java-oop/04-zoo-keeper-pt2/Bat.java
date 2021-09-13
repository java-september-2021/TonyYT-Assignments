public class Bat extends Mammal {
    // Create a Bat class that can fly(), eatHumans(), and attackTown() and has a
    // default energy level of 300.
    private int energyLevel = 300;

    // For the fly() method, print the sound a bat taking off and decrease its
    // energy by 50.
    public void fly() {
        System.out.println("fei...fei...fei...");
        energyLevel = energyLevel - 50;
    }

    // For the eatHumans() method, print the so- well, never mind, just increase its
    // energy by 25.
    public void eatHumans() {
        energyLevel = energyLevel + 25;
    }

    // For the attackTown() method, print the sound of a town on fire and decrease
    // its energy by 100.
    public void attackTown() {
        System.out.println("boom...bibu...bibu...");
        energyLevel = energyLevel - 100;
    }
}
