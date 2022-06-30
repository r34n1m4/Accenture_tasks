package w3resource.HashSet;
/*
Write a Java program to remove all of the elements from a hash set.
*/

import java.util.Collections;
import java.util.HashSet;

public class Exercise12 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Yellow");
        hashSet.add("Blue");
        hashSet.add("Red");
        System.out.println("Initial hash set: " + hashSet);

        hashSet.clear();
        System.out.printf(hashSet + " Is empty %n" + "HashSet has been removed.");
    }
}
