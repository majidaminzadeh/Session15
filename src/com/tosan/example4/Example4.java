package com.tosan.example4;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(205, "Majid");
        sortedMap.put(400, "Ali");
        sortedMap.put(500, "Zahra");
        sortedMap.put(230, "Parisa");
        Collection<String> collection = sortedMap.values();
//        collection.forEach(t-> System.out.println(t));
        Set<Integer> set = sortedMap.keySet();
//        set.forEach(t-> System.out.println(t));
        Map<Integer, String> map2 = sortedMap.tailMap(230);
        Set<Integer> set2 = map2.keySet();
        set2.forEach(t-> System.out.println(t));
    }
}
