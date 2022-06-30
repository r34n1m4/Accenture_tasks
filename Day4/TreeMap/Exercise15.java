package w3resource.TreeMap;
/*
Write a Java program to get the least key strictly
greater than the given key. Return null if there is no such key.
*/

import java.util.TreeMap;

public class Exercise15 {
    public static void main(String[] args) {
        TreeMap <Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Java");
        treeMap.put(2, "Python");
        treeMap.put(3, "C#");
        treeMap.put(4, "C++");
        treeMap.put(5, "JavaScript");
        System.out.println("Current TreeMap: " + treeMap);

        System.out.println("Showing higher key value than given: " + treeMap.higherKey(1));
    }
}

