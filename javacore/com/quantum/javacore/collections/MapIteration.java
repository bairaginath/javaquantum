package com.quantum.javacore.collections;


import java.util.HashMap;
import java.util.Map;

public class MapIteration {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        String s1 = "bairagi";
        String s2 = "bairagi";
        System.out.println("hascode of s1=" + s1.hashCode());
        System.out.println("hascode of s2=" + s2.hashCode());
        hm.put(s1, 0);
        hm.put(s2, 1);
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println("--------" + entry.getKey() + ":::" + entry.getValue());
        }
    }
}
