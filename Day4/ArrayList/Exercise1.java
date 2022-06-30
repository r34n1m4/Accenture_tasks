package w3resource.ArrayList;
/*
Write a Java program to create a new array list, add some colors (string) and print out the collection.
*/
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");

        System.out.println(colorList);
        colorList.remove("Yellow");
        System.out.println(colorList);

    }

}

