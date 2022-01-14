package com.tosan.example5;

import java.util.LinkedList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.forEach(
                (t)-> {
            System.out.println(t);
        }
        );
        method(
                () -> {
                System.out.println("My interface new Impl");
            });
    }

    private static void method(MyInterface myInterface) {
        //...
        myInterface.print();
    }
}
