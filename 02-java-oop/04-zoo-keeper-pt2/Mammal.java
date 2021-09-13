public class Mammal {
    public int energyLevel;
    
    public int displayEnergy(){
        System.out.println(this.energyLevel);
        return energyLevel;
    }

    //build a constructor
    public Mammal(){
        this.energyLevel = 100;
    }
}
