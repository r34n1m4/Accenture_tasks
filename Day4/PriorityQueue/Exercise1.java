package w3resource.PriorityQueue;
/*
Write a Java program to create a new priority queue,
add some colors (string) and print out the elements of the priority queue.
 */

import java.util.PriorityQueue;

public class Exercise1 {
    public static void main(String[] args) {
        PriorityQueue<String> colorQue = new PriorityQueue<>();
        colorQue.add("Black");
        colorQue.add("White");
        colorQue.add("Red");
        colorQue.add("Green");
        colorQue.add("Blue");
        System.out.println("Current color queue: " + colorQue);
    }
}
