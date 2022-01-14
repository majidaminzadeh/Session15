package com.tosan.example3;

import java.util.*;

public class Example3 {
    // Key : Value
    // ID : name
    // 205 : Majid
    // 400 : Ali
    // 500 : Zahra
    // 230 : Parisa
    // ...
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(205, "Majid");
        map.put(400, "Ali");
        map.put(500, "Zahra");
        map.put(230, "Parisa");
//        map.put(null, null);
//        System.out.println(map.get(null));
        map.put(500, "Fatemeh");
//        System.out.println(map.get(500));
//        Set<Integer> keySet = map.keySet();
//        Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();
//        entrySet.forEach(t-> System.out.println(t.getKey() + " - " + t.getValue()));
        map.putIfAbsent(501, "sss");
        map.replace(501, "ooo");
//        System.out.println(map.get(501));
        map.remove(501);
        map.remove(500, "Fatemeh");
//        Collection<String> collection = map.values();
//        collection.forEach(t-> System.out.println(t));
//        map.isEmpty();
//        map.clear();
//        map.containsKey(500);
//        map.containsValue("Fatemeh");
//        map.get(500);
        String str = map.getOrDefault(600, "NULL");
        str = str.concat("88");
        str.toLowerCase();
        System.out.println(str);
    }
}
