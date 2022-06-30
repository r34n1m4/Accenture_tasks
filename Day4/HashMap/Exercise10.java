package w3resource.HashMap;
/*
Write a Java program to get the value of a specified key in a map.
*/

import java.util.HashMap;

public class Exercise10 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C#", 3);
        hashMap.put("C++", 4);
        hashMap.put("JavaScript", 5);
        System.out.println("Current HashMap: " + hashMap);

        System.out.println("Some value from HashMap: " + hashMap.get("Java"));
    }
}
