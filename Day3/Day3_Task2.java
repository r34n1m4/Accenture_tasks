package accenture;

/*2) Declare and initialize an array with four arbitrary whole numbers.
Write a Java program to copy this array by iterating it.
*/

import java.util.Arrays;

public class Day3_Task2 {
    public static void main (String [] args) {
        int[] array = {1, 2, 3, 4};
        int[] arrayCopy = new int[4];

        for(int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        System.out.println("Copied array: " + Arrays.toString(arrayCopy));

    }
}
