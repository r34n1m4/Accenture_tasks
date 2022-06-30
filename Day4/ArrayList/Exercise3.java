package w3resource.ArrayList;
/*
Write a Java program to insert an element into the array list at the first position
*/
import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Red");

        System.out.println(colorList);
        colorList.add(2,"Purple");
        System.out.println(colorList);
    }
}
