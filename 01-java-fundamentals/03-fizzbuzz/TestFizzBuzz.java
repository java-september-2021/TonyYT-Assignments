
public class TestFizzBuzz {
    // This will be the launch point for the application
    // For now, we are using this method to test our
    // FizzBuzz methods
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();
        System.out.println(tester.fizzBuzz(9)); //this should be fizz
        System.out.println(tester.fizzBuzz(10)); //this should be buzz
        System.out.println(tester.fizzBuzz(15)); //this should be fizzbuzz
        System.out.println(tester.fizzBuzz(16)); //this should be 16
        System.out.println(tester.fizzBuzz(2) + "\n"); //this should be 2

        for (int i = 1; i <= 50; i++) {
        System.out.println(tester.fizzBuzz(i));
        }   
        System.out.println("\n");

        // test the words replacement
        for (int k = 1; k <=50; k++){
            System.out.println(tester.fizzBuzz(k, "This is Multiple of 3", "This is Multiple of 5", "This is Multiple of 15"));
        }
    }
}