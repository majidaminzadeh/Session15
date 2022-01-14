package com.tosan.example2;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
//        Deque<String> deque = new ArrayDeque<>();
//        deque.add("1");
//        deque.add("3");
//        deque.add("5");
//        deque.add("4");
//        deque.add("2");
//        deque.addLast("66");
//        deque.addFirst("77");
//        deque.forEach(t -> System.out.println(t));
//        String str = "Stack Testing";
//        method();
//        System.out.println(str);
//        dequeLinkedList.forEach(t -> System.out.println(t));
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.peek());
    }

    private static void method() {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        method2();
        System.out.println(linkedList.get(0));
    }

    private static void method2() {
        Deque<String> dequeLinkedList = new LinkedList<>();
        dequeLinkedList.add("1");
        dequeLinkedList.add("2");
        dequeLinkedList.push("4");
        System.out.println(dequeLinkedList.pop());
    }


}
