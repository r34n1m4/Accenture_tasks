package w3resource.TreeSet;
/*
Write a Java program to get the element in a tree set which is greater than or equal to the given element.
*/

import java.util.TreeSet;

public class Exercise10 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(111);
        System.out.println("Initial TreeSet: " + treeSet);

        System.out.println("Greater than or equal to 111: " + treeSet.ceiling(111));

    }
}
