public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            String s = Integer.toString(number);
            return s;
        }
        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        //         or a String cast of the number itself.
        //         Hint: You can use a String method to cast the int to a String.
    }
    //Buons: Implement the same logic, but replace "Fizz", "Buzz" and 
        // "Fizzbuzz" with the given words
    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word) {
        if (number % 3 == 0 && number % 5 ==0){
            return multOf15Word;
        } else if (number % 3 == 0){
            return multOf3Word;
        } else if (number % 5 == 0){
            return multOf5Word;
        } else {
            String s = Integer.toString(number);
            return s;
    }
}
}