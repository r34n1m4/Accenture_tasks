package w3resource.LinkedList;

import java.util.LinkedList;

/*
Write a Java program to append the specified element to the end of a linked list.
*/
public class Exercise1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        linkedList.add("Blue");
        linkedList.add("Red");
        System.out.println("Initial list: " + linkedList);
    }
}

