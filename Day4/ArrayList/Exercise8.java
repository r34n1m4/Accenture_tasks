package w3resource.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
Write a Java program to sort a given array list
*/
public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Red");
        System.out.println("Initial list: " + colorList);

        Collections.sort(colorList);
        System.out.println("Sorted list: " + colorList);
    }
}
