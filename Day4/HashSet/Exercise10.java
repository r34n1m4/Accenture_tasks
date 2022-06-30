package w3resource.HashSet;
/*
Write a Java program to compare two hash set.
*/

import java.util.HashSet;

public class Exercise10 {
    public static void main(String[] args) {
        HashSet<String> firstHashSet = new HashSet<>();
        firstHashSet.add("Black");
        firstHashSet.add("White");
        firstHashSet.add("Blue");
        System.out.println("First HashSet contains: " + firstHashSet);

        HashSet<String> secondHashSet = new HashSet<>();
        secondHashSet.add("Yellow");
        secondHashSet.add("Red");
        secondHashSet.add("Purple");
        System.out.println("Second HashSet contains: " + secondHashSet);

        boolean compare = firstHashSet.equals(secondHashSet);
        System.out.println("Are those HashSet equal? " + compare);
    }
}
