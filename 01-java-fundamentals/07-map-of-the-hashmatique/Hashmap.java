import java.util.Set;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String,String>();
        trackList.put("memories", "Here's to the ones that we got Cheers to the wish you were here, but you're not Cause the drinks bring back all the memories Of everything we've been through");
        trackList.put("This Love", "This love has taken its toll on me She said goodbye too many times before And her heart is breaking in front of me And I have no choice, 'cause I won't say goodbye anymore");
        trackList.put("Sugar", "You sugar, yes please Would you come and put it down on me? I'm right here, 'cause I need Little love, a little sympathy Yeah you show me good loving, make it alright Need a little sweetness in my life");
        trackList.put("Payphone", "You say it's too late to make it But is it too late to try? And in our time that you wasted All of our bridges burned down");
        System.out.println("----------------------"+"\n");
        System.out.print(trackList.get("Sugar") + "\n");
        System.out.println("----------------------"+"\n");

        Set<String> keys = trackList.keySet();
        for (String key : keys){
            System.out.println(key + ": " + trackList.get(key));
            //System.out.println(trackList.get(key));
        }
    }
}
