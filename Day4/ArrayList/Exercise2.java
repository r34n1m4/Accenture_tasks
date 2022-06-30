package w3resource.ArrayList;
/*
Write a Java program to iterate through all elements in an array list.
*/
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Red");

        for (String color : colorList) {
            System.out.println(color);
        }
    }
}
