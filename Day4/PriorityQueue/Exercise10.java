package w3resource.PriorityQueue;
/*
Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
*/

import java.util.PriorityQueue;

public class Exercise10 {
    public static void main(String[] args) {
        PriorityQueue<String> colorQue = new PriorityQueue<>();
        colorQue.add("Black");
        colorQue.add("White");
        colorQue.add("Red");
        colorQue.add("Green");
        colorQue.add("Blue");
        System.out.println("Current color queue: " + colorQue);

        colorQue.toArray();
        System.out.println("Array from PriorityQueue: " + colorQue);
    }
}
