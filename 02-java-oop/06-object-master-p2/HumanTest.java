public class HumanTest {
    // Test these methods work using a HumanTest class
    public static void main(String[] args) {
        Samurai Curry = new Samurai();
        Ninja NJ = new Ninja();
        Wizard WZ = new Wizard();
        Samurai SS = new Samurai();

        Curry.displayStatus();
        NJ.displayStatus();

        Curry.attack(NJ);
        NJ.displayStatus();

        NJ.attack(Curry);
        Curry.displayStatus();

        System.out.println("----------------\n");
        Samurai.howMany();

        WZ.fireball(Curry);
        WZ.heal(NJ);

        Curry.meditate();
        Curry.deathBlow(WZ);

        NJ.steal(Curry);
        NJ.runAway();

        System.out.println(Curry.health);
        System.out.println(NJ.health);
        System.out.println(WZ.health);
        System.out.println(SS.health);
    }
}
