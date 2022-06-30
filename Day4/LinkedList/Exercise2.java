package w3resource.LinkedList;

import java.util.LinkedList;

/*
Write a Java program to iterate through all elements in a linked list.
*/
public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        linkedList.add("Blue");
        linkedList.add("Red");
        System.out.println("Initial list: " + linkedList);

        for (String color : linkedList) {
            System.out.println(color);
        }
    }
}

