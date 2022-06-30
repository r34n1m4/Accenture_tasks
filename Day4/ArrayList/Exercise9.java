package w3resource.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
Write a Java program to copy one array list into another.
*/
public class Exercise9 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Red");
        System.out.println("Initial list of colors: " + colorList);

        ArrayList<String> carList = new ArrayList<>();
        carList.add("Audi");
        carList.add("Mercedes");
        carList.add("Mazda");
        carList.add("Volvo");
        carList.add("Ford");
        System.out.println("Initial list of cars: " + carList);

        Collections.copy(colorList, carList);
        System.out.println("colorList became carList: " + colorList);
        System.out.println("carList: " + carList);
    }
}
