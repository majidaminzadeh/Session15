package com.tosan.example6;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example6 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("44");
        queue.add("55");
        System.out.println(queue.element());
        System.out.println(queue.peek());
    }
}
