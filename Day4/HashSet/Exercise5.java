package w3resource.HashSet;

import java.util.HashSet;

/*
 Write a Java program to test a hash set is empty or not.
 */
public class Exercise5 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Yellow");
        hashSet.add("Blue");
        hashSet.add("Red");
        System.out.println("Initial hash set: " + hashSet);

        if (hashSet.isEmpty()) {
            System.out.println("Hash set is empty.");
        } else {
            System.out.println("Hash set isn't empty, it contains: " + hashSet);
        }
    }
}
