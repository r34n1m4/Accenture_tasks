package w3resource.HashSet;
/*
Write a Java program to append the specified element to the end of a hash set.
*/

import java.util.HashSet;

public class Exercise1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Yellow");
        hashSet.add("Blue");
        hashSet.add("Red");
        System.out.println("Initial hash set: " + hashSet);
    }
}
