package w3resource.HashMap;
/*
Write a Java program to get a collection view of the values contained in this map.
*/

import java.util.HashMap;

public class Exercise12 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C#", 3);
        hashMap.put("C++", 4);
        hashMap.put("JavaScript", 5);
        System.out.println("Current HashMap: " + hashMap);

        System.out.println("Collection view of the values: " + hashMap.values());
    }
}
