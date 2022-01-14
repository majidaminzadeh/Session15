package com.tosan.example1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("0");
        list.add("10");
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        for (String str : list){
            System.out.println(str);
        }
    }
}
