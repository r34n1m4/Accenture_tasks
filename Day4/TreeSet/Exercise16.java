package w3resource.TreeSet;
/*
Write a Java program to remove a given element from a tree set.
*/

import java.util.TreeSet;

public class Exercise16 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Red");
        System.out.println("Initial TreeSet: " + treeSet);

        treeSet.remove("Red");
        System.out.println("Updated TreeSet: " + treeSet);
    }
}
