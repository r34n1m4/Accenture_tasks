package w3resource.TreeSet;
/*
Write a Java program to get the first and last elements in a tree set.
*/

import java.util.TreeSet;

public class Exercise5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Red");
        System.out.println("Initial TreeSet: " + treeSet);

        System.out.println("First element is: " + treeSet.first());
        System.out.println("Last element is: " + treeSet.last());
    }
}
