public class BatTest {
    public static void main(String[] args) {
        //Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.
        Bat BB = new Bat();
        BB.displayEnergy();
        
        //attack three towns
        BB.attackTown();
        BB.attackTown();
        BB.attackTown();
        BB.displayEnergy();

        //eat two humans
        BB.eatHumans();
        BB.eatHumans();
        BB.displayEnergy();

        //fly twice
        BB.fly();
        BB.fly();
        BB.displayEnergy();
    }
}
