package w3resource.TreeSet;
/*
 Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
*/

import java.util.TreeSet;

public class Exercise1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Red");
        System.out.println("Initial TreeSet: " + treeSet);

    }
}
