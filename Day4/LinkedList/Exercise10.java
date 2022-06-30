package w3resource.LinkedList;

import java.util.LinkedList;

/*
Write a Java program to get the first and last occurrence of the specified elements in a linked list.
*/
public class Exercise10 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        linkedList.add("Blue");
        linkedList.add("Red");
        linkedList.add("Black");
        System.out.println("Initial list: " + linkedList);

        Object firstElem = linkedList.getFirst();
        System.out.println("First element of the list is: " + firstElem);
        Object lastElem = linkedList.getLast();
        System.out.println("Last element of the list is: " + lastElem);
    }
}
