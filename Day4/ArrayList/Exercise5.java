package w3resource.ArrayList;

import java.util.ArrayList;

/*
Write a Java program to update specific array element by given element.
*/
public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Red");

        System.out.println("Initial list: " + colorList);
        colorList.set(1, "Purple");
        System.out.println("Updated list: " + colorList);
    }
}
