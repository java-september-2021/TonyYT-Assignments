public class GorillaTest {
    //Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.
    public static void main(String[] args) {       
        Gorilla lucy = new Gorilla();
        lucy.displayEnergy();
    
        lucy.throwSomething();
        lucy.displayEnergy();
    
        lucy.eatBananas();
        lucy.displayEnergy();
    
        lucy.climb();
        lucy.displayEnergy();
    }
}
