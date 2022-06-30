package w3resource.ArrayList;

import java.util.ArrayList;
/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
*/
public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Red");

        System.out.println(colorList);
        final int index = 1;
        String color = colorList.get(index);
        System.out.printf("The color with index %d is %s .", index, color);
    }
}
