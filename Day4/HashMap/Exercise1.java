package w3resource.HashMap;
/*
Write a Java program to associate the specified value with the specified key in a HashMap.
*/

import java.util.HashMap;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C#", 3);
        hashMap.put("C++", 4);
        hashMap.put("JavaScript", 5);
        System.out.println("Current HashMap: " + hashMap);
    }
}
