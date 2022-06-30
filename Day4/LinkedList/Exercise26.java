package w3resource.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

/*
Write a Java program to replace an element in a linked list.
*/
public class Exercise26 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        linkedList.add("Blue");
        linkedList.add("Red");
        System.out.println("Initial list: " + linkedList);

        Collections.replaceAll(linkedList, "Yellow", "Purple");
        System.out.println("Updated list: " + linkedList);
    }
}
