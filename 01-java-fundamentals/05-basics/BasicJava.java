import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicJava {

    // print Integer 1-255:
    // Write a method that prIntegers all the numbers from 1 to 255.
    public static void oneToTwoFiveFive() {
        int[] myArray = new int[255];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        ;

        for (int f = 0; f < myArray.length; f++) {
            System.out.println(myArray[f]);
        }
        ;
    }

    // Print odd numbers between 1-255: Write a method that prints all the odd
    // numbers from 1 to 255.
    public static ArrayList<Integer> oddNumTo255() {
        ArrayList<Integer> OddNumList = new ArrayList<Integer>();
        for (Integer k = 1; k < 256; k++) {
            if (k % 2 == 1) {
                OddNumList.add(k);
            }
        }
        return OddNumList;
    }

    // Sigma of 255 AKA Sum to 255.
    // Write a method that creates and eventually returns a sum variable that adds
    // up all the numbers from 1 to 255. In this method you are not printing the
    // sum, except to debug if you need to, the method should return the sum. Note:
    // You do not need an array to write this function.
    public static int SigmaOf255() {
        int sum = 0;
        for (int g = 1; g < 256; g++) {
            sum += g;
        }
        return sum;
    }

    // Iterating through an array
    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate
    // through each member of the array and print each value on the screen. Being
    // able to loop through each member of the array is extremely important.
    public static void printOutElement(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    // Find Max
    // Write a method (sets of instructions) that takes any array and prints the
    // maximum value in the array. Your method should also work with a given array
    // that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive
    // numbers, negative numbers and zero.
    public static int findMax(int[] arr) {
        int currentMax = Integer.MIN_VALUE;
        for (int element:arr) {
            if (element>currentMax) {
                currentMax = element;
            }
        }
        return currentMax;
    }

    public static int findMin (int[] arr){
        int temp = Integer.MAX_VALUE;
        for (int element :arr){
            if(element<temp){
                temp = element;
            }
        }
        return temp;
    }

    // Array with Odd Numbers
    // Write a method that creates an array 'y' that contains all the odd numbers
    // between 1 to 255. When the method is done, 'y' should have the value of [1,
    // 3, 5, 7, ... 255].

    public static void oddNumArr() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int m = 1; m < 256; m++) {
            if (m % 2 == 1) {
                y.add(m);
            }
        }
        System.out.println(y);
    }

    // Get Average
    // Write a method that takes an array, and prints the AVERAGE of the values in
    // the array. For example for an array [2, 10, 3], your method should print an
    // average of 5. Again, make sure you come up with a simple base case and write
    // instructions to solve that base case first, then test your instructions for
    // other complicated cases.

    public static void arrAverage(float[] arr) {
        float sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += arr[a];
        }
        float ave = sum / arr.length;
        System.out.println(ave);
    }

    // Greater Than Y
    // Write a method that takes an array and returns the number of values in that
    // array whose value is greater than a given value y. For example, if array =
    // [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there
    // are two values in the array that are greater than 3).

    public static int greaterThanY(float[] arr, float Y) {
        int count = 0;
        for (int m = 0; m < arr.length; m++) {
            if (arr[m] > Y) {
                count += 1;
            }
        }
        return count;
    }

    // Square the values
    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each
    // value in the array by itself. When the method is done, the array x should
    // have values that have been squared, say [1, 25, 100, 4].

    public static void squareArray(int[] arr) {
        for (int b = 0; b < arr.length; b++) {
            int bSquare = (int) Math.pow(arr[b], 2);
            arr[b] = bSquare;
        }
        // return Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Eliminate Negative Numbers
    // Given any array x, say [1, 5, 10, -2], write a method that replaces any
    // negative number with the value of 0. When the method is done, x should have
    // no negative values, say [1, 5, 10, 0].

    public static void eliNegativeNum(int[] arr) {
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] < 0) {
                arr[b] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Sensei Bonuses (Optional):
    // Max, Min, and Average
    // Given any array x, say [1, 5, 10, -2], write a method that returns an array
    // with the maximum number in the array, the minimum value in the array, and the
    // average of the values in the array. The returned array should be three
    // elements long and contain: [MAXNUM, MINNUM, AVG]

    public static ArrayList<Float> maxMinAve(int[] arr) {
        float sum = 0;
        for (int w = 0; w < arr.length; w++) {
            sum += arr[w];
        }
        float ave = sum / arr.length;
        // List<int[]> arrAsList = Arrays.asList(arr);
        int min = BasicJava.findMin(arr);
        int max = BasicJava.findMax(arr);

        ArrayList<Float> output = new ArrayList<Float>();
        output.add((float) min);
        output.add((float) max);;
        output.add(ave);

        //System.out.println(Arrays.toString(output));
        return output;
    }

    // Shifting the Values in the Array
    // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each
    // number by one to the front. For example, when the method is done, an x of [1,
    // 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is
    // 0. The method does not need to wrap around the values shifted out of bounds.
    public static void shifting(int[] arr){
        for (int y = 0; y<arr.length-1; y++){
            arr[y] = (arr[y+1]);
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }

}