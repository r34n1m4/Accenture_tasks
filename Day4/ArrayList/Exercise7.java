package w3resource.ArrayList;

import java.util.ArrayList;

/*
Write a Java program to search an element in a array list.
*/
public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Red");
        System.out.println("Initial list: " + colorList);
        if (colorList.contains("Black")) {
            System.out.println("There is such an element in the list.");
        } else {
            System.out.println("There is no such an element in the list.");
        }
    }
}


