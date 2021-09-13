public class Gorilla extends Mammal{
    public void throwSomething(){
        energyLevel = energyLevel -5;
        System.out.println("the Gorilla has throw something to people and energy decrese 5 ");
    }

    //For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
    public void eatBananas(){
        energyLevel = energyLevel +10;
        System.out.println("the Gorilla ate an banana and increase its energy by 10 !");
    }

    //For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
    public void climb(){
        energyLevel = energyLevel -10;
        System.out.println("the Gorilla climb a tree and decrease its energy by 10 !");
    }
}
