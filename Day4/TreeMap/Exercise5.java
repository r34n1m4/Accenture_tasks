package w3resource.TreeMap;
/*
Write a Java program to get all keys from the given a Tree Map.
*/

import java.util.TreeMap;

public class Exercise5 {
    public static void main(String[] args) {
        TreeMap <Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Java");
        treeMap.put(2, "Python");
        treeMap.put(3, "C#");
        treeMap.put(4, "C++");
        treeMap.put(5, "JavaScript");
        System.out.println("Current TreeMap: " + treeMap);

        System.out.println("All keys: " + treeMap.keySet());
    }
}
