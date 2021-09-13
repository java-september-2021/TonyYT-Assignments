public class HumanTest {
    // Test these methods work using a HumanTest class
    public static void main(String[] args) {
        Samurai Curry = new Samurai();
        Ninja NJ = new Ninja();

        Curry.displayStatus();
        NJ.displayStatus();

        Curry.attack(NJ);
        NJ.displayStatus();

        NJ.attack(Curry);
        Curry.displayStatus();
    }
}
