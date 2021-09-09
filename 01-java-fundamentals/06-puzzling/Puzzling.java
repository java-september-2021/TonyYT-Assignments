import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Puzzling {
    // getTenRolls
    // Write a method that will generate and return an array with 10 random numbers
    // between 1 and 20 inclusive.
    public static ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random ran = new Random();

        for (int i = 0; i < 10; i++) {
            arr.add(ran.nextInt((20 - 1) + 1) + 1); // ((max - min) + 1 + min)
        }
        return arr;
    }

    // getRandomLetter
    // Write a method that will:
    // Create an array within the method that contains all 26 letters of the
    // alphabet (this array must have 26 values).
    // Generate a random index between 0-25, and use it to pull a random letter out
    // of the array.
    // Return the random letter.
    public static char getRandomLetter() {
        // create an array with all 26 letters of the alphabet.
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char cha = 'a'; cha <= 'z'; cha++) {
            alphabet.add(cha);
        }
        //System.out.println(alphabet);

        // generate a random index between 0-25
        Random ran = new Random();
        int index = ran.nextInt(26);

        // return randomLetter
        char randomLetter = alphabet.get(index);
        return randomLetter;
    }

    // generatePassword
    // Write a method that uses the previous method to create a random string of
    // eight characters, and return that string.
    public static String generatePassword() {
        ArrayList<Character> ranString = new ArrayList<Character>();
        for (int m = 0; m < 9; m++) {
            ranString.add(getRandomLetter());
        }
        // joint ArrayList element into
        StringBuilder strArray = new StringBuilder(ranString.size());
        for (Character cha : ranString) {
            strArray.append(cha);
        }
        return strArray.toString();
    }

    // getNewPasswordSet
    // Write a method that takes an int length as an argument and creates an array
    // of random eight character words. The array should be the length passed in as
    // an int.
    public static ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> output = new ArrayList<String>();
        for (int m = 0; m < length; m++) {
            output.add(generatePassword());
        }
        return output;
    }

    // SENSEI BONUS:
    // shuffleArray
    // Write a method that takes an array and and mixes up all the values in a
    // pseudo-random way. Hint: use random indexes within the array, and swap values
    // repeatedly.
    public static ArrayList<String> shuffleArray(List<?> arr){
        ArrayList<String> output = new ArrayList<String>();
        Collections.shuffle(arr);
        return output;
    }


}
