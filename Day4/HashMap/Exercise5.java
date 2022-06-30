package w3resource.HashMap;
/*
Write a Java program to check whether a map contains key-value mappings (empty) or not.
*/

import java.util.HashMap;

public class Exercise5 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C#", 3);
        hashMap.put("C++", 4);
        hashMap.put("JavaScript", 5);
        System.out.println("Current HashMap: " + hashMap);

        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap isn't empty.");
        }
    }
}
