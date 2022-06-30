package w3resource.TreeMap;
/*
Write a Java program to get a key-value mapping associated with the
least key greater than or equal to the given key.
Return null if there is no such key.
*/

import java.util.TreeMap;

public class Exercise25 {
    public static void main(String[] args) {
        TreeMap <Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Java");
        treeMap.put(2, "Python");
        treeMap.put(3, "C#");
        treeMap.put(4, "C++");
        treeMap.put(5, "JavaScript");
        System.out.println("Current TreeMap: " + treeMap);

        System.out.println("Return value: " + treeMap.ceilingKey(5));
    }
}
