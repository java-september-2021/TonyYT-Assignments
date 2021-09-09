import java.util.ArrayList;
import java.util.List;

public class TestPuzzling {
    public static void main(String[] args) {
        //Puzzling tester = new Puzzling();
        System.out.println(Puzzling.getTenRolls());
        System.out.println(Puzzling.getRandomLetter());
        System.out.println(Puzzling.generatePassword());
        System.out.println(Puzzling.getNewPasswordSet(10));
        TestPuzzling tester = new TestPuzzling();
        //System.out.println(tester.alp());
        System.out.println(Puzzling.shuffleArray(alp()));
        System.out.println("---------------------------------" +"\n");
    }

    public static List<?> alp(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char cha = 'a'; cha <= 'z'; cha++) {
            alphabet.add(cha);
        }
        System.out.println(alphabet);
        return alphabet;
    }

}
