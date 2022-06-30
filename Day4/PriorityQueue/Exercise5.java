package w3resource.PriorityQueue;
/*
Write a Java program to remove all the elements from a priority queue.
*/

import java.util.PriorityQueue;

public class Exercise5 {
    public static void main(String[] args) {
        PriorityQueue<String> colorQue = new PriorityQueue<>();
        colorQue.add("Black");
        colorQue.add("White");
        colorQue.add("Red");
        colorQue.add("Green");
        colorQue.add("Blue");
        System.out.println("Current color queue: " + colorQue);

        colorQue.clear();
        System.out.println(colorQue + " is now empty.");
    }
}
