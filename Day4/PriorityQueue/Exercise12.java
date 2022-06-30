package w3resource.PriorityQueue;
/*
Write a Java program to change priorityQueue to maximum priorityqueue.
*/

import java.util.Collections;
import java.util.PriorityQueue;

public class Exercise12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(99);
        pq.add(55);
        pq.add(11);
        pq.add(33);
        pq.add(88);
        System.out.println("Current Priority Queue: " + pq);

        Integer i;
        System.out.print("Maximum Priority Queue: \n");
        while ( (i = pq.poll()) != null) {
            System.out.println(i + " ");
        }
    }
}