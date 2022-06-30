package w3resource.TreeMap;
/*
Write a Java program to get a reverse order view of the keys contained in a given map.
*/

import java.util.TreeMap;

public class Exercise10 {
    public static void main(String[] args) {
        TreeMap <Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Java");
        treeMap.put(2, "Python");
        treeMap.put(3, "C#");
        treeMap.put(4, "C++");
        treeMap.put(5, "JavaScript");
        System.out.println("Current TreeMap: " + treeMap);

        System.out.println("All keys: " + treeMap.descendingKeySet());
    }
}
